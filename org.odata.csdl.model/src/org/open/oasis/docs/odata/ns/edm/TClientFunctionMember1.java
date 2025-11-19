/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.open.oasis.docs.odata.ns.edm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>TClient Function Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTClientFunctionMember1()
 * @model extendedMetaData="name='TClientFunction_._member_._1'"
 * @generated
 */
@ProviderType
public enum TClientFunctionMember1 implements Enumerator {
	/**
	 * The '<em><b>Odata Concat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CONCAT_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_CONCAT(0, "odataConcat", "odata.concat"),

	/**
	 * The '<em><b>Odata Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_CONTAINS(1, "odataContains", "odata.contains"),

	/**
	 * The '<em><b>Odata Endswith</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ENDSWITH_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_ENDSWITH(2, "odataEndswith", "odata.endswith"),

	/**
	 * The '<em><b>Odata Indexof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_INDEXOF_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_INDEXOF(3, "odataIndexof", "odata.indexof"),

	/**
	 * The '<em><b>Odata Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_LENGTH(4, "odataLength", "odata.length"),

	/**
	 * The '<em><b>Odata Startswith</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_STARTSWITH_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_STARTSWITH(5, "odataStartswith", "odata.startswith"),

	/**
	 * The '<em><b>Odata Substring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_SUBSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_SUBSTRING(6, "odataSubstring", "odata.substring"),

	/**
	 * The '<em><b>Odata Hassubset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HASSUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_HASSUBSET(7, "odataHassubset", "odata.hassubset"),

	/**
	 * The '<em><b>Odata Hassubsequence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HASSUBSEQUENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_HASSUBSEQUENCE(8, "odataHassubsequence", "odata.hassubsequence"),

	/**
	 * The '<em><b>Odata Tolower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOLOWER_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TOLOWER(9, "odataTolower", "odata.tolower"),

	/**
	 * The '<em><b>Odata Toupper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOUPPER_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TOUPPER(10, "odataToupper", "odata.toupper"),

	/**
	 * The '<em><b>Odata Trim</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TRIM_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TRIM(11, "odataTrim", "odata.trim"),

	/**
	 * The '<em><b>Odata Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_DATE(12, "odataDate", "odata.date"),

	/**
	 * The '<em><b>Odata Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_DAY(13, "odataDay", "odata.day"),

	/**
	 * The '<em><b>Odata Fractionalseconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FRACTIONALSECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_FRACTIONALSECONDS(14, "odataFractionalseconds", "odata.fractionalseconds"),

	/**
	 * The '<em><b>Odata Hour</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HOUR_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_HOUR(15, "odataHour", "odata.hour"),

	/**
	 * The '<em><b>Odata Maxdatetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MAXDATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_MAXDATETIME(16, "odataMaxdatetime", "odata.maxdatetime"),

	/**
	 * The '<em><b>Odata Mindatetime</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MINDATETIME_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_MINDATETIME(17, "odataMindatetime", "odata.mindatetime"),

	/**
	 * The '<em><b>Odata Minute</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MINUTE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_MINUTE(18, "odataMinute", "odata.minute"),

	/**
	 * The '<em><b>Odata Month</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_MONTH(19, "odataMonth", "odata.month"),

	/**
	 * The '<em><b>Odata Now</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_NOW_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_NOW(20, "odataNow", "odata.now"),

	/**
	 * The '<em><b>Odata Second</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_SECOND_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_SECOND(21, "odataSecond", "odata.second"),

	/**
	 * The '<em><b>Odata Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TIME(22, "odataTime", "odata.time"),

	/**
	 * The '<em><b>Odata Totaloffsetminutes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOTALOFFSETMINUTES_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TOTALOFFSETMINUTES(23, "odataTotaloffsetminutes", "odata.totaloffsetminutes"),

	/**
	 * The '<em><b>Odata Totalseconds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOTALSECONDS_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_TOTALSECONDS(24, "odataTotalseconds", "odata.totalseconds"),

	/**
	 * The '<em><b>Odata Year</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_YEAR(25, "odataYear", "odata.year"),

	/**
	 * The '<em><b>Odata Ceiling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CEILING_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_CEILING(26, "odataCeiling", "odata.ceiling"),

	/**
	 * The '<em><b>Odata Floor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FLOOR_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_FLOOR(27, "odataFloor", "odata.floor"),

	/**
	 * The '<em><b>Odata Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_ROUND(28, "odataRound", "odata.round"),

	/**
	 * The '<em><b>Odata Cast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CAST_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_CAST(29, "odataCast", "odata.cast"),

	/**
	 * The '<em><b>Odata Isof</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ISOF_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_ISOF(30, "odataIsof", "odata.isof"),

	/**
	 * The '<em><b>Odata Geo Distance</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_DISTANCE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_GEO_DISTANCE(31, "odataGeoDistance", "odata.geo.distance"),

	/**
	 * The '<em><b>Odata Geo Intersects</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_INTERSECTS_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_GEO_INTERSECTS(32, "odataGeoIntersects", "odata.geo.intersects"),

	/**
	 * The '<em><b>Odata Geo Length</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_LENGTH_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_GEO_LENGTH(33, "odataGeoLength", "odata.geo.length"),

	/**
	 * The '<em><b>Odata Fill Uri Template</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FILL_URI_TEMPLATE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_FILL_URI_TEMPLATE(34, "odataFillUriTemplate", "odata.fillUriTemplate"),

	/**
	 * The '<em><b>Odata Uri Encode</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_URI_ENCODE_VALUE
	 * @generated
	 * @ordered
	 */
	ODATA_URI_ENCODE(35, "odataUriEncode", "odata.uriEncode");

