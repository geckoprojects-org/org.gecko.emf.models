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
 * A representation of the literals of the enumeration '<em><b>TPrimitive Type Member0</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmPackage#getTPrimitiveTypeMember0()
 * @model extendedMetaData="name='TPrimitiveType_._member_._0'"
 * @generated
 */
@ProviderType
public enum TPrimitiveTypeMember0 implements Enumerator {
	/**
	 * The '<em><b>Edm Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_BINARY(0, "EdmBinary", "Edm.Binary"),

	/**
	 * The '<em><b>Edm Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_BOOLEAN(1, "EdmBoolean", "Edm.Boolean"),

	/**
	 * The '<em><b>Edm Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_BYTE(2, "EdmByte", "Edm.Byte"),

	/**
	 * The '<em><b>Edm Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_DATE(3, "EdmDate", "Edm.Date"),

	/**
	 * The '<em><b>Edm Date Time Offset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DATE_TIME_OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_DATE_TIME_OFFSET(4, "EdmDateTimeOffset", "Edm.DateTimeOffset"),

	/**
	 * The '<em><b>Edm Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_DURATION(5, "EdmDuration", "Edm.Duration"),

	/**
	 * The '<em><b>Edm Time Of Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_TIME_OF_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_TIME_OF_DAY(6, "EdmTimeOfDay", "Edm.TimeOfDay"),

	/**
	 * The '<em><b>Edm Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_DECIMAL(7, "EdmDecimal", "Edm.Decimal"),

	/**
	 * The '<em><b>Edm Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_DOUBLE(8, "EdmDouble", "Edm.Double"),

	/**
	 * The '<em><b>Edm Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_SINGLE(9, "EdmSingle", "Edm.Single"),

	/**
	 * The '<em><b>Edm Geography Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_POINT(10, "EdmGeographyPoint", "Edm.GeographyPoint"),

	/**
	 * The '<em><b>Edm Geography Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_LINE_STRING(11, "EdmGeographyLineString", "Edm.GeographyLineString"),

	/**
	 * The '<em><b>Edm Geography Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_POLYGON(12, "EdmGeographyPolygon", "Edm.GeographyPolygon"),

	/**
	 * The '<em><b>Edm Geography Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_MULTI_POINT(13, "EdmGeographyMultiPoint", "Edm.GeographyMultiPoint"),

	/**
	 * The '<em><b>Edm Geography Multi Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_MULTI_LINE_STRING(14, "EdmGeographyMultiLineString", "Edm.GeographyMultiLineString"),

	/**
	 * The '<em><b>Edm Geography Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_MULTI_POLYGON(15, "EdmGeographyMultiPolygon", "Edm.GeographyMultiPolygon"),

	/**
	 * The '<em><b>Edm Geography Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOGRAPHY_COLLECTION(16, "EdmGeographyCollection", "Edm.GeographyCollection"),

	/**
	 * The '<em><b>Edm Geometry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_POINT(17, "EdmGeometryPoint", "Edm.GeometryPoint"),

	/**
	 * The '<em><b>Edm Geometry Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_LINE_STRING(18, "EdmGeometryLineString", "Edm.GeometryLineString"),

	/**
	 * The '<em><b>Edm Geometry Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_POLYGON(19, "EdmGeometryPolygon", "Edm.GeometryPolygon"),

	/**
	 * The '<em><b>Edm Geometry Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_MULTI_POINT(20, "EdmGeometryMultiPoint", "Edm.GeometryMultiPoint"),

	/**
	 * The '<em><b>Edm Geometry Multi Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_MULTI_LINE_STRING(21, "EdmGeometryMultiLineString", "Edm.GeometryMultiLineString"),

	/**
	 * The '<em><b>Edm Geometry Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_MULTI_POLYGON(22, "EdmGeometryMultiPolygon", "Edm.GeometryMultiPolygon"),

	/**
	 * The '<em><b>Edm Geometry Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GEOMETRY_COLLECTION(23, "EdmGeometryCollection", "Edm.GeometryCollection"),

	/**
	 * The '<em><b>Edm Guid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GUID_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_GUID(24, "EdmGuid", "Edm.Guid"),

	/**
	 * The '<em><b>Edm Int16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT16_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_INT16(25, "EdmInt16", "Edm.Int16"),

	/**
	 * The '<em><b>Edm Int32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT32_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_INT32(26, "EdmInt32", "Edm.Int32"),

	/**
	 * The '<em><b>Edm Int64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT64_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_INT64(27, "EdmInt64", "Edm.Int64"),

	/**
	 * The '<em><b>Edm String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_STRING(28, "EdmString", "Edm.String"),

	/**
	 * The '<em><b>Edm SByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_SBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	EDM_SBYTE(29, "EdmSByte", "Edm.SByte"),

	/**
	 * The '<em><b>Collection Edm Binary</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BINARY_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_BINARY(30, "CollectionEdmBinary", "Collection(Edm.Binary)"),

	/**
	 * The '<em><b>Collection Edm Boolean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BOOLEAN_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_BOOLEAN(31, "CollectionEdmBoolean", "Collection(Edm.Boolean)"),

	/**
	 * The '<em><b>Collection Edm Byte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BYTE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_BYTE(32, "CollectionEdmByte", "Collection(Edm.Byte)"),

	/**
	 * The '<em><b>Collection Edm Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_DATE(33, "CollectionEdmDate", "Collection(Edm.Date)"),

	/**
	 * The '<em><b>Collection Edm Date Time Offset</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DATE_TIME_OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_DATE_TIME_OFFSET(34, "CollectionEdmDateTimeOffset", "Collection(Edm.DateTimeOffset)"),

	/**
	 * The '<em><b>Collection Edm Duration</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DURATION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_DURATION(35, "CollectionEdmDuration", "Collection(Edm.Duration)"),

	/**
	 * The '<em><b>Collection Edm Time Of Day</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_TIME_OF_DAY_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_TIME_OF_DAY(36, "CollectionEdmTimeOfDay", "Collection(Edm.TimeOfDay)"),

	/**
	 * The '<em><b>Collection Edm Decimal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_DECIMAL(37, "CollectionEdmDecimal", "Collection(Edm.Decimal)"),

	/**
	 * The '<em><b>Collection Edm Double</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_DOUBLE(38, "CollectionEdmDouble", "Collection(Edm.Double)"),

	/**
	 * The '<em><b>Collection Edm Single</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_SINGLE(39, "CollectionEdmSingle", "Collection(Edm.Single)"),

	/**
	 * The '<em><b>Collection Edm Geography Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_POINT(40, "CollectionEdmGeographyPoint", "Collection(Edm.GeographyPoint)"),

	/**
	 * The '<em><b>Collection Edm Geography Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_LINE_STRING(41, "CollectionEdmGeographyLineString", "Collection(Edm.GeographyLineString)"),

	/**
	 * The '<em><b>Collection Edm Geography Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_POLYGON(42, "CollectionEdmGeographyPolygon", "Collection(Edm.GeographyPolygon)"),

	/**
	 * The '<em><b>Collection Edm Geography Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_MULTI_POINT(43, "CollectionEdmGeographyMultiPoint", "Collection(Edm.GeographyMultiPoint)"),

	/**
	 * The '<em><b>Collection Edm Geography Multi Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING(44, "CollectionEdmGeographyMultiLineString", "Collection(Edm.GeographyMultiLineString)"),

	/**
	 * The '<em><b>Collection Edm Geography Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON(45, "CollectionEdmGeographyMultiPolygon", "Collection(Edm.GeographyMultiPolygon)"),

	/**
	 * The '<em><b>Collection Edm Geography Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOGRAPHY_COLLECTION(46, "CollectionEdmGeographyCollection", "Collection(Edm.GeographyCollection)"),

	/**
	 * The '<em><b>Collection Edm Geometry Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_POINT(47, "CollectionEdmGeometryPoint", "Collection(Edm.GeometryPoint)"),

	/**
	 * The '<em><b>Collection Edm Geometry Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_LINE_STRING(48, "CollectionEdmGeometryLineString", "Collection(Edm.GeometryLineString)"),

	/**
	 * The '<em><b>Collection Edm Geometry Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_POLYGON(49, "CollectionEdmGeometryPolygon", "Collection(Edm.GeometryPolygon)"),

	/**
	 * The '<em><b>Collection Edm Geometry Multi Point</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_MULTI_POINT(50, "CollectionEdmGeometryMultiPoint", "Collection(Edm.GeometryMultiPoint)"),

	/**
	 * The '<em><b>Collection Edm Geometry Multi Line String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING(51, "CollectionEdmGeometryMultiLineString", "Collection(Edm.GeometryMultiLineString)"),

	/**
	 * The '<em><b>Collection Edm Geometry Multi Polygon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_MULTI_POLYGON(52, "CollectionEdmGeometryMultiPolygon", "Collection(Edm.GeometryMultiPolygon)"),

	/**
	 * The '<em><b>Collection Edm Geometry Collection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GEOMETRY_COLLECTION(53, "CollectionEdmGeometryCollection", "Collection(Edm.GeometryCollection)"),

	/**
	 * The '<em><b>Collection Edm Guid</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GUID_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_GUID(54, "CollectionEdmGuid", "Collection(Edm.Guid)"),

	/**
	 * The '<em><b>Collection Edm Int16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT16_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_INT16(55, "CollectionEdmInt16", "Collection(Edm.Int16)"),

	/**
	 * The '<em><b>Collection Edm Int32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT32_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_INT32(56, "CollectionEdmInt32", "Collection(Edm.Int32)"),

	/**
	 * The '<em><b>Collection Edm Int64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT64_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_INT64(57, "CollectionEdmInt64", "Collection(Edm.Int64)"),

	/**
	 * The '<em><b>Collection Edm String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_STRING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_STRING(58, "CollectionEdmString", "Collection(Edm.String)"),

	/**
	 * The '<em><b>Collection Edm SByte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_SBYTE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION_EDM_SBYTE(59, "CollectionEdmSByte", "Collection(Edm.SByte)");

	/**
	 * The '<em><b>Edm Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BINARY
	 * @model name="EdmBinary" literal="Edm.Binary"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_BINARY_VALUE = 0;

	/**
	 * The '<em><b>Edm Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BOOLEAN
	 * @model name="EdmBoolean" literal="Edm.Boolean"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_BOOLEAN_VALUE = 1;

	/**
	 * The '<em><b>Edm Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_BYTE
	 * @model name="EdmByte" literal="Edm.Byte"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_BYTE_VALUE = 2;

	/**
	 * The '<em><b>Edm Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DATE
	 * @model name="EdmDate" literal="Edm.Date"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_DATE_VALUE = 3;

	/**
	 * The '<em><b>Edm Date Time Offset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DATE_TIME_OFFSET
	 * @model name="EdmDateTimeOffset" literal="Edm.DateTimeOffset"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_DATE_TIME_OFFSET_VALUE = 4;

	/**
	 * The '<em><b>Edm Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DURATION
	 * @model name="EdmDuration" literal="Edm.Duration"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_DURATION_VALUE = 5;

	/**
	 * The '<em><b>Edm Time Of Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_TIME_OF_DAY
	 * @model name="EdmTimeOfDay" literal="Edm.TimeOfDay"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_TIME_OF_DAY_VALUE = 6;

	/**
	 * The '<em><b>Edm Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DECIMAL
	 * @model name="EdmDecimal" literal="Edm.Decimal"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_DECIMAL_VALUE = 7;

	/**
	 * The '<em><b>Edm Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_DOUBLE
	 * @model name="EdmDouble" literal="Edm.Double"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_DOUBLE_VALUE = 8;

	/**
	 * The '<em><b>Edm Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_SINGLE
	 * @model name="EdmSingle" literal="Edm.Single"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_SINGLE_VALUE = 9;

	/**
	 * The '<em><b>Edm Geography Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_POINT
	 * @model name="EdmGeographyPoint" literal="Edm.GeographyPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_POINT_VALUE = 10;

	/**
	 * The '<em><b>Edm Geography Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_LINE_STRING
	 * @model name="EdmGeographyLineString" literal="Edm.GeographyLineString"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_LINE_STRING_VALUE = 11;

	/**
	 * The '<em><b>Edm Geography Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_POLYGON
	 * @model name="EdmGeographyPolygon" literal="Edm.GeographyPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_POLYGON_VALUE = 12;

	/**
	 * The '<em><b>Edm Geography Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_POINT
	 * @model name="EdmGeographyMultiPoint" literal="Edm.GeographyMultiPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_MULTI_POINT_VALUE = 13;

	/**
	 * The '<em><b>Edm Geography Multi Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_LINE_STRING
	 * @model name="EdmGeographyMultiLineString" literal="Edm.GeographyMultiLineString"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE = 14;

	/**
	 * The '<em><b>Edm Geography Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_MULTI_POLYGON
	 * @model name="EdmGeographyMultiPolygon" literal="Edm.GeographyMultiPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_MULTI_POLYGON_VALUE = 15;

	/**
	 * The '<em><b>Edm Geography Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOGRAPHY_COLLECTION
	 * @model name="EdmGeographyCollection" literal="Edm.GeographyCollection"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOGRAPHY_COLLECTION_VALUE = 16;

	/**
	 * The '<em><b>Edm Geometry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_POINT
	 * @model name="EdmGeometryPoint" literal="Edm.GeometryPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_POINT_VALUE = 17;

	/**
	 * The '<em><b>Edm Geometry Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_LINE_STRING
	 * @model name="EdmGeometryLineString" literal="Edm.GeometryLineString"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_LINE_STRING_VALUE = 18;

	/**
	 * The '<em><b>Edm Geometry Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_POLYGON
	 * @model name="EdmGeometryPolygon" literal="Edm.GeometryPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_POLYGON_VALUE = 19;

	/**
	 * The '<em><b>Edm Geometry Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_POINT
	 * @model name="EdmGeometryMultiPoint" literal="Edm.GeometryMultiPoint"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_MULTI_POINT_VALUE = 20;

	/**
	 * The '<em><b>Edm Geometry Multi Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_LINE_STRING
	 * @model name="EdmGeometryMultiLineString" literal="Edm.GeometryMultiLineString"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_MULTI_LINE_STRING_VALUE = 21;

	/**
	 * The '<em><b>Edm Geometry Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_MULTI_POLYGON
	 * @model name="EdmGeometryMultiPolygon" literal="Edm.GeometryMultiPolygon"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_MULTI_POLYGON_VALUE = 22;

	/**
	 * The '<em><b>Edm Geometry Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GEOMETRY_COLLECTION
	 * @model name="EdmGeometryCollection" literal="Edm.GeometryCollection"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GEOMETRY_COLLECTION_VALUE = 23;

	/**
	 * The '<em><b>Edm Guid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_GUID
	 * @model name="EdmGuid" literal="Edm.Guid"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_GUID_VALUE = 24;

	/**
	 * The '<em><b>Edm Int16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT16
	 * @model name="EdmInt16" literal="Edm.Int16"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_INT16_VALUE = 25;

	/**
	 * The '<em><b>Edm Int32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT32
	 * @model name="EdmInt32" literal="Edm.Int32"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_INT32_VALUE = 26;

	/**
	 * The '<em><b>Edm Int64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_INT64
	 * @model name="EdmInt64" literal="Edm.Int64"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_INT64_VALUE = 27;

	/**
	 * The '<em><b>Edm String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_STRING
	 * @model name="EdmString" literal="Edm.String"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_STRING_VALUE = 28;

	/**
	 * The '<em><b>Edm SByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EDM_SBYTE
	 * @model name="EdmSByte" literal="Edm.SByte"
	 * @generated
	 * @ordered
	 */
	public static final int EDM_SBYTE_VALUE = 29;

