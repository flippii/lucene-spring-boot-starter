package com.joshlong.lucene;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.Term;

interface DocumentWriteMapper<T> {

	@Data
	@RequiredArgsConstructor
	class DocumentWrite {

		private final Term term;

		private final Document document;

	}

	DocumentWrite map(T t) throws Exception;

}
