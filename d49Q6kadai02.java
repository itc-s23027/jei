//s23027
//中央値を求めるプログラムを追加した

public class d49Q6kadai2 {
	public static void main(String[] arguments){
		int[] nums = new int[arguments.length];

		int i = 0;
		for (String arg : arguments) {
			nums[i++] = Integer.parseInt(arg);
		}

		Analyzer analyzer = new Analyzer();
		analyzer.setNums(nums);
		System.out.println(analyzer.analyzer());
	}
}

class Analyzer {
	int[] nums;

	void setNums(int[] nums) {
		this.nums = nums;
	}

	String analyzer() {
		StringBuilder sb = new StringBuilder();

		double avg = getAverage();
		sb.append("平均値:" + avg + "¥n");

		int r = getRange();
		sb.append("値の範囲:" + r + "¥n");

		int[] counts = getHighLowCounts(avg);
		sb.append("平均より大きい値の個数:" + counts[0] +
				" 平均より小さい値の個数:" + counts[1] + "¥n" );

		 double median = getMedian();
        sb.append("中央値: " + median + "¥n");

		return sb.toString();
	}

	double getAverage() {
		double sum = 0;
		for (int n : nums) {
			sum += n;
		}
		return sum / nums.length;
	}

	int getRange() {
		int min = 1000, max = -1000;
		for (int n : nums) {
			if (n < min) {
				min = n;
			}
			if (n > max) {
				max = n;
			}
		}
		return max - min;
	}

	int[] getHighLowCounts(double avg) {
		int high = 0, low = 0;
		for (int n : nums) {
			if (n < avg) {
				low++;
			}
			if (n > avg) {
				high++;
			}
		}
		return new int[]{high, low};
	}
	double getMedian() {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
	}
}

