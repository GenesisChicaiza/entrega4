public class Funciones {


//34. Un algoritmo es un metodo que resuelve un problema.

//35.
public static int sumaN (int n){

    int result = 0;

    while ( n > 0){
        result += n;
        n--;
    }
    return result;
}

    public static int sumaNRecursivo (int n){

        if( n == 0){
            return 0;
        }
        return n + sumaNRecursivo(n - 1);
    }


    // 36. f(x)/x = k donde k es un entero
    // 37. O(1)

    //38. la primera es 0(1), y la segunda es 0(1) tambien.

    //39. 0(n)

    //40. todos son 0(1)

    //41. primero y segundo son 0(n). El tercero es 0(log(n)), el resto son 0(n),

    //42. tiene complejudad 0(n^2)

    //43. Tendra una complejidad de O(n^2) ya que son dos bucles anidados.

    //44.
        /* public static boolean buscar(int e, int[] array){

	int dch = array.length -1;
	int izq = 0;

	while(izq <= dch){

		medio = (dch - izq)/2;

		if(e > array[medio]){
			izq = medio +1;
		}
		else if(e < array[medio]){
			dch = medio -1;
		}
		else if( e == array[medio]){
			return true;
		}
	}
	return false;
}*/

    // tiene complejidad O(log(n))


   //46. complejidad temporal de O(2^n) y espacial de O(n)


    //47. Tiene algoritmo 0(n)

    //48. Cada vez que multiplicamos por
    //diez el numero de elementos el tiempo de ejecuccion crece 10^2.

    //49. Si existe un natural k tal que para todo m mayor que no se cumple que T(m) es siempre menor o igual a f(m) por k
    //podemos afirmar que T(n) pertence a O(f(n))






}
