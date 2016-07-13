
ALTER TABLE root.item ADD CONSTRAINT fk_produto FOREIGN KEY ( id_produto ) REFERENCES root.produto ( id ) ;
ALTER TABLE root.venda ADD CONSTRAINT fk_usuario FOREIGN KEY ( id_usuario ) REFERENCES root.usuario ( id ) ;
ALTER TABLE root.venda ADD CONSTRAINT fk_caixa FOREIGN KEY ( id_caixa ) REFERENCES root.caixa ( id ) ;

ALTER TABLE root.venda_item ADD CONSTRAINT fk_venda FOREIGN KEY ( id_venda ) REFERENCES root.venda ( id ) ;
ALTER TABLE root.venda_item ADD CONSTRAINT fk_item FOREIGN KEY ( id_item ) REFERENCES root.item ( id ) ;