package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.FastMath;
import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Sphere;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author Jesús Moisés
 */
public class Main extends SimpleApplication {
   
    //nodos para los nodos de los planetas
    Spatial s_sol;
    Node nodo_sol;
    Node nodo_sol_mercurio;
    Node nodo_sol_venus;
    Node nodo_sol_tierra;
    Node nodo_sol_marte;
    Node nodo_sol_jupiter;
    Node nodo_sol_saturno;
    Node nodo_sol_urano;
    Node nodo_sol_neptuno;
    Node nodo_sol_pluton;
    
    //---------
    Boolean isAtached = false;
    //mercurio
    Spatial s_mer;
    Vector3f mov_mer;
    //venus
    Spatial s_venus;
    Vector3f mov_venus;
    //tierra
    Spatial s_tierra;
    Vector3f mov_tierra;
    //marte
    Spatial s_marte;
    Vector3f mov_marte;
    //jupiter
    Spatial s_jupiter;
    Vector3f mov_jupiter;
    //saturno
    Spatial s_saturno;
    Vector3f mov_saturno;
    //urano
    Spatial s_urano;
    Vector3f mov_urano;
    //neptuno
    Spatial s_neptuno;
    Vector3f mov_neptuno;
    //pluton
    Spatial s_pluton;
    Vector3f mov_pluton;
    
    public static final Quaternion PITCH090 = new Quaternion().fromAngleAxis(FastMath.PI/2, new Vector3f(1,0,0));
    
    //Quaternion QnodeEart = new Quaternion().fromAngleAxis(FastMath.PI/18000, new Vector3f(0,1,0));//quaternion;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
            
        setDisplayFps(false);
        setDisplayStatView(false);
        
        //flyCam.setMoveSpeed(10.8f);
        
        cam.setLocation(new Vector3f(0, 40, 15));
        cam.setRotation(PITCH090);
        
        //--------------SOL--------------------
        //Creamos una esfera para nuestro sol
        Sphere sol = new Sphere(100,80,3);
        //creamos una geometria
        Geometry sol_geom = new Geometry("sol", sol);
        //creamos un material que será para nuestro sol
        Material sol_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img del sol
        sol_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/sunmap.jpg"));
        //aplicamos el material a nuestra geometria
        sol_geom.setMaterial(sol_mat);
        //rotamos la geometria
        sol_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        
        //-------------MERCURIO--------------------
        //creamos una esfera para mercurio
        Sphere mercurio = new Sphere(8,8,0.2f);
        //creamos una geometria
        Geometry mer_geom = new Geometry("mercurio", mercurio);
        //creamos un material que será para mercurio
        Material mer_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de mercurio
        mer_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/mercurymap.jpg"));
        //aplicamos el material a nuestra geometria
        mer_geom.setMaterial(mer_mat);
        //rotamos la geometria de mercurio
        mer_geom.rotate(FastMath.DEG_TO_RAD*-45, 0, 2);
        //movemos la geometria de mercurio
        mer_geom.move(new Vector3f(3,0,3));
        
        //--------------VENUS--------------------
        //creamos una esfera para venus
        Sphere venus = new Sphere(15,15,0.4f);
        //creamos una geometria
        Geometry venus_geom = new Geometry("venus", venus);
        //creamos un material que será para venus
        Material venus_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de venus
        venus_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/venusmap.jpg"));
        //aplicamos el material a nuestra geometria
        venus_geom.setMaterial(venus_mat);
        //rotamos la geometria de venus
        venus_geom.rotate(FastMath.DEG_TO_RAD*-45, 0, 2);
        //movemos la geometria de venus
        venus_geom.move(new Vector3f(5,0,5));
        
        //--------------TIERRA--------------------
        //creamos una esfera para tierra
        Sphere tierra = new Sphere(17,17,0.8f);
        //creamos una geometria
        Geometry tierra_geom = new Geometry("tierra", tierra);
        //creamos un material que será para tierra
        Material tierra_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de tierra
        tierra_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/earthmap1k.jpg"));
        //aplicamos el material a nuestra geometria
        tierra_geom.setMaterial(tierra_mat);
        //rotamos la geometria de tierra
        tierra_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de tierra
        tierra_geom.move(new Vector3f(7,3,3));
        
        //--------------MARTE--------------------
        //creamos una esfera para marte
        Sphere marte = new Sphere(12,12,0.6f);
        //creamos una geometria
        Geometry marte_geom = new Geometry("marte", marte);
        //creamos un material que será para marte
        Material marte_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de marte
        marte_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/mars_1k_color.jpg"));
        //aplicamos el material a nuestra geometria
        marte_geom.setMaterial(marte_mat);
        //rotamos la geometria de marte
        marte_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de marte
        marte_geom.move(new Vector3f(9,0,9));
        
