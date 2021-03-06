package io.github.carlosthe19916.beans;

import io.github.carlosthe19916.beans.catalogs.Catalogo1;

public abstract class AbstractGuiaRemisionRelacionadaBeanBuilder<Builder extends AbstractGuiaRemisionRelacionadaBeanBuilder, Bean extends GuiaRemisionRelacionadaBean> {

    protected final GuiaRemisionRelacionadaBean guiaRemisionRelacionada;

    protected AbstractGuiaRemisionRelacionadaBeanBuilder(Bean bean) {
        this.guiaRemisionRelacionada = bean;
    }

    protected abstract Builder getGuiaRemisionRelacionadaBuilder();

    public Builder guiaRemision(String guiaRemision) {
        guiaRemisionRelacionada.setGuiaRemision(guiaRemision);
        return getGuiaRemisionRelacionadaBuilder();
    }

    public Builder tipoGuiaRemision(Catalogo1 tipoGuiaRemision) {
        guiaRemisionRelacionada.setTipoGuiaRemision(tipoGuiaRemision);
        return getGuiaRemisionRelacionadaBuilder();
    }

}
