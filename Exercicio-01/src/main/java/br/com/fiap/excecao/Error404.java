package br.com.fiap.excecao;

public class Error404 extends Exception {
	private static final long serialVersionUID = 1L;

	public Error404() {
		super();
	}

	public Error404(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public Error404(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public Error404(String arg0) {
		super(arg0);
	}

	public Error404(Throwable arg0) {
		super(arg0);
	}

}