        //---------------JUPITER--------------------
        //creamos una esfera para jupiter
        Sphere jupiter = new Sphere(40,40,2);
        //creamos una geometria
        Geometry jupiter_geom = new Geometry("jupiter", jupiter);
        //creamos un material que será para jupiter
        Material jupiter_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de jupiter
        jupiter_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/jupitermap.jpg"));
        //aplicamos el material a nuestra geometria
        jupiter_geom.setMaterial(jupiter_mat);
        //rotamos la geometria de jupiter
        jupiter_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de jupiter
        jupiter_geom.move(new Vector3f(14,0,14));
        
        //---------------SATURNO--------------------
        //creamos una esfera para saturno
        Sphere saturno = new Sphere(38,38,1.5f);
        //creamos una geometria
        Geometry saturno_geom = new Geometry("saturno", saturno);
        //creamos un material que será para saturno
        Material saturno_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de jupiter
        saturno_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/saturnmap.jpg"));
        //aplicamos el material a nuestra geometria
        saturno_geom.setMaterial(saturno_mat);
        //rotamos la geometria de saturno
        saturno_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de saturno
        saturno_geom.move(new Vector3f(19,0,19));
        
        //---------------URANO--------------------
        //creamos una esfera para urano
        Sphere urano = new Sphere(30,30,1);
        //creamos una geometria
        Geometry urano_geom = new Geometry("urano", urano);
        //creamos un material que será para urano
        Material urano_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de urano
        urano_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/uranusmap.jpg"));
        //aplicamos el material a nuestra geometria
        urano_geom.setMaterial(urano_mat);
        //rotamos la geometria de urano
        urano_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de urano
        urano_geom.move(new Vector3f(23,0,23));
 
        //---------------NEPTUNO--------------------
        //creamos una esfera para neptuno
        Sphere neptuno = new Sphere(31,31,1);
        //creamos una geometria
        Geometry neptuno_geom = new Geometry("neptuno", neptuno);
        //creamos un material que será para neptuno
        Material neptuno_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de neptuno
        neptuno_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/neptunemap.jpg"));
        //aplicamos el material a nuestra geometria
        neptuno_geom.setMaterial(neptuno_mat);
        //rotamos la geometria de neptuno
        neptuno_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de neptuno
       neptuno_geom.move(new Vector3f(27,0,27));
       
       
       //---------------PLUTON--------------------
        //creamos una esfera para pluton
        Sphere pluton = new Sphere(8,8,0);
        //creamos una geometria
        Geometry pluton_geom = new Geometry("pluton", pluton);
        //creamos un material que será para pluton
        Material pluton_mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        //asignamos a nuestro material la img de pluton
        pluton_mat.setTexture("ColorMap", assetManager.loadTexture("Textures/plutomap1k.jpg"));
        //aplicamos el material a nuestra geometria
        pluton_geom.setMaterial(pluton_mat);
        //rotamos la geometria de pluton
        pluton_geom.rotate(FastMath.DEG_TO_RAD*-75, 0, 2);
        //movemos la geometria de pluton
        pluton_geom.move(new Vector3f(31,0,31));
        
        //creamos nodos para girar de diferente velocidad cada planeta
        nodo_sol = new Node ("nodo_sol");
        nodo_sol_mercurio = new Node ("nodo_sol_mercurio");
        nodo_sol_venus = new Node ("nodo_sol_venus");
        nodo_sol_tierra = new Node ("nodo_sol_tierra");
        nodo_sol_marte = new Node ("nodo_sol_marte");
        nodo_sol_jupiter = new Node ("nodo_sol_jupiter");
        nodo_sol_saturno = new Node ("nodo_sol_saturno");
        nodo_sol_urano = new Node ("nodo_sol_urano");
        nodo_sol_neptuno = new Node ("nodo_sol_neptuno");
        nodo_sol_pluton = new Node ("nodo_sol_pluton");
        
        //fijamos o enlazamos los nodos con los respectivos planetas
        rootNode.attachChild(sol_geom);
            rootNode.attachChild(nodo_sol);
        
        rootNode.attachChild(mer_geom);
            rootNode.attachChild(nodo_sol_mercurio);
        
        rootNode.attachChild(venus_geom);
            rootNode.attachChild(nodo_sol_venus);

        rootNode.attachChild(tierra_geom);
            rootNode.attachChild(nodo_sol_tierra);
        
        rootNode.attachChild(marte_geom);
            rootNode.attachChild(nodo_sol_marte);
        
