//s23027
//switch文が正しくcontrolの値に応じてmode変数の値を設定した
class d50Q27kadai {
    public static void main(String[] args) {
		int control = Integer.parseInt(args[0]);
        String mode;

		switch (control) {
         	case 1:
                mode = "Warm";
				break;
            case 2:
                mode = "Cool";
				break;
			default:
				mode = "Wind";
				break;
		}
		System.out.println(mode);

	}
}
