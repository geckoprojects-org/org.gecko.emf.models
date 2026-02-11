/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pubwork Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.docbook.ns.docbook.DocbookPackage#getPubworkType()
 * @model extendedMetaData="name='pubwork_._type'"
 * @generated
 */
@ProviderType
public enum PubworkType implements Enumerator {
	/**
	 * The '<em><b>Article</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTICLE_VALUE
	 * @generated
	 * @ordered
	 */
	ARTICLE(0, "article", "article"),

	/**
	 * The '<em><b>Bbs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BBS_VALUE
	 * @generated
	 * @ordered
	 */
	BBS(1, "bbs", "bbs"),

	/**
	 * The '<em><b>Book</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOK_VALUE
	 * @generated
	 * @ordered
	 */
	BOOK(2, "book", "book"),

	/**
	 * The '<em><b>Cdrom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDROM_VALUE
	 * @generated
	 * @ordered
	 */
	CDROM(3, "cdrom", "cdrom"),

	/**
	 * The '<em><b>Chapter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER_VALUE
	 * @generated
	 * @ordered
	 */
	CHAPTER(4, "chapter", "chapter"),

	/**
	 * The '<em><b>Dvd</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DVD_VALUE
	 * @generated
	 * @ordered
	 */
	DVD(5, "dvd", "dvd"),

	/**
	 * The '<em><b>Emailmessage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAILMESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	EMAILMESSAGE(6, "emailmessage", "emailmessage"),

	/**
	 * The '<em><b>Gopher</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOPHER_VALUE
	 * @generated
	 * @ordered
	 */
	GOPHER(7, "gopher", "gopher"),

	/**
	 * The '<em><b>Journal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNAL_VALUE
	 * @generated
	 * @ordered
	 */
	JOURNAL(8, "journal", "journal"),

	/**
	 * The '<em><b>Manuscript</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT_VALUE
	 * @generated
	 * @ordered
	 */
	MANUSCRIPT(9, "manuscript", "manuscript"),

	/**
	 * The '<em><b>Newsposting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWSPOSTING_VALUE
	 * @generated
	 * @ordered
	 */
	NEWSPOSTING(10, "newsposting", "newsposting"),

	/**
	 * The '<em><b>Part</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_VALUE
	 * @generated
	 * @ordered
	 */
	PART(11, "part", "part"),

	/**
	 * The '<em><b>Refentry</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFENTRY_VALUE
	 * @generated
	 * @ordered
	 */
	REFENTRY(12, "refentry", "refentry"),

	/**
	 * The '<em><b>Section</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SECTION(13, "section", "section"),

	/**
	 * The '<em><b>Series</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIES_VALUE
	 * @generated
	 * @ordered
	 */
	SERIES(14, "series", "series"),

	/**
	 * The '<em><b>Set</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_VALUE
	 * @generated
	 * @ordered
	 */
	SET(15, "set", "set"),

	/**
	 * The '<em><b>Webpage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBPAGE_VALUE
	 * @generated
	 * @ordered
	 */
	WEBPAGE(16, "webpage", "webpage"),

	/**
	 * The '<em><b>Wiki</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIKI_VALUE
	 * @generated
	 * @ordered
	 */
	WIKI(17, "wiki", "wiki");

	/**
	 * The '<em><b>Article</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARTICLE
	 * @model name="article"
	 * @generated
	 * @ordered
	 */
	public static final int ARTICLE_VALUE = 0;

	/**
	 * The '<em><b>Bbs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BBS
	 * @model name="bbs"
	 * @generated
	 * @ordered
	 */
	public static final int BBS_VALUE = 1;

	/**
	 * The '<em><b>Book</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOOK
	 * @model name="book"
	 * @generated
	 * @ordered
	 */
	public static final int BOOK_VALUE = 2;

	/**
	 * The '<em><b>Cdrom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CDROM
	 * @model name="cdrom"
	 * @generated
	 * @ordered
	 */
	public static final int CDROM_VALUE = 3;

	/**
	 * The '<em><b>Chapter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHAPTER
	 * @model name="chapter"
	 * @generated
	 * @ordered
	 */
	public static final int CHAPTER_VALUE = 4;