	/**
	 * The '<em><b>Odata Concat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CONCAT
	 * @model name="odataConcat" literal="odata.concat"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_CONCAT_VALUE = 0;

	/**
	 * The '<em><b>Odata Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CONTAINS
	 * @model name="odataContains" literal="odata.contains"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_CONTAINS_VALUE = 1;

	/**
	 * The '<em><b>Odata Endswith</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ENDSWITH
	 * @model name="odataEndswith" literal="odata.endswith"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_ENDSWITH_VALUE = 2;

	/**
	 * The '<em><b>Odata Indexof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_INDEXOF
	 * @model name="odataIndexof" literal="odata.indexof"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_INDEXOF_VALUE = 3;

	/**
	 * The '<em><b>Odata Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_LENGTH
	 * @model name="odataLength" literal="odata.length"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_LENGTH_VALUE = 4;

	/**
	 * The '<em><b>Odata Startswith</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_STARTSWITH
	 * @model name="odataStartswith" literal="odata.startswith"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_STARTSWITH_VALUE = 5;

	/**
	 * The '<em><b>Odata Substring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_SUBSTRING
	 * @model name="odataSubstring" literal="odata.substring"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_SUBSTRING_VALUE = 6;

	/**
	 * The '<em><b>Odata Hassubset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HASSUBSET
	 * @model name="odataHassubset" literal="odata.hassubset"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_HASSUBSET_VALUE = 7;

	/**
	 * The '<em><b>Odata Hassubsequence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HASSUBSEQUENCE
	 * @model name="odataHassubsequence" literal="odata.hassubsequence"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_HASSUBSEQUENCE_VALUE = 8;

	/**
	 * The '<em><b>Odata Tolower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOLOWER
	 * @model name="odataTolower" literal="odata.tolower"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TOLOWER_VALUE = 9;

	/**
	 * The '<em><b>Odata Toupper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOUPPER
	 * @model name="odataToupper" literal="odata.toupper"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TOUPPER_VALUE = 10;

	/**
	 * The '<em><b>Odata Trim</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TRIM
	 * @model name="odataTrim" literal="odata.trim"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TRIM_VALUE = 11;

	/**
	 * The '<em><b>Odata Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_DATE
	 * @model name="odataDate" literal="odata.date"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_DATE_VALUE = 12;

	/**
	 * The '<em><b>Odata Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_DAY
	 * @model name="odataDay" literal="odata.day"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_DAY_VALUE = 13;

	/**
	 * The '<em><b>Odata Fractionalseconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FRACTIONALSECONDS
	 * @model name="odataFractionalseconds" literal="odata.fractionalseconds"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_FRACTIONALSECONDS_VALUE = 14;

	/**
	 * The '<em><b>Odata Hour</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_HOUR
	 * @model name="odataHour" literal="odata.hour"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_HOUR_VALUE = 15;

	/**
	 * The '<em><b>Odata Maxdatetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MAXDATETIME
	 * @model name="odataMaxdatetime" literal="odata.maxdatetime"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_MAXDATETIME_VALUE = 16;

	/**
	 * The '<em><b>Odata Mindatetime</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MINDATETIME
	 * @model name="odataMindatetime" literal="odata.mindatetime"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_MINDATETIME_VALUE = 17;

	/**
	 * The '<em><b>Odata Minute</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MINUTE
	 * @model name="odataMinute" literal="odata.minute"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_MINUTE_VALUE = 18;

	/**
	 * The '<em><b>Odata Month</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_MONTH
	 * @model name="odataMonth" literal="odata.month"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_MONTH_VALUE = 19;

	/**
	 * The '<em><b>Odata Now</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_NOW
	 * @model name="odataNow" literal="odata.now"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_NOW_VALUE = 20;

	/**
	 * The '<em><b>Odata Second</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_SECOND
	 * @model name="odataSecond" literal="odata.second"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_SECOND_VALUE = 21;

	/**
	 * The '<em><b>Odata Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TIME
	 * @model name="odataTime" literal="odata.time"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TIME_VALUE = 22;

	/**
	 * The '<em><b>Odata Totaloffsetminutes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOTALOFFSETMINUTES
	 * @model name="odataTotaloffsetminutes" literal="odata.totaloffsetminutes"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TOTALOFFSETMINUTES_VALUE = 23;

	/**
	 * The '<em><b>Odata Totalseconds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_TOTALSECONDS
	 * @model name="odataTotalseconds" literal="odata.totalseconds"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_TOTALSECONDS_VALUE = 24;

	/**
	 * The '<em><b>Odata Year</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_YEAR
	 * @model name="odataYear" literal="odata.year"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_YEAR_VALUE = 25;

	/**
	 * The '<em><b>Odata Ceiling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CEILING
	 * @model name="odataCeiling" literal="odata.ceiling"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_CEILING_VALUE = 26;

	/**
	 * The '<em><b>Odata Floor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FLOOR
	 * @model name="odataFloor" literal="odata.floor"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_FLOOR_VALUE = 27;

	/**
	 * The '<em><b>Odata Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ROUND
	 * @model name="odataRound" literal="odata.round"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_ROUND_VALUE = 28;

	/**
	 * The '<em><b>Odata Cast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_CAST
	 * @model name="odataCast" literal="odata.cast"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_CAST_VALUE = 29;

	/**
	 * The '<em><b>Odata Isof</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_ISOF
	 * @model name="odataIsof" literal="odata.isof"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_ISOF_VALUE = 30;

	/**
	 * The '<em><b>Odata Geo Distance</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_DISTANCE
	 * @model name="odataGeoDistance" literal="odata.geo.distance"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_GEO_DISTANCE_VALUE = 31;

	/**
	 * The '<em><b>Odata Geo Intersects</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_INTERSECTS
	 * @model name="odataGeoIntersects" literal="odata.geo.intersects"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_GEO_INTERSECTS_VALUE = 32;

	/**
	 * The '<em><b>Odata Geo Length</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_GEO_LENGTH
	 * @model name="odataGeoLength" literal="odata.geo.length"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_GEO_LENGTH_VALUE = 33;

	/**
	 * The '<em><b>Odata Fill Uri Template</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_FILL_URI_TEMPLATE
	 * @model name="odataFillUriTemplate" literal="odata.fillUriTemplate"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_FILL_URI_TEMPLATE_VALUE = 34;

	/**
	 * The '<em><b>Odata Uri Encode</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ODATA_URI_ENCODE
	 * @model name="odataUriEncode" literal="odata.uriEncode"
	 * @generated
	 * @ordered
	 */
	public static final int ODATA_URI_ENCODE_VALUE = 35;

