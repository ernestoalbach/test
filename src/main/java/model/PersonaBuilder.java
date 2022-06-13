package model;

public class PersonaBuilder {
    public static  PersonaVO fromDTO (PersonaDTO origin){
        PersonaVO destino = new PersonaVO();

        destino.setId_usuario(origin.getIdUsuario());
        destino.setNombre(origin.getNombre());
        destino.setPaterno(origin.getPaterno());
        destino.setMaterno(origin.getMaterno());
        destino.setLogin(origin.getLogin());
        destino.setPassword(origin.getPassword());
        destino.setActivo(origin.getActivo());
        destino.setCveGrupo(origin.getCveGrupo());

        return destino;
    }

    public static PersonaDTO fromVO (PersonaVO origin){
         PersonaDTO destino = new PersonaDTO();

        destino.setIdUsuario(origin.getId_usuario());
        destino.setNombre(origin.getNombre());
        destino.setPaterno(origin.getPaterno());
        destino.setMaterno(origin.getMaterno());
        destino.setLogin(origin.getLogin());
        destino.setPassword(origin.getPassword());
        destino.setActivo(origin.getActivo());
        destino.setCveGrupo(origin.getCveGrupo());

         return destino;
    }

    private PersonaBuilder(){

    }

}