        rootNode.attachChild(jupiter_geom);
            rootNode.attachChild(nodo_sol_jupiter);
        
        rootNode.attachChild(saturno_geom);
            rootNode.attachChild(nodo_sol_saturno);
        
        rootNode.attachChild(urano_geom);
            rootNode.attachChild(nodo_sol_urano);
        
        rootNode.attachChild(neptuno_geom);
            rootNode.attachChild(nodo_sol_neptuno);
        
        rootNode.attachChild(pluton_geom);
            rootNode.attachChild(nodo_sol_pluton);
    }

    @Override
    public void simpleUpdate(float tpf) {
   
        //verificamos si nuestra spatial de cada planeta está nula
        if(s_sol == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_sol = rootNode.getChild("sol");
        }
        if(s_mer == null) {
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_mer = rootNode.getChild("mercurio");
        }
        if(s_venus == null) {
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_venus = rootNode.getChild("venus");
        }
        if(s_tierra == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_tierra = rootNode.getChild("tierra");
        }
        if(s_marte == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_marte = rootNode.getChild("marte");
        }
        if(s_jupiter == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_jupiter = rootNode.getChild("jupiter");
        }
        if(s_saturno == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_saturno = rootNode.getChild("saturno");
        }
        if(s_urano == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_urano = rootNode.getChild("urano");
        }
        if(s_neptuno == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_neptuno = rootNode.getChild("neptuno");
        }
        if(s_pluton == null){
            //optenemos el nodo hijo y lo asignamos al sphere del planeta correspondiente
            s_pluton = rootNode.getChild("pluton");
        }
        
        //rotamos nuestro planetas
        s_sol.rotate(0, FastMath.HALF_PI/400, tpf*2);
        s_mer.rotate(0, FastMath.HALF_PI/400, tpf/4);
        s_venus.rotate(0, FastMath.HALF_PI/400, tpf/5);
        s_tierra.rotate(0, FastMath.HALF_PI/400, tpf/6);
        s_marte.rotate(0, FastMath.HALF_PI/400, tpf/7);
        s_jupiter.rotate(0, FastMath.HALF_PI/400, tpf/8);
        s_saturno.rotate(0, FastMath.HALF_PI/400, tpf/9);
        s_urano.rotate(0, FastMath.HALF_PI/400, tpf/10);
        s_neptuno.rotate(0, FastMath.HALF_PI/400, tpf/11);
        s_pluton.rotate(0, FastMath.HALF_PI/400, tpf/12);
        
        
        //aplicamos el nodo del sol a cada uno de los planetas para que giren en diferente velocidad
        
        nodo_sol_mercurio.attachChild(s_mer);
        //nodo_tierra.rotate(0, FastMath.HALF_PI/555, FastMath.HALF_PI/555);
            nodo_sol_mercurio.rotate(0, FastMath.HALF_PI/200, FastMath.HALF_PI/555);
            
        nodo_sol_venus.attachChild(s_venus);
            nodo_sol_venus.rotate(0, FastMath.HALF_PI/300, FastMath.HALF_PI/700);
            
        nodo_sol_tierra.attachChild(s_tierra);
            nodo_sol_tierra.rotate(0, FastMath.HALF_PI/400, FastMath.HALF_PI/600);
            
        nodo_sol_marte.attachChild(s_marte);
            nodo_sol_marte.rotate(0, FastMath.HALF_PI/500, FastMath.HALF_PI/555);
            
        nodo_sol_jupiter.attachChild(s_jupiter);
            nodo_sol_jupiter.rotate(0, FastMath.HALF_PI/600, FastMath.HALF_PI/555);
            
        nodo_sol_saturno.attachChild(s_saturno);
            nodo_sol_saturno.rotate(0, FastMath.HALF_PI/700, FastMath.HALF_PI/555);
            
        nodo_sol_urano.attachChild(s_urano);
            nodo_sol_urano.rotate(0, FastMath.HALF_PI/800, FastMath.HALF_PI/555);
            
        nodo_sol_neptuno.attachChild(s_neptuno);
            nodo_sol_neptuno.rotate(0, FastMath.HALF_PI/900, FastMath.HALF_PI/555);
            
        nodo_sol_pluton.attachChild(s_pluton);
            nodo_sol_pluton.rotate(0, FastMath.HALF_PI/1000, FastMath.HALF_PI/555);
            
        
            //nodo_sol_tierra.rotate(QnodeEart);
            
            //rotacion de planetas
        //nodo_sol.rotate(0, tpf*0.2f, 1);
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
    
    
}//fin del main
