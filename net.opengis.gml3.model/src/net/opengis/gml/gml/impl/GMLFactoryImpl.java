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
package net.opengis.gml.gml.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import javax.xml.namespace.QName;

import net.opengis.gml.gml.*;

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
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_PROPERTY_TYPE: return createAbstractGeneralOperationParameterPropertyType();
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE: return createAbstractGeneralParameterValuePropertyType();
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE: return createAbstractRingPropertyType();
			case GMLPackage.ABSTRACT_SOLID_TYPE: return createAbstractSolidType();
			case GMLPackage.AFFINE_CS_PROPERTY_TYPE: return createAffineCSPropertyType();
			case GMLPackage.AFFINE_CS_TYPE: return createAffineCSType();
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
			case GMLPackage.ASSOCIATION_ROLE_TYPE: return createAssociationRoleType();
			case GMLPackage.BAG_TYPE: return createBagType();
			case GMLPackage.BASE_UNIT_TYPE: return createBaseUnitType();
			case GMLPackage.BEZIER_TYPE: return createBezierType();
			case GMLPackage.BOOLEAN_PROPERTY_TYPE: return createBooleanPropertyType();
			case GMLPackage.BOOLEAN_TYPE: return createBooleanType();
			case GMLPackage.BOUNDING_SHAPE_TYPE: return createBoundingShapeType();
			case GMLPackage.BSPLINE_TYPE: return createBSplineType();
			case GMLPackage.CARTESIAN_CS_PROPERTY_TYPE: return createCartesianCSPropertyType();
			case GMLPackage.CARTESIAN_CS_TYPE: return createCartesianCSType();
			case GMLPackage.CATEGORY_EXTENT_TYPE: return createCategoryExtentType();
			case GMLPackage.CATEGORY_PROPERTY_TYPE: return createCategoryPropertyType();
			case GMLPackage.CATEGORY_TYPE: return createCategoryType();
			case GMLPackage.CIRCLE_BY_CENTER_POINT_TYPE: return createCircleByCenterPointType();
			case GMLPackage.CIRCLE_TYPE: return createCircleType();
			case GMLPackage.CLOTHOID_TYPE: return createClothoidType();
			case GMLPackage.CODE_LIST_TYPE: return createCodeListType();
			case GMLPackage.CODE_OR_NIL_REASON_LIST_TYPE: return createCodeOrNilReasonListType();
			case GMLPackage.CODE_TYPE: return createCodeType();
			case GMLPackage.CODE_WITH_AUTHORITY_TYPE: return createCodeWithAuthorityType();
			case GMLPackage.COMPOSITE_CURVE_TYPE: return createCompositeCurveType();
			case GMLPackage.COMPOSITE_SOLID_TYPE: return createCompositeSolidType();
			case GMLPackage.COMPOSITE_SURFACE_TYPE: return createCompositeSurfaceType();
			case GMLPackage.COMPOSITE_VALUE_TYPE: return createCompositeValueType();
			case GMLPackage.COMPOUND_CRS_PROPERTY_TYPE: return createCompoundCRSPropertyType();
			case GMLPackage.COMPOUND_CRS_TYPE: return createCompoundCRSType();
			case GMLPackage.CONCATENATED_OPERATION_PROPERTY_TYPE: return createConcatenatedOperationPropertyType();
			case GMLPackage.CONCATENATED_OPERATION_TYPE: return createConcatenatedOperationType();
			case GMLPackage.CONE_TYPE: return createConeType();
			case GMLPackage.CONTROL_POINT_TYPE: return createControlPointType();
			case GMLPackage.CONVENTIONAL_UNIT_TYPE: return createConventionalUnitType();
			case GMLPackage.CONVERSION_PROPERTY_TYPE: return createConversionPropertyType();
			case GMLPackage.CONVERSION_TO_PREFERRED_UNIT_TYPE: return createConversionToPreferredUnitType();
			case GMLPackage.CONVERSION_TYPE: return createConversionType();
			case GMLPackage.COORDINATE_OPERATION_ACCURACY_TYPE: return createCoordinateOperationAccuracyType();
			case GMLPackage.COORDINATE_OPERATION_PROPERTY_TYPE: return createCoordinateOperationPropertyType();
			case GMLPackage.COORDINATES_TYPE: return createCoordinatesType();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_PROPERTY_TYPE: return createCoordinateSystemAxisPropertyType();
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE: return createCoordinateSystemAxisType();
			case GMLPackage.COORDINATE_SYSTEM_PROPERTY_TYPE: return createCoordinateSystemPropertyType();
			case GMLPackage.COUNT_PROPERTY_TYPE: return createCountPropertyType();
			case GMLPackage.COUNT_TYPE: return createCountType();
			case GMLPackage.COVERAGE_FUNCTION_TYPE: return createCoverageFunctionType();
			case GMLPackage.CRS_PROPERTY_TYPE: return createCRSPropertyType();
			case GMLPackage.CUBIC_SPLINE_TYPE: return createCubicSplineType();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE: return createCurveArrayPropertyType();
			case GMLPackage.CURVE_PROPERTY_TYPE: return createCurvePropertyType();
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE: return createCurveSegmentArrayPropertyType();
			case GMLPackage.CURVE_TYPE: return createCurveType();
			case GMLPackage.CYLINDER_TYPE: return createCylinderType();
			case GMLPackage.CYLINDRICAL_CS_PROPERTY_TYPE: return createCylindricalCSPropertyType();
			case GMLPackage.CYLINDRICAL_CS_TYPE: return createCylindricalCSType();
			case GMLPackage.DATA_BLOCK_TYPE: return createDataBlockType();
			case GMLPackage.DATUM_PROPERTY_TYPE: return createDatumPropertyType();
			case GMLPackage.DEFINITION_BASE_TYPE: return createDefinitionBaseType();
			case GMLPackage.DEFINITION_PROXY_TYPE: return createDefinitionProxyType();
			case GMLPackage.DEFINITION_TYPE: return createDefinitionType();
			case GMLPackage.DEGREES_TYPE: return createDegreesType();
			case GMLPackage.DERIVATION_UNIT_TERM_TYPE: return createDerivationUnitTermType();
			case GMLPackage.DERIVED_CRS_PROPERTY_TYPE: return createDerivedCRSPropertyType();
			case GMLPackage.DERIVED_CRS_TYPE: return createDerivedCRSType();
			case GMLPackage.DERIVED_UNIT_TYPE: return createDerivedUnitType();
			case GMLPackage.DICTIONARY_ENTRY_TYPE: return createDictionaryEntryType();
			case GMLPackage.DICTIONARY_TYPE: return createDictionaryType();
			case GMLPackage.DIRECTED_EDGE_PROPERTY_TYPE: return createDirectedEdgePropertyType();
			case GMLPackage.DIRECTED_FACE_PROPERTY_TYPE: return createDirectedFacePropertyType();
			case GMLPackage.DIRECTED_NODE_PROPERTY_TYPE: return createDirectedNodePropertyType();
			case GMLPackage.DIRECTED_OBSERVATION_AT_DISTANCE_TYPE: return createDirectedObservationAtDistanceType();
			case GMLPackage.DIRECTED_OBSERVATION_TYPE: return createDirectedObservationType();
			case GMLPackage.DIRECTED_TOPO_SOLID_PROPERTY_TYPE: return createDirectedTopoSolidPropertyType();
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE: return createDirectionDescriptionType();
			case GMLPackage.DIRECTION_PROPERTY_TYPE: return createDirectionPropertyType();
			case GMLPackage.DIRECTION_VECTOR_TYPE: return createDirectionVectorType();
			case GMLPackage.DIRECT_POSITION_LIST_TYPE: return createDirectPositionListType();
			case GMLPackage.DIRECT_POSITION_TYPE: return createDirectPositionType();
			case GMLPackage.DISCRETE_COVERAGE_TYPE: return createDiscreteCoverageType();
			case GMLPackage.DMS_ANGLE_TYPE: return createDMSAngleType();
			case GMLPackage.GML_DOCUMENT_ROOT: return createGMLDocumentRoot();
			case GMLPackage.DOMAIN_OF_VALIDITY_TYPE: return createDomainOfValidityType();
			case GMLPackage.DOMAIN_SET_TYPE: return createDomainSetType();
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE: return createDynamicFeatureCollectionType();
			case GMLPackage.DYNAMIC_FEATURE_MEMBER_TYPE: return createDynamicFeatureMemberType();
			case GMLPackage.DYNAMIC_FEATURE_TYPE: return createDynamicFeatureType();
			case GMLPackage.EDGE_TYPE: return createEdgeType();
			case GMLPackage.ELLIPSOIDAL_CS_PROPERTY_TYPE: return createEllipsoidalCSPropertyType();
			case GMLPackage.ELLIPSOIDAL_CS_TYPE: return createEllipsoidalCSType();
			case GMLPackage.ELLIPSOID_PROPERTY_TYPE: return createEllipsoidPropertyType();
			case GMLPackage.ELLIPSOID_TYPE: return createEllipsoidType();
			case GMLPackage.ENGINEERING_CRS_PROPERTY_TYPE: return createEngineeringCRSPropertyType();
			case GMLPackage.ENGINEERING_CRS_TYPE: return createEngineeringCRSType();
			case GMLPackage.ENGINEERING_DATUM_PROPERTY_TYPE: return createEngineeringDatumPropertyType();
			case GMLPackage.ENGINEERING_DATUM_TYPE: return createEngineeringDatumType();
			case GMLPackage.ENVELOPE_TYPE: return createEnvelopeType();
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE: return createEnvelopeWithTimePeriodType();
			case GMLPackage.FACE_OR_TOPO_SOLID_PROPERTY_TYPE: return createFaceOrTopoSolidPropertyType();
			case GMLPackage.FACE_TYPE: return createFaceType();
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE: return createFeatureArrayPropertyType();
			case GMLPackage.FEATURE_COLLECTION_TYPE: return createFeatureCollectionType();
			case GMLPackage.FEATURE_PROPERTY_TYPE: return createFeaturePropertyType();
			case GMLPackage.FILE_TYPE: return createFileType();
			case GMLPackage.FORMULA_CITATION_TYPE: return createFormulaCitationType();
			case GMLPackage.FORMULA_TYPE: return createFormulaType();
			case GMLPackage.GENERAL_CONVERSION_PROPERTY_TYPE: return createGeneralConversionPropertyType();
			case GMLPackage.GENERAL_TRANSFORMATION_PROPERTY_TYPE: return createGeneralTransformationPropertyType();
			case GMLPackage.GENERIC_META_DATA_TYPE: return createGenericMetaDataType();
			case GMLPackage.GEOCENTRIC_CRS_PROPERTY_TYPE: return createGeocentricCRSPropertyType();
			case GMLPackage.GEOCENTRIC_CRS_TYPE: return createGeocentricCRSType();
			case GMLPackage.GEODESIC_STRING_TYPE: return createGeodesicStringType();
			case GMLPackage.GEODESIC_TYPE: return createGeodesicType();
			case GMLPackage.GEODETIC_CRS_PROPERTY_TYPE: return createGeodeticCRSPropertyType();
			case GMLPackage.GEODETIC_CRS_TYPE: return createGeodeticCRSType();
			case GMLPackage.GEODETIC_DATUM_PROPERTY_TYPE: return createGeodeticDatumPropertyType();
			case GMLPackage.GEODETIC_DATUM_TYPE: return createGeodeticDatumType();
			case GMLPackage.GEOGRAPHIC_CRS_PROPERTY_TYPE: return createGeographicCRSPropertyType();
			case GMLPackage.GEOGRAPHIC_CRS_TYPE: return createGeographicCRSType();
			case GMLPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE: return createGeometricComplexPropertyType();
			case GMLPackage.GEOMETRIC_COMPLEX_TYPE: return createGeometricComplexType();
			case GMLPackage.GEOMETRIC_PRIMITIVE_PROPERTY_TYPE: return createGeometricPrimitivePropertyType();
			case GMLPackage.GEOMETRY_ARRAY_PROPERTY_TYPE: return createGeometryArrayPropertyType();
			case GMLPackage.GEOMETRY_PROPERTY_TYPE: return createGeometryPropertyType();
			case GMLPackage.GRID_ENVELOPE_TYPE: return createGridEnvelopeType();
			case GMLPackage.GRID_FUNCTION_TYPE: return createGridFunctionType();
			case GMLPackage.GRID_LENGTH_TYPE: return createGridLengthType();
			case GMLPackage.GRID_LIMITS_TYPE: return createGridLimitsType();
			case GMLPackage.GRID_TYPE: return createGridType();
			case GMLPackage.HISTORY_PROPERTY_TYPE: return createHistoryPropertyType();
			case GMLPackage.IMAGE_CRS_PROPERTY_TYPE: return createImageCRSPropertyType();
			case GMLPackage.IMAGE_CRS_TYPE: return createImageCRSType();
			case GMLPackage.IMAGE_DATUM_PROPERTY_TYPE: return createImageDatumPropertyType();
			case GMLPackage.IMAGE_DATUM_TYPE: return createImageDatumType();
			case GMLPackage.INDIRECT_ENTRY_TYPE: return createIndirectEntryType();
			case GMLPackage.INLINE_PROPERTY_TYPE: return createInlinePropertyType();
			case GMLPackage.KNOT_PROPERTY_TYPE: return createKnotPropertyType();
			case GMLPackage.KNOT_TYPE: return createKnotType();
			case GMLPackage.LENGTH_TYPE: return createLengthType();
			case GMLPackage.LINEAR_CS_PROPERTY_TYPE: return createLinearCSPropertyType();
			case GMLPackage.LINEAR_CS_TYPE: return createLinearCSType();
			case GMLPackage.LINEAR_RING_PROPERTY_TYPE: return createLinearRingPropertyType();
			case GMLPackage.LINEAR_RING_TYPE: return createLinearRingType();
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE: return createLineStringSegmentArrayPropertyType();
			case GMLPackage.LINE_STRING_SEGMENT_TYPE: return createLineStringSegmentType();
			case GMLPackage.LINE_STRING_TYPE: return createLineStringType();
			case GMLPackage.LOCATION_PROPERTY_TYPE: return createLocationPropertyType();
			case GMLPackage.MAPPING_RULE_TYPE: return createMappingRuleType();
			case GMLPackage.MEASURE_LIST_TYPE: return createMeasureListType();
			case GMLPackage.MEASURE_OR_NIL_REASON_LIST_TYPE: return createMeasureOrNilReasonListType();
			case GMLPackage.MEASURE_TYPE: return createMeasureType();
			case GMLPackage.META_DATA_PROPERTY_TYPE: return createMetaDataPropertyType();
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE: return createMovingObjectStatusType();
			case GMLPackage.MULTI_CURVE_PROPERTY_TYPE: return createMultiCurvePropertyType();
			case GMLPackage.MULTI_CURVE_TYPE: return createMultiCurveType();
			case GMLPackage.MULTI_GEOMETRY_PROPERTY_TYPE: return createMultiGeometryPropertyType();
			case GMLPackage.MULTI_GEOMETRY_TYPE: return createMultiGeometryType();
			case GMLPackage.MULTI_POINT_PROPERTY_TYPE: return createMultiPointPropertyType();
			case GMLPackage.MULTI_POINT_TYPE: return createMultiPointType();
			case GMLPackage.MULTI_SOLID_PROPERTY_TYPE: return createMultiSolidPropertyType();
			case GMLPackage.MULTI_SOLID_TYPE: return createMultiSolidType();
			case GMLPackage.MULTI_SURFACE_PROPERTY_TYPE: return createMultiSurfacePropertyType();
			case GMLPackage.MULTI_SURFACE_TYPE: return createMultiSurfaceType();
			case GMLPackage.NODE_OR_EDGE_PROPERTY_TYPE: return createNodeOrEdgePropertyType();
			case GMLPackage.NODE_PROPERTY_TYPE: return createNodePropertyType();
			case GMLPackage.NODE_TYPE: return createNodeType();
			case GMLPackage.OBLIQUE_CARTESIAN_CS_PROPERTY_TYPE: return createObliqueCartesianCSPropertyType();
			case GMLPackage.OBLIQUE_CARTESIAN_CS_TYPE: return createObliqueCartesianCSType();
			case GMLPackage.OBSERVATION_TYPE: return createObservationType();
			case GMLPackage.OFFSET_CURVE_TYPE: return createOffsetCurveType();
			case GMLPackage.OPERATION_METHOD_PROPERTY_TYPE: return createOperationMethodPropertyType();
			case GMLPackage.OPERATION_METHOD_TYPE: return createOperationMethodType();
			case GMLPackage.OPERATION_PARAMETER_GROUP_PROPERTY_TYPE: return createOperationParameterGroupPropertyType();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE: return createOperationParameterGroupType();
			case GMLPackage.OPERATION_PARAMETER_PROPERTY_TYPE: return createOperationParameterPropertyType();
			case GMLPackage.OPERATION_PARAMETER_TYPE: return createOperationParameterType();
			case GMLPackage.OPERATION_PROPERTY_TYPE: return createOperationPropertyType();
			case GMLPackage.ORIENTABLE_CURVE_TYPE: return createOrientableCurveType();
			case GMLPackage.ORIENTABLE_SURFACE_TYPE: return createOrientableSurfaceType();
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE: return createParameterValueGroupType();
			case GMLPackage.PARAMETER_VALUE_TYPE: return createParameterValueType();
			case GMLPackage.PASS_THROUGH_OPERATION_PROPERTY_TYPE: return createPassThroughOperationPropertyType();
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE: return createPassThroughOperationType();
			case GMLPackage.POINT_ARRAY_PROPERTY_TYPE: return createPointArrayPropertyType();
			case GMLPackage.POINT_PROPERTY_TYPE: return createPointPropertyType();
			case GMLPackage.POINT_TYPE: return createPointType();
			case GMLPackage.POLAR_CS_PROPERTY_TYPE: return createPolarCSPropertyType();
			case GMLPackage.POLAR_CS_TYPE: return createPolarCSType();
			case GMLPackage.POLYGON_PATCH_TYPE: return createPolygonPatchType();
			case GMLPackage.POLYGON_TYPE: return createPolygonType();
			case GMLPackage.PRIME_MERIDIAN_PROPERTY_TYPE: return createPrimeMeridianPropertyType();
			case GMLPackage.PRIME_MERIDIAN_TYPE: return createPrimeMeridianType();
			case GMLPackage.PRIORITY_LOCATION_PROPERTY_TYPE: return createPriorityLocationPropertyType();
			case GMLPackage.PROCEDURE_PROPERTY_TYPE: return createProcedurePropertyType();
			case GMLPackage.PROJECTED_CRS_PROPERTY_TYPE: return createProjectedCRSPropertyType();
			case GMLPackage.PROJECTED_CRS_TYPE: return createProjectedCRSType();
			case GMLPackage.QUANTITY_EXTENT_TYPE: return createQuantityExtentType();
			case GMLPackage.QUANTITY_PROPERTY_TYPE: return createQuantityPropertyType();
			case GMLPackage.QUANTITY_TYPE: return createQuantityType();
			case GMLPackage.RANGE_SET_TYPE: return createRangeSetType();
			case GMLPackage.RECTANGLE_TYPE: return createRectangleType();
			case GMLPackage.RECTIFIED_GRID_TYPE: return createRectifiedGridType();
			case GMLPackage.REFERENCE_TYPE: return createReferenceType();
			case GMLPackage.REF_LOCATION_TYPE: return createRefLocationType();
			case GMLPackage.RELATED_TIME_TYPE: return createRelatedTimeType();
			case GMLPackage.RESULT_TYPE: return createResultType();
			case GMLPackage.RING_PROPERTY_TYPE: return createRingPropertyType();
			case GMLPackage.RING_TYPE: return createRingType();
			case GMLPackage.ROWS_TYPE: return createRowsType();
			case GMLPackage.ROW_TYPE: return createRowType();
			case GMLPackage.SCALE_TYPE: return createScaleType();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE: return createSecondDefiningParameterType();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1: return createSecondDefiningParameterType1();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE2: return createSecondDefiningParameterType2();
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE3: return createSecondDefiningParameterType3();
			case GMLPackage.SEQUENCE_RULE_TYPE: return createSequenceRuleType();
			case GMLPackage.SHELL_PROPERTY_TYPE: return createShellPropertyType();
			case GMLPackage.SHELL_TYPE: return createShellType();
			case GMLPackage.SINGLE_CRS_PROPERTY_TYPE: return createSingleCRSPropertyType();
			case GMLPackage.SINGLE_OPERATION_PROPERTY_TYPE: return createSingleOperationPropertyType();
			case GMLPackage.SOLID_ARRAY_PROPERTY_TYPE: return createSolidArrayPropertyType();
			case GMLPackage.SOLID_PROPERTY_TYPE: return createSolidPropertyType();
			case GMLPackage.SOLID_TYPE: return createSolidType();
			case GMLPackage.SPEED_TYPE: return createSpeedType();
			case GMLPackage.SPHERE_TYPE: return createSphereType();
			case GMLPackage.SPHERICAL_CS_PROPERTY_TYPE: return createSphericalCSPropertyType();
			case GMLPackage.SPHERICAL_CS_TYPE: return createSphericalCSType();
			case GMLPackage.STRING_OR_REF_TYPE: return createStringOrRefType();
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE: return createSurfaceArrayPropertyType();
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE: return createSurfacePatchArrayPropertyType();
			case GMLPackage.SURFACE_PROPERTY_TYPE: return createSurfacePropertyType();
			case GMLPackage.SURFACE_TYPE: return createSurfaceType();
			case GMLPackage.TARGET_PROPERTY_TYPE: return createTargetPropertyType();
			case GMLPackage.TEMPORAL_CRS_PROPERTY_TYPE: return createTemporalCRSPropertyType();
			case GMLPackage.TEMPORAL_CRS_TYPE: return createTemporalCRSType();
			case GMLPackage.TEMPORAL_CS_PROPERTY_TYPE: return createTemporalCSPropertyType();
			case GMLPackage.TEMPORAL_CS_TYPE: return createTemporalCSType();
			case GMLPackage.TEMPORAL_DATUM_PROPERTY_TYPE: return createTemporalDatumPropertyType();
			case GMLPackage.TEMPORAL_DATUM_TYPE: return createTemporalDatumType();
			case GMLPackage.TIME_CALENDAR_ERA_PROPERTY_TYPE: return createTimeCalendarEraPropertyType();
			case GMLPackage.TIME_CALENDAR_ERA_TYPE: return createTimeCalendarEraType();
			case GMLPackage.TIME_CALENDAR_PROPERTY_TYPE: return createTimeCalendarPropertyType();
			case GMLPackage.TIME_CALENDAR_TYPE: return createTimeCalendarType();
			case GMLPackage.TIME_CLOCK_PROPERTY_TYPE: return createTimeClockPropertyType();
			case GMLPackage.TIME_CLOCK_TYPE: return createTimeClockType();
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE: return createTimeCoordinateSystemType();
			case GMLPackage.TIME_CS_PROPERTY_TYPE: return createTimeCSPropertyType();
			case GMLPackage.TIME_CS_TYPE: return createTimeCSType();
			case GMLPackage.TIME_EDGE_PROPERTY_TYPE: return createTimeEdgePropertyType();
			case GMLPackage.TIME_EDGE_TYPE: return createTimeEdgeType();
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
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE: return createTimeReferenceSystemType();
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_PROPERTY_TYPE: return createTimeTopologyComplexPropertyType();
			case GMLPackage.TIME_TOPOLOGY_PRIMITIVE_PROPERTY_TYPE: return createTimeTopologyPrimitivePropertyType();
			case GMLPackage.TIME_TYPE: return createTimeType();
			case GMLPackage.TIN_TYPE: return createTinType();
			case GMLPackage.TOPO_COMPLEX_PROPERTY_TYPE: return createTopoComplexPropertyType();
			case GMLPackage.TOPO_COMPLEX_TYPE: return createTopoComplexType();
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE: return createTopoCurvePropertyType();
			case GMLPackage.TOPO_CURVE_TYPE: return createTopoCurveType();
			case GMLPackage.TOPO_POINT_PROPERTY_TYPE: return createTopoPointPropertyType();
			case GMLPackage.TOPO_POINT_TYPE: return createTopoPointType();
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE: return createTopoPrimitiveArrayAssociationType();
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE: return createTopoPrimitiveMemberType();
			case GMLPackage.TOPO_SOLID_PROPERTY_TYPE: return createTopoSolidPropertyType();
			case GMLPackage.TOPO_SOLID_TYPE: return createTopoSolidType();
			case GMLPackage.TOPO_SURFACE_PROPERTY_TYPE: return createTopoSurfacePropertyType();
			case GMLPackage.TOPO_SURFACE_TYPE: return createTopoSurfaceType();
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE: return createTopoVolumePropertyType();
			case GMLPackage.TOPO_VOLUME_TYPE: return createTopoVolumeType();
			case GMLPackage.TRANSFORMATION_PROPERTY_TYPE: return createTransformationPropertyType();
			case GMLPackage.TRANSFORMATION_TYPE: return createTransformationType();
			case GMLPackage.TRIANGLE_TYPE: return createTriangleType();
			case GMLPackage.UNIT_DEFINITION_TYPE: return createUnitDefinitionType();
			case GMLPackage.UNIT_OF_MEASURE_TYPE: return createUnitOfMeasureType();
			case GMLPackage.USER_DEFINED_CS_PROPERTY_TYPE: return createUserDefinedCSPropertyType();
			case GMLPackage.USER_DEFINED_CS_TYPE: return createUserDefinedCSType();
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE: return createValueArrayPropertyType();
			case GMLPackage.VALUE_ARRAY_TYPE: return createValueArrayType();
			case GMLPackage.VALUE_PROPERTY_TYPE: return createValuePropertyType();
			case GMLPackage.VECTOR_TYPE: return createVectorType();
			case GMLPackage.VERTICAL_CRS_PROPERTY_TYPE: return createVerticalCRSPropertyType();
			case GMLPackage.VERTICAL_CRS_TYPE: return createVerticalCRSType();
			case GMLPackage.VERTICAL_CS_PROPERTY_TYPE: return createVerticalCSPropertyType();
			case GMLPackage.VERTICAL_CS_TYPE: return createVerticalCSType();
			case GMLPackage.VERTICAL_DATUM_PROPERTY_TYPE: return createVerticalDatumPropertyType();
			case GMLPackage.VERTICAL_DATUM_TYPE: return createVerticalDatumType();
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
			case GMLPackage.AGGREGATION_TYPE:
				return createAggregationTypeFromString(eDataType, initialValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION:
				return createCompassPointEnumerationFromString(eDataType, initialValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE:
				return createCurveInterpolationTypeFromString(eDataType, initialValue);
			case GMLPackage.DIRECTION_TYPE:
				return createDirectionTypeFromString(eDataType, initialValue);
			case GMLPackage.INCREMENT_ORDER:
				return createIncrementOrderFromString(eDataType, initialValue);
			case GMLPackage.KNOT_TYPES_TYPE:
				return createKnotTypesTypeFromString(eDataType, initialValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0:
				return createNilReasonEnumerationMember0FromString(eDataType, initialValue);
			case GMLPackage.RELATIVE_POSITION_TYPE:
				return createRelativePositionTypeFromString(eDataType, initialValue);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION:
				return createSequenceRuleEnumerationFromString(eDataType, initialValue);
			case GMLPackage.SIGN_TYPE:
				return createSignTypeFromString(eDataType, initialValue);
			case GMLPackage.SUCCESSION_TYPE:
				return createSuccessionTypeFromString(eDataType, initialValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE:
				return createSurfaceInterpolationTypeFromString(eDataType, initialValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE:
				return createTimeIndeterminateValueTypeFromString(eDataType, initialValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0:
				return createTimeUnitTypeMember0FromString(eDataType, initialValue);
			case GMLPackage.AGGREGATION_TYPE_OBJECT:
				return createAggregationTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.ARC_MINUTES_TYPE:
				return createArcMinutesTypeFromString(eDataType, initialValue);
			case GMLPackage.ARC_SECONDS_TYPE:
				return createArcSecondsTypeFromString(eDataType, initialValue);
			case GMLPackage.AXIS_DIRECTION:
				return createAxisDirectionFromString(eDataType, initialValue);
			case GMLPackage.AXIS_DIRECTION_LIST:
				return createAxisDirectionListFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_LIST:
				return createBooleanListFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_OR_NIL_REASON:
				return createBooleanOrNilReasonFromString(eDataType, initialValue);
			case GMLPackage.BOOLEAN_OR_NIL_REASON_LIST:
				return createBooleanOrNilReasonListFromString(eDataType, initialValue);
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
			case GMLPackage.DIRECTION_TYPE_OBJECT:
				return createDirectionTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_LIST:
				return createDoubleListFromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_OR_NIL_REASON:
				return createDoubleOrNilReasonFromString(eDataType, initialValue);
			case GMLPackage.DOUBLE_OR_NIL_REASON_LIST:
				return createDoubleOrNilReasonListFromString(eDataType, initialValue);
			case GMLPackage.INCREMENT_ORDER_OBJECT:
				return createIncrementOrderObjectFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_LIST:
				return createIntegerListFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_OR_NIL_REASON:
				return createIntegerOrNilReasonFromString(eDataType, initialValue);
			case GMLPackage.INTEGER_OR_NIL_REASON_LIST:
				return createIntegerOrNilReasonListFromString(eDataType, initialValue);
			case GMLPackage.KNOT_TYPES_TYPE_OBJECT:
				return createKnotTypesTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.NAME_LIST:
				return createNameListFromString(eDataType, initialValue);
			case GMLPackage.NAME_OR_NIL_REASON:
				return createNameOrNilReasonFromString(eDataType, initialValue);
			case GMLPackage.NAME_OR_NIL_REASON_LIST:
				return createNameOrNilReasonListFromString(eDataType, initialValue);
			case GMLPackage.NC_NAME_LIST:
				return createNCNameListFromString(eDataType, initialValue);
			case GMLPackage.NIL_REASON_ENUMERATION:
				return createNilReasonEnumerationFromString(eDataType, initialValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0_OBJECT:
				return createNilReasonEnumerationMember0ObjectFromString(eDataType, initialValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER1:
				return createNilReasonEnumerationMember1FromString(eDataType, initialValue);
			case GMLPackage.NIL_REASON_TYPE:
				return createNilReasonTypeFromString(eDataType, initialValue);
			case GMLPackage.QNAME_LIST:
				return createQNameListFromString(eDataType, initialValue);
			case GMLPackage.RELATIVE_POSITION_TYPE_OBJECT:
				return createRelativePositionTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION_OBJECT:
				return createSequenceRuleEnumerationObjectFromString(eDataType, initialValue);
			case GMLPackage.SIGN_TYPE_OBJECT:
				return createSignTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.STRING_OR_NIL_REASON:
				return createStringOrNilReasonFromString(eDataType, initialValue);
			case GMLPackage.SUCCESSION_TYPE_OBJECT:
				return createSuccessionTypeObjectFromString(eDataType, initialValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE_OBJECT:
				return createSurfaceInterpolationTypeObjectFromString(eDataType, initialValue);
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
			case GMLPackage.UOM_IDENTIFIER:
				return createUomIdentifierFromString(eDataType, initialValue);
			case GMLPackage.UOM_SYMBOL:
				return createUomSymbolFromString(eDataType, initialValue);
			case GMLPackage.UOM_URI:
				return createUomURIFromString(eDataType, initialValue);
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
			case GMLPackage.AGGREGATION_TYPE:
				return convertAggregationTypeToString(eDataType, instanceValue);
			case GMLPackage.COMPASS_POINT_ENUMERATION:
				return convertCompassPointEnumerationToString(eDataType, instanceValue);
			case GMLPackage.CURVE_INTERPOLATION_TYPE:
				return convertCurveInterpolationTypeToString(eDataType, instanceValue);
			case GMLPackage.DIRECTION_TYPE:
				return convertDirectionTypeToString(eDataType, instanceValue);
			case GMLPackage.INCREMENT_ORDER:
				return convertIncrementOrderToString(eDataType, instanceValue);
			case GMLPackage.KNOT_TYPES_TYPE:
				return convertKnotTypesTypeToString(eDataType, instanceValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0:
				return convertNilReasonEnumerationMember0ToString(eDataType, instanceValue);
			case GMLPackage.RELATIVE_POSITION_TYPE:
				return convertRelativePositionTypeToString(eDataType, instanceValue);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION:
				return convertSequenceRuleEnumerationToString(eDataType, instanceValue);
			case GMLPackage.SIGN_TYPE:
				return convertSignTypeToString(eDataType, instanceValue);
			case GMLPackage.SUCCESSION_TYPE:
				return convertSuccessionTypeToString(eDataType, instanceValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE:
				return convertSurfaceInterpolationTypeToString(eDataType, instanceValue);
			case GMLPackage.TIME_INDETERMINATE_VALUE_TYPE:
				return convertTimeIndeterminateValueTypeToString(eDataType, instanceValue);
			case GMLPackage.TIME_UNIT_TYPE_MEMBER0:
				return convertTimeUnitTypeMember0ToString(eDataType, instanceValue);
			case GMLPackage.AGGREGATION_TYPE_OBJECT:
				return convertAggregationTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.ARC_MINUTES_TYPE:
				return convertArcMinutesTypeToString(eDataType, instanceValue);
			case GMLPackage.ARC_SECONDS_TYPE:
				return convertArcSecondsTypeToString(eDataType, instanceValue);
			case GMLPackage.AXIS_DIRECTION:
				return convertAxisDirectionToString(eDataType, instanceValue);
			case GMLPackage.AXIS_DIRECTION_LIST:
				return convertAxisDirectionListToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_LIST:
				return convertBooleanListToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_OR_NIL_REASON:
				return convertBooleanOrNilReasonToString(eDataType, instanceValue);
			case GMLPackage.BOOLEAN_OR_NIL_REASON_LIST:
				return convertBooleanOrNilReasonListToString(eDataType, instanceValue);
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
			case GMLPackage.DIRECTION_TYPE_OBJECT:
				return convertDirectionTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_LIST:
				return convertDoubleListToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_OR_NIL_REASON:
				return convertDoubleOrNilReasonToString(eDataType, instanceValue);
			case GMLPackage.DOUBLE_OR_NIL_REASON_LIST:
				return convertDoubleOrNilReasonListToString(eDataType, instanceValue);
			case GMLPackage.INCREMENT_ORDER_OBJECT:
				return convertIncrementOrderObjectToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_LIST:
				return convertIntegerListToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_OR_NIL_REASON:
				return convertIntegerOrNilReasonToString(eDataType, instanceValue);
			case GMLPackage.INTEGER_OR_NIL_REASON_LIST:
				return convertIntegerOrNilReasonListToString(eDataType, instanceValue);
			case GMLPackage.KNOT_TYPES_TYPE_OBJECT:
				return convertKnotTypesTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.NAME_LIST:
				return convertNameListToString(eDataType, instanceValue);
			case GMLPackage.NAME_OR_NIL_REASON:
				return convertNameOrNilReasonToString(eDataType, instanceValue);
			case GMLPackage.NAME_OR_NIL_REASON_LIST:
				return convertNameOrNilReasonListToString(eDataType, instanceValue);
			case GMLPackage.NC_NAME_LIST:
				return convertNCNameListToString(eDataType, instanceValue);
			case GMLPackage.NIL_REASON_ENUMERATION:
				return convertNilReasonEnumerationToString(eDataType, instanceValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER0_OBJECT:
				return convertNilReasonEnumerationMember0ObjectToString(eDataType, instanceValue);
			case GMLPackage.NIL_REASON_ENUMERATION_MEMBER1:
				return convertNilReasonEnumerationMember1ToString(eDataType, instanceValue);
			case GMLPackage.NIL_REASON_TYPE:
				return convertNilReasonTypeToString(eDataType, instanceValue);
			case GMLPackage.QNAME_LIST:
				return convertQNameListToString(eDataType, instanceValue);
			case GMLPackage.RELATIVE_POSITION_TYPE_OBJECT:
				return convertRelativePositionTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.SEQUENCE_RULE_ENUMERATION_OBJECT:
				return convertSequenceRuleEnumerationObjectToString(eDataType, instanceValue);
			case GMLPackage.SIGN_TYPE_OBJECT:
				return convertSignTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.STRING_OR_NIL_REASON:
				return convertStringOrNilReasonToString(eDataType, instanceValue);
			case GMLPackage.SUCCESSION_TYPE_OBJECT:
				return convertSuccessionTypeObjectToString(eDataType, instanceValue);
			case GMLPackage.SURFACE_INTERPOLATION_TYPE_OBJECT:
				return convertSurfaceInterpolationTypeObjectToString(eDataType, instanceValue);
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
			case GMLPackage.UOM_IDENTIFIER:
				return convertUomIdentifierToString(eDataType, instanceValue);
			case GMLPackage.UOM_SYMBOL:
				return convertUomSymbolToString(eDataType, instanceValue);
			case GMLPackage.UOM_URI:
				return convertUomURIToString(eDataType, instanceValue);
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
	public AbstractGeneralOperationParameterPropertyType createAbstractGeneralOperationParameterPropertyType() {
		AbstractGeneralOperationParameterPropertyTypeImpl abstractGeneralOperationParameterPropertyType = new AbstractGeneralOperationParameterPropertyTypeImpl();
		return abstractGeneralOperationParameterPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractGeneralParameterValuePropertyType createAbstractGeneralParameterValuePropertyType() {
		AbstractGeneralParameterValuePropertyTypeImpl abstractGeneralParameterValuePropertyType = new AbstractGeneralParameterValuePropertyTypeImpl();
		return abstractGeneralParameterValuePropertyType;
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
	public AffineCSPropertyType createAffineCSPropertyType() {
		AffineCSPropertyTypeImpl affineCSPropertyType = new AffineCSPropertyTypeImpl();
		return affineCSPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffineCSType createAffineCSType() {
		AffineCSTypeImpl affineCSType = new AffineCSTypeImpl();
		return affineCSType;
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
	public AssociationRoleType createAssociationRoleType() {
		AssociationRoleTypeImpl associationRoleType = new AssociationRoleTypeImpl();
		return associationRoleType;
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
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
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
	public CartesianCSPropertyType createCartesianCSPropertyType() {
		CartesianCSPropertyTypeImpl cartesianCSPropertyType = new CartesianCSPropertyTypeImpl();
		return cartesianCSPropertyType;
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
	public CategoryType createCategoryType() {
		CategoryTypeImpl categoryType = new CategoryTypeImpl();
		return categoryType;
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
	public CodeOrNilReasonListType createCodeOrNilReasonListType() {
		CodeOrNilReasonListTypeImpl codeOrNilReasonListType = new CodeOrNilReasonListTypeImpl();
		return codeOrNilReasonListType;
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
	public CodeWithAuthorityType createCodeWithAuthorityType() {
		CodeWithAuthorityTypeImpl codeWithAuthorityType = new CodeWithAuthorityTypeImpl();
		return codeWithAuthorityType;
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
	public CompoundCRSPropertyType createCompoundCRSPropertyType() {
		CompoundCRSPropertyTypeImpl compoundCRSPropertyType = new CompoundCRSPropertyTypeImpl();
		return compoundCRSPropertyType;
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
	public ConcatenatedOperationPropertyType createConcatenatedOperationPropertyType() {
		ConcatenatedOperationPropertyTypeImpl concatenatedOperationPropertyType = new ConcatenatedOperationPropertyTypeImpl();
		return concatenatedOperationPropertyType;
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
	public ConversionPropertyType createConversionPropertyType() {
		ConversionPropertyTypeImpl conversionPropertyType = new ConversionPropertyTypeImpl();
		return conversionPropertyType;
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
	public CoordinateOperationAccuracyType createCoordinateOperationAccuracyType() {
		CoordinateOperationAccuracyTypeImpl coordinateOperationAccuracyType = new CoordinateOperationAccuracyTypeImpl();
		return coordinateOperationAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinateOperationPropertyType createCoordinateOperationPropertyType() {
		CoordinateOperationPropertyTypeImpl coordinateOperationPropertyType = new CoordinateOperationPropertyTypeImpl();
		return coordinateOperationPropertyType;
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
	public CoordinateSystemAxisPropertyType createCoordinateSystemAxisPropertyType() {
		CoordinateSystemAxisPropertyTypeImpl coordinateSystemAxisPropertyType = new CoordinateSystemAxisPropertyTypeImpl();
		return coordinateSystemAxisPropertyType;
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
	public CoordinateSystemPropertyType createCoordinateSystemPropertyType() {
		CoordinateSystemPropertyTypeImpl coordinateSystemPropertyType = new CoordinateSystemPropertyTypeImpl();
		return coordinateSystemPropertyType;
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
	public CountType createCountType() {
		CountTypeImpl countType = new CountTypeImpl();
		return countType;
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
	public CRSPropertyType createCRSPropertyType() {
		CRSPropertyTypeImpl crsPropertyType = new CRSPropertyTypeImpl();
		return crsPropertyType;
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
	public CylindricalCSPropertyType createCylindricalCSPropertyType() {
		CylindricalCSPropertyTypeImpl cylindricalCSPropertyType = new CylindricalCSPropertyTypeImpl();
		return cylindricalCSPropertyType;
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
	public DatumPropertyType createDatumPropertyType() {
		DatumPropertyTypeImpl datumPropertyType = new DatumPropertyTypeImpl();
		return datumPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionBaseType createDefinitionBaseType() {
		DefinitionBaseTypeImpl definitionBaseType = new DefinitionBaseTypeImpl();
		return definitionBaseType;
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
	public DerivedCRSPropertyType createDerivedCRSPropertyType() {
		DerivedCRSPropertyTypeImpl derivedCRSPropertyType = new DerivedCRSPropertyTypeImpl();
		return derivedCRSPropertyType;
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
	public DirectionDescriptionType createDirectionDescriptionType() {
		DirectionDescriptionTypeImpl directionDescriptionType = new DirectionDescriptionTypeImpl();
		return directionDescriptionType;
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
	public DiscreteCoverageType createDiscreteCoverageType() {
		DiscreteCoverageTypeImpl discreteCoverageType = new DiscreteCoverageTypeImpl();
		return discreteCoverageType;
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
	public GMLDocumentRoot createGMLDocumentRoot() {
		GMLDocumentRootImpl gmlDocumentRoot = new GMLDocumentRootImpl();
		return gmlDocumentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainOfValidityType createDomainOfValidityType() {
		DomainOfValidityTypeImpl domainOfValidityType = new DomainOfValidityTypeImpl();
		return domainOfValidityType;
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
	public DynamicFeatureMemberType createDynamicFeatureMemberType() {
		DynamicFeatureMemberTypeImpl dynamicFeatureMemberType = new DynamicFeatureMemberTypeImpl();
		return dynamicFeatureMemberType;
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
	public EllipsoidalCSPropertyType createEllipsoidalCSPropertyType() {
		EllipsoidalCSPropertyTypeImpl ellipsoidalCSPropertyType = new EllipsoidalCSPropertyTypeImpl();
		return ellipsoidalCSPropertyType;
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
	public EllipsoidPropertyType createEllipsoidPropertyType() {
		EllipsoidPropertyTypeImpl ellipsoidPropertyType = new EllipsoidPropertyTypeImpl();
		return ellipsoidPropertyType;
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
	public EngineeringCRSPropertyType createEngineeringCRSPropertyType() {
		EngineeringCRSPropertyTypeImpl engineeringCRSPropertyType = new EngineeringCRSPropertyTypeImpl();
		return engineeringCRSPropertyType;
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
	public EngineeringDatumPropertyType createEngineeringDatumPropertyType() {
		EngineeringDatumPropertyTypeImpl engineeringDatumPropertyType = new EngineeringDatumPropertyTypeImpl();
		return engineeringDatumPropertyType;
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
	public FaceOrTopoSolidPropertyType createFaceOrTopoSolidPropertyType() {
		FaceOrTopoSolidPropertyTypeImpl faceOrTopoSolidPropertyType = new FaceOrTopoSolidPropertyTypeImpl();
		return faceOrTopoSolidPropertyType;
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
	public FormulaCitationType createFormulaCitationType() {
		FormulaCitationTypeImpl formulaCitationType = new FormulaCitationTypeImpl();
		return formulaCitationType;
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
	public GeneralConversionPropertyType createGeneralConversionPropertyType() {
		GeneralConversionPropertyTypeImpl generalConversionPropertyType = new GeneralConversionPropertyTypeImpl();
		return generalConversionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralTransformationPropertyType createGeneralTransformationPropertyType() {
		GeneralTransformationPropertyTypeImpl generalTransformationPropertyType = new GeneralTransformationPropertyTypeImpl();
		return generalTransformationPropertyType;
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
	public GeocentricCRSPropertyType createGeocentricCRSPropertyType() {
		GeocentricCRSPropertyTypeImpl geocentricCRSPropertyType = new GeocentricCRSPropertyTypeImpl();
		return geocentricCRSPropertyType;
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
	public GeodeticCRSPropertyType createGeodeticCRSPropertyType() {
		GeodeticCRSPropertyTypeImpl geodeticCRSPropertyType = new GeodeticCRSPropertyTypeImpl();
		return geodeticCRSPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticCRSType createGeodeticCRSType() {
		GeodeticCRSTypeImpl geodeticCRSType = new GeodeticCRSTypeImpl();
		return geodeticCRSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeodeticDatumPropertyType createGeodeticDatumPropertyType() {
		GeodeticDatumPropertyTypeImpl geodeticDatumPropertyType = new GeodeticDatumPropertyTypeImpl();
		return geodeticDatumPropertyType;
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
	public GeographicCRSPropertyType createGeographicCRSPropertyType() {
		GeographicCRSPropertyTypeImpl geographicCRSPropertyType = new GeographicCRSPropertyTypeImpl();
		return geographicCRSPropertyType;
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
	public ImageCRSPropertyType createImageCRSPropertyType() {
		ImageCRSPropertyTypeImpl imageCRSPropertyType = new ImageCRSPropertyTypeImpl();
		return imageCRSPropertyType;
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
	public ImageDatumPropertyType createImageDatumPropertyType() {
		ImageDatumPropertyTypeImpl imageDatumPropertyType = new ImageDatumPropertyTypeImpl();
		return imageDatumPropertyType;
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
	public InlinePropertyType createInlinePropertyType() {
		InlinePropertyTypeImpl inlinePropertyType = new InlinePropertyTypeImpl();
		return inlinePropertyType;
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
	public LinearCSPropertyType createLinearCSPropertyType() {
		LinearCSPropertyTypeImpl linearCSPropertyType = new LinearCSPropertyTypeImpl();
		return linearCSPropertyType;
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
	public MappingRuleType createMappingRuleType() {
		MappingRuleTypeImpl mappingRuleType = new MappingRuleTypeImpl();
		return mappingRuleType;
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
	public MeasureOrNilReasonListType createMeasureOrNilReasonListType() {
		MeasureOrNilReasonListTypeImpl measureOrNilReasonListType = new MeasureOrNilReasonListTypeImpl();
		return measureOrNilReasonListType;
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
	public NodeOrEdgePropertyType createNodeOrEdgePropertyType() {
		NodeOrEdgePropertyTypeImpl nodeOrEdgePropertyType = new NodeOrEdgePropertyTypeImpl();
		return nodeOrEdgePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NodePropertyType createNodePropertyType() {
		NodePropertyTypeImpl nodePropertyType = new NodePropertyTypeImpl();
		return nodePropertyType;
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
	public ObliqueCartesianCSPropertyType createObliqueCartesianCSPropertyType() {
		ObliqueCartesianCSPropertyTypeImpl obliqueCartesianCSPropertyType = new ObliqueCartesianCSPropertyTypeImpl();
		return obliqueCartesianCSPropertyType;
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
	public OperationMethodPropertyType createOperationMethodPropertyType() {
		OperationMethodPropertyTypeImpl operationMethodPropertyType = new OperationMethodPropertyTypeImpl();
		return operationMethodPropertyType;
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
	public OperationParameterGroupPropertyType createOperationParameterGroupPropertyType() {
		OperationParameterGroupPropertyTypeImpl operationParameterGroupPropertyType = new OperationParameterGroupPropertyTypeImpl();
		return operationParameterGroupPropertyType;
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
	public OperationParameterPropertyType createOperationParameterPropertyType() {
		OperationParameterPropertyTypeImpl operationParameterPropertyType = new OperationParameterPropertyTypeImpl();
		return operationParameterPropertyType;
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
	public OperationPropertyType createOperationPropertyType() {
		OperationPropertyTypeImpl operationPropertyType = new OperationPropertyTypeImpl();
		return operationPropertyType;
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
	public PassThroughOperationPropertyType createPassThroughOperationPropertyType() {
		PassThroughOperationPropertyTypeImpl passThroughOperationPropertyType = new PassThroughOperationPropertyTypeImpl();
		return passThroughOperationPropertyType;
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
	public PolarCSPropertyType createPolarCSPropertyType() {
		PolarCSPropertyTypeImpl polarCSPropertyType = new PolarCSPropertyTypeImpl();
		return polarCSPropertyType;
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
	public PrimeMeridianPropertyType createPrimeMeridianPropertyType() {
		PrimeMeridianPropertyTypeImpl primeMeridianPropertyType = new PrimeMeridianPropertyTypeImpl();
		return primeMeridianPropertyType;
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
	public ProcedurePropertyType createProcedurePropertyType() {
		ProcedurePropertyTypeImpl procedurePropertyType = new ProcedurePropertyTypeImpl();
		return procedurePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectedCRSPropertyType createProjectedCRSPropertyType() {
		ProjectedCRSPropertyTypeImpl projectedCRSPropertyType = new ProjectedCRSPropertyTypeImpl();
		return projectedCRSPropertyType;
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
	public QuantityType createQuantityType() {
		QuantityTypeImpl quantityType = new QuantityTypeImpl();
		return quantityType;
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
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
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
	public RowsType createRowsType() {
		RowsTypeImpl rowsType = new RowsTypeImpl();
		return rowsType;
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
	public SecondDefiningParameterType1 createSecondDefiningParameterType1() {
		SecondDefiningParameterType1Impl secondDefiningParameterType1 = new SecondDefiningParameterType1Impl();
		return secondDefiningParameterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType2 createSecondDefiningParameterType2() {
		SecondDefiningParameterType2Impl secondDefiningParameterType2 = new SecondDefiningParameterType2Impl();
		return secondDefiningParameterType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType3 createSecondDefiningParameterType3() {
		SecondDefiningParameterType3Impl secondDefiningParameterType3 = new SecondDefiningParameterType3Impl();
		return secondDefiningParameterType3;
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
	public ShellPropertyType createShellPropertyType() {
		ShellPropertyTypeImpl shellPropertyType = new ShellPropertyTypeImpl();
		return shellPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellType createShellType() {
		ShellTypeImpl shellType = new ShellTypeImpl();
		return shellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCRSPropertyType createSingleCRSPropertyType() {
		SingleCRSPropertyTypeImpl singleCRSPropertyType = new SingleCRSPropertyTypeImpl();
		return singleCRSPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleOperationPropertyType createSingleOperationPropertyType() {
		SingleOperationPropertyTypeImpl singleOperationPropertyType = new SingleOperationPropertyTypeImpl();
		return singleOperationPropertyType;
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
	public SphericalCSPropertyType createSphericalCSPropertyType() {
		SphericalCSPropertyTypeImpl sphericalCSPropertyType = new SphericalCSPropertyTypeImpl();
		return sphericalCSPropertyType;
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
	public TemporalCRSPropertyType createTemporalCRSPropertyType() {
		TemporalCRSPropertyTypeImpl temporalCRSPropertyType = new TemporalCRSPropertyTypeImpl();
		return temporalCRSPropertyType;
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
	public TemporalCSPropertyType createTemporalCSPropertyType() {
		TemporalCSPropertyTypeImpl temporalCSPropertyType = new TemporalCSPropertyTypeImpl();
		return temporalCSPropertyType;
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
	public TemporalDatumPropertyType createTemporalDatumPropertyType() {
		TemporalDatumPropertyTypeImpl temporalDatumPropertyType = new TemporalDatumPropertyTypeImpl();
		return temporalDatumPropertyType;
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
	public TimeCSPropertyType createTimeCSPropertyType() {
		TimeCSPropertyTypeImpl timeCSPropertyType = new TimeCSPropertyTypeImpl();
		return timeCSPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeCSType createTimeCSType() {
		TimeCSTypeImpl timeCSType = new TimeCSTypeImpl();
		return timeCSType;
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
	public TimeReferenceSystemType createTimeReferenceSystemType() {
		TimeReferenceSystemTypeImpl timeReferenceSystemType = new TimeReferenceSystemTypeImpl();
		return timeReferenceSystemType;
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
	public TopoComplexPropertyType createTopoComplexPropertyType() {
		TopoComplexPropertyTypeImpl topoComplexPropertyType = new TopoComplexPropertyTypeImpl();
		return topoComplexPropertyType;
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
	public TopoSolidPropertyType createTopoSolidPropertyType() {
		TopoSolidPropertyTypeImpl topoSolidPropertyType = new TopoSolidPropertyTypeImpl();
		return topoSolidPropertyType;
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
	public TransformationPropertyType createTransformationPropertyType() {
		TransformationPropertyTypeImpl transformationPropertyType = new TransformationPropertyTypeImpl();
		return transformationPropertyType;
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
	public UserDefinedCSPropertyType createUserDefinedCSPropertyType() {
		UserDefinedCSPropertyTypeImpl userDefinedCSPropertyType = new UserDefinedCSPropertyTypeImpl();
		return userDefinedCSPropertyType;
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
	public VerticalCRSPropertyType createVerticalCRSPropertyType() {
		VerticalCRSPropertyTypeImpl verticalCRSPropertyType = new VerticalCRSPropertyTypeImpl();
		return verticalCRSPropertyType;
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
	public VerticalCSPropertyType createVerticalCSPropertyType() {
		VerticalCSPropertyTypeImpl verticalCSPropertyType = new VerticalCSPropertyTypeImpl();
		return verticalCSPropertyType;
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
	public VerticalDatumPropertyType createVerticalDatumPropertyType() {
		VerticalDatumPropertyTypeImpl verticalDatumPropertyType = new VerticalDatumPropertyTypeImpl();
		return verticalDatumPropertyType;
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
	public VolumeType createVolumeType() {
		VolumeTypeImpl volumeType = new VolumeTypeImpl();
		return volumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationType createAggregationTypeFromString(EDataType eDataType, String initialValue) {
		AggregationType result = AggregationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeToString(EDataType eDataType, Object instanceValue) {
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
	public DirectionType createDirectionTypeFromString(EDataType eDataType, String initialValue) {
		DirectionType result = DirectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeToString(EDataType eDataType, Object instanceValue) {
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
	public NilReasonEnumerationMember0 createNilReasonEnumerationMember0FromString(EDataType eDataType, String initialValue) {
		NilReasonEnumerationMember0 result = NilReasonEnumerationMember0.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNilReasonEnumerationMember0ToString(EDataType eDataType, Object instanceValue) {
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
	public SequenceRuleEnumeration createSequenceRuleEnumerationFromString(EDataType eDataType, String initialValue) {
		SequenceRuleEnumeration result = SequenceRuleEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceRuleEnumerationToString(EDataType eDataType, Object instanceValue) {
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
	public AggregationType createAggregationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregationTypeFromString(GMLPackage.eINSTANCE.getAggregationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregationTypeToString(GMLPackage.eINSTANCE.getAggregationType(), instanceValue);
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
	public String createAxisDirectionFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisDirectionToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createAxisDirectionListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<String> result = new ArrayList<String>();
		for (String item : split(initialValue)) {
			result.add(createAxisDirectionFromString(GMLPackage.eINSTANCE.getAxisDirection(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAxisDirectionListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertAxisDirectionToString(GMLPackage.eINSTANCE.getAxisDirection(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
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
	public Object createBooleanOrNilReasonFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertBooleanOrNilReasonToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public List<Object> createBooleanOrNilReasonListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createBooleanOrNilReasonFromString(GMLPackage.eINSTANCE.getBooleanOrNilReason(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOrNilReasonListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertBooleanOrNilReasonToString(GMLPackage.eINSTANCE.getBooleanOrNilReason(), item));
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
		return createIntegerOrNilReasonListFromString(GMLPackage.eINSTANCE.getIntegerOrNilReasonList(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountExtentTypeToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerOrNilReasonListToString(GMLPackage.eINSTANCE.getIntegerOrNilReasonList(), instanceValue);
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
	public DirectionType createDirectionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirectionTypeFromString(GMLPackage.eINSTANCE.getDirectionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirectionTypeToString(GMLPackage.eINSTANCE.getDirectionType(), instanceValue);
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
	public Object createDoubleOrNilReasonFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertDoubleOrNilReasonToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public List<Object> createDoubleOrNilReasonListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createDoubleOrNilReasonFromString(GMLPackage.eINSTANCE.getDoubleOrNilReason(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleOrNilReasonListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertDoubleOrNilReasonToString(GMLPackage.eINSTANCE.getDoubleOrNilReason(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
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
	public Object createIntegerOrNilReasonFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertIntegerOrNilReasonToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public List<Object> createIntegerOrNilReasonListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createIntegerOrNilReasonFromString(GMLPackage.eINSTANCE.getIntegerOrNilReason(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOrNilReasonListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertIntegerOrNilReasonToString(GMLPackage.eINSTANCE.getIntegerOrNilReason(), item));
			result.append(' ');
		}
		return result.substring(0, result.length() - 1);
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
	public Object createNameOrNilReasonFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertNameOrNilReasonToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public List<Object> createNameOrNilReasonListFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		List<Object> result = new ArrayList<Object>();
		for (String item : split(initialValue)) {
			result.add(createNameOrNilReasonFromString(GMLPackage.eINSTANCE.getNameOrNilReason(), item));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameOrNilReasonListToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		List<?> list = (List<?>)instanceValue;
		if (list.isEmpty()) return "";
		StringBuffer result = new StringBuffer();
		for (Object item : list) {
			result.append(convertNameOrNilReasonToString(GMLPackage.eINSTANCE.getNameOrNilReason(), item));
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
	public Object createNilReasonEnumerationFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationMember0FromString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNilReasonEnumerationMember1FromString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember1(), initialValue);
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
	public String convertNilReasonEnumerationToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember0().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationMember0ToString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (GMLPackage.eINSTANCE.getNilReasonEnumerationMember1().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationMember1ToString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember1(), instanceValue);
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
	public NilReasonEnumerationMember0 createNilReasonEnumerationMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createNilReasonEnumerationMember0FromString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNilReasonEnumerationMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNilReasonEnumerationMember0ToString(GMLPackage.eINSTANCE.getNilReasonEnumerationMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNilReasonEnumerationMember1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNilReasonEnumerationMember1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createNilReasonTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertNilReasonTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public SequenceRuleEnumeration createSequenceRuleEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSequenceRuleEnumerationFromString(GMLPackage.eINSTANCE.getSequenceRuleEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSequenceRuleEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSequenceRuleEnumerationToString(GMLPackage.eINSTANCE.getSequenceRuleEnumeration(), instanceValue);
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
	public Object createStringOrNilReasonFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createNilReasonEnumerationFromString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), initialValue);
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
	public String convertStringOrNilReasonToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getNilReasonEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertNilReasonEnumerationToString(GMLPackage.eINSTANCE.getNilReasonEnumeration(), instanceValue);
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
	public String createUomIdentifierFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createUomSymbolFromString(GMLPackage.eINSTANCE.getUomSymbol(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUomURIFromString(GMLPackage.eINSTANCE.getUomURI(), initialValue);
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
	public String convertUomIdentifierToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (GMLPackage.eINSTANCE.getUomSymbol().isInstance(instanceValue)) {
			try {
				String value = convertUomSymbolToString(GMLPackage.eINSTANCE.getUomSymbol(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (GMLPackage.eINSTANCE.getUomURI().isInstance(instanceValue)) {
			try {
				String value = convertUomURIToString(GMLPackage.eINSTANCE.getUomURI(), instanceValue);
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
	public String createUomSymbolFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUomSymbolToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUomURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUomURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
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
