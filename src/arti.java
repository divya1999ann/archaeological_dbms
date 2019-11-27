/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Divya Ann
 */
public class arti {
    private String art_id,arch_id,raw_material,site_id,type_id;
    public arti(String art_id,String raw_material,String arch_id,String site_id,String type_id)
    {
        this.art_id=art_id;
        this.arch_id=arch_id;
        this.raw_material=raw_material;
         this.type_id=type_id;
          this.site_id=site_id;
    }

    arti(String string, String string0, String string1, String string2, String string3, String string4, String string5 ) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getart_id(){
        return art_id;
    }
    public String getarch_id(){
        return arch_id;
    }
    public String getraw_material(){
        return raw_material;
    }
    public String getsite_id(){
        return site_id;
    }
    public String gettype_id(){
        return type_id;
    }
    
}
