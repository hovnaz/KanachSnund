package am.kanachsnund.kanachsnund.mapper.base;

public interface BaseMapper<Entity, Request, Response> {

    Entity toEntity(Request request);

    Response toResponse(Entity entity);
}
