export const lessons = [
  {
    numLessons: 2,
    issue: 'Java SE',
    day: 9,
    msg: `<small> “Dejo ir todo lo que ya no me sirve”. <br>
    FRASES PARA SUPERAR EL SÍNDROME DEL IMPOSTOR </small>`,
    myProgress: '🥚>🐣',

    exercise: [
      {
        numExercise: 1,
        title: '',
        description:`<small>Haz una clase llamada Persona que siga las siguientes condiciones:

        <p>Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No
        queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el
        más adecuado, también su tipo.  </p>Si quieres añadir algún atributo puedes hacerlo,
        
        <p>Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0
        números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una
        constante para ello.
        
        Se implantaran varios constructores:
        
        Un constructor por defecto.
        Un constructor con el nombre, edad y sexo, el resto por defecto.
        
        Un constructor con tados los atributos como parámetro.`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0610-ta08/tree/main/src/com/tmbs/ta08_01',
        urlPG: '',
      },
      {
        numExercise: 2,
        title: '',
        description:  `<samll> Haz una clase llamada Password que siga las siguientes condiciones:

        <li> Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.</li>
        <ol> Los constructores serán los siguiente:</ol>
        
        <li> Un constructor por defecto.</li>
        <li> Un constructor con la longitud que nosotros le pasemos.</li>
        <li> Generara una contraseña aleatoria con esa longitud. </li>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0610-ta08/tree/main/src/com/tmbs/ta08_02',
        urlPG: ''
      },
      {
        numExercise: 3,
        title: '',
        description: `<small>Crearemos una clase llamada Electrodomestico con las siguientes características:

        Sus atributos son precio base, color, consumo energético [letras entre A y F) ypeso.
        Indica que se podrán heredar.
        
        <p>Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de
        100 € y el peso de 5 kg. Usa constantes para ello.</p>
        
        <p>Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre
        esta en mayúsculas o en minúsculas.</p>
        
        <p>Los constructores que se implementaran serán</p>
        <li> Un constructor por defecto.</li>
        <li> Un constructor con el precio y peso. El resto por defecto, </li>
        <li> Un constructor con todos los atributos.</li>
        `,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0610-ta08/tree/main/src/com/tmbs/ta08_03',
        urlPG: ''
      },
      {
        numExercise: 4,
        title: '',
        description: `<small>Crearemos una clase llamada Serie con las siguientes caracteristicas:

        <ol> Sus atributos son titulo, numero de temporadas, entregado, genero y creador.<ol>
        
        Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
        <p>El  resto de atributos serdn valores por defecto segin el tipo del atributo.</p>
        
        <li> Los constructores que se implementaran seran:</li>
        <li> Un constructor por defecto.</li>
        <li> Un constructor con el titulo y creador. El resto por defecto.</li>
        <li> Un constructor con todos los atributos, excepto de entregado.</li>`,
        urlCode: 'https://github.com/TECHMA-Bootcamp-FullStack-Java-Angular/dmb-tsys-java-0610-ta08/tree/main/src/com/tmbs/ta08_04',
        urlPG: ''
      },
    ]
  },
]


 
