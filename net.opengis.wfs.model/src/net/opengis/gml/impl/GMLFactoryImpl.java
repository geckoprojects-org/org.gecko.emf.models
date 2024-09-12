/**
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.gml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import net.opengis.gml.*;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMLFactoryImpl extends EFactoryImpl implements GMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMLFactory init() {
		try {
			GMLFactory theGMLFactory = (GMLFactory)EPackage.Registry.INSTANCE.getEFactory(GMLPackage.eNS_URI);
			if (theGMLFactory != null) {
				return theGMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMLPackage.ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE: return createAbsoluteExternalPositionalAccuracyType();
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_REF_TYPE: return createAbstractGeneralOperationParameterRefType();
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE: return createAbstractGriddedSurfaceType();
			case GMLPackage.ABSTRACT_PARAMETRIC_CURVE_SURFACE_TYPE: return createAbstractParametricCurveSurfaceType();
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE: return createAbstractRingPropertyType();
			case GMLPackage.ABSTRACT_SOLID_TYPE: return createAbstractSolidType();
			case GMLPackage.ABSTRACT_SURFACE_TYPE: return createAbstractSurfaceType();
			case GMLPackage.AFFINE_PLACEMENT_TYPE: return createAffinePlacementType();
			case GMLPackage.ANGLE_CHOICE_TYPE: return createAngleChoiceType();
			case GMLPackage.ANGLE_TYPE: return createAngleType();
			case GMLPackage.ARC_BY_BULGE_TYPE: return createArcByBulgeType();
			case GMLPackage.ARC_BY_CENTER_POINT_TYPE: return createArcByCenterPointType();
			case GMLPackage.ARC_STRING_BY_BULGE_TYPE: return createArcStringByBulgeType();
			case GMLPackage.ARC_STRING_TYPE: return createArcStringType();
			case GMLPackage.ARC_TYPE: return createArcType();
			case GMLPackage.AREA_TYPE: return createAreaType();
			case GMLPackage.ARRAY_ASSOCIATION_TYPE: return createArrayAssociationType();
			case GMLPackage.ARRAY_TYPE: return createArrayType();
			case GMLPackage.ASSOCIATION_TYPE: return createAssociationType();
			case GMLPackage.BAG_TYPE: return createBagType();
			case GMLPackage.BASE_STYLE_DESCRIPTOR_TYPE: return createBaseStyleDescriptorType();
			case GMLPackage.BASE_UNIT_TYPE: return createBaseUnitType();
			case GMLPackage.BEZIER_TYPE: return createBezierType();
			case GMLPackage.BOOLEAN_PROPERTY_TYPE: return createBooleanPropertyType();
			case GMLPackage.BOUNDING_SHAPE_TYPE: return createBoundingShapeType();
			case GMLPackage.BSPLINE_TYPE: return createBSplineType();
			case GMLPackage.CARTESIAN_CS_REF_TYPE: return createCartesianCSRefType();
			case GMLPackage.CARTESIAN_CS_TYPE: return createCartesianCSType();
			case GMLPackage.CATEGORY_EXTENT_TYPE: return createCategoryExtentType();
			case GMLPackage.CATEGORY_PROPERTY_TYPE: return createCategoryPropertyType();
			case GMLPackage.CIRCLE_BY_CENTER_POINT_TYPE: return createCircleByCenterPointType();
			case GMLPackage.CIRCLE_TYPE: return createCircleType();
			case GMLPackage.CLOTHOID_TYPE: return createClothoidType();
			case GMLPackage.CODE_LIST_TYPE: return createCodeListType();
			case GMLPackage.CODE_OR_NULL_LIST_TYPE: return createCodeOrNullListType();
			case GMLPackage.CODE_TYPE: return createCodeType();
			case GMLPackage.COMPOSITE_CURVE_PROPERTY_TYPE: return createCompositeCurvePropertyType();
			case GMLPackage.COMPOSITE_CURVE_TYPE: return createCompositeCurveType();
			case GMLPackage.COMPOSITE_SOLID_PROPERTY_TYPE: return createCompositeSolidPropertyType();
			case GMLPackage.COMPOSITE_SOLID_TYPE: return createCompositeSolidType();
			case GMLPackage.COMPOSITE_SURFACE_PROPERTY_TYPE: return createCompositeSurfacePropertyType();
			case GMLPackage.COMPOSITE_SURFACE_TYPE: return createCompositeSurfaceType();
			case GMLPackage.COMPOSITE_VALUE_TYPE: return createCompositeValueType();
			case GMLPackage.COMPOUND_CRS_REF_TYPE: return createCompoundCRSRefType();
			case GMLPackage.COMPOUND_CRS_TYPE: return createCompoundCRSType();
			case GMLPackage.CONCATENATED_OPERATION_REF_TYPE: return createConcatenatedOperationRefType();
			case GMLPackage.CONCATENATED_OPERATION_TYPE: return createConcatenatedOperationType();
			case GMLPackage.CONE_TYPE: return createConeType();
			case GMLPackage.CONTAINER_PROPERTY_TYPE: return createContainerPropertyType();
			case GMLPackage.CONTROL_POINT_TYPE: return createControlPointType();
			case GMLPackage.CONVENTIONAL_UNIT_TYPE: return createConventionalUnitType();
			case GMLPackage.CONVERSION_REF_TYPE: return createConversionRefType();
			case GMLPackage.CONVERSION_TO_PREFERRED_UNIT_TYPE: return createConversionToPreferredUnitType();
			case GMLPackage.CONVERSION_TYPE: return createConversionType();
			case GMLPackage.COORDINATE_OPERATION_REF_TYPE: return createCoordinateOperationRefType();
			case GMLPackage.COORDINATE_REFERENCE_SYSTEM_REF_TYPE: return createCoordinateReferenceSystemRefType();
			case GMLPackage.COORDINATES_TYPE: return createCoordinatesType();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_REF_TYPE: return createCoordinateSystemAxisRefType();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE: return createCoordinateSystemAxisType();
			case GMLPackage.COORDINATE_SYSTEM_REF_TYPE: return createCoordinateSystemRefType();
			case GMLPackage.COORD_TYPE: return createCoordType();
			case GMLPackage.COUNT_PROPERTY_TYPE: return createCountPropertyType();
			case GMLPackage.COVARIANCE_ELEMENT_TYPE: return createCovarianceElementType();
			case GMLPackage.COVARIANCE_MATRIX_TYPE: return createCovarianceMatrixType();
			case GMLPackage.COVERAGE_FUNCTION_TYPE: return createCoverageFunctionType();
			case GMLPackage.CRS_REF_TYPE: return createCRSRefType();
			case GMLPackage.CUBIC_SPLINE_TYPE: return createCubicSplineType();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE: return createCurveArrayPropertyType();
			case GMLPackage.CURVE_PROPERTY_TYPE: return createCurvePropertyType();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE: return createCurveSegmentArrayPropertyType();
			case GMLPackage.CURVE_TYPE: return createCurveType();
			case GMLPackage.CYLINDER_TYPE: return createCylinderType();
			case GMLPackage.CYLINDRICAL_CS_REF_TYPE: return createCylindricalCSRefType();
			case GMLPackage.CYLINDRICAL_CS_TYPE: return createCylindricalCSType();
			case GMLPackage.DATA_BLOCK_TYPE: return createDataBlockType();
			case GMLPackage.DATUM_REF_TYPE: return createDatumRefType();
			case GMLPackage.DEFAULT_STYLE_PROPERTY_TYPE: return createDefaultStylePropertyType();
			case GMLPackage.DEFINITION_PROXY_TYPE: return createDefinitionProxyType();
			case GMLPackage.DEFINITION_TYPE: return createDefinitionType();
			case GMLPackage.DEGREES_TYPE: return createDegreesType();
			case GMLPackage.DERIVATION_UNIT_TERM_TYPE: return createDerivationUnitTermType();
			case GMLPackage.DERIVED_CRS_REF_TYPE: return createDerivedCRSRefType();
			case GMLPackage.DERIVED_CRS_TYPE: return createDerivedCRSType();
			case GMLPackage.DERIVED_CRS_TYPE_TYPE: return createDerivedCRSTypeType();
			case GMLPackage.DERIVED_UNIT_TYPE: return createDerivedUnitType();
			case GMLPackage.DICTIONARY_ENTRY_TYPE: return createDictionaryEntryType();
			case GMLPackage.DICTIONARY_TYPE: return createDictionaryType();
			case GMLPackage.DIRECTED_EDGE_PROPERTY_TYPE: return createDirectedEdgePropertyType();
			case GMLPackage.DIRECTED_FACE_PROPERTY_TYPE: return createDirectedFacePropertyType();
			case GMLPackage.DIRECTED_NODE_PROPERTY_TYPE: return createDirectedNodePropertyType();
			case GMLPackage.DIRECTED_OBSERVATION_AT_DISTANCE_TYPE: return createDirectedObservationAtDistanceType();
			case GMLPackage.DIRECTED_OBSERVATION_TYPE: return createDirectedObservationType();
			case GMLPackage.DIRECTED_TOPO_SOLID_PROPERTY_TYPE: return createDirectedTopoSolidPropertyType();
			case GMLPackage.DIRECTION_PROPERTY_TYPE: return createDirectionPropertyType();
			case GMLPackage.DIRECTION_VECTOR_TYPE: return createDirectionVectorType();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE: return createDirectPositionListType();
			case GMLPackage.DIRECT_POSITION_TYPE: return createDirectPositionType();
			case GMLPackage.DMS_ANGLE_TYPE: return createDMSAngleType();
			case GMLPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GMLPackage.DOMAIN_SET_TYPE: return createDomainSetType();
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE: return createDynamicFeatureCollectionType();
			case GMLPackage.DYNAMIC_FEATURE_TYPE: return createDynamicFeatureType();
			case GMLPackage.EDGE_TYPE: return createEdgeType();
			case GMLPackage.ELLIPSOIDAL_CS_REF_TYPE: return createEllipsoidalCSRefType();
			case GMLPackage.ELLIPSOIDAL_CS_TYPE: return createEllipsoidalCSType();
			case GMLPackage.ELLIPSOID_REF_TYPE: return createEllipsoidRefType();
			case GMLPackage.ELLIPSOID_TYPE: return createEllipsoidType();
			case GMLPackage.ENGINEERING_CRS_REF_TYPE: return createEngineeringCRSRefType();
			case GMLPackage.ENGINEERING_CRS_TYPE: return createEngineeringCRSType();
			case GMLPackage.ENGINEERING_DATUM_REF_TYPE: return createEngineeringDatumRefType();
			case GMLPackage.ENGINEERING_DATUM_TYPE: return createEngineeringDatumType();
			case GMLPackage.ENVELOPE_TYPE: return createEnvelopeType();
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE: return createEnvelopeWithTimePeriodType();
			case GMLPackage.EXTENT_TYPE: return createExtentType();
			case GMLPackage.FACE_TYPE: return createFaceType();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE: return createFeatureArrayPropertyType();
			case GMLPackage.FEATURE_COLLECTION_TYPE: return createFeatureCollectionType();
			case GMLPackage.FEATURE_PROPERTY_TYPE: return createFeaturePropertyType();
			case GMLPackage.FEATURE_STYLE_PROPERTY_TYPE: return createFeatureStylePropertyType();
			case GMLPackage.FEATURE_STYLE_TYPE: return createFeatureStyleType();
			case GMLPackage.FILE_TYPE: return createFileType();
			case GMLPackage.FORMULA_TYPE: return createFormulaType();
			case GMLPackage.GENERAL_CONVERSION_REF_TYPE: return createGeneralConversionRefType();
			case GMLPackage.GENERAL_TRANSFORMATION_REF_TYPE: return createGeneralTransformationRefType();
			case GMLPackage.GENERIC_META_DATA_TYPE: return createGenericMetaDataType();
			case GMLPackage.GEOCENTRIC_CRS_REF_TYPE: return createGeocentricCRSRefType();
			case GMLPackage.GEOCENTRIC_CRS_TYPE: return createGeocentricCRSType();
			case GMLPackage.GEODESIC_STRING_TYPE: return createGeodesicStringType();
			case GMLPackage.GEODESIC_TYPE: return createGeodesicType();
			case GMLPackage.GEODETIC_DATUM_REF_TYPE: return createGeodeticDatumRefType();
			case GMLPackage.GEODETIC_DATUM_TYPE: return createGeodeticDatumType();
			case GMLPackage.GEOGRAPHIC_CRS_REF_TYPE: return createGeographicCRSRefType();
			case GMLPackage.GEOGRAPHIC_CRS_TYPE: return createGeographicCRSType();
			case GMLPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE: return createGeometricComplexPropertyType();
			case GMLPackage.GEOMETRIC_COMPLEX_TYPE: return createGeometricComplexType();
			case GMLPackage.GEOMETRIC_PRIMITIVE_PROPERTY_TYPE: return createGeometricPrimitivePropertyType();
			case GMLPackage.GEOMETRY_ARRAY_PROPERTY_TYPE: return createGeometryArrayPropertyType();
			case GMLPackage.GEOMETRY_PROPERTY_TYPE: return createGeometryPropertyType();
			case GMLPackage.GEOMETRY_STYLE_PROPERTY_TYPE: return createGeometryStylePropertyType();
			case GMLPackage.GEOMETRY_STYLE_TYPE: return createGeometryStyleType();
			case GMLPackage.GRAPH_STYLE_PROPERTY_TYPE: return createGraphStylePropertyType();
			case GMLPackage.GRAPH_STYLE_TYPE: return createGraphStyleType();
			case GMLPackage.GRID_COVERAGE_TYPE: return createGridCoverageType();
			case GMLPackage.GRID_DOMAIN_TYPE: return createGridDomainType();
			case GMLPackage.GRID_ENVELOPE_TYPE: return createGridEnvelopeType();
			case GMLPackage.GRID_FUNCTION_TYPE: return createGridFunctionType();
			case GMLPackage.GRID_LENGTH_TYPE: return createGridLengthType();
			case GMLPackage.GRID_LIMITS_TYPE: return createGridLimitsType();
			case GMLPackage.GRID_TYPE: return createGridType();
			case GMLPackage.HISTORY_PROPERTY_TYPE: return createHistoryPropertyType();
			case GMLPackage.IDENTIFIER_TYPE: return createIdentifierType();
			case GMLPackage.IMAGE_CRS_REF_TYPE: return createImageCRSRefType();
			case GMLPackage.IMAGE_CRS_TYPE: return createImageCRSType();
			case GMLPackage.IMAGE_DATUM_REF_TYPE: return createImageDatumRefType();
			case GMLPackage.IMAGE_DATUM_TYPE: return createImageDatumType();
			case GMLPackage.INDEX_MAP_TYPE: return createIndexMapType();
			case GMLPackage.INDIRECT_ENTRY_TYPE: return createIndirectEntryType();
			case GMLPackage.ISOLATED_PROPERTY_TYPE: return createIsolatedPropertyType();
			case GMLPackage.KNOT_PROPERTY_TYPE: return createKnotPropertyType();
			case GMLPackage.KNOT_TYPE: return createKnotType();
			case GMLPackage.LABEL_STYLE_PROPERTY_TYPE: return createLabelStylePropertyType();
			case GMLPackage.LABEL_STYLE_TYPE: return createLabelStyleType();
			case GMLPackage.LABEL_TYPE: return createLabelType();
			case GMLPackage.LENGTH_TYPE: return createLengthType();
			case GMLPackage.LINEAR_CS_REF_TYPE: return createLinearCSRefType();
			case GMLPackage.LINEAR_CS_TYPE: return createLinearCSType();
			case GMLPackage.LINEAR_RING_PROPERTY_TYPE: return createLinearRingPropertyType();
			case GMLPackage.LINEAR_RING_TYPE: return createLinearRingType();
			case GMLPackage.LINE_STRING_PROPERTY_TYPE: return createLineStringPropertyType();
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE: return createLineStringSegmentArrayPropertyType();
			case GMLPackage.LINE_STRING_SEGMENT_TYPE: return createLineStringSegmentType();
			case GMLPackage.LINE_STRING_TYPE: return createLineStringType();
			case GMLPackage.LOCATION_PROPERTY_TYPE: return createLocationPropertyType();
			case GMLPackage.MEASURE_LIST_TYPE: return createMeasureListType();
			case GMLPackage.MEASURE_OR_NULL_LIST_TYPE: return createMeasureOrNullListType();
			case GMLPackage.MEASURE_TYPE: return createMeasureType();
			case GMLPackage.META_DATA_PROPERTY_TYPE: return createMetaDataPropertyType();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE: return createMovingObjectStatusType();
			case GMLPackage.MULTI_CURVE_COVERAGE_TYPE: return createMultiCurveCoverageType();
			case GMLPackage.MULTI_CURVE_DOMAIN_TYPE: return createMultiCurveDomainType();
			case GMLPackage.MULTI_CURVE_PROPERTY_TYPE: return createMultiCurvePropertyType();
			case GMLPackage.MULTI_CURVE_TYPE: return createMultiCurveType();
			case GMLPackage.MULTI_GEOMETRY_PROPERTY_TYPE: return createMultiGeometryPropertyType();
			case GMLPackage.MULTI_GEOMETRY_TYPE: return createMultiGeometryType();
			case GMLPackage.MULTI_LINE_STRING_PROPERTY_TYPE: return createMultiLineStringPropertyType();
			case GMLPackage.MULTI_LINE_STRING_TYPE: return createMultiLineStringType();
			case GMLPackage.MULTI_POINT_COVERAGE_TYPE: return createMultiPointCoverageType();
			case GMLPackage.MULTI_POINT_DOMAIN_TYPE: return createMultiPointDomainType();
			case GMLPackage.MULTI_POINT_PROPERTY_TYPE: return createMultiPointPropertyType();
			case GMLPackage.MULTI_POINT_TYPE: return createMultiPointType();
			case GMLPackage.MULTI_POLYGON_PROPERTY_TYPE: return createMultiPolygonPropertyType();
			case GMLPackage.MULTI_POLYGON_TYPE: return createMultiPolygonType();
			case GMLPackage.MULTI_SOLID_COVERAGE_TYPE: return createMultiSolidCoverageType();
			case GMLPackage.MULTI_SOLID_DOMAIN_TYPE: return createMultiSolidDomainType();
			case GMLPackage.MULTI_SOLID_PROPERTY_TYPE: return createMultiSolidPropertyType();
			case GMLPackage.MULTI_SOLID_TYPE: return createMultiSolidType();
			case GMLPackage.MULTI_SURFACE_COVERAGE_TYPE: return createMultiSurfaceCoverageType();
			case GMLPackage.MULTI_SURFACE_DOMAIN_TYPE: return createMultiSurfaceDomainType();
			case GMLPackage.MULTI_SURFACE_PROPERTY_TYPE: return createMultiSurfacePropertyType();
			case GMLPackage.MULTI_SURFACE_TYPE: return createMultiSurfaceType();
			case GMLPackage.NODE_TYPE: return createNodeType();
			case GMLPackage.OBLIQUE_CARTESIAN_CS_REF_TYPE: return createObliqueCartesianCSRefType();
			case GMLPackage.OBLIQUE_CARTESIAN_CS_TYPE: return createObliqueCartesianCSType();
			case GMLPackage.OBSERVATION_TYPE: return createObservationType();
			case GMLPackage.OFFSET_CURVE_TYPE: return createOffsetCurveType();
			case GMLPackage.OPERATION_METHOD_REF_TYPE: return createOperationMethodRefType();
			case GMLPackage.OPERATION_METHOD_TYPE: return createOperationMethodType();
			case GMLPackage.OPERATION_PARAMETER_GROUP_REF_TYPE: return createOperationParameterGroupRefType();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE: return createOperationParameterGroupType();
			case GMLPackage.OPERATION_PARAMETER_REF_TYPE: return createOperationParameterRefType();
			case GMLPackage.OPERATION_PARAMETER_TYPE: return createOperationParameterType();
			case GMLPackage.OPERATION_REF_TYPE: return createOperationRefType();
			case GMLPackage.ORIENTABLE_CURVE_TYPE: return createOrientableCurveType();
			case GMLPackage.ORIENTABLE_SURFACE_TYPE: return createOrientableSurfaceType();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE: return createParameterValueGroupType();
			case GMLPackage.PARAMETER_VALUE_TYPE: return createParameterValueType();
			case GMLPackage.PASS_THROUGH_OPERATION_REF_TYPE: return createPassThroughOperationRefType();
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE: return createPassThroughOperationType();
			case GMLPackage.PIXEL_IN_CELL_TYPE: return createPixelInCellType();
			case GMLPackage.POINT_ARRAY_PROPERTY_TYPE: return createPointArrayPropertyType();
			case GMLPackage.POINT_PROPERTY_TYPE: return createPointPropertyType();
			case GMLPackage.POINT_TYPE: return createPointType();
			case GMLPackage.POLAR_CS_REF_TYPE: return createPolarCSRefType();
			case GMLPackage.POLAR_CS_TYPE: return createPolarCSType();
			case GMLPackage.POLYGON_PATCH_ARRAY_PROPERTY_TYPE: return createPolygonPatchArrayPropertyType();
			case GMLPackage.POLYGON_PATCH_TYPE: return createPolygonPatchType();
			case GMLPackage.POLYGON_PROPERTY_TYPE: return createPolygonPropertyType();
			case GMLPackage.POLYGON_TYPE: return createPolygonType();
			case GMLPackage.POLYHEDRAL_SURFACE_TYPE: return createPolyhedralSurfaceType();
			case GMLPackage.PRIME_MERIDIAN_REF_TYPE: return createPrimeMeridianRefType();
			case GMLPackage.PRIME_MERIDIAN_TYPE: return createPrimeMeridianType();
			case GMLPackage.PRIORITY_LOCATION_PROPERTY_TYPE: return createPriorityLocationPropertyType();
			case GMLPackage.PROJECTED_CRS_REF_TYPE: return createProjectedCRSRefType();
			case GMLPackage.PROJECTED_CRS_TYPE: return createProjectedCRSType();
			case GMLPackage.QUANTITY_EXTENT_TYPE: return createQuantityExtentType();
			case GMLPackage.QUANTITY_PROPERTY_TYPE: return createQuantityPropertyType();
			case GMLPackage.RANGE_PARAMETERS_TYPE: return createRangeParametersType();
			case GMLPackage.RANGE_SET_TYPE: return createRangeSetType();
			case GMLPackage.RECTANGLE_TYPE: return createRectangleType();
			case GMLPackage.RECTIFIED_GRID_COVERAGE_TYPE: return createRectifiedGridCoverageType();
			case GMLPackage.RECTIFIED_GRID_DOMAIN_TYPE: return createRectifiedGridDomainType();
			case GMLPackage.RECTIFIED_GRID_TYPE: return createRectifiedGridType();
			case GMLPackage.REFERENCE_SYSTEM_REF_TYPE: return createReferenceSystemRefType();
			case GMLPackage.REFERENCE_TYPE: return createReferenceType();
			case GMLPackage.REF_LOCATION_TYPE: return createRefLocationType();
			case GMLPackage.RELATED_TIME_TYPE: return createRelatedTimeType();
			case GMLPackage.RELATIVE_INTERNAL_POSITIONAL_ACCURACY_TYPE: return createRelativeInternalPositionalAccuracyType();
			case GMLPackage.RING_PROPERTY_TYPE: return createRingPropertyType();
			case GMLPackage.RING_TYPE: return createRingType();
			case GMLPackage.ROW_TYPE: return createRowType();
			case GMLPackage.SCALAR_VALUE_PROPERTY_TYPE: return createScalarValuePropertyType();
			case GMLPackage.SCALE_TYPE: return createScaleType();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE: return createSecondDefiningParameterType();
			case GMLPackage.SEQUENCE_RULE_TYPE: return createSequenceRuleType();
			case GMLPackage.SINGLE_OPERATION_REF_TYPE: return createSingleOperationRefType();
			case GMLPackage.SOLID_ARRAY_PROPERTY_TYPE: return createSolidArrayPropertyType();
			case GMLPackage.SOLID_PROPERTY_TYPE: return createSolidPropertyType();
			case GMLPackage.SOLID_TYPE: return createSolidType();
			case GMLPackage.SPEED_TYPE: return createSpeedType();
			case GMLPackage.SPHERE_TYPE: return createSphereType();
			case GMLPackage.SPHERICAL_CS_REF_TYPE: return createSphericalCSRefType();
			case GMLPackage.SPHERICAL_CS_TYPE: return createSphericalCSType();
			case GMLPackage.STRING_OR_REF_TYPE: return createStringOrRefType();
			case GMLPackage.STYLE_TYPE: return createStyleType();
			case GMLPackage.STYLE_VARIATION_TYPE: return createStyleVariationType();
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE: return createSurfaceArrayPropertyType();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE: return createSurfacePatchArrayPropertyType();
			case GMLPackage.SURFACE_PROPERTY_TYPE: return createSurfacePropertyType();
			case GMLPackage.SURFACE_TYPE: return createSurfaceType();
			case GMLPackage.SYMBOL_TYPE: return createSymbolType();
			case GMLPackage.TARGET_PROPERTY_TYPE: return createTargetPropertyType();
			case GMLPackage.TEMPORAL_CRS_REF_TYPE: return createTemporalCRSRefType();
			case GMLPackage.TEMPORAL_CRS_TYPE: return createTemporalCRSType();
			case GMLPackage.TEMPORAL_CS_REF_TYPE: return createTemporalCSRefType();
			case GMLPackage.TEMPORAL_CS_TYPE: return createTemporalCSType();
			case GMLPackage.TEMPORAL_DATUM_REF_TYPE: return createTemporalDatumRefType();
			case GMLPackage.TEMPORAL_DATUM_TYPE: return createTemporalDatumType();
			case GMLPackage.TIME_CALENDAR_ERA_PROPERTY_TYPE: return createTimeCalendarEraPropertyType();
			case GMLPackage.TIME_CALENDAR_ERA_TYPE: return createTimeCalendarEraType();
			case GMLPackage.TIME_CALENDAR_PROPERTY_TYPE: return createTimeCalendarPropertyType();
			case GMLPackage.TIME_CALENDAR_TYPE: return createTimeCalendarType();
			case GMLPackage.TIME_CLOCK_PROPERTY_TYPE: return createTimeClockPropertyType();
			case GMLPackage.TIME_CLOCK_TYPE: return createTimeClockType();
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE: return createTimeCoordinateSystemType();
			case GMLPackage.TIME_EDGE_PROPERTY_TYPE: return createTimeEdgePropertyType();
			case GMLPackage.TIME_EDGE_TYPE: return createTimeEdgeType();
			case GMLPackage.TIME_GEOMETRIC_PRIMITIVE_PROPERTY_TYPE: return createTimeGeometricPrimitivePropertyType();
			case GMLPackage.TIME_INSTANT_PROPERTY_TYPE: return createTimeInstantPropertyType();
			case GMLPackage.TIME_INSTANT_TYPE: return createTimeInstantType();
			case GMLPackage.TIME_INTERVAL_LENGTH_TYPE: return createTimeIntervalLengthType();
			case GMLPackage.TIME_NODE_PROPERTY_TYPE: return createTimeNodePropertyType();
			case GMLPackage.TIME_NODE_TYPE: return createTimeNodeType();
			case GMLPackage.TIME_ORDINAL_ERA_PROPERTY_TYPE: return createTimeOrdinalEraPropertyType();
			case GMLPackage.TIME_ORDINAL_ERA_TYPE: return createTimeOrdinalEraType();
			case GMLPackage.TIME_ORDINAL_REFERENCE_SYSTEM_TYPE: return createTimeOrdinalReferenceSystemType();
			case GMLPackage.TIME_PERIOD_PROPERTY_TYPE: return createTimePeriodPropertyType();
			case GMLPackage.TIME_PERIOD_TYPE: return createTimePeriodType();
			case GMLPackage.TIME_POSITION_TYPE: return createTimePositionType();
			case GMLPackage.TIME_PRIMITIVE_PROPERTY_TYPE: return createTimePrimitivePropertyType();
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_PROPERTY_TYPE: return createTimeTopologyComplexPropertyType();
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_TYPE: return createTimeTopologyComplexType();
			case GMLPackage.TIME_TOPOLOGY_PRIMITIVE_PROPERTY_TYPE: return createTimeTopologyPrimitivePropertyType();
			case GMLPackage.TIME_TYPE: return createTimeType();
			case GMLPackage.TIN_TYPE: return createTinType();
			case GMLPackage.TOPO_COMPLEX_MEMBER_TYPE: return createTopoComplexMemberType();
			case GMLPackage.TOPO_COMPLEX_TYPE: return createTopoComplexType();
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE: return createTopoCurvePropertyType();
			case GMLPackage.TOPO_CURVE_TYPE: return createTopoCurveType();
			case GMLPackage.TOPOLOGY_STYLE_PROPERTY_TYPE: return createTopologyStylePropertyType();
			case GMLPackage.TOPOLOGY_STYLE_TYPE: return createTopologyStyleType();
			case GMLPackage.TOPO_POINT_PROPERTY_TYPE: return createTopoPointPropertyType();
			case GMLPackage.TOPO_POINT_TYPE: return createTopoPointType();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE: return createTopoPrimitiveArrayAssociationType();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE: return createTopoPrimitiveMemberType();
			case GMLPackage.TOPO_SOLID_TYPE: return createTopoSolidType();
			case GMLPackage.TOPO_SURFACE_PROPERTY_TYPE: return createTopoSurfacePropertyType();
			case GMLPackage.TOPO_SURFACE_TYPE: return createTopoSurfaceType();
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE: return createTopoVolumePropertyType();
			case GMLPackage.TOPO_VOLUME_TYPE: return createTopoVolumeType();
			case GMLPackage.TRACK_TYPE: return createTrackType();
			case GMLPackage.TRANSFORMATION_REF_TYPE: return createTransformationRefType();
			case GMLPackage.TRANSFORMATION_TYPE: return createTransformationType();
			case GMLPackage.TRIANGLE_PATCH_ARRAY_PROPERTY_TYPE: return createTrianglePatchArrayPropertyType();
			case GMLPackage.TRIANGLE_TYPE: return createTriangleType();
			case GMLPackage.TRIANGULATED_SURFACE_TYPE: return createTriangulatedSurfaceType();
			case GMLPackage.UNIT_DEFINITION_TYPE: return createUnitDefinitionType();
			case GMLPackage.UNIT_OF_MEASURE_TYPE: return createUnitOfMeasureType();
			case GMLPackage.USER_DEFINED_CS_REF_TYPE: return createUserDefinedCSRefType();
			case GMLPackage.USER_DEFINED_CS_TYPE: return createUserDefinedCSType();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE: return createValueArrayPropertyType();
			case GMLPackage.VALUE_ARRAY_TYPE: return createValueArrayType();
			case GMLPackage.VALUE_PROPERTY_TYPE: return createValuePropertyType();
			case GMLPackage.VECTOR_TYPE: return createVectorType();
			case GMLPackage.VERTICAL_CRS_REF_TYPE: return createVerticalCRSRefType();
			case GMLPackage.VERTICAL_CRS_TYPE: return createVerticalCRSType();
			case GMLPackage.VERTICAL_CS_REF_TYPE: return createVerticalCSRefType();
			case GMLPackage.VERTICAL_CS_TYPE: return createVerticalCSType();
			case GMLPackage.VERTICAL_DATUM_REF_TYPE: return createVerticalDatumRefType();
			case GMLPackage.VERTICAL_DATUM_TYPE: return createVerticalDatumType();
			case GMLPackage.VERTICAL_DATUM_TYPE_TYPE: return createVerticalDatumTypeType();
			case GMLPackage.VOLUME_TYPE: return createVolumeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMLPackage.AESHETIC_CRITERIA_TYPE:
				return createAesheticCriteriaTypeFromString(eDataType, initialValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION:
				return createCompassPointEnumerationFromString(eDataType, initialValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE:
				return createCurveInterpolationTypeFromString(eDataType, initialValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER0:
				return createDirectionTypeMember0FromString(eDataType, initialValue);
			case GMLPackage.DRAWING_TYPE_TYPE:
				return createDrawingTypeTypeFromString(eDataType, initialValue);
			case GMLPackage.FILE_VALUE_MODEL_TYPE:
				return createFileValueModelTypeFromString(eDataType, initialValue);
			case GMLPackage.GRAPH_TYPE_TYPE:
				return createGraphTypeTypeFromString(eDataType, initialValue);
			case GMLPackage.INCREMENT_ORDER:
				return createIncrementOrderFromString(eDataType, initialValue);
			case GMLPackage.IS_SPHERE_TYPE:
				return createIsSphereTypeFromString(eDataType, initialValue);
			case GMLPackage.KNOT_TYPES_TYPE:
				return createKnotTypesTypeFromString(eDataType, initialValue);
			case GMLPackage.LINE_TYPE_TYPE:
				return createLineTypeTypeFromString(eDataType, initialValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER0:
				return createNullEnumerationMember0FromString(eDataType, initialValue);
			case GMLPackage.QUERY_GRAMMAR_ENUMERATION:
				return createQueryGrammarEnumerationFromString(eDataType, initialValue);
			case GMLPackage.RELATIVE_POSITION_TYPE:
				return createRelativePositionTypeFromString(eDataType, initialValue);
			case GMLPackage.SEQUENCE_RULE_NAMES:
				return createSequenceRuleNamesFromString(eDataType, initialValue);
			case GMLPackage.SIGN_TYPE:
				return createSignTypeFromString(eDataType, initialValue);
			case GMLPackage.SUCCESSION_TYPE:
				return createSuccessionTypeFromString(eDataType, initialValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE:
				return createSurfaceInterpolationTypeFromString(eDataType, initialValue);
			case GMLPackage.SYMBOL_TYPE_ENUMERATION:
				return createSymbolTypeEnumerationFromString(eDataType, initialValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE:
				return createTimeIndeterminateValueTypeFromString(eDataType, initialValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0:
				return createTimeUnitTypeMember0FromString(eDataType, initialValue);
			case GMLPackage.AESHETIC_CRITERIA_TYPE_OBJECT:
				return createAesheticCriteriaTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.ARC_MINUTES_TYPE:
				return createArcMinutesTypeFromString(eDataType, initialValue);
			case GMLPackage.ARC_SECONDS_TYPE:
				return createArcSecondsTypeFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_LIST:
				return createBooleanListFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_OR_NULL:
				return createBooleanOrNullFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_OR_NULL_LIST:
				return createBooleanOrNullListFromString(eDataType, initialValue);
			case GMLPackage.CAL_DATE:
				return createCalDateFromString(eDataType, initialValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION_OBJECT:
				return createCompassPointEnumerationObjectFromString(eDataType, initialValue);
			case GMLPackage.COUNT_EXTENT_TYPE:
				return createCountExtentTypeFromString(eDataType, initialValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE_OBJECT:
				return createCurveInterpolationTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.DECIMAL_MINUTES_TYPE:
				return createDecimalMinutesTypeFromString(eDataType, initialValue);
			case GMLPackage.DEGREE_VALUE_TYPE:
				return createDegreeValueTypeFromString(eDataType, initialValue);
			case GMLPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER0_OBJECT:
				return createDirectionTypeMember0ObjectFromString(eDataType, initialValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER1:
				return createDirectionTypeMember1FromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_LIST:
				return createDoubleListFromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_OR_NULL:
				return createDoubleOrNullFromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_OR_NULL_LIST:
				return createDoubleOrNullListFromString(eDataType, initialValue);
			case GMLPackage.DRAWING_TYPE_TYPE_OBJECT:
				return createDrawingTypeTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.FILE_VALUE_MODEL_TYPE_OBJECT:
				return createFileValueModelTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.GRAPH_TYPE_TYPE_OBJECT:
				return createGraphTypeTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.INCREMENT_ORDER_OBJECT:
				return createIncrementOrderObjectFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_LIST:
				return createIntegerListFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_OR_NULL:
				return createIntegerOrNullFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_OR_NULL_LIST:
				return createIntegerOrNullListFromString(eDataType, initialValue);
			case GMLPackage.IS_SPHERE_TYPE_OBJECT:
				return createIsSphereTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.KNOT_TYPES_TYPE_OBJECT:
				return createKnotTypesTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.LINE_TYPE_TYPE_OBJECT:
				return createLineTypeTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.NAME_LIST:
				return createNameListFromString(eDataType, initialValue);
			case GMLPackage.NAME_OR_NULL:
				return createNameOrNullFromString(eDataType, initialValue);
			case GMLPackage.NAME_OR_NULL_LIST:
				return createNameOrNullListFromString(eDataType, initialValue);
			case GMLPackage.NC_NAME_LIST:
				return createNCNameListFromString(eDataType, initialValue);
			case GMLPackage.NULL_ENUMERATION:
				return createNullEnumerationFromString(eDataType, initialValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER0_OBJECT:
				return createNullEnumerationMember0ObjectFromString(eDataType, initialValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER1:
				return createNullEnumerationMember1FromString(eDataType, initialValue);
			case GMLPackage.NULL_TYPE:
				return createNullTypeFromString(eDataType, initialValue);
			case GMLPackage.QNAME_LIST:
				return createQNameListFromString(eDataType, initialValue);
			case GMLPackage.QUERY_GRAMMAR_ENUMERATION_OBJECT:
				return createQueryGrammarEnumerationObjectFromString(eDataType, initialValue);
			case GMLPackage.RELATIVE_POSITION_TYPE_OBJECT:
				return createRelativePositionTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.SEQUENCE_RULE_NAMES_OBJECT:
				return createSequenceRuleNamesObjectFromString(eDataType, initialValue);
			case GMLPackage.SIGN_TYPE_OBJECT:
				return createSignTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.STRING_OR_NULL:
				return createStringOrNullFromString(eDataType, initialValue);
			case GMLPackage.SUCCESSION_TYPE_OBJECT:
				return createSuccessionTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE_OBJECT:
				return createSurfaceInterpolationTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.SYMBOL_TYPE_ENUMERATION_OBJECT:
				return createSymbolTypeEnumerationObjectFromString(eDataType, initialValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE_OBJECT:
				return createTimeIndeterminateValueTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.TIME_POSITION_UNION:
				return createTimePositionUnionFromString(eDataType, initialValue);
			case GMLPackage.TIME_UNIT_TYPE:
				return createTimeUnitTypeFromString(eDataType, initialValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0_OBJECT:
				return createTimeUnitTypeMember0ObjectFromString(eDataType, initialValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER1:
				return createTimeUnitTypeMember1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMLPackage.AESHETIC_CRITERIA_TYPE:
				return convertAesheticCriteriaTypeToString(eDataType, instanceValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION:
				return convertCompassPointEnumerationToString(eDataType, instanceValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE:
				return convertCurveInterpolationTypeToString(eDataType, instanceValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER0:
				return convertDirectionTypeMember0ToString(eDataType, instanceValue);
			case GMLPackage.DRAWING_TYPE_TYPE:
				return convertDrawingTypeTypeToString(eDataType, instanceValue);
			case GMLPackage.FILE_VALUE_MODEL_TYPE:
				return convertFileValueModelTypeToString(eDataType, instanceValue);
			case GMLPackage.GRAPH_TYPE_TYPE:
				return convertGraphTypeTypeToString(eDataType, instanceValue);
			case GMLPackage.INCREMENT_ORDER:
				return convertIncrementOrderToString(eDataType, instanceValue);
			case GMLPackage.IS_SPHERE_TYPE:
				return convertIsSphereTypeToString(eDataType, instanceValue);
			case GMLPackage.KNOT_TYPES_TYPE:
				return convertKnotTypesTypeToString(eDataType, instanceValue);
			case GMLPackage.LINE_TYPE_TYPE:
				return convertLineTypeTypeToString(eDataType, instanceValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER0:
				return convertNullEnumerationMember0ToString(eDataType, instanceValue);
			case GMLPackage.QUERY_GRAMMAR_ENUMERATION:
				return convertQueryGrammarEnumerationToString(eDataType, instanceValue);
			case GMLPackage.RELATIVE_POSITION_TYPE:
				return convertRelativePositionTypeToString(eDataType, instanceValue);
			case GMLPackage.SEQUENCE_RULE_NAMES:
				return convertSequenceRuleNamesToString(eDataType, instanceValue);
			case GMLPackage.SIGN_TYPE:
				return convertSignTypeToString(eDataType, instanceValue);
			case GMLPackage.SUCCESSION_TYPE:
				return convertSuccessionTypeToString(eDataType, instanceValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE:
				return convertSurfaceInterpolationTypeToString(eDataType, instanceValue);
			case GMLPackage.SYMBOL_TYPE_ENUMERATION:
				return convertSymbolTypeEnumerationToString(eDataType, instanceValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE:
				return convertTimeIndeterminateValueTypeToString(eDataType, instanceValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0:
				return convertTimeUnitTypeMember0ToString(eDataType, instanceValue);
			case GMLPackage.AESHETIC_CRITERIA_TYPE_OBJECT:
				return convertAesheticCriteriaTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.ARC_MINUTES_TYPE:
				return convertArcMinutesTypeToString(eDataType, instanceValue);
			case GMLPackage.ARC_SECONDS_TYPE:
				return convertArcSecondsTypeToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_LIST:
				return convertBooleanListToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_OR_NULL:
				return convertBooleanOrNullToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_OR_NULL_LIST:
				return convertBooleanOrNullListToString(eDataType, instanceValue);
			case GMLPackage.CAL_DATE:
				return convertCalDateToString(eDataType, instanceValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION_OBJECT:
				return convertCompassPointEnumerationObjectToString(eDataType, instanceValue);
			case GMLPackage.COUNT_EXTENT_TYPE:
				return convertCountExtentTypeToString(eDataType, instanceValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE_OBJECT:
				return convertCurveInterpolationTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.DECIMAL_MINUTES_TYPE:
				return convertDecimalMinutesTypeToString(eDataType, instanceValue);
			case GMLPackage.DEGREE_VALUE_TYPE:
				return convertDegreeValueTypeToString(eDataType, instanceValue);
			case GMLPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER0_OBJECT:
				return convertDirectionTypeMember0ObjectToString(eDataType, instanceValue);
			case GMLPackage.DIRECTION_TYPE_MEMBER1:
				return convertDirectionTypeMember1ToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_LIST:
				return convertDoubleListToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_OR_NULL:
				return convertDoubleOrNullToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_OR_NULL_LIST:
				return convertDoubleOrNullListToString(eDataType, instanceValue);
			case GMLPackage.DRAWING_TYPE_TYPE_OBJECT:
				return convertDrawingTypeTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.FILE_VALUE_MODEL_TYPE_OBJECT:
				return convertFileValueModelTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.GRAPH_TYPE_TYPE_OBJECT:
				return convertGraphTypeTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.INCREMENT_ORDER_OBJECT:
				return convertIncrementOrderObjectToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_LIST:
				return convertIntegerListToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_OR_NULL:
				return convertIntegerOrNullToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_OR_NULL_LIST:
				return convertIntegerOrNullListToString(eDataType, instanceValue);
			case GMLPackage.IS_SPHERE_TYPE_OBJECT:
				return convertIsSphereTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.KNOT_TYPES_TYPE_OBJECT:
				return convertKnotTypesTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.LINE_TYPE_TYPE_OBJECT:
				return convertLineTypeTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.NAME_LIST:
				return convertNameListToString(eDataType, instanceValue);
			case GMLPackage.NAME_OR_NULL:
				return convertNameOrNullToString(eDataType, instanceValue);
			case GMLPackage.NAME_OR_NULL_LIST:
				return convertNameOrNullListToString(eDataType, instanceValue);
			case GMLPackage.NC_NAME_LIST:
				return convertNCNameListToString(eDataType, instanceValue);
			case GMLPackage.NULL_ENUMERATION:
				return convertNullEnumerationToString(eDataType, instanceValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER0_OBJECT:
				return convertNullEnumerationMember0ObjectToString(eDataType, instanceValue);
			case GMLPackage.NULL_ENUMERATION_MEMBER1:
				return convertNullEnumerationMember1ToString(eDataType, instanceValue);
			case GMLPackage.NULL_TYPE:
				return convertNullTypeToString(eDataType, instanceValue);
			case GMLPackage.QNAME_LIST:
				return convertQNameListToString(eDataType, instanceValue);
			case GMLPackage.QUERY_GRAMMAR_ENUMERATION_OBJECT:
				return convertQueryGrammarEnumerationObjectToString(eDataType, instanceValue);
			case GMLPackage.RELATIVE_POSITION_TYPE_OBJECT:
				return convertRelativePositionTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.SEQUENCE_RULE_NAMES_OBJECT:
				return convertSequenceRuleNamesObjectToString(eDataType, instanceValue);
			case GMLPackage.SIGN_TYPE_OBJECT:
				return convertSignTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.STRING_OR_NULL:
				return convertStringOrNullToString(eDataType, instanceValue);
			case GMLPackage.SUCCESSION_TYPE_OBJECT:
				return convertSuccessionTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE_OBJECT:
				return convertSurfaceInterpolationTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.SYMBOL_TYPE_ENUMERATION_OBJECT:
				return convertSymbolTypeEnumerationObjectToString(eDataType, instanceValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE_OBJECT:
				return convertTimeIndeterminateValueTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.TIME_POSITION_UNION:
				return convertTimePositionUnionToString(eDataType, instanceValue);
			case GMLPackage.TIME_UNIT_TYPE:
				return convertTimeUnitTypeToString(eDataType, instanceValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0_OBJECT:
				return convertTimeUnitTypeMember0ObjectToString(eDataType, instanceValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER1:
				return convertTimeUnitTypeMember1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbsoluteExternalPositionalAccuracyType createAbsoluteExternalPositionalAccuracyType() {
		AbsoluteExternalPositionalAccuracyTypeImpl absoluteExternalPositionalAccuracyType = new AbsoluteExternalPositionalAccuracyTypeImpl();
		return absoluteExternalPositionalAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralOperationParameterRefType createAbstractGeneralOperationParameterRefType() {
		AbstractGeneralOperationParameterRefTypeImpl abstractGeneralOperationParameterRefType = new AbstractGeneralOperationParameterRefTypeImpl();
		return abstractGeneralOperationParameterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGriddedSurfaceType createAbstractGriddedSurfaceType() {
		AbstractGriddedSurfaceTypeImpl abstractGriddedSurfaceType = new AbstractGriddedSurfaceTypeImpl();
		return abstractGriddedSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractParametricCurveSurfaceType createAbstractParametricCurveSurfaceType() {
		AbstractParametricCurveSurfaceTypeImpl abstractParametricCurveSurfaceType = new AbstractParametricCurveSurfaceTypeImpl();
		return abstractParametricCurveSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRingPropertyType createAbstractRingPropertyType() {
		AbstractRingPropertyTypeImpl abstractRingPropertyType = new AbstractRingPropertyTypeImpl();
		return abstractRingPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSolidType createAbstractSolidType() {
		AbstractSolidTypeImpl abstractSolidType = new AbstractSolidTypeImpl();
		return abstractSolidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractSurfaceType createAbstractSurfaceType() {
		AbstractSurfaceTypeImpl abstractSurfaceType = new AbstractSurfaceTypeImpl();
		return abstractSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffinePlacementType createAffinePlacementType() {
		AffinePlacementTypeImpl affinePlacementType = new AffinePlacementTypeImpl();
		return affinePlacementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleChoiceType createAngleChoiceType() {
		AngleChoiceTypeImpl angleChoiceType = new AngleChoiceTypeImpl();
		return angleChoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngleType createAngleType() {
		AngleTypeImpl angleType = new AngleTypeImpl();
		return angleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcByBulgeType createArcByBulgeType() {
		ArcByBulgeTypeImpl arcByBulgeType = new ArcByBulgeTypeImpl();
		return arcByBulgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcByCenterPointType createArcByCenterPointType() {
		ArcByCenterPointTypeImpl arcByCenterPointType = new ArcByCenterPointTypeImpl();
		return arcByCenterPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcStringByBulgeType createArcStringByBulgeType() {
		ArcStringByBulgeTypeImpl arcStringByBulgeType = new ArcStringByBulgeTypeImpl();
		return arcStringByBulgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcStringType createArcStringType() {
		ArcStringTypeImpl arcStringType = new ArcStringTypeImpl();
		return arcStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArcType createArcType() {
		ArcTypeImpl arcType = new ArcTypeImpl();
		return arcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAssociationType createArrayAssociationType() {
		ArrayAssociationTypeImpl arrayAssociationType = new ArrayAssociationTypeImpl();
		return arrayAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayType createArrayType() {
		ArrayTypeImpl arrayType = new ArrayTypeImpl();
		return arrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssociationType createAssociationType() {
		AssociationTypeImpl associationType = new AssociationTypeImpl();
		return associationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BagType createBagType() {
		BagTypeImpl bagType = new BagTypeImpl();
		return bagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseStyleDescriptorType createBaseStyleDescriptorType() {
		BaseStyleDescriptorTypeImpl baseStyleDescriptorType = new BaseStyleDescriptorTypeImpl();
		return baseStyleDescriptorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BaseUnitType createBaseUnitType() {
		BaseUnitTypeImpl baseUnitType = new BaseUnitTypeImpl();
		return baseUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BezierType createBezierType() {
		BezierTypeImpl bezierType = new BezierTypeImpl();
		return bezierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanPropertyType createBooleanPropertyType() {
		BooleanPropertyTypeImpl booleanPropertyType = new BooleanPropertyTypeImpl();
		return booleanPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingShapeType createBoundingShapeType() {
		BoundingShapeTypeImpl boundingShapeType = new BoundingShapeTypeImpl();
		return boundingShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSplineType createBSplineType() {
		BSplineTypeImpl bSplineType = new BSplineTypeImpl();
		return bSplineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSRefType createCartesianCSRefType() {
		CartesianCSRefTypeImpl cartesianCSRefType = new CartesianCSRefTypeImpl();
		return cartesianCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CartesianCSType createCartesianCSType() {
		CartesianCSTypeImpl cartesianCSType = new CartesianCSTypeImpl();
		return cartesianCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryExtentType createCategoryExtentType() {
		CategoryExtentTypeImpl categoryExtentType = new CategoryExtentTypeImpl();
		return categoryExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CategoryPropertyType createCategoryPropertyType() {
		CategoryPropertyTypeImpl categoryPropertyType = new CategoryPropertyTypeImpl();
		return categoryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleByCenterPointType createCircleByCenterPointType() {
		CircleByCenterPointTypeImpl circleByCenterPointType = new CircleByCenterPointTypeImpl();
		return circleByCenterPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CircleType createCircleType() {
		CircleTypeImpl circleType = new CircleTypeImpl();
		return circleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClothoidType createClothoidType() {
		ClothoidTypeImpl clothoidType = new ClothoidTypeImpl();
		return clothoidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListType createCodeListType() {
		CodeListTypeImpl codeListType = new CodeListTypeImpl();
		return codeListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeOrNullListType createCodeOrNullListType() {
		CodeOrNullListTypeImpl codeOrNullListType = new CodeOrNullListTypeImpl();
		return codeOrNullListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCurvePropertyType createCompositeCurvePropertyType() {
		CompositeCurvePropertyTypeImpl compositeCurvePropertyType = new CompositeCurvePropertyTypeImpl();
		return compositeCurvePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCurveType createCompositeCurveType() {
		CompositeCurveTypeImpl compositeCurveType = new CompositeCurveTypeImpl();
		return compositeCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSolidPropertyType createCompositeSolidPropertyType() {
		CompositeSolidPropertyTypeImpl compositeSolidPropertyType = new CompositeSolidPropertyTypeImpl();
		return compositeSolidPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSolidType createCompositeSolidType() {
		CompositeSolidTypeImpl compositeSolidType = new CompositeSolidTypeImpl();
		return compositeSolidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSurfacePropertyType createCompositeSurfacePropertyType() {
		CompositeSurfacePropertyTypeImpl compositeSurfacePropertyType = new CompositeSurfacePropertyTypeImpl();
		return compositeSurfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeSurfaceType createCompositeSurfaceType() {
		CompositeSurfaceTypeImpl compositeSurfaceType = new CompositeSurfaceTypeImpl();
		return compositeSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeValueType createCompositeValueType() {
		CompositeValueTypeImpl compositeValueType = new CompositeValueTypeImpl();
		return compositeValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundCRSRefType createCompoundCRSRefType() {
		CompoundCRSRefTypeImpl compoundCRSRefType = new CompoundCRSRefTypeImpl();
		return compoundCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompoundCRSType createCompoundCRSType() {
		CompoundCRSTypeImpl compoundCRSType = new CompoundCRSTypeImpl();
		return compoundCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcatenatedOperationRefType createConcatenatedOperationRefType() {
		ConcatenatedOperationRefTypeImpl concatenatedOperationRefType = new ConcatenatedOperationRefTypeImpl();
		return concatenatedOperationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcatenatedOperationType createConcatenatedOperationType() {
		ConcatenatedOperationTypeImpl concatenatedOperationType = new ConcatenatedOperationTypeImpl();
		return concatenatedOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConeType createConeType() {
		ConeTypeImpl coneType = new ConeTypeImpl();
		return coneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPropertyType createContainerPropertyType() {
		ContainerPropertyTypeImpl containerPropertyType = new ContainerPropertyTypeImpl();
		return containerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlPointType createControlPointType() {
		ControlPointTypeImpl controlPointType = new ControlPointTypeImpl();
		return controlPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConventionalUnitType createConventionalUnitType() {
		ConventionalUnitTypeImpl conventionalUnitType = new ConventionalUnitTypeImpl();
		return conventionalUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionRefType createConversionRefType() {
		ConversionRefTypeImpl conversionRefType = new ConversionRefTypeImpl();
		return conversionRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionToPreferredUnitType createConversionToPreferredUnitType() {
		ConversionToPreferredUnitTypeImpl conversionToPreferredUnitType = new ConversionToPreferredUnitTypeImpl();
		return conversionToPreferredUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConversionType createConversionType() {
		ConversionTypeImpl conversionType = new ConversionTypeImpl();
		return conversionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationRefType createCoordinateOperationRefType() {
		CoordinateOperationRefTypeImpl coordinateOperationRefType = new CoordinateOperationRefTypeImpl();
		return coordinateOperationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateReferenceSystemRefType createCoordinateReferenceSystemRefType() {
		CoordinateReferenceSystemRefTypeImpl coordinateReferenceSystemRefType = new CoordinateReferenceSystemRefTypeImpl();
		return coordinateReferenceSystemRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinatesType createCoordinatesType() {
		CoordinatesTypeImpl coordinatesType = new CoordinatesTypeImpl();
		return coordinatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisRefType createCoordinateSystemAxisRefType() {
		CoordinateSystemAxisRefTypeImpl coordinateSystemAxisRefType = new CoordinateSystemAxisRefTypeImpl();
		return coordinateSystemAxisRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemAxisType createCoordinateSystemAxisType() {
		CoordinateSystemAxisTypeImpl coordinateSystemAxisType = new CoordinateSystemAxisTypeImpl();
		return coordinateSystemAxisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateSystemRefType createCoordinateSystemRefType() {
		CoordinateSystemRefTypeImpl coordinateSystemRefType = new CoordinateSystemRefTypeImpl();
		return coordinateSystemRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordType createCoordType() {
		CoordTypeImpl coordType = new CoordTypeImpl();
		return coordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountPropertyType createCountPropertyType() {
		CountPropertyTypeImpl countPropertyType = new CountPropertyTypeImpl();
		return countPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CovarianceElementType createCovarianceElementType() {
		CovarianceElementTypeImpl covarianceElementType = new CovarianceElementTypeImpl();
		return covarianceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CovarianceMatrixType createCovarianceMatrixType() {
		CovarianceMatrixTypeImpl covarianceMatrixType = new CovarianceMatrixTypeImpl();
		return covarianceMatrixType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageFunctionType createCoverageFunctionType() {
		CoverageFunctionTypeImpl coverageFunctionType = new CoverageFunctionTypeImpl();
		return coverageFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CRSRefType createCRSRefType() {
		CRSRefTypeImpl crsRefType = new CRSRefTypeImpl();
		return crsRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CubicSplineType createCubicSplineType() {
		CubicSplineTypeImpl cubicSplineType = new CubicSplineTypeImpl();
		return cubicSplineType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveArrayPropertyType createCurveArrayPropertyType() {
		CurveArrayPropertyTypeImpl curveArrayPropertyType = new CurveArrayPropertyTypeImpl();
		return curveArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurvePropertyType createCurvePropertyType() {
		CurvePropertyTypeImpl curvePropertyType = new CurvePropertyTypeImpl();
		return curvePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveSegmentArrayPropertyType createCurveSegmentArrayPropertyType() {
		CurveSegmentArrayPropertyTypeImpl curveSegmentArrayPropertyType = new CurveSegmentArrayPropertyTypeImpl();
		return curveSegmentArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveType createCurveType() {
		CurveTypeImpl curveType = new CurveTypeImpl();
		return curveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylinderType createCylinderType() {
		CylinderTypeImpl cylinderType = new CylinderTypeImpl();
		return cylinderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSRefType createCylindricalCSRefType() {
		CylindricalCSRefTypeImpl cylindricalCSRefType = new CylindricalCSRefTypeImpl();
		return cylindricalCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CylindricalCSType createCylindricalCSType() {
		CylindricalCSTypeImpl cylindricalCSType = new CylindricalCSTypeImpl();
		return cylindricalCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataBlockType createDataBlockType() {
		DataBlockTypeImpl dataBlockType = new DataBlockTypeImpl();
		return dataBlockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatumRefType createDatumRefType() {
		DatumRefTypeImpl datumRefType = new DatumRefTypeImpl();
		return datumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultStylePropertyType createDefaultStylePropertyType() {
		DefaultStylePropertyTypeImpl defaultStylePropertyType = new DefaultStylePropertyTypeImpl();
		return defaultStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionProxyType createDefinitionProxyType() {
		DefinitionProxyTypeImpl definitionProxyType = new DefinitionProxyTypeImpl();
		return definitionProxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DegreesType createDegreesType() {
		DegreesTypeImpl degreesType = new DegreesTypeImpl();
		return degreesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivationUnitTermType createDerivationUnitTermType() {
		DerivationUnitTermTypeImpl derivationUnitTermType = new DerivationUnitTermTypeImpl();
		return derivationUnitTermType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCRSRefType createDerivedCRSRefType() {
		DerivedCRSRefTypeImpl derivedCRSRefType = new DerivedCRSRefTypeImpl();
		return derivedCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCRSType createDerivedCRSType() {
		DerivedCRSTypeImpl derivedCRSType = new DerivedCRSTypeImpl();
		return derivedCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedCRSTypeType createDerivedCRSTypeType() {
		DerivedCRSTypeTypeImpl derivedCRSTypeType = new DerivedCRSTypeTypeImpl();
		return derivedCRSTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedUnitType createDerivedUnitType() {
		DerivedUnitTypeImpl derivedUnitType = new DerivedUnitTypeImpl();
		return derivedUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryEntryType createDictionaryEntryType() {
		DictionaryEntryTypeImpl dictionaryEntryType = new DictionaryEntryTypeImpl();
		return dictionaryEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DictionaryType createDictionaryType() {
		DictionaryTypeImpl dictionaryType = new DictionaryTypeImpl();
		return dictionaryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedEdgePropertyType createDirectedEdgePropertyType() {
		DirectedEdgePropertyTypeImpl directedEdgePropertyType = new DirectedEdgePropertyTypeImpl();
		return directedEdgePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedFacePropertyType createDirectedFacePropertyType() {
		DirectedFacePropertyTypeImpl directedFacePropertyType = new DirectedFacePropertyTypeImpl();
		return directedFacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedNodePropertyType createDirectedNodePropertyType() {
		DirectedNodePropertyTypeImpl directedNodePropertyType = new DirectedNodePropertyTypeImpl();
		return directedNodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedObservationAtDistanceType createDirectedObservationAtDistanceType() {
		DirectedObservationAtDistanceTypeImpl directedObservationAtDistanceType = new DirectedObservationAtDistanceTypeImpl();
		return directedObservationAtDistanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedObservationType createDirectedObservationType() {
		DirectedObservationTypeImpl directedObservationType = new DirectedObservationTypeImpl();
		return directedObservationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectedTopoSolidPropertyType createDirectedTopoSolidPropertyType() {
		DirectedTopoSolidPropertyTypeImpl directedTopoSolidPropertyType = new DirectedTopoSolidPropertyTypeImpl();
		return directedTopoSolidPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionPropertyType createDirectionPropertyType() {
		DirectionPropertyTypeImpl directionPropertyType = new DirectionPropertyTypeImpl();
		return directionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectionVectorType createDirectionVectorType() {
		DirectionVectorTypeImpl directionVectorType = new DirectionVectorTypeImpl();
		return directionVectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionListType createDirectPositionListType() {
		DirectPositionListTypeImpl directPositionListType = new DirectPositionListTypeImpl();
		return directPositionListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionType createDirectPositionType() {
		DirectPositionTypeImpl directPositionType = new DirectPositionTypeImpl();
		return directPositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMSAngleType createDMSAngleType() {
		DMSAngleTypeImpl dmsAngleType = new DMSAngleTypeImpl();
		return dmsAngleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainSetType createDomainSetType() {
		DomainSetTypeImpl domainSetType = new DomainSetTypeImpl();
		return domainSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureCollectionType createDynamicFeatureCollectionType() {
		DynamicFeatureCollectionTypeImpl dynamicFeatureCollectionType = new DynamicFeatureCollectionTypeImpl();
		return dynamicFeatureCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicFeatureType createDynamicFeatureType() {
		DynamicFeatureTypeImpl dynamicFeatureType = new DynamicFeatureTypeImpl();
		return dynamicFeatureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EdgeType createEdgeType() {
		EdgeTypeImpl edgeType = new EdgeTypeImpl();
		return edgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSRefType createEllipsoidalCSRefType() {
		EllipsoidalCSRefTypeImpl ellipsoidalCSRefType = new EllipsoidalCSRefTypeImpl();
		return ellipsoidalCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidalCSType createEllipsoidalCSType() {
		EllipsoidalCSTypeImpl ellipsoidalCSType = new EllipsoidalCSTypeImpl();
		return ellipsoidalCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidRefType createEllipsoidRefType() {
		EllipsoidRefTypeImpl ellipsoidRefType = new EllipsoidRefTypeImpl();
		return ellipsoidRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EllipsoidType createEllipsoidType() {
		EllipsoidTypeImpl ellipsoidType = new EllipsoidTypeImpl();
		return ellipsoidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringCRSRefType createEngineeringCRSRefType() {
		EngineeringCRSRefTypeImpl engineeringCRSRefType = new EngineeringCRSRefTypeImpl();
		return engineeringCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringCRSType createEngineeringCRSType() {
		EngineeringCRSTypeImpl engineeringCRSType = new EngineeringCRSTypeImpl();
		return engineeringCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumRefType createEngineeringDatumRefType() {
		EngineeringDatumRefTypeImpl engineeringDatumRefType = new EngineeringDatumRefTypeImpl();
		return engineeringDatumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EngineeringDatumType createEngineeringDatumType() {
		EngineeringDatumTypeImpl engineeringDatumType = new EngineeringDatumTypeImpl();
		return engineeringDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopeType createEnvelopeType() {
		EnvelopeTypeImpl envelopeType = new EnvelopeTypeImpl();
		return envelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvelopeWithTimePeriodType createEnvelopeWithTimePeriodType() {
		EnvelopeWithTimePeriodTypeImpl envelopeWithTimePeriodType = new EnvelopeWithTimePeriodTypeImpl();
		return envelopeWithTimePeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtentType createExtentType() {
		ExtentTypeImpl extentType = new ExtentTypeImpl();
		return extentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaceType createFaceType() {
		FaceTypeImpl faceType = new FaceTypeImpl();
		return faceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureArrayPropertyType createFeatureArrayPropertyType() {
		FeatureArrayPropertyTypeImpl featureArrayPropertyType = new FeatureArrayPropertyTypeImpl();
		return featureArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollectionType createFeatureCollectionType() {
		FeatureCollectionTypeImpl featureCollectionType = new FeatureCollectionTypeImpl();
		return featureCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeaturePropertyType createFeaturePropertyType() {
		FeaturePropertyTypeImpl featurePropertyType = new FeaturePropertyTypeImpl();
		return featurePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureStylePropertyType createFeatureStylePropertyType() {
		FeatureStylePropertyTypeImpl featureStylePropertyType = new FeatureStylePropertyTypeImpl();
		return featureStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureStyleType createFeatureStyleType() {
		FeatureStyleTypeImpl featureStyleType = new FeatureStyleTypeImpl();
		return featureStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileType createFileType() {
		FileTypeImpl fileType = new FileTypeImpl();
		return fileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaType createFormulaType() {
		FormulaTypeImpl formulaType = new FormulaTypeImpl();
		return formulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralConversionRefType createGeneralConversionRefType() {
		GeneralConversionRefTypeImpl generalConversionRefType = new GeneralConversionRefTypeImpl();
		return generalConversionRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralTransformationRefType createGeneralTransformationRefType() {
		GeneralTransformationRefTypeImpl generalTransformationRefType = new GeneralTransformationRefTypeImpl();
		return generalTransformationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericMetaDataType createGenericMetaDataType() {
		GenericMetaDataTypeImpl genericMetaDataType = new GenericMetaDataTypeImpl();
		return genericMetaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeocentricCRSRefType createGeocentricCRSRefType() {
		GeocentricCRSRefTypeImpl geocentricCRSRefType = new GeocentricCRSRefTypeImpl();
		return geocentricCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeocentricCRSType createGeocentricCRSType() {
		GeocentricCRSTypeImpl geocentricCRSType = new GeocentricCRSTypeImpl();
		return geocentricCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodesicStringType createGeodesicStringType() {
		GeodesicStringTypeImpl geodesicStringType = new GeodesicStringTypeImpl();
		return geodesicStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodesicType createGeodesicType() {
		GeodesicTypeImpl geodesicType = new GeodesicTypeImpl();
		return geodesicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumRefType createGeodeticDatumRefType() {
		GeodeticDatumRefTypeImpl geodeticDatumRefType = new GeodeticDatumRefTypeImpl();
		return geodeticDatumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumType createGeodeticDatumType() {
		GeodeticDatumTypeImpl geodeticDatumType = new GeodeticDatumTypeImpl();
		return geodeticDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSRefType createGeographicCRSRefType() {
		GeographicCRSRefTypeImpl geographicCRSRefType = new GeographicCRSRefTypeImpl();
		return geographicCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeographicCRSType createGeographicCRSType() {
		GeographicCRSTypeImpl geographicCRSType = new GeographicCRSTypeImpl();
		return geographicCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricComplexPropertyType createGeometricComplexPropertyType() {
		GeometricComplexPropertyTypeImpl geometricComplexPropertyType = new GeometricComplexPropertyTypeImpl();
		return geometricComplexPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricComplexType createGeometricComplexType() {
		GeometricComplexTypeImpl geometricComplexType = new GeometricComplexTypeImpl();
		return geometricComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometricPrimitivePropertyType createGeometricPrimitivePropertyType() {
		GeometricPrimitivePropertyTypeImpl geometricPrimitivePropertyType = new GeometricPrimitivePropertyTypeImpl();
		return geometricPrimitivePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryArrayPropertyType createGeometryArrayPropertyType() {
		GeometryArrayPropertyTypeImpl geometryArrayPropertyType = new GeometryArrayPropertyTypeImpl();
		return geometryArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryPropertyType createGeometryPropertyType() {
		GeometryPropertyTypeImpl geometryPropertyType = new GeometryPropertyTypeImpl();
		return geometryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryStylePropertyType createGeometryStylePropertyType() {
		GeometryStylePropertyTypeImpl geometryStylePropertyType = new GeometryStylePropertyTypeImpl();
		return geometryStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeometryStyleType createGeometryStyleType() {
		GeometryStyleTypeImpl geometryStyleType = new GeometryStyleTypeImpl();
		return geometryStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphStylePropertyType createGraphStylePropertyType() {
		GraphStylePropertyTypeImpl graphStylePropertyType = new GraphStylePropertyTypeImpl();
		return graphStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphStyleType createGraphStyleType() {
		GraphStyleTypeImpl graphStyleType = new GraphStyleTypeImpl();
		return graphStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridCoverageType createGridCoverageType() {
		GridCoverageTypeImpl gridCoverageType = new GridCoverageTypeImpl();
		return gridCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridDomainType createGridDomainType() {
		GridDomainTypeImpl gridDomainType = new GridDomainTypeImpl();
		return gridDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridEnvelopeType createGridEnvelopeType() {
		GridEnvelopeTypeImpl gridEnvelopeType = new GridEnvelopeTypeImpl();
		return gridEnvelopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridFunctionType createGridFunctionType() {
		GridFunctionTypeImpl gridFunctionType = new GridFunctionTypeImpl();
		return gridFunctionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridLengthType createGridLengthType() {
		GridLengthTypeImpl gridLengthType = new GridLengthTypeImpl();
		return gridLengthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridLimitsType createGridLimitsType() {
		GridLimitsTypeImpl gridLimitsType = new GridLimitsTypeImpl();
		return gridLimitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridType createGridType() {
		GridTypeImpl gridType = new GridTypeImpl();
		return gridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HistoryPropertyType createHistoryPropertyType() {
		HistoryPropertyTypeImpl historyPropertyType = new HistoryPropertyTypeImpl();
		return historyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCRSRefType createImageCRSRefType() {
		ImageCRSRefTypeImpl imageCRSRefType = new ImageCRSRefTypeImpl();
		return imageCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageCRSType createImageCRSType() {
		ImageCRSTypeImpl imageCRSType = new ImageCRSTypeImpl();
		return imageCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumRefType createImageDatumRefType() {
		ImageDatumRefTypeImpl imageDatumRefType = new ImageDatumRefTypeImpl();
		return imageDatumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImageDatumType createImageDatumType() {
		ImageDatumTypeImpl imageDatumType = new ImageDatumTypeImpl();
		return imageDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndexMapType createIndexMapType() {
		IndexMapTypeImpl indexMapType = new IndexMapTypeImpl();
		return indexMapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndirectEntryType createIndirectEntryType() {
		IndirectEntryTypeImpl indirectEntryType = new IndirectEntryTypeImpl();
		return indirectEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IsolatedPropertyType createIsolatedPropertyType() {
		IsolatedPropertyTypeImpl isolatedPropertyType = new IsolatedPropertyTypeImpl();
		return isolatedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnotPropertyType createKnotPropertyType() {
		KnotPropertyTypeImpl knotPropertyType = new KnotPropertyTypeImpl();
		return knotPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnotType createKnotType() {
		KnotTypeImpl knotType = new KnotTypeImpl();
		return knotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStylePropertyType createLabelStylePropertyType() {
		LabelStylePropertyTypeImpl labelStylePropertyType = new LabelStylePropertyTypeImpl();
		return labelStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelStyleType createLabelStyleType() {
		LabelStyleTypeImpl labelStyleType = new LabelStyleTypeImpl();
		return labelStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LengthType createLengthType() {
		LengthTypeImpl lengthType = new LengthTypeImpl();
		return lengthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSRefType createLinearCSRefType() {
		LinearCSRefTypeImpl linearCSRefType = new LinearCSRefTypeImpl();
		return linearCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearCSType createLinearCSType() {
		LinearCSTypeImpl linearCSType = new LinearCSTypeImpl();
		return linearCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingPropertyType createLinearRingPropertyType() {
		LinearRingPropertyTypeImpl linearRingPropertyType = new LinearRingPropertyTypeImpl();
		return linearRingPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinearRingType createLinearRingType() {
		LinearRingTypeImpl linearRingType = new LinearRingTypeImpl();
		return linearRingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringPropertyType createLineStringPropertyType() {
		LineStringPropertyTypeImpl lineStringPropertyType = new LineStringPropertyTypeImpl();
		return lineStringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringSegmentArrayPropertyType createLineStringSegmentArrayPropertyType() {
		LineStringSegmentArrayPropertyTypeImpl lineStringSegmentArrayPropertyType = new LineStringSegmentArrayPropertyTypeImpl();
		return lineStringSegmentArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringSegmentType createLineStringSegmentType() {
		LineStringSegmentTypeImpl lineStringSegmentType = new LineStringSegmentTypeImpl();
		return lineStringSegmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStringType createLineStringType() {
		LineStringTypeImpl lineStringType = new LineStringTypeImpl();
		return lineStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocationPropertyType createLocationPropertyType() {
		LocationPropertyTypeImpl locationPropertyType = new LocationPropertyTypeImpl();
		return locationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureListType createMeasureListType() {
		MeasureListTypeImpl measureListType = new MeasureListTypeImpl();
		return measureListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureOrNullListType createMeasureOrNullListType() {
		MeasureOrNullListTypeImpl measureOrNullListType = new MeasureOrNullListTypeImpl();
		return measureOrNullListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType createMeasureType() {
		MeasureTypeImpl measureType = new MeasureTypeImpl();
		return measureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetaDataPropertyType createMetaDataPropertyType() {
		MetaDataPropertyTypeImpl metaDataPropertyType = new MetaDataPropertyTypeImpl();
		return metaDataPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MovingObjectStatusType createMovingObjectStatusType() {
		MovingObjectStatusTypeImpl movingObjectStatusType = new MovingObjectStatusTypeImpl();
		return movingObjectStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurveCoverageType createMultiCurveCoverageType() {
		MultiCurveCoverageTypeImpl multiCurveCoverageType = new MultiCurveCoverageTypeImpl();
		return multiCurveCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurveDomainType createMultiCurveDomainType() {
		MultiCurveDomainTypeImpl multiCurveDomainType = new MultiCurveDomainTypeImpl();
		return multiCurveDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurvePropertyType createMultiCurvePropertyType() {
		MultiCurvePropertyTypeImpl multiCurvePropertyType = new MultiCurvePropertyTypeImpl();
		return multiCurvePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCurveType createMultiCurveType() {
		MultiCurveTypeImpl multiCurveType = new MultiCurveTypeImpl();
		return multiCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryPropertyType createMultiGeometryPropertyType() {
		MultiGeometryPropertyTypeImpl multiGeometryPropertyType = new MultiGeometryPropertyTypeImpl();
		return multiGeometryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiGeometryType createMultiGeometryType() {
		MultiGeometryTypeImpl multiGeometryType = new MultiGeometryTypeImpl();
		return multiGeometryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLineStringPropertyType createMultiLineStringPropertyType() {
		MultiLineStringPropertyTypeImpl multiLineStringPropertyType = new MultiLineStringPropertyTypeImpl();
		return multiLineStringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiLineStringType createMultiLineStringType() {
		MultiLineStringTypeImpl multiLineStringType = new MultiLineStringTypeImpl();
		return multiLineStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointCoverageType createMultiPointCoverageType() {
		MultiPointCoverageTypeImpl multiPointCoverageType = new MultiPointCoverageTypeImpl();
		return multiPointCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointDomainType createMultiPointDomainType() {
		MultiPointDomainTypeImpl multiPointDomainType = new MultiPointDomainTypeImpl();
		return multiPointDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointPropertyType createMultiPointPropertyType() {
		MultiPointPropertyTypeImpl multiPointPropertyType = new MultiPointPropertyTypeImpl();
		return multiPointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPointType createMultiPointType() {
		MultiPointTypeImpl multiPointType = new MultiPointTypeImpl();
		return multiPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPolygonPropertyType createMultiPolygonPropertyType() {
		MultiPolygonPropertyTypeImpl multiPolygonPropertyType = new MultiPolygonPropertyTypeImpl();
		return multiPolygonPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiPolygonType createMultiPolygonType() {
		MultiPolygonTypeImpl multiPolygonType = new MultiPolygonTypeImpl();
		return multiPolygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidCoverageType createMultiSolidCoverageType() {
		MultiSolidCoverageTypeImpl multiSolidCoverageType = new MultiSolidCoverageTypeImpl();
		return multiSolidCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidDomainType createMultiSolidDomainType() {
		MultiSolidDomainTypeImpl multiSolidDomainType = new MultiSolidDomainTypeImpl();
		return multiSolidDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidPropertyType createMultiSolidPropertyType() {
		MultiSolidPropertyTypeImpl multiSolidPropertyType = new MultiSolidPropertyTypeImpl();
		return multiSolidPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSolidType createMultiSolidType() {
		MultiSolidTypeImpl multiSolidType = new MultiSolidTypeImpl();
		return multiSolidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceCoverageType createMultiSurfaceCoverageType() {
		MultiSurfaceCoverageTypeImpl multiSurfaceCoverageType = new MultiSurfaceCoverageTypeImpl();
		return multiSurfaceCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceDomainType createMultiSurfaceDomainType() {
		MultiSurfaceDomainTypeImpl multiSurfaceDomainType = new MultiSurfaceDomainTypeImpl();
		return multiSurfaceDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfacePropertyType createMultiSurfacePropertyType() {
		MultiSurfacePropertyTypeImpl multiSurfacePropertyType = new MultiSurfacePropertyTypeImpl();
		return multiSurfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiSurfaceType createMultiSurfaceType() {
		MultiSurfaceTypeImpl multiSurfaceType = new MultiSurfaceTypeImpl();
		return multiSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodeType createNodeType() {
		NodeTypeImpl nodeType = new NodeTypeImpl();
		return nodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSRefType createObliqueCartesianCSRefType() {
		ObliqueCartesianCSRefTypeImpl obliqueCartesianCSRefType = new ObliqueCartesianCSRefTypeImpl();
		return obliqueCartesianCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObliqueCartesianCSType createObliqueCartesianCSType() {
		ObliqueCartesianCSTypeImpl obliqueCartesianCSType = new ObliqueCartesianCSTypeImpl();
		return obliqueCartesianCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObservationType createObservationType() {
		ObservationTypeImpl observationType = new ObservationTypeImpl();
		return observationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OffsetCurveType createOffsetCurveType() {
		OffsetCurveTypeImpl offsetCurveType = new OffsetCurveTypeImpl();
		return offsetCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodRefType createOperationMethodRefType() {
		OperationMethodRefTypeImpl operationMethodRefType = new OperationMethodRefTypeImpl();
		return operationMethodRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationMethodType createOperationMethodType() {
		OperationMethodTypeImpl operationMethodType = new OperationMethodTypeImpl();
		return operationMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupRefType createOperationParameterGroupRefType() {
		OperationParameterGroupRefTypeImpl operationParameterGroupRefType = new OperationParameterGroupRefTypeImpl();
		return operationParameterGroupRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterGroupType createOperationParameterGroupType() {
		OperationParameterGroupTypeImpl operationParameterGroupType = new OperationParameterGroupTypeImpl();
		return operationParameterGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterRefType createOperationParameterRefType() {
		OperationParameterRefTypeImpl operationParameterRefType = new OperationParameterRefTypeImpl();
		return operationParameterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationParameterType createOperationParameterType() {
		OperationParameterTypeImpl operationParameterType = new OperationParameterTypeImpl();
		return operationParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationRefType createOperationRefType() {
		OperationRefTypeImpl operationRefType = new OperationRefTypeImpl();
		return operationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientableCurveType createOrientableCurveType() {
		OrientableCurveTypeImpl orientableCurveType = new OrientableCurveTypeImpl();
		return orientableCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrientableSurfaceType createOrientableSurfaceType() {
		OrientableSurfaceTypeImpl orientableSurfaceType = new OrientableSurfaceTypeImpl();
		return orientableSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueGroupType createParameterValueGroupType() {
		ParameterValueGroupTypeImpl parameterValueGroupType = new ParameterValueGroupTypeImpl();
		return parameterValueGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterValueType createParameterValueType() {
		ParameterValueTypeImpl parameterValueType = new ParameterValueTypeImpl();
		return parameterValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughOperationRefType createPassThroughOperationRefType() {
		PassThroughOperationRefTypeImpl passThroughOperationRefType = new PassThroughOperationRefTypeImpl();
		return passThroughOperationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassThroughOperationType createPassThroughOperationType() {
		PassThroughOperationTypeImpl passThroughOperationType = new PassThroughOperationTypeImpl();
		return passThroughOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PixelInCellType createPixelInCellType() {
		PixelInCellTypeImpl pixelInCellType = new PixelInCellTypeImpl();
		return pixelInCellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointArrayPropertyType createPointArrayPropertyType() {
		PointArrayPropertyTypeImpl pointArrayPropertyType = new PointArrayPropertyTypeImpl();
		return pointArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType createPointPropertyType() {
		PointPropertyTypeImpl pointPropertyType = new PointPropertyTypeImpl();
		return pointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointType createPointType() {
		PointTypeImpl pointType = new PointTypeImpl();
		return pointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSRefType createPolarCSRefType() {
		PolarCSRefTypeImpl polarCSRefType = new PolarCSRefTypeImpl();
		return polarCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolarCSType createPolarCSType() {
		PolarCSTypeImpl polarCSType = new PolarCSTypeImpl();
		return polarCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonPatchArrayPropertyType createPolygonPatchArrayPropertyType() {
		PolygonPatchArrayPropertyTypeImpl polygonPatchArrayPropertyType = new PolygonPatchArrayPropertyTypeImpl();
		return polygonPatchArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonPatchType createPolygonPatchType() {
		PolygonPatchTypeImpl polygonPatchType = new PolygonPatchTypeImpl();
		return polygonPatchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonPropertyType createPolygonPropertyType() {
		PolygonPropertyTypeImpl polygonPropertyType = new PolygonPropertyTypeImpl();
		return polygonPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolygonType createPolygonType() {
		PolygonTypeImpl polygonType = new PolygonTypeImpl();
		return polygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolyhedralSurfaceType createPolyhedralSurfaceType() {
		PolyhedralSurfaceTypeImpl polyhedralSurfaceType = new PolyhedralSurfaceTypeImpl();
		return polyhedralSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianRefType createPrimeMeridianRefType() {
		PrimeMeridianRefTypeImpl primeMeridianRefType = new PrimeMeridianRefTypeImpl();
		return primeMeridianRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimeMeridianType createPrimeMeridianType() {
		PrimeMeridianTypeImpl primeMeridianType = new PrimeMeridianTypeImpl();
		return primeMeridianType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PriorityLocationPropertyType createPriorityLocationPropertyType() {
		PriorityLocationPropertyTypeImpl priorityLocationPropertyType = new PriorityLocationPropertyTypeImpl();
		return priorityLocationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectedCRSRefType createProjectedCRSRefType() {
		ProjectedCRSRefTypeImpl projectedCRSRefType = new ProjectedCRSRefTypeImpl();
		return projectedCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectedCRSType createProjectedCRSType() {
		ProjectedCRSTypeImpl projectedCRSType = new ProjectedCRSTypeImpl();
		return projectedCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityExtentType createQuantityExtentType() {
		QuantityExtentTypeImpl quantityExtentType = new QuantityExtentTypeImpl();
		return quantityExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantityPropertyType createQuantityPropertyType() {
		QuantityPropertyTypeImpl quantityPropertyType = new QuantityPropertyTypeImpl();
		return quantityPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeParametersType createRangeParametersType() {
		RangeParametersTypeImpl rangeParametersType = new RangeParametersTypeImpl();
		return rangeParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RangeSetType createRangeSetType() {
		RangeSetTypeImpl rangeSetType = new RangeSetTypeImpl();
		return rangeSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleType createRectangleType() {
		RectangleTypeImpl rectangleType = new RectangleTypeImpl();
		return rectangleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridCoverageType createRectifiedGridCoverageType() {
		RectifiedGridCoverageTypeImpl rectifiedGridCoverageType = new RectifiedGridCoverageTypeImpl();
		return rectifiedGridCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridDomainType createRectifiedGridDomainType() {
		RectifiedGridDomainTypeImpl rectifiedGridDomainType = new RectifiedGridDomainTypeImpl();
		return rectifiedGridDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectifiedGridType createRectifiedGridType() {
		RectifiedGridTypeImpl rectifiedGridType = new RectifiedGridTypeImpl();
		return rectifiedGridType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSystemRefType createReferenceSystemRefType() {
		ReferenceSystemRefTypeImpl referenceSystemRefType = new ReferenceSystemRefTypeImpl();
		return referenceSystemRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefLocationType createRefLocationType() {
		RefLocationTypeImpl refLocationType = new RefLocationTypeImpl();
		return refLocationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedTimeType createRelatedTimeType() {
		RelatedTimeTypeImpl relatedTimeType = new RelatedTimeTypeImpl();
		return relatedTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeInternalPositionalAccuracyType createRelativeInternalPositionalAccuracyType() {
		RelativeInternalPositionalAccuracyTypeImpl relativeInternalPositionalAccuracyType = new RelativeInternalPositionalAccuracyTypeImpl();
		return relativeInternalPositionalAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RingPropertyType createRingPropertyType() {
		RingPropertyTypeImpl ringPropertyType = new RingPropertyTypeImpl();
		return ringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RingType createRingType() {
		RingTypeImpl ringType = new RingTypeImpl();
		return ringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowType createRowType() {
		RowTypeImpl rowType = new RowTypeImpl();
		return rowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScalarValuePropertyType createScalarValuePropertyType() {
		ScalarValuePropertyTypeImpl scalarValuePropertyType = new ScalarValuePropertyTypeImpl();
		return scalarValuePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ScaleType createScaleType() {
		ScaleTypeImpl scaleType = new ScaleTypeImpl();
		return scaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType createSecondDefiningParameterType() {
		SecondDefiningParameterTypeImpl secondDefiningParameterType = new SecondDefiningParameterTypeImpl();
		return secondDefiningParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SequenceRuleType createSequenceRuleType() {
		SequenceRuleTypeImpl sequenceRuleType = new SequenceRuleTypeImpl();
		return sequenceRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleOperationRefType createSingleOperationRefType() {
		SingleOperationRefTypeImpl singleOperationRefType = new SingleOperationRefTypeImpl();
		return singleOperationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidArrayPropertyType createSolidArrayPropertyType() {
		SolidArrayPropertyTypeImpl solidArrayPropertyType = new SolidArrayPropertyTypeImpl();
		return solidArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidPropertyType createSolidPropertyType() {
		SolidPropertyTypeImpl solidPropertyType = new SolidPropertyTypeImpl();
		return solidPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolidType createSolidType() {
		SolidTypeImpl solidType = new SolidTypeImpl();
		return solidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpeedType createSpeedType() {
		SpeedTypeImpl speedType = new SpeedTypeImpl();
		return speedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphereType createSphereType() {
		SphereTypeImpl sphereType = new SphereTypeImpl();
		return sphereType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSRefType createSphericalCSRefType() {
		SphericalCSRefTypeImpl sphericalCSRefType = new SphericalCSRefTypeImpl();
		return sphericalCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SphericalCSType createSphericalCSType() {
		SphericalCSTypeImpl sphericalCSType = new SphericalCSTypeImpl();
		return sphericalCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType createStringOrRefType() {
		StringOrRefTypeImpl stringOrRefType = new StringOrRefTypeImpl();
		return stringOrRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType createStyleType() {
		StyleTypeImpl styleType = new StyleTypeImpl();
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleVariationType createStyleVariationType() {
		StyleVariationTypeImpl styleVariationType = new StyleVariationTypeImpl();
		return styleVariationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceArrayPropertyType createSurfaceArrayPropertyType() {
		SurfaceArrayPropertyTypeImpl surfaceArrayPropertyType = new SurfaceArrayPropertyTypeImpl();
		return surfaceArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePatchArrayPropertyType createSurfacePatchArrayPropertyType() {
		SurfacePatchArrayPropertyTypeImpl surfacePatchArrayPropertyType = new SurfacePatchArrayPropertyTypeImpl();
		return surfacePatchArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfacePropertyType createSurfacePropertyType() {
		SurfacePropertyTypeImpl surfacePropertyType = new SurfacePropertyTypeImpl();
		return surfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SurfaceType createSurfaceType() {
		SurfaceTypeImpl surfaceType = new SurfaceTypeImpl();
		return surfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymbolType createSymbolType() {
		SymbolTypeImpl symbolType = new SymbolTypeImpl();
		return symbolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPropertyType createTargetPropertyType() {
		TargetPropertyTypeImpl targetPropertyType = new TargetPropertyTypeImpl();
		return targetPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCRSRefType createTemporalCRSRefType() {
		TemporalCRSRefTypeImpl temporalCRSRefType = new TemporalCRSRefTypeImpl();
		return temporalCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCRSType createTemporalCRSType() {
		TemporalCRSTypeImpl temporalCRSType = new TemporalCRSTypeImpl();
		return temporalCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSRefType createTemporalCSRefType() {
		TemporalCSRefTypeImpl temporalCSRefType = new TemporalCSRefTypeImpl();
		return temporalCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalCSType createTemporalCSType() {
		TemporalCSTypeImpl temporalCSType = new TemporalCSTypeImpl();
		return temporalCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumRefType createTemporalDatumRefType() {
		TemporalDatumRefTypeImpl temporalDatumRefType = new TemporalDatumRefTypeImpl();
		return temporalDatumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalDatumType createTemporalDatumType() {
		TemporalDatumTypeImpl temporalDatumType = new TemporalDatumTypeImpl();
		return temporalDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarEraPropertyType createTimeCalendarEraPropertyType() {
		TimeCalendarEraPropertyTypeImpl timeCalendarEraPropertyType = new TimeCalendarEraPropertyTypeImpl();
		return timeCalendarEraPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarEraType createTimeCalendarEraType() {
		TimeCalendarEraTypeImpl timeCalendarEraType = new TimeCalendarEraTypeImpl();
		return timeCalendarEraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarPropertyType createTimeCalendarPropertyType() {
		TimeCalendarPropertyTypeImpl timeCalendarPropertyType = new TimeCalendarPropertyTypeImpl();
		return timeCalendarPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCalendarType createTimeCalendarType() {
		TimeCalendarTypeImpl timeCalendarType = new TimeCalendarTypeImpl();
		return timeCalendarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeClockPropertyType createTimeClockPropertyType() {
		TimeClockPropertyTypeImpl timeClockPropertyType = new TimeClockPropertyTypeImpl();
		return timeClockPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeClockType createTimeClockType() {
		TimeClockTypeImpl timeClockType = new TimeClockTypeImpl();
		return timeClockType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCoordinateSystemType createTimeCoordinateSystemType() {
		TimeCoordinateSystemTypeImpl timeCoordinateSystemType = new TimeCoordinateSystemTypeImpl();
		return timeCoordinateSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeEdgePropertyType createTimeEdgePropertyType() {
		TimeEdgePropertyTypeImpl timeEdgePropertyType = new TimeEdgePropertyTypeImpl();
		return timeEdgePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeEdgeType createTimeEdgeType() {
		TimeEdgeTypeImpl timeEdgeType = new TimeEdgeTypeImpl();
		return timeEdgeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeGeometricPrimitivePropertyType createTimeGeometricPrimitivePropertyType() {
		TimeGeometricPrimitivePropertyTypeImpl timeGeometricPrimitivePropertyType = new TimeGeometricPrimitivePropertyTypeImpl();
		return timeGeometricPrimitivePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInstantPropertyType createTimeInstantPropertyType() {
		TimeInstantPropertyTypeImpl timeInstantPropertyType = new TimeInstantPropertyTypeImpl();
		return timeInstantPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeInstantType createTimeInstantType() {
		TimeInstantTypeImpl timeInstantType = new TimeInstantTypeImpl();
		return timeInstantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeIntervalLengthType createTimeIntervalLengthType() {
		TimeIntervalLengthTypeImpl timeIntervalLengthType = new TimeIntervalLengthTypeImpl();
		return timeIntervalLengthType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeNodePropertyType createTimeNodePropertyType() {
		TimeNodePropertyTypeImpl timeNodePropertyType = new TimeNodePropertyTypeImpl();
		return timeNodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeNodeType createTimeNodeType() {
		TimeNodeTypeImpl timeNodeType = new TimeNodeTypeImpl();
		return timeNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeOrdinalEraPropertyType createTimeOrdinalEraPropertyType() {
		TimeOrdinalEraPropertyTypeImpl timeOrdinalEraPropertyType = new TimeOrdinalEraPropertyTypeImpl();
		return timeOrdinalEraPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeOrdinalEraType createTimeOrdinalEraType() {
		TimeOrdinalEraTypeImpl timeOrdinalEraType = new TimeOrdinalEraTypeImpl();
		return timeOrdinalEraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeOrdinalReferenceSystemType createTimeOrdinalReferenceSystemType() {
		TimeOrdinalReferenceSystemTypeImpl timeOrdinalReferenceSystemType = new TimeOrdinalReferenceSystemTypeImpl();
		return timeOrdinalReferenceSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePeriodPropertyType createTimePeriodPropertyType() {
		TimePeriodPropertyTypeImpl timePeriodPropertyType = new TimePeriodPropertyTypeImpl();
		return timePeriodPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePeriodType createTimePeriodType() {
		TimePeriodTypeImpl timePeriodType = new TimePeriodTypeImpl();
		return timePeriodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePositionType createTimePositionType() {
		TimePositionTypeImpl timePositionType = new TimePositionTypeImpl();
		return timePositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimePrimitivePropertyType createTimePrimitivePropertyType() {
		TimePrimitivePropertyTypeImpl timePrimitivePropertyType = new TimePrimitivePropertyTypeImpl();
		return timePrimitivePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTopologyComplexPropertyType createTimeTopologyComplexPropertyType() {
		TimeTopologyComplexPropertyTypeImpl timeTopologyComplexPropertyType = new TimeTopologyComplexPropertyTypeImpl();
		return timeTopologyComplexPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTopologyComplexType createTimeTopologyComplexType() {
		TimeTopologyComplexTypeImpl timeTopologyComplexType = new TimeTopologyComplexTypeImpl();
		return timeTopologyComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeTopologyPrimitivePropertyType createTimeTopologyPrimitivePropertyType() {
		TimeTopologyPrimitivePropertyTypeImpl timeTopologyPrimitivePropertyType = new TimeTopologyPrimitivePropertyTypeImpl();
		return timeTopologyPrimitivePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TinType createTinType() {
		TinTypeImpl tinType = new TinTypeImpl();
		return tinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexMemberType createTopoComplexMemberType() {
		TopoComplexMemberTypeImpl topoComplexMemberType = new TopoComplexMemberTypeImpl();
		return topoComplexMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoComplexType createTopoComplexType() {
		TopoComplexTypeImpl topoComplexType = new TopoComplexTypeImpl();
		return topoComplexType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoCurvePropertyType createTopoCurvePropertyType() {
		TopoCurvePropertyTypeImpl topoCurvePropertyType = new TopoCurvePropertyTypeImpl();
		return topoCurvePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoCurveType createTopoCurveType() {
		TopoCurveTypeImpl topoCurveType = new TopoCurveTypeImpl();
		return topoCurveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyStylePropertyType createTopologyStylePropertyType() {
		TopologyStylePropertyTypeImpl topologyStylePropertyType = new TopologyStylePropertyTypeImpl();
		return topologyStylePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopologyStyleType createTopologyStyleType() {
		TopologyStyleTypeImpl topologyStyleType = new TopologyStyleTypeImpl();
		return topologyStyleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPointPropertyType createTopoPointPropertyType() {
		TopoPointPropertyTypeImpl topoPointPropertyType = new TopoPointPropertyTypeImpl();
		return topoPointPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPointType createTopoPointType() {
		TopoPointTypeImpl topoPointType = new TopoPointTypeImpl();
		return topoPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPrimitiveArrayAssociationType createTopoPrimitiveArrayAssociationType() {
		TopoPrimitiveArrayAssociationTypeImpl topoPrimitiveArrayAssociationType = new TopoPrimitiveArrayAssociationTypeImpl();
		return topoPrimitiveArrayAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoPrimitiveMemberType createTopoPrimitiveMemberType() {
		TopoPrimitiveMemberTypeImpl topoPrimitiveMemberType = new TopoPrimitiveMemberTypeImpl();
		return topoPrimitiveMemberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSolidType createTopoSolidType() {
		TopoSolidTypeImpl topoSolidType = new TopoSolidTypeImpl();
		return topoSolidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSurfacePropertyType createTopoSurfacePropertyType() {
		TopoSurfacePropertyTypeImpl topoSurfacePropertyType = new TopoSurfacePropertyTypeImpl();
		return topoSurfacePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoSurfaceType createTopoSurfaceType() {
		TopoSurfaceTypeImpl topoSurfaceType = new TopoSurfaceTypeImpl();
		return topoSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoVolumePropertyType createTopoVolumePropertyType() {
		TopoVolumePropertyTypeImpl topoVolumePropertyType = new TopoVolumePropertyTypeImpl();
		return topoVolumePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TopoVolumeType createTopoVolumeType() {
		TopoVolumeTypeImpl topoVolumeType = new TopoVolumeTypeImpl();
		return topoVolumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrackType createTrackType() {
		TrackTypeImpl trackType = new TrackTypeImpl();
		return trackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationRefType createTransformationRefType() {
		TransformationRefTypeImpl transformationRefType = new TransformationRefTypeImpl();
		return transformationRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformationType createTransformationType() {
		TransformationTypeImpl transformationType = new TransformationTypeImpl();
		return transformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrianglePatchArrayPropertyType createTrianglePatchArrayPropertyType() {
		TrianglePatchArrayPropertyTypeImpl trianglePatchArrayPropertyType = new TrianglePatchArrayPropertyTypeImpl();
		return trianglePatchArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangleType createTriangleType() {
		TriangleTypeImpl triangleType = new TriangleTypeImpl();
		return triangleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriangulatedSurfaceType createTriangulatedSurfaceType() {
		TriangulatedSurfaceTypeImpl triangulatedSurfaceType = new TriangulatedSurfaceTypeImpl();
		return triangulatedSurfaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitDefinitionType createUnitDefinitionType() {
		UnitDefinitionTypeImpl unitDefinitionType = new UnitDefinitionTypeImpl();
		return unitDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnitOfMeasureType createUnitOfMeasureType() {
		UnitOfMeasureTypeImpl unitOfMeasureType = new UnitOfMeasureTypeImpl();
		return unitOfMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSRefType createUserDefinedCSRefType() {
		UserDefinedCSRefTypeImpl userDefinedCSRefType = new UserDefinedCSRefTypeImpl();
		return userDefinedCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserDefinedCSType createUserDefinedCSType() {
		UserDefinedCSTypeImpl userDefinedCSType = new UserDefinedCSTypeImpl();
		return userDefinedCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayPropertyType createValueArrayPropertyType() {
		ValueArrayPropertyTypeImpl valueArrayPropertyType = new ValueArrayPropertyTypeImpl();
		return valueArrayPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayType createValueArrayType() {
		ValueArrayTypeImpl valueArrayType = new ValueArrayTypeImpl();
		return valueArrayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValuePropertyType createValuePropertyType() {
		ValuePropertyTypeImpl valuePropertyType = new ValuePropertyTypeImpl();
		return valuePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VectorType createVectorType() {
		VectorTypeImpl vectorType = new VectorTypeImpl();
		return vectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCRSRefType createVerticalCRSRefType() {
		VerticalCRSRefTypeImpl verticalCRSRefType = new VerticalCRSRefTypeImpl();
		return verticalCRSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCRSType createVerticalCRSType() {
		VerticalCRSTypeImpl verticalCRSType = new VerticalCRSTypeImpl();
		return verticalCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSRefType createVerticalCSRefType() {
		VerticalCSRefTypeImpl verticalCSRefType = new VerticalCSRefTypeImpl();
		return verticalCSRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalCSType createVerticalCSType() {
		VerticalCSTypeImpl verticalCSType = new VerticalCSTypeImpl();
		return verticalCSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumRefType createVerticalDatumRefType() {
		VerticalDatumRefTypeImpl verticalDatumRefType = new VerticalDatumRefTypeImpl();
		return verticalDatumRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumType createVerticalDatumType() {
		VerticalDatumTypeImpl verticalDatumType = new VerticalDatumTypeImpl();
		return verticalDatumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalDatumTypeType createVerticalDatumTypeType() {
		VerticalDatumTypeTypeImpl verticalDatumTypeType = new VerticalDatumTypeTypeImpl();
		return verticalDatumTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeType createVolumeType() {
		VolumeTypeImpl volumeType = new VolumeTypeImpl();
		return volumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AesheticCriteriaType createAesheticCriteriaTypeFromString(EDataType eDataType, String initialValue) {
		AesheticCriteriaType result = AesheticCriteriaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAesheticCriteriaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompassPointEnumeration createCompassPointEnumerationFromString(EDataType eDataType, String initialValue) {
		CompassPointEnumeration result = CompassPointEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompassPointEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveInterpolationType createCurveInterpolationTypeFromString(EDataType eDataType, String initialValue) {
		CurveInterpolationType result = CurveInterpolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveInterpolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionTypeMember0 createDirectionTypeMember0FromString(EDataType eDataType, String initialValue) {
		DirectionTypeMember0 result = DirectionTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingTypeType createDrawingTypeTypeFromString(EDataType eDataType, String initialValue) {
		DrawingTypeType result = DrawingTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrawingTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValueModelType createFileValueModelTypeFromString(EDataType eDataType, String initialValue) {
		FileValueModelType result = FileValueModelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileValueModelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphTypeType createGraphTypeTypeFromString(EDataType eDataType, String initialValue) {
		GraphTypeType result = GraphTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementOrder createIncrementOrderFromString(EDataType eDataType, String initialValue) {
		IncrementOrder result = IncrementOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncrementOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsSphereType createIsSphereTypeFromString(EDataType eDataType, String initialValue) {
		IsSphereType result = IsSphereType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsSphereTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnotTypesType createKnotTypesTypeFromString(EDataType eDataType, String initialValue) {
		KnotTypesType result = KnotTypesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnotTypesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTypeType createLineTypeTypeFromString(EDataType eDataType, String initialValue) {
		LineTypeType result = LineTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullEnumerationMember0 createNullEnumerationMember0FromString(EDataType eDataType, String initialValue) {
		NullEnumerationMember0 result = NullEnumerationMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullEnumerationMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGrammarEnumeration createQueryGrammarEnumerationFromString(EDataType eDataType, String initialValue) {
		QueryGrammarEnumeration result = QueryGrammarEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryGrammarEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePositionType createRelativePositionTypeFromString(EDataType eDataType, String initialValue) {
		RelativePositionType result = RelativePositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativePositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRuleNames createSequenceRuleNamesFromString(EDataType eDataType, String initialValue) {
		SequenceRuleNames result = SequenceRuleNames.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceRuleNamesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createSignTypeFromString(EDataType eDataType, String initialValue) {
		SignType result = SignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessionType createSuccessionTypeFromString(EDataType eDataType, String initialValue) {
		SuccessionType result = SuccessionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuccessionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceInterpolationType createSurfaceInterpolationTypeFromString(EDataType eDataType, String initialValue) {
		SurfaceInterpolationType result = SurfaceInterpolationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurfaceInterpolationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTypeEnumeration createSymbolTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		SymbolTypeEnumeration result = SymbolTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIndeterminateValueType createTimeIndeterminateValueTypeFromString(EDataType eDataType, String initialValue) {
		TimeIndeterminateValueType result = TimeIndeterminateValueType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeIndeterminateValueTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitTypeMember0 createTimeUnitTypeMember0FromString(EDataType eDataType, String initialValue) {
		TimeUnitTypeMember0 result = TimeUnitTypeMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AesheticCriteriaType createAesheticCriteriaTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAesheticCriteriaTypeFromString(GMLPackage.eINSTANCE.getAesheticCriteriaType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAesheticCriteriaTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAesheticCriteriaTypeToString(GMLPackage.eINSTANCE.getAesheticCriteriaType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createArcMinutesTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArcMinutesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createArcSecondsTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArcSecondsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Boolean> createBooleanListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Boolean> result = new ArrayList<Boolean>();
		for (String item : split(initialValue)) {
			result.add((Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createBooleanOrNullFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOrNullToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.BOOLEAN.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createBooleanOrNullListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createBooleanOrNullFromString(GMLPackage.eINSTANCE.getBooleanOrNull(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOrNullListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertBooleanOrNullToString(GMLPackage.eINSTANCE.getBooleanOrNull(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createCalDateFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		XMLGregorianCalendar result = null;
		RuntimeException exception = null;
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR_MONTH, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.GYEAR, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalDateToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.DATE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR_MONTH.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR_MONTH, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.GYEAR.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.GYEAR, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompassPointEnumeration createCompassPointEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createCompassPointEnumerationFromString(GMLPackage.eINSTANCE.getCompassPointEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompassPointEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCompassPointEnumerationToString(GMLPackage.eINSTANCE.getCompassPointEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createCountExtentTypeFromString(EDataType eDataType, String initialValue) {
		return createIntegerOrNullListFromString(GMLPackage.eINSTANCE.getIntegerOrNullList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountExtentTypeToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerOrNullListToString(GMLPackage.eINSTANCE.getIntegerOrNullList(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurveInterpolationType createCurveInterpolationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCurveInterpolationTypeFromString(GMLPackage.eINSTANCE.getCurveInterpolationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCurveInterpolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCurveInterpolationTypeToString(GMLPackage.eINSTANCE.getCurveInterpolationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalMinutesTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalMinutesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createDegreeValueTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDegreeValueTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Enumerator result = null;
		RuntimeException exception = null;
		try {
			result = (Enumerator)createDirectionTypeMember0FromString(GMLPackage.eINSTANCE.getDirectionTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = (Enumerator)createDirectionTypeMember1FromString(GMLPackage.eINSTANCE.getDirectionTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getDirectionTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertDirectionTypeMember0ToString(GMLPackage.eINSTANCE.getDirectionTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (GMLPackage.eINSTANCE.getDirectionTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertDirectionTypeMember1ToString(GMLPackage.eINSTANCE.getDirectionTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectionTypeMember0 createDirectionTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeMember0FromString(GMLPackage.eINSTANCE.getDirectionTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeMember0ToString(GMLPackage.eINSTANCE.getDirectionTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createDirectionTypeMember1FromString(EDataType eDataType, String initialValue) {
		return createSignTypeFromString(GMLPackage.eINSTANCE.getSignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return convertSignTypeToString(GMLPackage.eINSTANCE.getSignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Double> createDoubleListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Double> result = new ArrayList<Double>();
		for (String item : split(initialValue)) {
			result.add((Double)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDoubleOrNullFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DOUBLE, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleOrNullToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DOUBLE.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DOUBLE, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createDoubleOrNullListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createDoubleOrNullFromString(GMLPackage.eINSTANCE.getDoubleOrNull(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleOrNullListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertDoubleOrNullToString(GMLPackage.eINSTANCE.getDoubleOrNull(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrawingTypeType createDrawingTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDrawingTypeTypeFromString(GMLPackage.eINSTANCE.getDrawingTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrawingTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDrawingTypeTypeToString(GMLPackage.eINSTANCE.getDrawingTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileValueModelType createFileValueModelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createFileValueModelTypeFromString(GMLPackage.eINSTANCE.getFileValueModelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileValueModelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFileValueModelTypeToString(GMLPackage.eINSTANCE.getFileValueModelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphTypeType createGraphTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createGraphTypeTypeFromString(GMLPackage.eINSTANCE.getGraphTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGraphTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGraphTypeTypeToString(GMLPackage.eINSTANCE.getGraphTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncrementOrder createIncrementOrderObjectFromString(EDataType eDataType, String initialValue) {
		return createIncrementOrderFromString(GMLPackage.eINSTANCE.getIncrementOrder(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIncrementOrderObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIncrementOrderToString(GMLPackage.eINSTANCE.getIncrementOrder(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<BigInteger> createIntegerListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<BigInteger> result = new ArrayList<BigInteger>();
		for (String item : split(initialValue)) {
			result.add((BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createIntegerOrNullFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOrNullToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.INTEGER.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createIntegerOrNullListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createIntegerOrNullFromString(GMLPackage.eINSTANCE.getIntegerOrNull(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOrNullListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertIntegerOrNullToString(GMLPackage.eINSTANCE.getIntegerOrNull(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsSphereType createIsSphereTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIsSphereTypeFromString(GMLPackage.eINSTANCE.getIsSphereType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsSphereTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsSphereTypeToString(GMLPackage.eINSTANCE.getIsSphereType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KnotTypesType createKnotTypesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createKnotTypesTypeFromString(GMLPackage.eINSTANCE.getKnotTypesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKnotTypesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertKnotTypesTypeToString(GMLPackage.eINSTANCE.getKnotTypesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineTypeType createLineTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLineTypeTypeFromString(GMLPackage.eINSTANCE.getLineTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLineTypeTypeToString(GMLPackage.eINSTANCE.getLineTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createNameListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNameOrNullFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NAME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameOrNullToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.NAME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NAME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<Object> createNameOrNullListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createNameOrNullFromString(GMLPackage.eINSTANCE.getNameOrNull(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameOrNullListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertNameOrNullToString(GMLPackage.eINSTANCE.getNameOrNull(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createNCNameListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add((String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNCNameListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNullEnumerationFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationMember0FromString(GMLPackage.eINSTANCE.getNullEnumerationMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNullEnumerationMember1FromString(GMLPackage.eINSTANCE.getNullEnumerationMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullEnumerationToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumerationMember0().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationMember0ToString(GMLPackage.eINSTANCE.getNullEnumerationMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (GMLPackage.eINSTANCE.getNullEnumerationMember1().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationMember1ToString(GMLPackage.eINSTANCE.getNullEnumerationMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullEnumerationMember0 createNullEnumerationMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createNullEnumerationMember0FromString(GMLPackage.eINSTANCE.getNullEnumerationMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullEnumerationMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNullEnumerationMember0ToString(GMLPackage.eINSTANCE.getNullEnumerationMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNullEnumerationMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullEnumerationMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNullTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNullTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<QName> createQNameListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<QName> result = new ArrayList<QName>();
		for (String item : split(initialValue)) {
			result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQNameListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGrammarEnumeration createQueryGrammarEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createQueryGrammarEnumerationFromString(GMLPackage.eINSTANCE.getQueryGrammarEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQueryGrammarEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertQueryGrammarEnumerationToString(GMLPackage.eINSTANCE.getQueryGrammarEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativePositionType createRelativePositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createRelativePositionTypeFromString(GMLPackage.eINSTANCE.getRelativePositionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelativePositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRelativePositionTypeToString(GMLPackage.eINSTANCE.getRelativePositionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceRuleNames createSequenceRuleNamesObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceRuleNamesFromString(GMLPackage.eINSTANCE.getSequenceRuleNames(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceRuleNamesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceRuleNamesToString(GMLPackage.eINSTANCE.getSequenceRuleNames(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignType createSignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSignTypeFromString(GMLPackage.eINSTANCE.getSignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSignTypeToString(GMLPackage.eINSTANCE.getSignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createStringOrNullFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNullEnumerationFromString(GMLPackage.eINSTANCE.getNullEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringOrNullToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNullEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNullEnumerationToString(GMLPackage.eINSTANCE.getNullEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuccessionType createSuccessionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSuccessionTypeFromString(GMLPackage.eINSTANCE.getSuccessionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSuccessionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSuccessionTypeToString(GMLPackage.eINSTANCE.getSuccessionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceInterpolationType createSurfaceInterpolationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSurfaceInterpolationTypeFromString(GMLPackage.eINSTANCE.getSurfaceInterpolationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSurfaceInterpolationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSurfaceInterpolationTypeToString(GMLPackage.eINSTANCE.getSurfaceInterpolationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolTypeEnumeration createSymbolTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSymbolTypeEnumerationFromString(GMLPackage.eINSTANCE.getSymbolTypeEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSymbolTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSymbolTypeEnumerationToString(GMLPackage.eINSTANCE.getSymbolTypeEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIndeterminateValueType createTimeIndeterminateValueTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeIndeterminateValueTypeFromString(GMLPackage.eINSTANCE.getTimeIndeterminateValueType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeIndeterminateValueTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeIndeterminateValueTypeToString(GMLPackage.eINSTANCE.getTimeIndeterminateValueType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTimePositionUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createCalDateFromString(GMLPackage.eINSTANCE.getCalDate(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePositionUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getCalDate().isInstance(instanceValue)) {
			try {
				String value = convertCalDateToString(GMLPackage.eINSTANCE.getCalDate(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DATE_TIME.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.DECIMAL.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createTimeUnitTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createTimeUnitTypeMember0FromString(GMLPackage.eINSTANCE.getTimeUnitTypeMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createTimeUnitTypeMember1FromString(GMLPackage.eINSTANCE.getTimeUnitTypeMember1(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getTimeUnitTypeMember0().isInstance(instanceValue)) {
			try {
				String value = convertTimeUnitTypeMember0ToString(GMLPackage.eINSTANCE.getTimeUnitTypeMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (GMLPackage.eINSTANCE.getTimeUnitTypeMember1().isInstance(instanceValue)) {
			try {
				String value = convertTimeUnitTypeMember1ToString(GMLPackage.eINSTANCE.getTimeUnitTypeMember1(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnitTypeMember0 createTimeUnitTypeMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createTimeUnitTypeMember0FromString(GMLPackage.eINSTANCE.getTimeUnitTypeMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTimeUnitTypeMember0ToString(GMLPackage.eINSTANCE.getTimeUnitTypeMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTimeUnitTypeMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMLPackage getGMLPackage() {
		return (GMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GMLPackage getPackage() {
		return GMLPackage.eINSTANCE;
	}

} //GMLFactoryImpl