	/**
	 * The '<em><b>Collection Edm Binary</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BINARY
	 * @model name="CollectionEdmBinary" literal="Collection(Edm.Binary)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_BINARY_VALUE = 30;

	/**
	 * The '<em><b>Collection Edm Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BOOLEAN
	 * @model name="CollectionEdmBoolean" literal="Collection(Edm.Boolean)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_BOOLEAN_VALUE = 31;

	/**
	 * The '<em><b>Collection Edm Byte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_BYTE
	 * @model name="CollectionEdmByte" literal="Collection(Edm.Byte)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_BYTE_VALUE = 32;

	/**
	 * The '<em><b>Collection Edm Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DATE
	 * @model name="CollectionEdmDate" literal="Collection(Edm.Date)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_DATE_VALUE = 33;

	/**
	 * The '<em><b>Collection Edm Date Time Offset</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DATE_TIME_OFFSET
	 * @model name="CollectionEdmDateTimeOffset" literal="Collection(Edm.DateTimeOffset)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_DATE_TIME_OFFSET_VALUE = 34;

	/**
	 * The '<em><b>Collection Edm Duration</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DURATION
	 * @model name="CollectionEdmDuration" literal="Collection(Edm.Duration)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_DURATION_VALUE = 35;

	/**
	 * The '<em><b>Collection Edm Time Of Day</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_TIME_OF_DAY
	 * @model name="CollectionEdmTimeOfDay" literal="Collection(Edm.TimeOfDay)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_TIME_OF_DAY_VALUE = 36;

	/**
	 * The '<em><b>Collection Edm Decimal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DECIMAL
	 * @model name="CollectionEdmDecimal" literal="Collection(Edm.Decimal)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_DECIMAL_VALUE = 37;

	/**
	 * The '<em><b>Collection Edm Double</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_DOUBLE
	 * @model name="CollectionEdmDouble" literal="Collection(Edm.Double)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_DOUBLE_VALUE = 38;

	/**
	 * The '<em><b>Collection Edm Single</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_SINGLE
	 * @model name="CollectionEdmSingle" literal="Collection(Edm.Single)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_SINGLE_VALUE = 39;

	/**
	 * The '<em><b>Collection Edm Geography Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_POINT
	 * @model name="CollectionEdmGeographyPoint" literal="Collection(Edm.GeographyPoint)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_POINT_VALUE = 40;

	/**
	 * The '<em><b>Collection Edm Geography Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_LINE_STRING
	 * @model name="CollectionEdmGeographyLineString" literal="Collection(Edm.GeographyLineString)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_LINE_STRING_VALUE = 41;

	/**
	 * The '<em><b>Collection Edm Geography Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_POLYGON
	 * @model name="CollectionEdmGeographyPolygon" literal="Collection(Edm.GeographyPolygon)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_POLYGON_VALUE = 42;

	/**
	 * The '<em><b>Collection Edm Geography Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_POINT
	 * @model name="CollectionEdmGeographyMultiPoint" literal="Collection(Edm.GeographyMultiPoint)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_MULTI_POINT_VALUE = 43;

	/**
	 * The '<em><b>Collection Edm Geography Multi Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING
	 * @model name="CollectionEdmGeographyMultiLineString" literal="Collection(Edm.GeographyMultiLineString)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE = 44;

	/**
	 * The '<em><b>Collection Edm Geography Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON
	 * @model name="CollectionEdmGeographyMultiPolygon" literal="Collection(Edm.GeographyMultiPolygon)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON_VALUE = 45;

	/**
	 * The '<em><b>Collection Edm Geography Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOGRAPHY_COLLECTION
	 * @model name="CollectionEdmGeographyCollection" literal="Collection(Edm.GeographyCollection)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOGRAPHY_COLLECTION_VALUE = 46;

	/**
	 * The '<em><b>Collection Edm Geometry Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_POINT
	 * @model name="CollectionEdmGeometryPoint" literal="Collection(Edm.GeometryPoint)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_POINT_VALUE = 47;

	/**
	 * The '<em><b>Collection Edm Geometry Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_LINE_STRING
	 * @model name="CollectionEdmGeometryLineString" literal="Collection(Edm.GeometryLineString)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_LINE_STRING_VALUE = 48;

	/**
	 * The '<em><b>Collection Edm Geometry Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_POLYGON
	 * @model name="CollectionEdmGeometryPolygon" literal="Collection(Edm.GeometryPolygon)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_POLYGON_VALUE = 49;

	/**
	 * The '<em><b>Collection Edm Geometry Multi Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_POINT
	 * @model name="CollectionEdmGeometryMultiPoint" literal="Collection(Edm.GeometryMultiPoint)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_MULTI_POINT_VALUE = 50;

	/**
	 * The '<em><b>Collection Edm Geometry Multi Line String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING
	 * @model name="CollectionEdmGeometryMultiLineString" literal="Collection(Edm.GeometryMultiLineString)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING_VALUE = 51;

	/**
	 * The '<em><b>Collection Edm Geometry Multi Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_MULTI_POLYGON
	 * @model name="CollectionEdmGeometryMultiPolygon" literal="Collection(Edm.GeometryMultiPolygon)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_MULTI_POLYGON_VALUE = 52;

	/**
	 * The '<em><b>Collection Edm Geometry Collection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GEOMETRY_COLLECTION
	 * @model name="CollectionEdmGeometryCollection" literal="Collection(Edm.GeometryCollection)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GEOMETRY_COLLECTION_VALUE = 53;

	/**
	 * The '<em><b>Collection Edm Guid</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_GUID
	 * @model name="CollectionEdmGuid" literal="Collection(Edm.Guid)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_GUID_VALUE = 54;

	/**
	 * The '<em><b>Collection Edm Int16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT16
	 * @model name="CollectionEdmInt16" literal="Collection(Edm.Int16)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_INT16_VALUE = 55;

	/**
	 * The '<em><b>Collection Edm Int32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT32
	 * @model name="CollectionEdmInt32" literal="Collection(Edm.Int32)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_INT32_VALUE = 56;

	/**
	 * The '<em><b>Collection Edm Int64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_INT64
	 * @model name="CollectionEdmInt64" literal="Collection(Edm.Int64)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_INT64_VALUE = 57;

	/**
	 * The '<em><b>Collection Edm String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_STRING
	 * @model name="CollectionEdmString" literal="Collection(Edm.String)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_STRING_VALUE = 58;

	/**
	 * The '<em><b>Collection Edm SByte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTION_EDM_SBYTE
	 * @model name="CollectionEdmSByte" literal="Collection(Edm.SByte)"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_EDM_SBYTE_VALUE = 59;

	/**
	 * An array of all the '<em><b>TPrimitive Type Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TPrimitiveTypeMember0[] VALUES_ARRAY =
		new TPrimitiveTypeMember0[] {
			EDM_BINARY,
			EDM_BOOLEAN,
			EDM_BYTE,
			EDM_DATE,
			EDM_DATE_TIME_OFFSET,
			EDM_DURATION,
			EDM_TIME_OF_DAY,
			EDM_DECIMAL,
			EDM_DOUBLE,
			EDM_SINGLE,
			EDM_GEOGRAPHY_POINT,
			EDM_GEOGRAPHY_LINE_STRING,
			EDM_GEOGRAPHY_POLYGON,
			EDM_GEOGRAPHY_MULTI_POINT,
			EDM_GEOGRAPHY_MULTI_LINE_STRING,
			EDM_GEOGRAPHY_MULTI_POLYGON,
			EDM_GEOGRAPHY_COLLECTION,
			EDM_GEOMETRY_POINT,
			EDM_GEOMETRY_LINE_STRING,
			EDM_GEOMETRY_POLYGON,
			EDM_GEOMETRY_MULTI_POINT,
			EDM_GEOMETRY_MULTI_LINE_STRING,
			EDM_GEOMETRY_MULTI_POLYGON,
			EDM_GEOMETRY_COLLECTION,
			EDM_GUID,
			EDM_INT16,
			EDM_INT32,
			EDM_INT64,
			EDM_STRING,
			EDM_SBYTE,
			COLLECTION_EDM_BINARY,
			COLLECTION_EDM_BOOLEAN,
			COLLECTION_EDM_BYTE,
			COLLECTION_EDM_DATE,
			COLLECTION_EDM_DATE_TIME_OFFSET,
			COLLECTION_EDM_DURATION,
			COLLECTION_EDM_TIME_OF_DAY,
			COLLECTION_EDM_DECIMAL,
			COLLECTION_EDM_DOUBLE,
			COLLECTION_EDM_SINGLE,
			COLLECTION_EDM_GEOGRAPHY_POINT,
			COLLECTION_EDM_GEOGRAPHY_LINE_STRING,
			COLLECTION_EDM_GEOGRAPHY_POLYGON,
			COLLECTION_EDM_GEOGRAPHY_MULTI_POINT,
			COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING,
			COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON,
			COLLECTION_EDM_GEOGRAPHY_COLLECTION,
			COLLECTION_EDM_GEOMETRY_POINT,
			COLLECTION_EDM_GEOMETRY_LINE_STRING,
			COLLECTION_EDM_GEOMETRY_POLYGON,
			COLLECTION_EDM_GEOMETRY_MULTI_POINT,
			COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING,
			COLLECTION_EDM_GEOMETRY_MULTI_POLYGON,
			COLLECTION_EDM_GEOMETRY_COLLECTION,
			COLLECTION_EDM_GUID,
			COLLECTION_EDM_INT16,
			COLLECTION_EDM_INT32,
			COLLECTION_EDM_INT64,
			COLLECTION_EDM_STRING,
			COLLECTION_EDM_SBYTE,
		};

	/**
	 * A public read-only list of all the '<em><b>TPrimitive Type Member0</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TPrimitiveTypeMember0> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>TPrimitive Type Member0</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TPrimitiveTypeMember0 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPrimitiveTypeMember0 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPrimitive Type Member0</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TPrimitiveTypeMember0 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TPrimitiveTypeMember0 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>TPrimitive Type Member0</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TPrimitiveTypeMember0 get(int value) {
		switch (value) {
			case EDM_BINARY_VALUE: return EDM_BINARY;
			case EDM_BOOLEAN_VALUE: return EDM_BOOLEAN;
			case EDM_BYTE_VALUE: return EDM_BYTE;
			case EDM_DATE_VALUE: return EDM_DATE;
			case EDM_DATE_TIME_OFFSET_VALUE: return EDM_DATE_TIME_OFFSET;
			case EDM_DURATION_VALUE: return EDM_DURATION;
			case EDM_TIME_OF_DAY_VALUE: return EDM_TIME_OF_DAY;
			case EDM_DECIMAL_VALUE: return EDM_DECIMAL;
			case EDM_DOUBLE_VALUE: return EDM_DOUBLE;
			case EDM_SINGLE_VALUE: return EDM_SINGLE;
			case EDM_GEOGRAPHY_POINT_VALUE: return EDM_GEOGRAPHY_POINT;
			case EDM_GEOGRAPHY_LINE_STRING_VALUE: return EDM_GEOGRAPHY_LINE_STRING;
			case EDM_GEOGRAPHY_POLYGON_VALUE: return EDM_GEOGRAPHY_POLYGON;
			case EDM_GEOGRAPHY_MULTI_POINT_VALUE: return EDM_GEOGRAPHY_MULTI_POINT;
			case EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE: return EDM_GEOGRAPHY_MULTI_LINE_STRING;
			case EDM_GEOGRAPHY_MULTI_POLYGON_VALUE: return EDM_GEOGRAPHY_MULTI_POLYGON;
			case EDM_GEOGRAPHY_COLLECTION_VALUE: return EDM_GEOGRAPHY_COLLECTION;
			case EDM_GEOMETRY_POINT_VALUE: return EDM_GEOMETRY_POINT;
			case EDM_GEOMETRY_LINE_STRING_VALUE: return EDM_GEOMETRY_LINE_STRING;
			case EDM_GEOMETRY_POLYGON_VALUE: return EDM_GEOMETRY_POLYGON;
			case EDM_GEOMETRY_MULTI_POINT_VALUE: return EDM_GEOMETRY_MULTI_POINT;
			case EDM_GEOMETRY_MULTI_LINE_STRING_VALUE: return EDM_GEOMETRY_MULTI_LINE_STRING;
			case EDM_GEOMETRY_MULTI_POLYGON_VALUE: return EDM_GEOMETRY_MULTI_POLYGON;
			case EDM_GEOMETRY_COLLECTION_VALUE: return EDM_GEOMETRY_COLLECTION;
			case EDM_GUID_VALUE: return EDM_GUID;
			case EDM_INT16_VALUE: return EDM_INT16;
			case EDM_INT32_VALUE: return EDM_INT32;
			case EDM_INT64_VALUE: return EDM_INT64;
			case EDM_STRING_VALUE: return EDM_STRING;
			case EDM_SBYTE_VALUE: return EDM_SBYTE;
			case COLLECTION_EDM_BINARY_VALUE: return COLLECTION_EDM_BINARY;
			case COLLECTION_EDM_BOOLEAN_VALUE: return COLLECTION_EDM_BOOLEAN;
			case COLLECTION_EDM_BYTE_VALUE: return COLLECTION_EDM_BYTE;
			case COLLECTION_EDM_DATE_VALUE: return COLLECTION_EDM_DATE;
			case COLLECTION_EDM_DATE_TIME_OFFSET_VALUE: return COLLECTION_EDM_DATE_TIME_OFFSET;
			case COLLECTION_EDM_DURATION_VALUE: return COLLECTION_EDM_DURATION;
			case COLLECTION_EDM_TIME_OF_DAY_VALUE: return COLLECTION_EDM_TIME_OF_DAY;
			case COLLECTION_EDM_DECIMAL_VALUE: return COLLECTION_EDM_DECIMAL;
			case COLLECTION_EDM_DOUBLE_VALUE: return COLLECTION_EDM_DOUBLE;
			case COLLECTION_EDM_SINGLE_VALUE: return COLLECTION_EDM_SINGLE;
			case COLLECTION_EDM_GEOGRAPHY_POINT_VALUE: return COLLECTION_EDM_GEOGRAPHY_POINT;
			case COLLECTION_EDM_GEOGRAPHY_LINE_STRING_VALUE: return COLLECTION_EDM_GEOGRAPHY_LINE_STRING;
			case COLLECTION_EDM_GEOGRAPHY_POLYGON_VALUE: return COLLECTION_EDM_GEOGRAPHY_POLYGON;
			case COLLECTION_EDM_GEOGRAPHY_MULTI_POINT_VALUE: return COLLECTION_EDM_GEOGRAPHY_MULTI_POINT;
			case COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING_VALUE: return COLLECTION_EDM_GEOGRAPHY_MULTI_LINE_STRING;
			case COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON_VALUE: return COLLECTION_EDM_GEOGRAPHY_MULTI_POLYGON;
			case COLLECTION_EDM_GEOGRAPHY_COLLECTION_VALUE: return COLLECTION_EDM_GEOGRAPHY_COLLECTION;
			case COLLECTION_EDM_GEOMETRY_POINT_VALUE: return COLLECTION_EDM_GEOMETRY_POINT;
			case COLLECTION_EDM_GEOMETRY_LINE_STRING_VALUE: return COLLECTION_EDM_GEOMETRY_LINE_STRING;
			case COLLECTION_EDM_GEOMETRY_POLYGON_VALUE: return COLLECTION_EDM_GEOMETRY_POLYGON;
			case COLLECTION_EDM_GEOMETRY_MULTI_POINT_VALUE: return COLLECTION_EDM_GEOMETRY_MULTI_POINT;
			case COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING_VALUE: return COLLECTION_EDM_GEOMETRY_MULTI_LINE_STRING;
			case COLLECTION_EDM_GEOMETRY_MULTI_POLYGON_VALUE: return COLLECTION_EDM_GEOMETRY_MULTI_POLYGON;
			case COLLECTION_EDM_GEOMETRY_COLLECTION_VALUE: return COLLECTION_EDM_GEOMETRY_COLLECTION;
			case COLLECTION_EDM_GUID_VALUE: return COLLECTION_EDM_GUID;
			case COLLECTION_EDM_INT16_VALUE: return COLLECTION_EDM_INT16;
			case COLLECTION_EDM_INT32_VALUE: return COLLECTION_EDM_INT32;
			case COLLECTION_EDM_INT64_VALUE: return COLLECTION_EDM_INT64;
			case COLLECTION_EDM_STRING_VALUE: return COLLECTION_EDM_STRING;
			case COLLECTION_EDM_SBYTE_VALUE: return COLLECTION_EDM_SBYTE;
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
	private TPrimitiveTypeMember0(int value, String name, String literal) {
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
	
} //TPrimitiveTypeMember0
