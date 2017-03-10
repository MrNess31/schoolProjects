
public class Octave {
	int c_b�mole;
	int c;
	int c_di�z;
	int d;
	int d_di�z;
	int e;
	int f;
	int f_di�z;
	int g;
	int g_di�z;
	int a;
	int a_di�z;
	int b;
	int b_di�z;

	public Octave(double fInitial) {
		double multiplicator = Math.pow(2.0,  1.0/12.0);
		
		this.c_b�mole = (int)fInitial;
		fInitial *= multiplicator;
		this.c = (int)fInitial;
		fInitial *= multiplicator;
		this.c_di�z = (int)fInitial;
		fInitial *= multiplicator;
		this.d = (int)fInitial;
		fInitial *= multiplicator;
		this.d_di�z = (int)fInitial;
		fInitial *= multiplicator;
		this.e = (int)fInitial;
		fInitial *= multiplicator;
		this.f = (int)fInitial;
		fInitial *= multiplicator;
		this.f_di�z = (int)fInitial;
		fInitial *= multiplicator;
		this.g = (int)fInitial;
		fInitial *= multiplicator;
		this.g_di�z = (int)fInitial;
		fInitial *= multiplicator;
		this.a = (int)fInitial;
		fInitial *= multiplicator;
		this.a_di�z = (int)fInitial;
		fInitial *= multiplicator;
		this.b = (int)fInitial;
		fInitial *= multiplicator;
		this.b_di�z = (int)fInitial;
	}
}