	/**
	 * The '<em><b>Dvd</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DVD
	 * @model name="dvd"
	 * @generated
	 * @ordered
	 */
	public static final int DVD_VALUE = 5;

	/**
	 * The '<em><b>Emailmessage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMAILMESSAGE
	 * @model name="emailmessage"
	 * @generated
	 * @ordered
	 */
	public static final int EMAILMESSAGE_VALUE = 6;

	/**
	 * The '<em><b>Gopher</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GOPHER
	 * @model name="gopher"
	 * @generated
	 * @ordered
	 */
	public static final int GOPHER_VALUE = 7;

	/**
	 * The '<em><b>Journal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOURNAL
	 * @model name="journal"
	 * @generated
	 * @ordered
	 */
	public static final int JOURNAL_VALUE = 8;

	/**
	 * The '<em><b>Manuscript</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANUSCRIPT
	 * @model name="manuscript"
	 * @generated
	 * @ordered
	 */
	public static final int MANUSCRIPT_VALUE = 9;

	/**
	 * The '<em><b>Newsposting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEWSPOSTING
	 * @model name="newsposting"
	 * @generated
	 * @ordered
	 */
	public static final int NEWSPOSTING_VALUE = 10;

	/**
	 * The '<em><b>Part</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART
	 * @model name="part"
	 * @generated
	 * @ordered
	 */
	public static final int PART_VALUE = 11;

	/**
	 * The '<em><b>Refentry</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFENTRY
	 * @model name="refentry"
	 * @generated
	 * @ordered
	 */
	public static final int REFENTRY_VALUE = 12;

	/**
	 * The '<em><b>Section</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECTION
	 * @model name="section"
	 * @generated
	 * @ordered
	 */
	public static final int SECTION_VALUE = 13;

	/**
	 * The '<em><b>Series</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIES
	 * @model name="series"
	 * @generated
	 * @ordered
	 */
	public static final int SERIES_VALUE = 14;

	/**
	 * The '<em><b>Set</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET
	 * @model name="set"
	 * @generated
	 * @ordered
	 */
	public static final int SET_VALUE = 15;

	/**
	 * The '<em><b>Webpage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBPAGE
	 * @model name="webpage"
	 * @generated
	 * @ordered
	 */
	public static final int WEBPAGE_VALUE = 16;

	/**
	 * The '<em><b>Wiki</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WIKI
	 * @model name="wiki"
	 * @generated
	 * @ordered
	 */
	public static final int WIKI_VALUE = 17;

	/**
	 * An array of all the '<em><b>Pubwork Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PubworkType[] VALUES_ARRAY =
		new PubworkType[] {
			ARTICLE,
			BBS,
			BOOK,
			CDROM,
			CHAPTER,
			DVD,
			EMAILMESSAGE,
			GOPHER,
			JOURNAL,
			MANUSCRIPT,
			NEWSPOSTING,
			PART,
			REFENTRY,
			SECTION,
			SERIES,
			SET,
			WEBPAGE,
			WIKI,
		};

	/**
	 * A public read-only list of all the '<em><b>Pubwork Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PubworkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pubwork Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubworkType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubworkType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pubwork Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubworkType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PubworkType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pubwork Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PubworkType get(int value) {
		switch (value) {
			case ARTICLE_VALUE: return ARTICLE;
			case BBS_VALUE: return BBS;
			case BOOK_VALUE: return BOOK;
			case CDROM_VALUE: return CDROM;
			case CHAPTER_VALUE: return CHAPTER;
			case DVD_VALUE: return DVD;
			case EMAILMESSAGE_VALUE: return EMAILMESSAGE;
			case GOPHER_VALUE: return GOPHER;
			case JOURNAL_VALUE: return JOURNAL;
			case MANUSCRIPT_VALUE: return MANUSCRIPT;
			case NEWSPOSTING_VALUE: return NEWSPOSTING;
			case PART_VALUE: return PART;
			case REFENTRY_VALUE: return REFENTRY;
			case SECTION_VALUE: return SECTION;
			case SERIES_VALUE: return SERIES;
			case SET_VALUE: return SET;
			case WEBPAGE_VALUE: return WEBPAGE;
			case WIKI_VALUE: return WIKI;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PubworkType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PubworkType
