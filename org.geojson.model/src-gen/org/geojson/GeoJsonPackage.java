/*
 */
package org.geojson;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.geojson.GeoJsonFactory
 * @model kind="package"
 *        annotation="Version value='1.0'"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel publicConstructors='true' contentTypeIdentifier='application/geo+json' oSGiCompatible='true' modelName='GeoJson' basePackage='org' dataTypeConverters='true'"
 * @generated
 */
@ProviderType
@EPackage(uri = GeoJsonPackage.eNS_URI, genModel = "/model/geojson.genmodel", genModelSourceLocations = {"model/geojson.genmodel","org.geojson.model/model/geojson.genmodel"}, ecore="/model/geojson.ecore", ecoreSourceLocations="/model/geojson.ecore")
public interface GeoJsonPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "geojson";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://geojson.org/model/2016";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "geo-json";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "application/geo+json";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeoJsonPackage eINSTANCE = org.geojson.impl.GeoJsonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.geojson.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.CoordinatesImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 0;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LONGITUDE = 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__LATITUDE = 1;

	/**
	 * The feature id for the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES__ELEVATION = 2;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.GeoJsonObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeoJsonObjectImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getGeoJsonObject()
	 * @generated
	 */
	int GEO_JSON_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT__BBOX = 0;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT__BOUNDING_BOX = 1;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT___SET_BBOX__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEO_JSON_OBJECT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.geojson.Geometry <em>Geometry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.Geometry
	 * @see org.geojson.impl.GeoJsonPackageImpl#getGeometry()
	 * @generated
	 */
	int GEOMETRY = 3;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__BBOX = GEO_JSON_OBJECT__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY__BOUNDING_BOX = GEO_JSON_OBJECT__BOUNDING_BOX;

	/**
	 * The number of structural features of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_FEATURE_COUNT = GEO_JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY___SET_BBOX__DOUBLE = GEO_JSON_OBJECT___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Geometry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERATION_COUNT = GEO_JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.PointImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The operation id for the '<em>Set Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___SET_DATA__DOUBLE = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.geojson.impl.LineStringImpl <em>Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.LineStringImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getLineString()
	 * @generated
	 */
	int LINE_STRING = 4;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING__COORDINATES = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.SimpleLineStringImpl <em>Simple Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.SimpleLineStringImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getSimpleLineString()
	 * @generated
	 */
	int SIMPLE_LINE_STRING = 5;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_STRING__DATA = 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_STRING__COORDINATES = 1;

	/**
	 * The number of structural features of the '<em>Simple Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_STRING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINE_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.FeatureImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BBOX = GEO_JSON_OBJECT__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__BOUNDING_BOX = GEO_JSON_OBJECT__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = GEO_JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GEOMETRY = GEO_JSON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = GEO_JSON_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = GEO_JSON_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE___SET_BBOX__DOUBLE = GEO_JSON_OBJECT___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = GEO_JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.FeatureCollectionImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getFeatureCollection()
	 * @generated
	 */
	int FEATURE_COLLECTION = 7;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__BBOX = GEO_JSON_OBJECT__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__BOUNDING_BOX = GEO_JSON_OBJECT__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION__FEATURES = GEO_JSON_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_FEATURE_COUNT = GEO_JSON_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION___SET_BBOX__DOUBLE = GEO_JSON_OBJECT___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Feature Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_OPERATION_COUNT = GEO_JSON_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.GeometryCollectionImpl <em>Geometry Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeometryCollectionImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getGeometryCollection()
	 * @generated
	 */
	int GEOMETRY_COLLECTION = 8;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Geometries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION__GEOMETRIES = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geometry Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Geometry Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_COLLECTION_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.MultiPointImpl <em>Multi Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.MultiPointImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiPoint()
	 * @generated
	 */
	int MULTI_POINT = 9;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT__COORDINATES = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The number of operations of the '<em>Multi Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POINT_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.PolygonImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 10;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exterior Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__EXTERIOR_RING = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interior Holes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__INTERIOR_HOLES = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The operation id for the '<em>Set Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON___SET_DATA__DOUBLE = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.geojson.impl.RingImpl <em>Ring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.RingImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getRing()
	 * @generated
	 */
	int RING = 11;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING__COORDINATES = 0;

	/**
	 * The number of structural features of the '<em>Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.HoleImpl <em>Hole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.HoleImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getHole()
	 * @generated
	 */
	int HOLE = 12;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__COORDINATES = RING__COORDINATES;

	/**
	 * The number of structural features of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_FEATURE_COUNT = RING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_OPERATION_COUNT = RING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.geojson.impl.MultiPolygonImpl <em>Multi Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.MultiPolygonImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiPolygon()
	 * @generated
	 */
	int MULTI_POLYGON = 13;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polygons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON__POLYGONS = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The operation id for the '<em>Set Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON___SET_DATA__DOUBLE = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_POLYGON_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.geojson.impl.SimplePolygonImpl <em>Simple Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.SimplePolygonImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getSimplePolygon()
	 * @generated
	 */
	int SIMPLE_POLYGON = 14;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON__DATA = 0;

	/**
	 * The feature id for the '<em><b>Exterior Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON__EXTERIOR_RING = 1;

	/**
	 * The feature id for the '<em><b>Interior Holes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON__INTERIOR_HOLES = 2;

	/**
	 * The number of structural features of the '<em>Simple Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON___SET_DATA__DOUBLE = 0;

	/**
	 * The number of operations of the '<em>Simple Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_POLYGON_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.geojson.impl.MultiLineStringImpl <em>Multi Line String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.MultiLineStringImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiLineString()
	 * @generated
	 */
	int MULTI_LINE_STRING = 15;

	/**
	 * The feature id for the '<em><b>Bbox</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__BBOX = GEOMETRY__BBOX;

	/**
	 * The feature id for the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__BOUNDING_BOX = GEOMETRY__BOUNDING_BOX;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__DATA = GEOMETRY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lines Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING__LINES_STRINGS = GEOMETRY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING_FEATURE_COUNT = GEOMETRY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Bbox</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING___SET_BBOX__DOUBLE = GEOMETRY___SET_BBOX__DOUBLE;

	/**
	 * The operation id for the '<em>Set Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING___SET_DATA__DOUBLE = GEOMETRY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multi Line String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_LINE_STRING_OPERATION_COUNT = GEOMETRY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.geojson.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.BoundingBoxImpl
	 * @see org.geojson.impl.GeoJsonPackageImpl#getBoundingBox()
	 * @generated
	 */
	int BOUNDING_BOX = 16;

	/**
	 * The feature id for the '<em><b>Southwest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__SOUTHWEST = 0;

	/**
	 * The feature id for the '<em><b>Northeast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX__NORTHEAST = 1;

	/**
	 * The number of structural features of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bounding Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDING_BOX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Double Array1 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray1D()
	 * @generated
	 */
	int DOUBLE_ARRAY1_D = 17;

	/**
	 * The meta object id for the '<em>Double Array2 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray2D()
	 * @generated
	 */
	int DOUBLE_ARRAY2_D = 18;

	/**
	 * The meta object id for the '<em>Double Array3 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray3D()
	 * @generated
	 */
	int DOUBLE_ARRAY3_D = 19;

	/**
	 * The meta object id for the '<em>Double Array4 D</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray4D()
	 * @generated
	 */
	int DOUBLE_ARRAY4_D = 20;


	/**
	 * Returns the meta object for class '{@link org.geojson.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see org.geojson.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.Coordinates#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see org.geojson.Coordinates#getLongitude()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.Coordinates#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see org.geojson.Coordinates#getLatitude()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.Coordinates#getElevation <em>Elevation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elevation</em>'.
	 * @see org.geojson.Coordinates#getElevation()
	 * @see #getCoordinates()
	 * @generated
	 */
	EAttribute getCoordinates_Elevation();

	/**
	 * Returns the meta object for class '{@link org.geojson.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see org.geojson.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.Point <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.geojson.Point
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.Point#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinates</em>'.
	 * @see org.geojson.Point#getCoordinates()
	 * @see #getPoint()
	 * @generated
	 */
	EReference getPoint_Coordinates();

	/**
	 * Returns the meta object for the '{@link org.geojson.Point#setData(java.lang.double[]) <em>Set Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Data</em>' operation.
	 * @see org.geojson.Point#setData(java.lang.double[])
	 * @generated
	 */
	EOperation getPoint__SetData__double();

	/**
	 * Returns the meta object for class '{@link org.geojson.GeoJsonObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see org.geojson.GeoJsonObject
	 * @generated
	 */
	EClass getGeoJsonObject();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.GeoJsonObject <em>Bbox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bbox</em>'.
	 * @see org.geojson.GeoJsonObject
	 * @see #getGeoJsonObject()
	 * @generated
	 */
	EAttribute getGeoJsonObject_Bbox();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.GeoJsonObject#getBoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounding Box</em>'.
	 * @see org.geojson.GeoJsonObject#getBoundingBox()
	 * @see #getGeoJsonObject()
	 * @generated
	 */
	EReference getGeoJsonObject_BoundingBox();

	/**
	 * Returns the meta object for the '{@link org.geojson.GeoJsonObject#setBbox(java.lang.double[]) <em>Set Bbox</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bbox</em>' operation.
	 * @see org.geojson.GeoJsonObject#setBbox(java.lang.double[])
	 * @generated
	 */
	EOperation getGeoJsonObject__SetBbox__double();

	/**
	 * Returns the meta object for class '{@link org.geojson.Geometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry</em>'.
	 * @see org.geojson.Geometry
	 * @generated
	 */
	EClass getGeometry();

	/**
	 * Returns the meta object for class '{@link org.geojson.LineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String</em>'.
	 * @see org.geojson.LineString
	 * @generated
	 */
	EClass getLineString();

	/**
	 * Returns the meta object for class '{@link org.geojson.SimpleLineString <em>Simple Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Line String</em>'.
	 * @see org.geojson.SimpleLineString
	 * @generated
	 */
	EClass getSimpleLineString();

	/**
	 * Returns the meta object for the attribute list '{@link org.geojson.SimpleLineString <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.geojson.SimpleLineString
	 * @see #getSimpleLineString()
	 * @generated
	 */
	EAttribute getSimpleLineString_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.SimpleLineString#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see org.geojson.SimpleLineString#getCoordinates()
	 * @see #getSimpleLineString()
	 * @generated
	 */
	EReference getSimpleLineString_Coordinates();

	/**
	 * Returns the meta object for class '{@link org.geojson.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.geojson.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.geojson.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.Feature#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see org.geojson.Feature#getGeometry()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.Feature#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see org.geojson.Feature#getProperties()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Properties();

	/**
	 * Returns the meta object for class '{@link org.geojson.FeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collection</em>'.
	 * @see org.geojson.FeatureCollection
	 * @generated
	 */
	EClass getFeatureCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.FeatureCollection#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.geojson.FeatureCollection#getFeatures()
	 * @see #getFeatureCollection()
	 * @generated
	 */
	EReference getFeatureCollection_Features();

	/**
	 * Returns the meta object for class '{@link org.geojson.GeometryCollection <em>Geometry Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Collection</em>'.
	 * @see org.geojson.GeometryCollection
	 * @generated
	 */
	EClass getGeometryCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.GeometryCollection#getGeometries <em>Geometries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Geometries</em>'.
	 * @see org.geojson.GeometryCollection#getGeometries()
	 * @see #getGeometryCollection()
	 * @generated
	 */
	EReference getGeometryCollection_Geometries();

	/**
	 * Returns the meta object for class '{@link org.geojson.MultiPoint <em>Multi Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Point</em>'.
	 * @see org.geojson.MultiPoint
	 * @generated
	 */
	EClass getMultiPoint();

	/**
	 * Returns the meta object for the attribute list '{@link org.geojson.MultiPoint <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data</em>'.
	 * @see org.geojson.MultiPoint
	 * @see #getMultiPoint()
	 * @generated
	 */
	EAttribute getMultiPoint_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.MultiPoint#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see org.geojson.MultiPoint#getCoordinates()
	 * @see #getMultiPoint()
	 * @generated
	 */
	EReference getMultiPoint_Coordinates();

	/**
	 * Returns the meta object for class '{@link org.geojson.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see org.geojson.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for class '{@link org.geojson.Ring <em>Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ring</em>'.
	 * @see org.geojson.Ring
	 * @generated
	 */
	EClass getRing();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.Ring#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordinates</em>'.
	 * @see org.geojson.Ring#getCoordinates()
	 * @see #getRing()
	 * @generated
	 */
	EReference getRing_Coordinates();

	/**
	 * Returns the meta object for class '{@link org.geojson.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hole</em>'.
	 * @see org.geojson.Hole
	 * @generated
	 */
	EClass getHole();

	/**
	 * Returns the meta object for class '{@link org.geojson.MultiPolygon <em>Multi Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Polygon</em>'.
	 * @see org.geojson.MultiPolygon
	 * @generated
	 */
	EClass getMultiPolygon();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.MultiPolygon <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.geojson.MultiPolygon
	 * @see #getMultiPolygon()
	 * @generated
	 */
	EAttribute getMultiPolygon_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.MultiPolygon#getPolygons <em>Polygons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygons</em>'.
	 * @see org.geojson.MultiPolygon#getPolygons()
	 * @see #getMultiPolygon()
	 * @generated
	 */
	EReference getMultiPolygon_Polygons();

	/**
	 * Returns the meta object for the '{@link org.geojson.MultiPolygon#setData(java.lang.double[][][][]) <em>Set Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Data</em>' operation.
	 * @see org.geojson.MultiPolygon#setData(java.lang.double[][][][])
	 * @generated
	 */
	EOperation getMultiPolygon__SetData__double();

	/**
	 * Returns the meta object for class '{@link org.geojson.SimplePolygon <em>Simple Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Polygon</em>'.
	 * @see org.geojson.SimplePolygon
	 * @generated
	 */
	EClass getSimplePolygon();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.SimplePolygon <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.geojson.SimplePolygon
	 * @see #getSimplePolygon()
	 * @generated
	 */
	EAttribute getSimplePolygon_Data();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.SimplePolygon#getExteriorRing <em>Exterior Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exterior Ring</em>'.
	 * @see org.geojson.SimplePolygon#getExteriorRing()
	 * @see #getSimplePolygon()
	 * @generated
	 */
	EReference getSimplePolygon_ExteriorRing();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.SimplePolygon#getInteriorHoles <em>Interior Holes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interior Holes</em>'.
	 * @see org.geojson.SimplePolygon#getInteriorHoles()
	 * @see #getSimplePolygon()
	 * @generated
	 */
	EReference getSimplePolygon_InteriorHoles();

	/**
	 * Returns the meta object for the '{@link org.geojson.SimplePolygon#setData(java.lang.double[][][]) <em>Set Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Data</em>' operation.
	 * @see org.geojson.SimplePolygon#setData(java.lang.double[][][])
	 * @generated
	 */
	EOperation getSimplePolygon__SetData__double();

	/**
	 * Returns the meta object for class '{@link org.geojson.MultiLineString <em>Multi Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Line String</em>'.
	 * @see org.geojson.MultiLineString
	 * @generated
	 */
	EClass getMultiLineString();

	/**
	 * Returns the meta object for the attribute '{@link org.geojson.MultiLineString <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.geojson.MultiLineString
	 * @see #getMultiLineString()
	 * @generated
	 */
	EAttribute getMultiLineString_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link org.geojson.MultiLineString#getLinesStrings <em>Lines Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines Strings</em>'.
	 * @see org.geojson.MultiLineString#getLinesStrings()
	 * @see #getMultiLineString()
	 * @generated
	 */
	EReference getMultiLineString_LinesStrings();

	/**
	 * Returns the meta object for the '{@link org.geojson.MultiLineString#setData(java.lang.double[][][]) <em>Set Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Data</em>' operation.
	 * @see org.geojson.MultiLineString#setData(java.lang.double[][][])
	 * @generated
	 */
	EOperation getMultiLineString__SetData__double();

	/**
	 * Returns the meta object for class '{@link org.geojson.BoundingBox <em>Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounding Box</em>'.
	 * @see org.geojson.BoundingBox
	 * @generated
	 */
	EClass getBoundingBox();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.BoundingBox#getSouthwest <em>Southwest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Southwest</em>'.
	 * @see org.geojson.BoundingBox#getSouthwest()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EReference getBoundingBox_Southwest();

	/**
	 * Returns the meta object for the containment reference '{@link org.geojson.BoundingBox#getNortheast <em>Northeast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Northeast</em>'.
	 * @see org.geojson.BoundingBox#getNortheast()
	 * @see #getBoundingBox()
	 * @generated
	 */
	EReference getBoundingBox_Northeast();

	/**
	 * Returns the meta object for data type '<em>Double Array1 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array1 D</em>'.
	 * @model instanceClass="java.lang.double[]"
	 * @generated
	 */
	EDataType getDoubleArray1D();

	/**
	 * Returns the meta object for data type '<em>Double Array2 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array2 D</em>'.
	 * @model instanceClass="java.lang.double[][]"
	 * @generated
	 */
	EDataType getDoubleArray2D();

	/**
	 * Returns the meta object for data type '<em>Double Array3 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array3 D</em>'.
	 * @model instanceClass="java.lang.double[][][]"
	 * @generated
	 */
	EDataType getDoubleArray3D();

	/**
	 * Returns the meta object for data type '<em>Double Array4 D</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double Array4 D</em>'.
	 * @model instanceClass="java.lang.double[][][][]"
	 * @generated
	 */
	EDataType getDoubleArray4D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeoJsonFactory getGeoJsonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.geojson.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.CoordinatesImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '<em><b>Longitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LONGITUDE = eINSTANCE.getCoordinates_Longitude();

		/**
		 * The meta object literal for the '<em><b>Latitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__LATITUDE = eINSTANCE.getCoordinates_Latitude();

		/**
		 * The meta object literal for the '<em><b>Elevation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATES__ELEVATION = eINSTANCE.getCoordinates_Elevation();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.PointImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__DATA = eINSTANCE.getPoint_Data();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT__COORDINATES = eINSTANCE.getPoint_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Set Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT___SET_DATA__DOUBLE = eINSTANCE.getPoint__SetData__double();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.GeoJsonObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeoJsonObjectImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getGeoJsonObject()
		 * @generated
		 */
		EClass GEO_JSON_OBJECT = eINSTANCE.getGeoJsonObject();

		/**
		 * The meta object literal for the '<em><b>Bbox</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEO_JSON_OBJECT__BBOX = eINSTANCE.getGeoJsonObject_Bbox();

		/**
		 * The meta object literal for the '<em><b>Bounding Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEO_JSON_OBJECT__BOUNDING_BOX = eINSTANCE.getGeoJsonObject_BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Set Bbox</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GEO_JSON_OBJECT___SET_BBOX__DOUBLE = eINSTANCE.getGeoJsonObject__SetBbox__double();

		/**
		 * The meta object literal for the '{@link org.geojson.Geometry <em>Geometry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.Geometry
		 * @see org.geojson.impl.GeoJsonPackageImpl#getGeometry()
		 * @generated
		 */
		EClass GEOMETRY = eINSTANCE.getGeometry();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.LineStringImpl <em>Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.LineStringImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getLineString()
		 * @generated
		 */
		EClass LINE_STRING = eINSTANCE.getLineString();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.SimpleLineStringImpl <em>Simple Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.SimpleLineStringImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getSimpleLineString()
		 * @generated
		 */
		EClass SIMPLE_LINE_STRING = eINSTANCE.getSimpleLineString();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LINE_STRING__DATA = eINSTANCE.getSimpleLineString_Data();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_LINE_STRING__COORDINATES = eINSTANCE.getSimpleLineString_Coordinates();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.FeatureImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GEOMETRY = eINSTANCE.getFeature_Geometry();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__PROPERTIES = eINSTANCE.getFeature_Properties();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.FeatureCollectionImpl <em>Feature Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.FeatureCollectionImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getFeatureCollection()
		 * @generated
		 */
		EClass FEATURE_COLLECTION = eINSTANCE.getFeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_COLLECTION__FEATURES = eINSTANCE.getFeatureCollection_Features();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.GeometryCollectionImpl <em>Geometry Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeometryCollectionImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getGeometryCollection()
		 * @generated
		 */
		EClass GEOMETRY_COLLECTION = eINSTANCE.getGeometryCollection();

		/**
		 * The meta object literal for the '<em><b>Geometries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEOMETRY_COLLECTION__GEOMETRIES = eINSTANCE.getGeometryCollection_Geometries();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.MultiPointImpl <em>Multi Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.MultiPointImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiPoint()
		 * @generated
		 */
		EClass MULTI_POINT = eINSTANCE.getMultiPoint();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_POINT__DATA = eINSTANCE.getMultiPoint_Data();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POINT__COORDINATES = eINSTANCE.getMultiPoint_Coordinates();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.PolygonImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.RingImpl <em>Ring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.RingImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getRing()
		 * @generated
		 */
		EClass RING = eINSTANCE.getRing();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RING__COORDINATES = eINSTANCE.getRing_Coordinates();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.HoleImpl <em>Hole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.HoleImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getHole()
		 * @generated
		 */
		EClass HOLE = eINSTANCE.getHole();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.MultiPolygonImpl <em>Multi Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.MultiPolygonImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiPolygon()
		 * @generated
		 */
		EClass MULTI_POLYGON = eINSTANCE.getMultiPolygon();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_POLYGON__DATA = eINSTANCE.getMultiPolygon_Data();

		/**
		 * The meta object literal for the '<em><b>Polygons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_POLYGON__POLYGONS = eINSTANCE.getMultiPolygon_Polygons();

		/**
		 * The meta object literal for the '<em><b>Set Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_POLYGON___SET_DATA__DOUBLE = eINSTANCE.getMultiPolygon__SetData__double();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.SimplePolygonImpl <em>Simple Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.SimplePolygonImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getSimplePolygon()
		 * @generated
		 */
		EClass SIMPLE_POLYGON = eINSTANCE.getSimplePolygon();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_POLYGON__DATA = eINSTANCE.getSimplePolygon_Data();

		/**
		 * The meta object literal for the '<em><b>Exterior Ring</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_POLYGON__EXTERIOR_RING = eINSTANCE.getSimplePolygon_ExteriorRing();

		/**
		 * The meta object literal for the '<em><b>Interior Holes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_POLYGON__INTERIOR_HOLES = eINSTANCE.getSimplePolygon_InteriorHoles();

		/**
		 * The meta object literal for the '<em><b>Set Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_POLYGON___SET_DATA__DOUBLE = eINSTANCE.getSimplePolygon__SetData__double();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.MultiLineStringImpl <em>Multi Line String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.MultiLineStringImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getMultiLineString()
		 * @generated
		 */
		EClass MULTI_LINE_STRING = eINSTANCE.getMultiLineString();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_LINE_STRING__DATA = eINSTANCE.getMultiLineString_Data();

		/**
		 * The meta object literal for the '<em><b>Lines Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_LINE_STRING__LINES_STRINGS = eINSTANCE.getMultiLineString_LinesStrings();

		/**
		 * The meta object literal for the '<em><b>Set Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_LINE_STRING___SET_DATA__DOUBLE = eINSTANCE.getMultiLineString__SetData__double();

		/**
		 * The meta object literal for the '{@link org.geojson.impl.BoundingBoxImpl <em>Bounding Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.BoundingBoxImpl
		 * @see org.geojson.impl.GeoJsonPackageImpl#getBoundingBox()
		 * @generated
		 */
		EClass BOUNDING_BOX = eINSTANCE.getBoundingBox();

		/**
		 * The meta object literal for the '<em><b>Southwest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDING_BOX__SOUTHWEST = eINSTANCE.getBoundingBox_Southwest();

		/**
		 * The meta object literal for the '<em><b>Northeast</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDING_BOX__NORTHEAST = eINSTANCE.getBoundingBox_Northeast();

		/**
		 * The meta object literal for the '<em>Double Array1 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray1D()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY1_D = eINSTANCE.getDoubleArray1D();

		/**
		 * The meta object literal for the '<em>Double Array2 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray2D()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY2_D = eINSTANCE.getDoubleArray2D();

		/**
		 * The meta object literal for the '<em>Double Array3 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray3D()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY3_D = eINSTANCE.getDoubleArray3D();

		/**
		 * The meta object literal for the '<em>Double Array4 D</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.geojson.impl.GeoJsonPackageImpl#getDoubleArray4D()
		 * @generated
		 */
		EDataType DOUBLE_ARRAY4_D = eINSTANCE.getDoubleArray4D();

	}

} //GeoJsonPackage