	/**
	 * An array of all the '<em><b>TClient Function Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TClientFunctionMember1[] VALUES_ARRAY =
		new TClientFunctionMember1[] {
			ODATA_CONCAT,
			ODATA_CONTAINS,
			ODATA_ENDSWITH,
			ODATA_INDEXOF,
			ODATA_LENGTH,
			ODATA_STARTSWITH,
			ODATA_SUBSTRING,
			ODATA_HASSUBSET,
			ODATA_HASSUBSEQUENCE,
			ODATA_TOLOWER,
			ODATA_TOUPPER,
			ODATA_TRIM,
			ODATA_DATE,
			ODATA_DAY,
			ODATA_FRACTIONALSECONDS,
			ODATA_HOUR,
			ODATA_MAXDATETIME,
			ODATA_MINDATETIME,
			ODATA_MINUTE,
			ODATA_MONTH,
			ODATA_NOW,
			ODATA_SECOND,
			ODATA_TIME,
			ODATA_TOTALOFFSETMINUTES,
			ODATA_TOTALSECONDS,
			ODATA_YEAR,
			ODATA_CEILING,
			ODATA_FLOOR,
			ODATA_ROUND,
			ODATA_CAST,
			ODATA_ISOF,
			ODATA_GEO_DISTANCE,
			ODATA_GEO_INTERSECTS,
			ODATA_GEO_LENGTH,
			ODATA_FILL_URI_TEMPLATE,
			ODATA_URI_ENCODE,
		};

	/**
	 * A public read-only list of all the '<em><b>TClient Function Member1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TClientFunctionMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TClient Function Member1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TClientFunctionMember1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TClientFunctionMember1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TClient Function Member1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TClientFunctionMember1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TClientFunctionMember1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TClient Function Member1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TClientFunctionMember1 get(int value) {
		switch (value) {
			case ODATA_CONCAT_VALUE: return ODATA_CONCAT;
			case ODATA_CONTAINS_VALUE: return ODATA_CONTAINS;
			case ODATA_ENDSWITH_VALUE: return ODATA_ENDSWITH;
			case ODATA_INDEXOF_VALUE: return ODATA_INDEXOF;
			case ODATA_LENGTH_VALUE: return ODATA_LENGTH;
			case ODATA_STARTSWITH_VALUE: return ODATA_STARTSWITH;
			case ODATA_SUBSTRING_VALUE: return ODATA_SUBSTRING;
			case ODATA_HASSUBSET_VALUE: return ODATA_HASSUBSET;
			case ODATA_HASSUBSEQUENCE_VALUE: return ODATA_HASSUBSEQUENCE;
			case ODATA_TOLOWER_VALUE: return ODATA_TOLOWER;
			case ODATA_TOUPPER_VALUE: return ODATA_TOUPPER;
			case ODATA_TRIM_VALUE: return ODATA_TRIM;
			case ODATA_DATE_VALUE: return ODATA_DATE;
			case ODATA_DAY_VALUE: return ODATA_DAY;
			case ODATA_FRACTIONALSECONDS_VALUE: return ODATA_FRACTIONALSECONDS;
			case ODATA_HOUR_VALUE: return ODATA_HOUR;
			case ODATA_MAXDATETIME_VALUE: return ODATA_MAXDATETIME;
			case ODATA_MINDATETIME_VALUE: return ODATA_MINDATETIME;
			case ODATA_MINUTE_VALUE: return ODATA_MINUTE;
			case ODATA_MONTH_VALUE: return ODATA_MONTH;
			case ODATA_NOW_VALUE: return ODATA_NOW;
			case ODATA_SECOND_VALUE: return ODATA_SECOND;
			case ODATA_TIME_VALUE: return ODATA_TIME;
			case ODATA_TOTALOFFSETMINUTES_VALUE: return ODATA_TOTALOFFSETMINUTES;
			case ODATA_TOTALSECONDS_VALUE: return ODATA_TOTALSECONDS;
			case ODATA_YEAR_VALUE: return ODATA_YEAR;
			case ODATA_CEILING_VALUE: return ODATA_CEILING;
			case ODATA_FLOOR_VALUE: return ODATA_FLOOR;
			case ODATA_ROUND_VALUE: return ODATA_ROUND;
			case ODATA_CAST_VALUE: return ODATA_CAST;
			case ODATA_ISOF_VALUE: return ODATA_ISOF;
			case ODATA_GEO_DISTANCE_VALUE: return ODATA_GEO_DISTANCE;
			case ODATA_GEO_INTERSECTS_VALUE: return ODATA_GEO_INTERSECTS;
			case ODATA_GEO_LENGTH_VALUE: return ODATA_GEO_LENGTH;
			case ODATA_FILL_URI_TEMPLATE_VALUE: return ODATA_FILL_URI_TEMPLATE;
			case ODATA_URI_ENCODE_VALUE: return ODATA_URI_ENCODE;
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
	private TClientFunctionMember1(int value, String name, String literal) {
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
	
} //TClientFunctionMember1
