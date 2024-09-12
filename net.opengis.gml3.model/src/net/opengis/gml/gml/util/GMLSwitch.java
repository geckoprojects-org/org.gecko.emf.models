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
package net.opengis.gml.gml.util;

import net.opengis.gml.gml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.opengis.gml.gml.GMLPackage
 * @generated
 */
public class GMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMLSwitch() {
		if (modelPackage == null) {
			modelPackage = GMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMLPackage.ABSTRACT_CONTINUOUS_COVERAGE_TYPE: {
				AbstractContinuousCoverageType abstractContinuousCoverageType = (AbstractContinuousCoverageType)theEObject;
				T result = caseAbstractContinuousCoverageType(abstractContinuousCoverageType);
				if (result == null) result = caseAbstractCoverageType(abstractContinuousCoverageType);
				if (result == null) result = caseAbstractFeatureType(abstractContinuousCoverageType);
				if (result == null) result = caseAbstractGMLType(abstractContinuousCoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_COORDINATE_OPERATION_TYPE: {
				AbstractCoordinateOperationType abstractCoordinateOperationType = (AbstractCoordinateOperationType)theEObject;
				T result = caseAbstractCoordinateOperationType(abstractCoordinateOperationType);
				if (result == null) result = caseIdentifiedObjectType(abstractCoordinateOperationType);
				if (result == null) result = caseDefinitionType(abstractCoordinateOperationType);
				if (result == null) result = caseDefinitionBaseType(abstractCoordinateOperationType);
				if (result == null) result = caseAbstractGMLType(abstractCoordinateOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_COORDINATE_SYSTEM_TYPE: {
				AbstractCoordinateSystemType abstractCoordinateSystemType = (AbstractCoordinateSystemType)theEObject;
				T result = caseAbstractCoordinateSystemType(abstractCoordinateSystemType);
				if (result == null) result = caseIdentifiedObjectType(abstractCoordinateSystemType);
				if (result == null) result = caseDefinitionType(abstractCoordinateSystemType);
				if (result == null) result = caseDefinitionBaseType(abstractCoordinateSystemType);
				if (result == null) result = caseAbstractGMLType(abstractCoordinateSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_COVERAGE_TYPE: {
				AbstractCoverageType abstractCoverageType = (AbstractCoverageType)theEObject;
				T result = caseAbstractCoverageType(abstractCoverageType);
				if (result == null) result = caseAbstractFeatureType(abstractCoverageType);
				if (result == null) result = caseAbstractGMLType(abstractCoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_CRS_TYPE: {
				AbstractCRSType abstractCRSType = (AbstractCRSType)theEObject;
				T result = caseAbstractCRSType(abstractCRSType);
				if (result == null) result = caseIdentifiedObjectType(abstractCRSType);
				if (result == null) result = caseDefinitionType(abstractCRSType);
				if (result == null) result = caseDefinitionBaseType(abstractCRSType);
				if (result == null) result = caseAbstractGMLType(abstractCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_CURVE_SEGMENT_TYPE: {
				AbstractCurveSegmentType abstractCurveSegmentType = (AbstractCurveSegmentType)theEObject;
				T result = caseAbstractCurveSegmentType(abstractCurveSegmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_CURVE_TYPE: {
				AbstractCurveType abstractCurveType = (AbstractCurveType)theEObject;
				T result = caseAbstractCurveType(abstractCurveType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(abstractCurveType);
				if (result == null) result = caseAbstractGeometryType(abstractCurveType);
				if (result == null) result = caseAbstractGMLType(abstractCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_DATUM_TYPE: {
				AbstractDatumType abstractDatumType = (AbstractDatumType)theEObject;
				T result = caseAbstractDatumType(abstractDatumType);
				if (result == null) result = caseIdentifiedObjectType(abstractDatumType);
				if (result == null) result = caseDefinitionType(abstractDatumType);
				if (result == null) result = caseDefinitionBaseType(abstractDatumType);
				if (result == null) result = caseAbstractGMLType(abstractDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE: {
				AbstractFeatureCollectionType abstractFeatureCollectionType = (AbstractFeatureCollectionType)theEObject;
				T result = caseAbstractFeatureCollectionType(abstractFeatureCollectionType);
				if (result == null) result = caseAbstractFeatureType(abstractFeatureCollectionType);
				if (result == null) result = caseAbstractGMLType(abstractFeatureCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_FEATURE_MEMBER_TYPE: {
				AbstractFeatureMemberType abstractFeatureMemberType = (AbstractFeatureMemberType)theEObject;
				T result = caseAbstractFeatureMemberType(abstractFeatureMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_FEATURE_TYPE: {
				AbstractFeatureType abstractFeatureType = (AbstractFeatureType)theEObject;
				T result = caseAbstractFeatureType(abstractFeatureType);
				if (result == null) result = caseAbstractGMLType(abstractFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_CONVERSION_TYPE: {
				AbstractGeneralConversionType abstractGeneralConversionType = (AbstractGeneralConversionType)theEObject;
				T result = caseAbstractGeneralConversionType(abstractGeneralConversionType);
				if (result == null) result = caseAbstractCoordinateOperationType(abstractGeneralConversionType);
				if (result == null) result = caseIdentifiedObjectType(abstractGeneralConversionType);
				if (result == null) result = caseDefinitionType(abstractGeneralConversionType);
				if (result == null) result = caseDefinitionBaseType(abstractGeneralConversionType);
				if (result == null) result = caseAbstractGMLType(abstractGeneralConversionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_DERIVED_CRS_TYPE: {
				AbstractGeneralDerivedCRSType abstractGeneralDerivedCRSType = (AbstractGeneralDerivedCRSType)theEObject;
				T result = caseAbstractGeneralDerivedCRSType(abstractGeneralDerivedCRSType);
				if (result == null) result = caseAbstractCRSType(abstractGeneralDerivedCRSType);
				if (result == null) result = caseIdentifiedObjectType(abstractGeneralDerivedCRSType);
				if (result == null) result = caseDefinitionType(abstractGeneralDerivedCRSType);
				if (result == null) result = caseDefinitionBaseType(abstractGeneralDerivedCRSType);
				if (result == null) result = caseAbstractGMLType(abstractGeneralDerivedCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_PROPERTY_TYPE: {
				AbstractGeneralOperationParameterPropertyType abstractGeneralOperationParameterPropertyType = (AbstractGeneralOperationParameterPropertyType)theEObject;
				T result = caseAbstractGeneralOperationParameterPropertyType(abstractGeneralOperationParameterPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_OPERATION_PARAMETER_TYPE: {
				AbstractGeneralOperationParameterType abstractGeneralOperationParameterType = (AbstractGeneralOperationParameterType)theEObject;
				T result = caseAbstractGeneralOperationParameterType(abstractGeneralOperationParameterType);
				if (result == null) result = caseIdentifiedObjectType(abstractGeneralOperationParameterType);
				if (result == null) result = caseDefinitionType(abstractGeneralOperationParameterType);
				if (result == null) result = caseDefinitionBaseType(abstractGeneralOperationParameterType);
				if (result == null) result = caseAbstractGMLType(abstractGeneralOperationParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_PROPERTY_TYPE: {
				AbstractGeneralParameterValuePropertyType abstractGeneralParameterValuePropertyType = (AbstractGeneralParameterValuePropertyType)theEObject;
				T result = caseAbstractGeneralParameterValuePropertyType(abstractGeneralParameterValuePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_PARAMETER_VALUE_TYPE: {
				AbstractGeneralParameterValueType abstractGeneralParameterValueType = (AbstractGeneralParameterValueType)theEObject;
				T result = caseAbstractGeneralParameterValueType(abstractGeneralParameterValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GENERAL_TRANSFORMATION_TYPE: {
				AbstractGeneralTransformationType abstractGeneralTransformationType = (AbstractGeneralTransformationType)theEObject;
				T result = caseAbstractGeneralTransformationType(abstractGeneralTransformationType);
				if (result == null) result = caseAbstractCoordinateOperationType(abstractGeneralTransformationType);
				if (result == null) result = caseIdentifiedObjectType(abstractGeneralTransformationType);
				if (result == null) result = caseDefinitionType(abstractGeneralTransformationType);
				if (result == null) result = caseDefinitionBaseType(abstractGeneralTransformationType);
				if (result == null) result = caseAbstractGMLType(abstractGeneralTransformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GEOMETRIC_AGGREGATE_TYPE: {
				AbstractGeometricAggregateType abstractGeometricAggregateType = (AbstractGeometricAggregateType)theEObject;
				T result = caseAbstractGeometricAggregateType(abstractGeometricAggregateType);
				if (result == null) result = caseAbstractGeometryType(abstractGeometricAggregateType);
				if (result == null) result = caseAbstractGMLType(abstractGeometricAggregateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GEOMETRIC_PRIMITIVE_TYPE: {
				AbstractGeometricPrimitiveType abstractGeometricPrimitiveType = (AbstractGeometricPrimitiveType)theEObject;
				T result = caseAbstractGeometricPrimitiveType(abstractGeometricPrimitiveType);
				if (result == null) result = caseAbstractGeometryType(abstractGeometricPrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractGeometricPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GEOMETRY_TYPE: {
				AbstractGeometryType abstractGeometryType = (AbstractGeometryType)theEObject;
				T result = caseAbstractGeometryType(abstractGeometryType);
				if (result == null) result = caseAbstractGMLType(abstractGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GML_TYPE: {
				AbstractGMLType abstractGMLType = (AbstractGMLType)theEObject;
				T result = caseAbstractGMLType(abstractGMLType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_GRIDDED_SURFACE_TYPE: {
				AbstractGriddedSurfaceType abstractGriddedSurfaceType = (AbstractGriddedSurfaceType)theEObject;
				T result = caseAbstractGriddedSurfaceType(abstractGriddedSurfaceType);
				if (result == null) result = caseAbstractParametricCurveSurfaceType(abstractGriddedSurfaceType);
				if (result == null) result = caseAbstractSurfacePatchType(abstractGriddedSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_MEMBER_TYPE: {
				AbstractMemberType abstractMemberType = (AbstractMemberType)theEObject;
				T result = caseAbstractMemberType(abstractMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_METADATA_PROPERTY_TYPE: {
				AbstractMetadataPropertyType abstractMetadataPropertyType = (AbstractMetadataPropertyType)theEObject;
				T result = caseAbstractMetadataPropertyType(abstractMetadataPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_META_DATA_TYPE: {
				AbstractMetaDataType abstractMetaDataType = (AbstractMetaDataType)theEObject;
				T result = caseAbstractMetaDataType(abstractMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_PARAMETRIC_CURVE_SURFACE_TYPE: {
				AbstractParametricCurveSurfaceType abstractParametricCurveSurfaceType = (AbstractParametricCurveSurfaceType)theEObject;
				T result = caseAbstractParametricCurveSurfaceType(abstractParametricCurveSurfaceType);
				if (result == null) result = caseAbstractSurfacePatchType(abstractParametricCurveSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_RING_PROPERTY_TYPE: {
				AbstractRingPropertyType abstractRingPropertyType = (AbstractRingPropertyType)theEObject;
				T result = caseAbstractRingPropertyType(abstractRingPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_RING_TYPE: {
				AbstractRingType abstractRingType = (AbstractRingType)theEObject;
				T result = caseAbstractRingType(abstractRingType);
				if (result == null) result = caseAbstractCurveType(abstractRingType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(abstractRingType);
				if (result == null) result = caseAbstractGeometryType(abstractRingType);
				if (result == null) result = caseAbstractGMLType(abstractRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_SOLID_TYPE: {
				AbstractSolidType abstractSolidType = (AbstractSolidType)theEObject;
				T result = caseAbstractSolidType(abstractSolidType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(abstractSolidType);
				if (result == null) result = caseAbstractGeometryType(abstractSolidType);
				if (result == null) result = caseAbstractGMLType(abstractSolidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_SURFACE_PATCH_TYPE: {
				AbstractSurfacePatchType abstractSurfacePatchType = (AbstractSurfacePatchType)theEObject;
				T result = caseAbstractSurfacePatchType(abstractSurfacePatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_SURFACE_TYPE: {
				AbstractSurfaceType abstractSurfaceType = (AbstractSurfaceType)theEObject;
				T result = caseAbstractSurfaceType(abstractSurfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(abstractSurfaceType);
				if (result == null) result = caseAbstractGeometryType(abstractSurfaceType);
				if (result == null) result = caseAbstractGMLType(abstractSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_COMPLEX_TYPE: {
				AbstractTimeComplexType abstractTimeComplexType = (AbstractTimeComplexType)theEObject;
				T result = caseAbstractTimeComplexType(abstractTimeComplexType);
				if (result == null) result = caseAbstractTimeObjectType(abstractTimeComplexType);
				if (result == null) result = caseAbstractGMLType(abstractTimeComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_GEOMETRIC_PRIMITIVE_TYPE: {
				AbstractTimeGeometricPrimitiveType abstractTimeGeometricPrimitiveType = (AbstractTimeGeometricPrimitiveType)theEObject;
				T result = caseAbstractTimeGeometricPrimitiveType(abstractTimeGeometricPrimitiveType);
				if (result == null) result = caseAbstractTimePrimitiveType(abstractTimeGeometricPrimitiveType);
				if (result == null) result = caseAbstractTimeObjectType(abstractTimeGeometricPrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractTimeGeometricPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_OBJECT_TYPE: {
				AbstractTimeObjectType abstractTimeObjectType = (AbstractTimeObjectType)theEObject;
				T result = caseAbstractTimeObjectType(abstractTimeObjectType);
				if (result == null) result = caseAbstractGMLType(abstractTimeObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_PRIMITIVE_TYPE: {
				AbstractTimePrimitiveType abstractTimePrimitiveType = (AbstractTimePrimitiveType)theEObject;
				T result = caseAbstractTimePrimitiveType(abstractTimePrimitiveType);
				if (result == null) result = caseAbstractTimeObjectType(abstractTimePrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractTimePrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_SLICE_TYPE: {
				AbstractTimeSliceType abstractTimeSliceType = (AbstractTimeSliceType)theEObject;
				T result = caseAbstractTimeSliceType(abstractTimeSliceType);
				if (result == null) result = caseAbstractGMLType(abstractTimeSliceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TIME_TOPOLOGY_PRIMITIVE_TYPE: {
				AbstractTimeTopologyPrimitiveType abstractTimeTopologyPrimitiveType = (AbstractTimeTopologyPrimitiveType)theEObject;
				T result = caseAbstractTimeTopologyPrimitiveType(abstractTimeTopologyPrimitiveType);
				if (result == null) result = caseAbstractTimePrimitiveType(abstractTimeTopologyPrimitiveType);
				if (result == null) result = caseAbstractTimeObjectType(abstractTimeTopologyPrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractTimeTopologyPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TOPOLOGY_TYPE: {
				AbstractTopologyType abstractTopologyType = (AbstractTopologyType)theEObject;
				T result = caseAbstractTopologyType(abstractTopologyType);
				if (result == null) result = caseAbstractGMLType(abstractTopologyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ABSTRACT_TOPO_PRIMITIVE_TYPE: {
				AbstractTopoPrimitiveType abstractTopoPrimitiveType = (AbstractTopoPrimitiveType)theEObject;
				T result = caseAbstractTopoPrimitiveType(abstractTopoPrimitiveType);
				if (result == null) result = caseAbstractTopologyType(abstractTopoPrimitiveType);
				if (result == null) result = caseAbstractGMLType(abstractTopoPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.AFFINE_CS_PROPERTY_TYPE: {
				AffineCSPropertyType affineCSPropertyType = (AffineCSPropertyType)theEObject;
				T result = caseAffineCSPropertyType(affineCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.AFFINE_CS_TYPE: {
				AffineCSType affineCSType = (AffineCSType)theEObject;
				T result = caseAffineCSType(affineCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(affineCSType);
				if (result == null) result = caseIdentifiedObjectType(affineCSType);
				if (result == null) result = caseDefinitionType(affineCSType);
				if (result == null) result = caseDefinitionBaseType(affineCSType);
				if (result == null) result = caseAbstractGMLType(affineCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.AFFINE_PLACEMENT_TYPE: {
				AffinePlacementType affinePlacementType = (AffinePlacementType)theEObject;
				T result = caseAffinePlacementType(affinePlacementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ANGLE_CHOICE_TYPE: {
				AngleChoiceType angleChoiceType = (AngleChoiceType)theEObject;
				T result = caseAngleChoiceType(angleChoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ANGLE_TYPE: {
				AngleType angleType = (AngleType)theEObject;
				T result = caseAngleType(angleType);
				if (result == null) result = caseMeasureType(angleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARC_BY_BULGE_TYPE: {
				ArcByBulgeType arcByBulgeType = (ArcByBulgeType)theEObject;
				T result = caseArcByBulgeType(arcByBulgeType);
				if (result == null) result = caseArcStringByBulgeType(arcByBulgeType);
				if (result == null) result = caseAbstractCurveSegmentType(arcByBulgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARC_BY_CENTER_POINT_TYPE: {
				ArcByCenterPointType arcByCenterPointType = (ArcByCenterPointType)theEObject;
				T result = caseArcByCenterPointType(arcByCenterPointType);
				if (result == null) result = caseAbstractCurveSegmentType(arcByCenterPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARC_STRING_BY_BULGE_TYPE: {
				ArcStringByBulgeType arcStringByBulgeType = (ArcStringByBulgeType)theEObject;
				T result = caseArcStringByBulgeType(arcStringByBulgeType);
				if (result == null) result = caseAbstractCurveSegmentType(arcStringByBulgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARC_STRING_TYPE: {
				ArcStringType arcStringType = (ArcStringType)theEObject;
				T result = caseArcStringType(arcStringType);
				if (result == null) result = caseAbstractCurveSegmentType(arcStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARC_TYPE: {
				ArcType arcType = (ArcType)theEObject;
				T result = caseArcType(arcType);
				if (result == null) result = caseArcStringType(arcType);
				if (result == null) result = caseAbstractCurveSegmentType(arcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = caseMeasureType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARRAY_ASSOCIATION_TYPE: {
				ArrayAssociationType arrayAssociationType = (ArrayAssociationType)theEObject;
				T result = caseArrayAssociationType(arrayAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ARRAY_TYPE: {
				ArrayType arrayType = (ArrayType)theEObject;
				T result = caseArrayType(arrayType);
				if (result == null) result = caseAbstractGMLType(arrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ASSOCIATION_ROLE_TYPE: {
				AssociationRoleType associationRoleType = (AssociationRoleType)theEObject;
				T result = caseAssociationRoleType(associationRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BAG_TYPE: {
				BagType bagType = (BagType)theEObject;
				T result = caseBagType(bagType);
				if (result == null) result = caseAbstractGMLType(bagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BASE_UNIT_TYPE: {
				BaseUnitType baseUnitType = (BaseUnitType)theEObject;
				T result = caseBaseUnitType(baseUnitType);
				if (result == null) result = caseUnitDefinitionType(baseUnitType);
				if (result == null) result = caseDefinitionType(baseUnitType);
				if (result == null) result = caseDefinitionBaseType(baseUnitType);
				if (result == null) result = caseAbstractGMLType(baseUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BEZIER_TYPE: {
				BezierType bezierType = (BezierType)theEObject;
				T result = caseBezierType(bezierType);
				if (result == null) result = caseBSplineType(bezierType);
				if (result == null) result = caseAbstractCurveSegmentType(bezierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BOOLEAN_PROPERTY_TYPE: {
				BooleanPropertyType booleanPropertyType = (BooleanPropertyType)theEObject;
				T result = caseBooleanPropertyType(booleanPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BOOLEAN_TYPE: {
				BooleanType booleanType = (BooleanType)theEObject;
				T result = caseBooleanType(booleanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BOUNDED_FEATURE_TYPE: {
				BoundedFeatureType boundedFeatureType = (BoundedFeatureType)theEObject;
				T result = caseBoundedFeatureType(boundedFeatureType);
				if (result == null) result = caseAbstractFeatureType(boundedFeatureType);
				if (result == null) result = caseAbstractGMLType(boundedFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BOUNDING_SHAPE_TYPE: {
				BoundingShapeType boundingShapeType = (BoundingShapeType)theEObject;
				T result = caseBoundingShapeType(boundingShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.BSPLINE_TYPE: {
				BSplineType bSplineType = (BSplineType)theEObject;
				T result = caseBSplineType(bSplineType);
				if (result == null) result = caseAbstractCurveSegmentType(bSplineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CARTESIAN_CS_PROPERTY_TYPE: {
				CartesianCSPropertyType cartesianCSPropertyType = (CartesianCSPropertyType)theEObject;
				T result = caseCartesianCSPropertyType(cartesianCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CARTESIAN_CS_TYPE: {
				CartesianCSType cartesianCSType = (CartesianCSType)theEObject;
				T result = caseCartesianCSType(cartesianCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(cartesianCSType);
				if (result == null) result = caseIdentifiedObjectType(cartesianCSType);
				if (result == null) result = caseDefinitionType(cartesianCSType);
				if (result == null) result = caseDefinitionBaseType(cartesianCSType);
				if (result == null) result = caseAbstractGMLType(cartesianCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CATEGORY_EXTENT_TYPE: {
				CategoryExtentType categoryExtentType = (CategoryExtentType)theEObject;
				T result = caseCategoryExtentType(categoryExtentType);
				if (result == null) result = caseCodeOrNilReasonListType(categoryExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CATEGORY_PROPERTY_TYPE: {
				CategoryPropertyType categoryPropertyType = (CategoryPropertyType)theEObject;
				T result = caseCategoryPropertyType(categoryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CATEGORY_TYPE: {
				CategoryType categoryType = (CategoryType)theEObject;
				T result = caseCategoryType(categoryType);
				if (result == null) result = caseCodeType(categoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CIRCLE_BY_CENTER_POINT_TYPE: {
				CircleByCenterPointType circleByCenterPointType = (CircleByCenterPointType)theEObject;
				T result = caseCircleByCenterPointType(circleByCenterPointType);
				if (result == null) result = caseArcByCenterPointType(circleByCenterPointType);
				if (result == null) result = caseAbstractCurveSegmentType(circleByCenterPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CIRCLE_TYPE: {
				CircleType circleType = (CircleType)theEObject;
				T result = caseCircleType(circleType);
				if (result == null) result = caseArcType(circleType);
				if (result == null) result = caseArcStringType(circleType);
				if (result == null) result = caseAbstractCurveSegmentType(circleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CLOTHOID_TYPE: {
				ClothoidType clothoidType = (ClothoidType)theEObject;
				T result = caseClothoidType(clothoidType);
				if (result == null) result = caseAbstractCurveSegmentType(clothoidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CODE_LIST_TYPE: {
				CodeListType codeListType = (CodeListType)theEObject;
				T result = caseCodeListType(codeListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CODE_OR_NIL_REASON_LIST_TYPE: {
				CodeOrNilReasonListType codeOrNilReasonListType = (CodeOrNilReasonListType)theEObject;
				T result = caseCodeOrNilReasonListType(codeOrNilReasonListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CODE_WITH_AUTHORITY_TYPE: {
				CodeWithAuthorityType codeWithAuthorityType = (CodeWithAuthorityType)theEObject;
				T result = caseCodeWithAuthorityType(codeWithAuthorityType);
				if (result == null) result = caseCodeType(codeWithAuthorityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOSITE_CURVE_TYPE: {
				CompositeCurveType compositeCurveType = (CompositeCurveType)theEObject;
				T result = caseCompositeCurveType(compositeCurveType);
				if (result == null) result = caseAbstractCurveType(compositeCurveType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(compositeCurveType);
				if (result == null) result = caseAbstractGeometryType(compositeCurveType);
				if (result == null) result = caseAbstractGMLType(compositeCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOSITE_SOLID_TYPE: {
				CompositeSolidType compositeSolidType = (CompositeSolidType)theEObject;
				T result = caseCompositeSolidType(compositeSolidType);
				if (result == null) result = caseAbstractSolidType(compositeSolidType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(compositeSolidType);
				if (result == null) result = caseAbstractGeometryType(compositeSolidType);
				if (result == null) result = caseAbstractGMLType(compositeSolidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOSITE_SURFACE_TYPE: {
				CompositeSurfaceType compositeSurfaceType = (CompositeSurfaceType)theEObject;
				T result = caseCompositeSurfaceType(compositeSurfaceType);
				if (result == null) result = caseAbstractSurfaceType(compositeSurfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(compositeSurfaceType);
				if (result == null) result = caseAbstractGeometryType(compositeSurfaceType);
				if (result == null) result = caseAbstractGMLType(compositeSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOSITE_VALUE_TYPE: {
				CompositeValueType compositeValueType = (CompositeValueType)theEObject;
				T result = caseCompositeValueType(compositeValueType);
				if (result == null) result = caseAbstractGMLType(compositeValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOUND_CRS_PROPERTY_TYPE: {
				CompoundCRSPropertyType compoundCRSPropertyType = (CompoundCRSPropertyType)theEObject;
				T result = caseCompoundCRSPropertyType(compoundCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COMPOUND_CRS_TYPE: {
				CompoundCRSType compoundCRSType = (CompoundCRSType)theEObject;
				T result = caseCompoundCRSType(compoundCRSType);
				if (result == null) result = caseAbstractCRSType(compoundCRSType);
				if (result == null) result = caseIdentifiedObjectType(compoundCRSType);
				if (result == null) result = caseDefinitionType(compoundCRSType);
				if (result == null) result = caseDefinitionBaseType(compoundCRSType);
				if (result == null) result = caseAbstractGMLType(compoundCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONCATENATED_OPERATION_PROPERTY_TYPE: {
				ConcatenatedOperationPropertyType concatenatedOperationPropertyType = (ConcatenatedOperationPropertyType)theEObject;
				T result = caseConcatenatedOperationPropertyType(concatenatedOperationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONCATENATED_OPERATION_TYPE: {
				ConcatenatedOperationType concatenatedOperationType = (ConcatenatedOperationType)theEObject;
				T result = caseConcatenatedOperationType(concatenatedOperationType);
				if (result == null) result = caseAbstractCoordinateOperationType(concatenatedOperationType);
				if (result == null) result = caseIdentifiedObjectType(concatenatedOperationType);
				if (result == null) result = caseDefinitionType(concatenatedOperationType);
				if (result == null) result = caseDefinitionBaseType(concatenatedOperationType);
				if (result == null) result = caseAbstractGMLType(concatenatedOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONE_TYPE: {
				ConeType coneType = (ConeType)theEObject;
				T result = caseConeType(coneType);
				if (result == null) result = caseAbstractGriddedSurfaceType(coneType);
				if (result == null) result = caseAbstractParametricCurveSurfaceType(coneType);
				if (result == null) result = caseAbstractSurfacePatchType(coneType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONTROL_POINT_TYPE: {
				ControlPointType controlPointType = (ControlPointType)theEObject;
				T result = caseControlPointType(controlPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONVENTIONAL_UNIT_TYPE: {
				ConventionalUnitType conventionalUnitType = (ConventionalUnitType)theEObject;
				T result = caseConventionalUnitType(conventionalUnitType);
				if (result == null) result = caseUnitDefinitionType(conventionalUnitType);
				if (result == null) result = caseDefinitionType(conventionalUnitType);
				if (result == null) result = caseDefinitionBaseType(conventionalUnitType);
				if (result == null) result = caseAbstractGMLType(conventionalUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONVERSION_PROPERTY_TYPE: {
				ConversionPropertyType conversionPropertyType = (ConversionPropertyType)theEObject;
				T result = caseConversionPropertyType(conversionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONVERSION_TO_PREFERRED_UNIT_TYPE: {
				ConversionToPreferredUnitType conversionToPreferredUnitType = (ConversionToPreferredUnitType)theEObject;
				T result = caseConversionToPreferredUnitType(conversionToPreferredUnitType);
				if (result == null) result = caseUnitOfMeasureType(conversionToPreferredUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CONVERSION_TYPE: {
				ConversionType conversionType = (ConversionType)theEObject;
				T result = caseConversionType(conversionType);
				if (result == null) result = caseAbstractGeneralConversionType(conversionType);
				if (result == null) result = caseAbstractCoordinateOperationType(conversionType);
				if (result == null) result = caseIdentifiedObjectType(conversionType);
				if (result == null) result = caseDefinitionType(conversionType);
				if (result == null) result = caseDefinitionBaseType(conversionType);
				if (result == null) result = caseAbstractGMLType(conversionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATE_OPERATION_ACCURACY_TYPE: {
				CoordinateOperationAccuracyType coordinateOperationAccuracyType = (CoordinateOperationAccuracyType)theEObject;
				T result = caseCoordinateOperationAccuracyType(coordinateOperationAccuracyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATE_OPERATION_PROPERTY_TYPE: {
				CoordinateOperationPropertyType coordinateOperationPropertyType = (CoordinateOperationPropertyType)theEObject;
				T result = caseCoordinateOperationPropertyType(coordinateOperationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATES_TYPE: {
				CoordinatesType coordinatesType = (CoordinatesType)theEObject;
				T result = caseCoordinatesType(coordinatesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATE_SYSTEM_AXIS_PROPERTY_TYPE: {
				CoordinateSystemAxisPropertyType coordinateSystemAxisPropertyType = (CoordinateSystemAxisPropertyType)theEObject;
				T result = caseCoordinateSystemAxisPropertyType(coordinateSystemAxisPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATE_SYSTEM_AXIS_TYPE: {
				CoordinateSystemAxisType coordinateSystemAxisType = (CoordinateSystemAxisType)theEObject;
				T result = caseCoordinateSystemAxisType(coordinateSystemAxisType);
				if (result == null) result = caseIdentifiedObjectType(coordinateSystemAxisType);
				if (result == null) result = caseDefinitionType(coordinateSystemAxisType);
				if (result == null) result = caseDefinitionBaseType(coordinateSystemAxisType);
				if (result == null) result = caseAbstractGMLType(coordinateSystemAxisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COORDINATE_SYSTEM_PROPERTY_TYPE: {
				CoordinateSystemPropertyType coordinateSystemPropertyType = (CoordinateSystemPropertyType)theEObject;
				T result = caseCoordinateSystemPropertyType(coordinateSystemPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COUNT_PROPERTY_TYPE: {
				CountPropertyType countPropertyType = (CountPropertyType)theEObject;
				T result = caseCountPropertyType(countPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COUNT_TYPE: {
				CountType countType = (CountType)theEObject;
				T result = caseCountType(countType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.COVERAGE_FUNCTION_TYPE: {
				CoverageFunctionType coverageFunctionType = (CoverageFunctionType)theEObject;
				T result = caseCoverageFunctionType(coverageFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CRS_PROPERTY_TYPE: {
				CRSPropertyType crsPropertyType = (CRSPropertyType)theEObject;
				T result = caseCRSPropertyType(crsPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CUBIC_SPLINE_TYPE: {
				CubicSplineType cubicSplineType = (CubicSplineType)theEObject;
				T result = caseCubicSplineType(cubicSplineType);
				if (result == null) result = caseAbstractCurveSegmentType(cubicSplineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE: {
				CurveArrayPropertyType curveArrayPropertyType = (CurveArrayPropertyType)theEObject;
				T result = caseCurveArrayPropertyType(curveArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CURVE_PROPERTY_TYPE: {
				CurvePropertyType curvePropertyType = (CurvePropertyType)theEObject;
				T result = caseCurvePropertyType(curvePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CURVE_SEGMENT_ARRAY_PROPERTY_TYPE: {
				CurveSegmentArrayPropertyType curveSegmentArrayPropertyType = (CurveSegmentArrayPropertyType)theEObject;
				T result = caseCurveSegmentArrayPropertyType(curveSegmentArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CURVE_TYPE: {
				CurveType curveType = (CurveType)theEObject;
				T result = caseCurveType(curveType);
				if (result == null) result = caseAbstractCurveType(curveType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(curveType);
				if (result == null) result = caseAbstractGeometryType(curveType);
				if (result == null) result = caseAbstractGMLType(curveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CYLINDER_TYPE: {
				CylinderType cylinderType = (CylinderType)theEObject;
				T result = caseCylinderType(cylinderType);
				if (result == null) result = caseAbstractGriddedSurfaceType(cylinderType);
				if (result == null) result = caseAbstractParametricCurveSurfaceType(cylinderType);
				if (result == null) result = caseAbstractSurfacePatchType(cylinderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CYLINDRICAL_CS_PROPERTY_TYPE: {
				CylindricalCSPropertyType cylindricalCSPropertyType = (CylindricalCSPropertyType)theEObject;
				T result = caseCylindricalCSPropertyType(cylindricalCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.CYLINDRICAL_CS_TYPE: {
				CylindricalCSType cylindricalCSType = (CylindricalCSType)theEObject;
				T result = caseCylindricalCSType(cylindricalCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(cylindricalCSType);
				if (result == null) result = caseIdentifiedObjectType(cylindricalCSType);
				if (result == null) result = caseDefinitionType(cylindricalCSType);
				if (result == null) result = caseDefinitionBaseType(cylindricalCSType);
				if (result == null) result = caseAbstractGMLType(cylindricalCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DATA_BLOCK_TYPE: {
				DataBlockType dataBlockType = (DataBlockType)theEObject;
				T result = caseDataBlockType(dataBlockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DATUM_PROPERTY_TYPE: {
				DatumPropertyType datumPropertyType = (DatumPropertyType)theEObject;
				T result = caseDatumPropertyType(datumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DEFINITION_BASE_TYPE: {
				DefinitionBaseType definitionBaseType = (DefinitionBaseType)theEObject;
				T result = caseDefinitionBaseType(definitionBaseType);
				if (result == null) result = caseAbstractGMLType(definitionBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DEFINITION_PROXY_TYPE: {
				DefinitionProxyType definitionProxyType = (DefinitionProxyType)theEObject;
				T result = caseDefinitionProxyType(definitionProxyType);
				if (result == null) result = caseDefinitionType(definitionProxyType);
				if (result == null) result = caseDefinitionBaseType(definitionProxyType);
				if (result == null) result = caseAbstractGMLType(definitionProxyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DEFINITION_TYPE: {
				DefinitionType definitionType = (DefinitionType)theEObject;
				T result = caseDefinitionType(definitionType);
				if (result == null) result = caseDefinitionBaseType(definitionType);
				if (result == null) result = caseAbstractGMLType(definitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DEGREES_TYPE: {
				DegreesType degreesType = (DegreesType)theEObject;
				T result = caseDegreesType(degreesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DERIVATION_UNIT_TERM_TYPE: {
				DerivationUnitTermType derivationUnitTermType = (DerivationUnitTermType)theEObject;
				T result = caseDerivationUnitTermType(derivationUnitTermType);
				if (result == null) result = caseUnitOfMeasureType(derivationUnitTermType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DERIVED_CRS_PROPERTY_TYPE: {
				DerivedCRSPropertyType derivedCRSPropertyType = (DerivedCRSPropertyType)theEObject;
				T result = caseDerivedCRSPropertyType(derivedCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DERIVED_CRS_TYPE: {
				DerivedCRSType derivedCRSType = (DerivedCRSType)theEObject;
				T result = caseDerivedCRSType(derivedCRSType);
				if (result == null) result = caseAbstractGeneralDerivedCRSType(derivedCRSType);
				if (result == null) result = caseAbstractCRSType(derivedCRSType);
				if (result == null) result = caseIdentifiedObjectType(derivedCRSType);
				if (result == null) result = caseDefinitionType(derivedCRSType);
				if (result == null) result = caseDefinitionBaseType(derivedCRSType);
				if (result == null) result = caseAbstractGMLType(derivedCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DERIVED_UNIT_TYPE: {
				DerivedUnitType derivedUnitType = (DerivedUnitType)theEObject;
				T result = caseDerivedUnitType(derivedUnitType);
				if (result == null) result = caseUnitDefinitionType(derivedUnitType);
				if (result == null) result = caseDefinitionType(derivedUnitType);
				if (result == null) result = caseDefinitionBaseType(derivedUnitType);
				if (result == null) result = caseAbstractGMLType(derivedUnitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DICTIONARY_ENTRY_TYPE: {
				DictionaryEntryType dictionaryEntryType = (DictionaryEntryType)theEObject;
				T result = caseDictionaryEntryType(dictionaryEntryType);
				if (result == null) result = caseAbstractMemberType(dictionaryEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DICTIONARY_TYPE: {
				DictionaryType dictionaryType = (DictionaryType)theEObject;
				T result = caseDictionaryType(dictionaryType);
				if (result == null) result = caseDefinitionType(dictionaryType);
				if (result == null) result = caseDefinitionBaseType(dictionaryType);
				if (result == null) result = caseAbstractGMLType(dictionaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_EDGE_PROPERTY_TYPE: {
				DirectedEdgePropertyType directedEdgePropertyType = (DirectedEdgePropertyType)theEObject;
				T result = caseDirectedEdgePropertyType(directedEdgePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_FACE_PROPERTY_TYPE: {
				DirectedFacePropertyType directedFacePropertyType = (DirectedFacePropertyType)theEObject;
				T result = caseDirectedFacePropertyType(directedFacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_NODE_PROPERTY_TYPE: {
				DirectedNodePropertyType directedNodePropertyType = (DirectedNodePropertyType)theEObject;
				T result = caseDirectedNodePropertyType(directedNodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_OBSERVATION_AT_DISTANCE_TYPE: {
				DirectedObservationAtDistanceType directedObservationAtDistanceType = (DirectedObservationAtDistanceType)theEObject;
				T result = caseDirectedObservationAtDistanceType(directedObservationAtDistanceType);
				if (result == null) result = caseDirectedObservationType(directedObservationAtDistanceType);
				if (result == null) result = caseObservationType(directedObservationAtDistanceType);
				if (result == null) result = caseAbstractFeatureType(directedObservationAtDistanceType);
				if (result == null) result = caseAbstractGMLType(directedObservationAtDistanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_OBSERVATION_TYPE: {
				DirectedObservationType directedObservationType = (DirectedObservationType)theEObject;
				T result = caseDirectedObservationType(directedObservationType);
				if (result == null) result = caseObservationType(directedObservationType);
				if (result == null) result = caseAbstractFeatureType(directedObservationType);
				if (result == null) result = caseAbstractGMLType(directedObservationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTED_TOPO_SOLID_PROPERTY_TYPE: {
				DirectedTopoSolidPropertyType directedTopoSolidPropertyType = (DirectedTopoSolidPropertyType)theEObject;
				T result = caseDirectedTopoSolidPropertyType(directedTopoSolidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTION_DESCRIPTION_TYPE: {
				DirectionDescriptionType directionDescriptionType = (DirectionDescriptionType)theEObject;
				T result = caseDirectionDescriptionType(directionDescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTION_PROPERTY_TYPE: {
				DirectionPropertyType directionPropertyType = (DirectionPropertyType)theEObject;
				T result = caseDirectionPropertyType(directionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECTION_VECTOR_TYPE: {
				DirectionVectorType directionVectorType = (DirectionVectorType)theEObject;
				T result = caseDirectionVectorType(directionVectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECT_POSITION_LIST_TYPE: {
				DirectPositionListType directPositionListType = (DirectPositionListType)theEObject;
				T result = caseDirectPositionListType(directPositionListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DIRECT_POSITION_TYPE: {
				DirectPositionType directPositionType = (DirectPositionType)theEObject;
				T result = caseDirectPositionType(directPositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DISCRETE_COVERAGE_TYPE: {
				DiscreteCoverageType discreteCoverageType = (DiscreteCoverageType)theEObject;
				T result = caseDiscreteCoverageType(discreteCoverageType);
				if (result == null) result = caseAbstractCoverageType(discreteCoverageType);
				if (result == null) result = caseAbstractFeatureType(discreteCoverageType);
				if (result == null) result = caseAbstractGMLType(discreteCoverageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DMS_ANGLE_TYPE: {
				DMSAngleType dmsAngleType = (DMSAngleType)theEObject;
				T result = caseDMSAngleType(dmsAngleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GML_DOCUMENT_ROOT: {
				GMLDocumentRoot gmlDocumentRoot = (GMLDocumentRoot)theEObject;
				T result = caseGMLDocumentRoot(gmlDocumentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DOMAIN_OF_VALIDITY_TYPE: {
				DomainOfValidityType domainOfValidityType = (DomainOfValidityType)theEObject;
				T result = caseDomainOfValidityType(domainOfValidityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DOMAIN_SET_TYPE: {
				DomainSetType domainSetType = (DomainSetType)theEObject;
				T result = caseDomainSetType(domainSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DYNAMIC_FEATURE_COLLECTION_TYPE: {
				DynamicFeatureCollectionType dynamicFeatureCollectionType = (DynamicFeatureCollectionType)theEObject;
				T result = caseDynamicFeatureCollectionType(dynamicFeatureCollectionType);
				if (result == null) result = caseDynamicFeatureType(dynamicFeatureCollectionType);
				if (result == null) result = caseAbstractFeatureType(dynamicFeatureCollectionType);
				if (result == null) result = caseAbstractGMLType(dynamicFeatureCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DYNAMIC_FEATURE_MEMBER_TYPE: {
				DynamicFeatureMemberType dynamicFeatureMemberType = (DynamicFeatureMemberType)theEObject;
				T result = caseDynamicFeatureMemberType(dynamicFeatureMemberType);
				if (result == null) result = caseAbstractFeatureMemberType(dynamicFeatureMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.DYNAMIC_FEATURE_TYPE: {
				DynamicFeatureType dynamicFeatureType = (DynamicFeatureType)theEObject;
				T result = caseDynamicFeatureType(dynamicFeatureType);
				if (result == null) result = caseAbstractFeatureType(dynamicFeatureType);
				if (result == null) result = caseAbstractGMLType(dynamicFeatureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.EDGE_TYPE: {
				EdgeType edgeType = (EdgeType)theEObject;
				T result = caseEdgeType(edgeType);
				if (result == null) result = caseAbstractTopoPrimitiveType(edgeType);
				if (result == null) result = caseAbstractTopologyType(edgeType);
				if (result == null) result = caseAbstractGMLType(edgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ELLIPSOIDAL_CS_PROPERTY_TYPE: {
				EllipsoidalCSPropertyType ellipsoidalCSPropertyType = (EllipsoidalCSPropertyType)theEObject;
				T result = caseEllipsoidalCSPropertyType(ellipsoidalCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ELLIPSOIDAL_CS_TYPE: {
				EllipsoidalCSType ellipsoidalCSType = (EllipsoidalCSType)theEObject;
				T result = caseEllipsoidalCSType(ellipsoidalCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(ellipsoidalCSType);
				if (result == null) result = caseIdentifiedObjectType(ellipsoidalCSType);
				if (result == null) result = caseDefinitionType(ellipsoidalCSType);
				if (result == null) result = caseDefinitionBaseType(ellipsoidalCSType);
				if (result == null) result = caseAbstractGMLType(ellipsoidalCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ELLIPSOID_PROPERTY_TYPE: {
				EllipsoidPropertyType ellipsoidPropertyType = (EllipsoidPropertyType)theEObject;
				T result = caseEllipsoidPropertyType(ellipsoidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ELLIPSOID_TYPE: {
				EllipsoidType ellipsoidType = (EllipsoidType)theEObject;
				T result = caseEllipsoidType(ellipsoidType);
				if (result == null) result = caseIdentifiedObjectType(ellipsoidType);
				if (result == null) result = caseDefinitionType(ellipsoidType);
				if (result == null) result = caseDefinitionBaseType(ellipsoidType);
				if (result == null) result = caseAbstractGMLType(ellipsoidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENGINEERING_CRS_PROPERTY_TYPE: {
				EngineeringCRSPropertyType engineeringCRSPropertyType = (EngineeringCRSPropertyType)theEObject;
				T result = caseEngineeringCRSPropertyType(engineeringCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENGINEERING_CRS_TYPE: {
				EngineeringCRSType engineeringCRSType = (EngineeringCRSType)theEObject;
				T result = caseEngineeringCRSType(engineeringCRSType);
				if (result == null) result = caseAbstractCRSType(engineeringCRSType);
				if (result == null) result = caseIdentifiedObjectType(engineeringCRSType);
				if (result == null) result = caseDefinitionType(engineeringCRSType);
				if (result == null) result = caseDefinitionBaseType(engineeringCRSType);
				if (result == null) result = caseAbstractGMLType(engineeringCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENGINEERING_DATUM_PROPERTY_TYPE: {
				EngineeringDatumPropertyType engineeringDatumPropertyType = (EngineeringDatumPropertyType)theEObject;
				T result = caseEngineeringDatumPropertyType(engineeringDatumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENGINEERING_DATUM_TYPE: {
				EngineeringDatumType engineeringDatumType = (EngineeringDatumType)theEObject;
				T result = caseEngineeringDatumType(engineeringDatumType);
				if (result == null) result = caseAbstractDatumType(engineeringDatumType);
				if (result == null) result = caseIdentifiedObjectType(engineeringDatumType);
				if (result == null) result = caseDefinitionType(engineeringDatumType);
				if (result == null) result = caseDefinitionBaseType(engineeringDatumType);
				if (result == null) result = caseAbstractGMLType(engineeringDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENVELOPE_TYPE: {
				EnvelopeType envelopeType = (EnvelopeType)theEObject;
				T result = caseEnvelopeType(envelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ENVELOPE_WITH_TIME_PERIOD_TYPE: {
				EnvelopeWithTimePeriodType envelopeWithTimePeriodType = (EnvelopeWithTimePeriodType)theEObject;
				T result = caseEnvelopeWithTimePeriodType(envelopeWithTimePeriodType);
				if (result == null) result = caseEnvelopeType(envelopeWithTimePeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FACE_OR_TOPO_SOLID_PROPERTY_TYPE: {
				FaceOrTopoSolidPropertyType faceOrTopoSolidPropertyType = (FaceOrTopoSolidPropertyType)theEObject;
				T result = caseFaceOrTopoSolidPropertyType(faceOrTopoSolidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FACE_TYPE: {
				FaceType faceType = (FaceType)theEObject;
				T result = caseFaceType(faceType);
				if (result == null) result = caseAbstractTopoPrimitiveType(faceType);
				if (result == null) result = caseAbstractTopologyType(faceType);
				if (result == null) result = caseAbstractGMLType(faceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FEATURE_ARRAY_PROPERTY_TYPE: {
				FeatureArrayPropertyType featureArrayPropertyType = (FeatureArrayPropertyType)theEObject;
				T result = caseFeatureArrayPropertyType(featureArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FEATURE_COLLECTION_TYPE: {
				FeatureCollectionType featureCollectionType = (FeatureCollectionType)theEObject;
				T result = caseFeatureCollectionType(featureCollectionType);
				if (result == null) result = caseAbstractFeatureCollectionType(featureCollectionType);
				if (result == null) result = caseAbstractFeatureType(featureCollectionType);
				if (result == null) result = caseAbstractGMLType(featureCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FEATURE_PROPERTY_TYPE: {
				FeaturePropertyType featurePropertyType = (FeaturePropertyType)theEObject;
				T result = caseFeaturePropertyType(featurePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FILE_TYPE: {
				FileType fileType = (FileType)theEObject;
				T result = caseFileType(fileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FORMULA_CITATION_TYPE: {
				FormulaCitationType formulaCitationType = (FormulaCitationType)theEObject;
				T result = caseFormulaCitationType(formulaCitationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.FORMULA_TYPE: {
				FormulaType formulaType = (FormulaType)theEObject;
				T result = caseFormulaType(formulaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GENERAL_CONVERSION_PROPERTY_TYPE: {
				GeneralConversionPropertyType generalConversionPropertyType = (GeneralConversionPropertyType)theEObject;
				T result = caseGeneralConversionPropertyType(generalConversionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GENERAL_TRANSFORMATION_PROPERTY_TYPE: {
				GeneralTransformationPropertyType generalTransformationPropertyType = (GeneralTransformationPropertyType)theEObject;
				T result = caseGeneralTransformationPropertyType(generalTransformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GENERIC_META_DATA_TYPE: {
				GenericMetaDataType genericMetaDataType = (GenericMetaDataType)theEObject;
				T result = caseGenericMetaDataType(genericMetaDataType);
				if (result == null) result = caseAbstractMetaDataType(genericMetaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOCENTRIC_CRS_PROPERTY_TYPE: {
				GeocentricCRSPropertyType geocentricCRSPropertyType = (GeocentricCRSPropertyType)theEObject;
				T result = caseGeocentricCRSPropertyType(geocentricCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOCENTRIC_CRS_TYPE: {
				GeocentricCRSType geocentricCRSType = (GeocentricCRSType)theEObject;
				T result = caseGeocentricCRSType(geocentricCRSType);
				if (result == null) result = caseAbstractCRSType(geocentricCRSType);
				if (result == null) result = caseIdentifiedObjectType(geocentricCRSType);
				if (result == null) result = caseDefinitionType(geocentricCRSType);
				if (result == null) result = caseDefinitionBaseType(geocentricCRSType);
				if (result == null) result = caseAbstractGMLType(geocentricCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODESIC_STRING_TYPE: {
				GeodesicStringType geodesicStringType = (GeodesicStringType)theEObject;
				T result = caseGeodesicStringType(geodesicStringType);
				if (result == null) result = caseAbstractCurveSegmentType(geodesicStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODESIC_TYPE: {
				GeodesicType geodesicType = (GeodesicType)theEObject;
				T result = caseGeodesicType(geodesicType);
				if (result == null) result = caseGeodesicStringType(geodesicType);
				if (result == null) result = caseAbstractCurveSegmentType(geodesicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODETIC_CRS_PROPERTY_TYPE: {
				GeodeticCRSPropertyType geodeticCRSPropertyType = (GeodeticCRSPropertyType)theEObject;
				T result = caseGeodeticCRSPropertyType(geodeticCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODETIC_CRS_TYPE: {
				GeodeticCRSType geodeticCRSType = (GeodeticCRSType)theEObject;
				T result = caseGeodeticCRSType(geodeticCRSType);
				if (result == null) result = caseAbstractCRSType(geodeticCRSType);
				if (result == null) result = caseIdentifiedObjectType(geodeticCRSType);
				if (result == null) result = caseDefinitionType(geodeticCRSType);
				if (result == null) result = caseDefinitionBaseType(geodeticCRSType);
				if (result == null) result = caseAbstractGMLType(geodeticCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODETIC_DATUM_PROPERTY_TYPE: {
				GeodeticDatumPropertyType geodeticDatumPropertyType = (GeodeticDatumPropertyType)theEObject;
				T result = caseGeodeticDatumPropertyType(geodeticDatumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEODETIC_DATUM_TYPE: {
				GeodeticDatumType geodeticDatumType = (GeodeticDatumType)theEObject;
				T result = caseGeodeticDatumType(geodeticDatumType);
				if (result == null) result = caseAbstractDatumType(geodeticDatumType);
				if (result == null) result = caseIdentifiedObjectType(geodeticDatumType);
				if (result == null) result = caseDefinitionType(geodeticDatumType);
				if (result == null) result = caseDefinitionBaseType(geodeticDatumType);
				if (result == null) result = caseAbstractGMLType(geodeticDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOGRAPHIC_CRS_PROPERTY_TYPE: {
				GeographicCRSPropertyType geographicCRSPropertyType = (GeographicCRSPropertyType)theEObject;
				T result = caseGeographicCRSPropertyType(geographicCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOGRAPHIC_CRS_TYPE: {
				GeographicCRSType geographicCRSType = (GeographicCRSType)theEObject;
				T result = caseGeographicCRSType(geographicCRSType);
				if (result == null) result = caseAbstractCRSType(geographicCRSType);
				if (result == null) result = caseIdentifiedObjectType(geographicCRSType);
				if (result == null) result = caseDefinitionType(geographicCRSType);
				if (result == null) result = caseDefinitionBaseType(geographicCRSType);
				if (result == null) result = caseAbstractGMLType(geographicCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOMETRIC_COMPLEX_PROPERTY_TYPE: {
				GeometricComplexPropertyType geometricComplexPropertyType = (GeometricComplexPropertyType)theEObject;
				T result = caseGeometricComplexPropertyType(geometricComplexPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOMETRIC_COMPLEX_TYPE: {
				GeometricComplexType geometricComplexType = (GeometricComplexType)theEObject;
				T result = caseGeometricComplexType(geometricComplexType);
				if (result == null) result = caseAbstractGeometryType(geometricComplexType);
				if (result == null) result = caseAbstractGMLType(geometricComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOMETRIC_PRIMITIVE_PROPERTY_TYPE: {
				GeometricPrimitivePropertyType geometricPrimitivePropertyType = (GeometricPrimitivePropertyType)theEObject;
				T result = caseGeometricPrimitivePropertyType(geometricPrimitivePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOMETRY_ARRAY_PROPERTY_TYPE: {
				GeometryArrayPropertyType geometryArrayPropertyType = (GeometryArrayPropertyType)theEObject;
				T result = caseGeometryArrayPropertyType(geometryArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GEOMETRY_PROPERTY_TYPE: {
				GeometryPropertyType geometryPropertyType = (GeometryPropertyType)theEObject;
				T result = caseGeometryPropertyType(geometryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GRID_ENVELOPE_TYPE: {
				GridEnvelopeType gridEnvelopeType = (GridEnvelopeType)theEObject;
				T result = caseGridEnvelopeType(gridEnvelopeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GRID_FUNCTION_TYPE: {
				GridFunctionType gridFunctionType = (GridFunctionType)theEObject;
				T result = caseGridFunctionType(gridFunctionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GRID_LENGTH_TYPE: {
				GridLengthType gridLengthType = (GridLengthType)theEObject;
				T result = caseGridLengthType(gridLengthType);
				if (result == null) result = caseMeasureType(gridLengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GRID_LIMITS_TYPE: {
				GridLimitsType gridLimitsType = (GridLimitsType)theEObject;
				T result = caseGridLimitsType(gridLimitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.GRID_TYPE: {
				GridType gridType = (GridType)theEObject;
				T result = caseGridType(gridType);
				if (result == null) result = caseAbstractGeometryType(gridType);
				if (result == null) result = caseAbstractGMLType(gridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.HISTORY_PROPERTY_TYPE: {
				HistoryPropertyType historyPropertyType = (HistoryPropertyType)theEObject;
				T result = caseHistoryPropertyType(historyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.IDENTIFIED_OBJECT_TYPE: {
				IdentifiedObjectType identifiedObjectType = (IdentifiedObjectType)theEObject;
				T result = caseIdentifiedObjectType(identifiedObjectType);
				if (result == null) result = caseDefinitionType(identifiedObjectType);
				if (result == null) result = caseDefinitionBaseType(identifiedObjectType);
				if (result == null) result = caseAbstractGMLType(identifiedObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.IMAGE_CRS_PROPERTY_TYPE: {
				ImageCRSPropertyType imageCRSPropertyType = (ImageCRSPropertyType)theEObject;
				T result = caseImageCRSPropertyType(imageCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.IMAGE_CRS_TYPE: {
				ImageCRSType imageCRSType = (ImageCRSType)theEObject;
				T result = caseImageCRSType(imageCRSType);
				if (result == null) result = caseAbstractCRSType(imageCRSType);
				if (result == null) result = caseIdentifiedObjectType(imageCRSType);
				if (result == null) result = caseDefinitionType(imageCRSType);
				if (result == null) result = caseDefinitionBaseType(imageCRSType);
				if (result == null) result = caseAbstractGMLType(imageCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.IMAGE_DATUM_PROPERTY_TYPE: {
				ImageDatumPropertyType imageDatumPropertyType = (ImageDatumPropertyType)theEObject;
				T result = caseImageDatumPropertyType(imageDatumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.IMAGE_DATUM_TYPE: {
				ImageDatumType imageDatumType = (ImageDatumType)theEObject;
				T result = caseImageDatumType(imageDatumType);
				if (result == null) result = caseAbstractDatumType(imageDatumType);
				if (result == null) result = caseIdentifiedObjectType(imageDatumType);
				if (result == null) result = caseDefinitionType(imageDatumType);
				if (result == null) result = caseDefinitionBaseType(imageDatumType);
				if (result == null) result = caseAbstractGMLType(imageDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.INDIRECT_ENTRY_TYPE: {
				IndirectEntryType indirectEntryType = (IndirectEntryType)theEObject;
				T result = caseIndirectEntryType(indirectEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.INLINE_PROPERTY_TYPE: {
				InlinePropertyType inlinePropertyType = (InlinePropertyType)theEObject;
				T result = caseInlinePropertyType(inlinePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.KNOT_PROPERTY_TYPE: {
				KnotPropertyType knotPropertyType = (KnotPropertyType)theEObject;
				T result = caseKnotPropertyType(knotPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.KNOT_TYPE: {
				KnotType knotType = (KnotType)theEObject;
				T result = caseKnotType(knotType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LENGTH_TYPE: {
				LengthType lengthType = (LengthType)theEObject;
				T result = caseLengthType(lengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINEAR_CS_PROPERTY_TYPE: {
				LinearCSPropertyType linearCSPropertyType = (LinearCSPropertyType)theEObject;
				T result = caseLinearCSPropertyType(linearCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINEAR_CS_TYPE: {
				LinearCSType linearCSType = (LinearCSType)theEObject;
				T result = caseLinearCSType(linearCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(linearCSType);
				if (result == null) result = caseIdentifiedObjectType(linearCSType);
				if (result == null) result = caseDefinitionType(linearCSType);
				if (result == null) result = caseDefinitionBaseType(linearCSType);
				if (result == null) result = caseAbstractGMLType(linearCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINEAR_RING_PROPERTY_TYPE: {
				LinearRingPropertyType linearRingPropertyType = (LinearRingPropertyType)theEObject;
				T result = caseLinearRingPropertyType(linearRingPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINEAR_RING_TYPE: {
				LinearRingType linearRingType = (LinearRingType)theEObject;
				T result = caseLinearRingType(linearRingType);
				if (result == null) result = caseAbstractRingType(linearRingType);
				if (result == null) result = caseAbstractCurveType(linearRingType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(linearRingType);
				if (result == null) result = caseAbstractGeometryType(linearRingType);
				if (result == null) result = caseAbstractGMLType(linearRingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINE_STRING_SEGMENT_ARRAY_PROPERTY_TYPE: {
				LineStringSegmentArrayPropertyType lineStringSegmentArrayPropertyType = (LineStringSegmentArrayPropertyType)theEObject;
				T result = caseLineStringSegmentArrayPropertyType(lineStringSegmentArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINE_STRING_SEGMENT_TYPE: {
				LineStringSegmentType lineStringSegmentType = (LineStringSegmentType)theEObject;
				T result = caseLineStringSegmentType(lineStringSegmentType);
				if (result == null) result = caseAbstractCurveSegmentType(lineStringSegmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LINE_STRING_TYPE: {
				LineStringType lineStringType = (LineStringType)theEObject;
				T result = caseLineStringType(lineStringType);
				if (result == null) result = caseAbstractCurveType(lineStringType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(lineStringType);
				if (result == null) result = caseAbstractGeometryType(lineStringType);
				if (result == null) result = caseAbstractGMLType(lineStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.LOCATION_PROPERTY_TYPE: {
				LocationPropertyType locationPropertyType = (LocationPropertyType)theEObject;
				T result = caseLocationPropertyType(locationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MAPPING_RULE_TYPE: {
				MappingRuleType mappingRuleType = (MappingRuleType)theEObject;
				T result = caseMappingRuleType(mappingRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MEASURE_LIST_TYPE: {
				MeasureListType measureListType = (MeasureListType)theEObject;
				T result = caseMeasureListType(measureListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MEASURE_OR_NIL_REASON_LIST_TYPE: {
				MeasureOrNilReasonListType measureOrNilReasonListType = (MeasureOrNilReasonListType)theEObject;
				T result = caseMeasureOrNilReasonListType(measureOrNilReasonListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MEASURE_TYPE: {
				MeasureType measureType = (MeasureType)theEObject;
				T result = caseMeasureType(measureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.META_DATA_PROPERTY_TYPE: {
				MetaDataPropertyType metaDataPropertyType = (MetaDataPropertyType)theEObject;
				T result = caseMetaDataPropertyType(metaDataPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MOVING_OBJECT_STATUS_TYPE: {
				MovingObjectStatusType movingObjectStatusType = (MovingObjectStatusType)theEObject;
				T result = caseMovingObjectStatusType(movingObjectStatusType);
				if (result == null) result = caseAbstractTimeSliceType(movingObjectStatusType);
				if (result == null) result = caseAbstractGMLType(movingObjectStatusType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_CURVE_PROPERTY_TYPE: {
				MultiCurvePropertyType multiCurvePropertyType = (MultiCurvePropertyType)theEObject;
				T result = caseMultiCurvePropertyType(multiCurvePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_CURVE_TYPE: {
				MultiCurveType multiCurveType = (MultiCurveType)theEObject;
				T result = caseMultiCurveType(multiCurveType);
				if (result == null) result = caseAbstractGeometricAggregateType(multiCurveType);
				if (result == null) result = caseAbstractGeometryType(multiCurveType);
				if (result == null) result = caseAbstractGMLType(multiCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_GEOMETRY_PROPERTY_TYPE: {
				MultiGeometryPropertyType multiGeometryPropertyType = (MultiGeometryPropertyType)theEObject;
				T result = caseMultiGeometryPropertyType(multiGeometryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_GEOMETRY_TYPE: {
				MultiGeometryType multiGeometryType = (MultiGeometryType)theEObject;
				T result = caseMultiGeometryType(multiGeometryType);
				if (result == null) result = caseAbstractGeometricAggregateType(multiGeometryType);
				if (result == null) result = caseAbstractGeometryType(multiGeometryType);
				if (result == null) result = caseAbstractGMLType(multiGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_POINT_PROPERTY_TYPE: {
				MultiPointPropertyType multiPointPropertyType = (MultiPointPropertyType)theEObject;
				T result = caseMultiPointPropertyType(multiPointPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_POINT_TYPE: {
				MultiPointType multiPointType = (MultiPointType)theEObject;
				T result = caseMultiPointType(multiPointType);
				if (result == null) result = caseAbstractGeometricAggregateType(multiPointType);
				if (result == null) result = caseAbstractGeometryType(multiPointType);
				if (result == null) result = caseAbstractGMLType(multiPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_SOLID_PROPERTY_TYPE: {
				MultiSolidPropertyType multiSolidPropertyType = (MultiSolidPropertyType)theEObject;
				T result = caseMultiSolidPropertyType(multiSolidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_SOLID_TYPE: {
				MultiSolidType multiSolidType = (MultiSolidType)theEObject;
				T result = caseMultiSolidType(multiSolidType);
				if (result == null) result = caseAbstractGeometricAggregateType(multiSolidType);
				if (result == null) result = caseAbstractGeometryType(multiSolidType);
				if (result == null) result = caseAbstractGMLType(multiSolidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_SURFACE_PROPERTY_TYPE: {
				MultiSurfacePropertyType multiSurfacePropertyType = (MultiSurfacePropertyType)theEObject;
				T result = caseMultiSurfacePropertyType(multiSurfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.MULTI_SURFACE_TYPE: {
				MultiSurfaceType multiSurfaceType = (MultiSurfaceType)theEObject;
				T result = caseMultiSurfaceType(multiSurfaceType);
				if (result == null) result = caseAbstractGeometricAggregateType(multiSurfaceType);
				if (result == null) result = caseAbstractGeometryType(multiSurfaceType);
				if (result == null) result = caseAbstractGMLType(multiSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.NODE_OR_EDGE_PROPERTY_TYPE: {
				NodeOrEdgePropertyType nodeOrEdgePropertyType = (NodeOrEdgePropertyType)theEObject;
				T result = caseNodeOrEdgePropertyType(nodeOrEdgePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.NODE_PROPERTY_TYPE: {
				NodePropertyType nodePropertyType = (NodePropertyType)theEObject;
				T result = caseNodePropertyType(nodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.NODE_TYPE: {
				NodeType nodeType = (NodeType)theEObject;
				T result = caseNodeType(nodeType);
				if (result == null) result = caseAbstractTopoPrimitiveType(nodeType);
				if (result == null) result = caseAbstractTopologyType(nodeType);
				if (result == null) result = caseAbstractGMLType(nodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OBLIQUE_CARTESIAN_CS_PROPERTY_TYPE: {
				ObliqueCartesianCSPropertyType obliqueCartesianCSPropertyType = (ObliqueCartesianCSPropertyType)theEObject;
				T result = caseObliqueCartesianCSPropertyType(obliqueCartesianCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OBLIQUE_CARTESIAN_CS_TYPE: {
				ObliqueCartesianCSType obliqueCartesianCSType = (ObliqueCartesianCSType)theEObject;
				T result = caseObliqueCartesianCSType(obliqueCartesianCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(obliqueCartesianCSType);
				if (result == null) result = caseIdentifiedObjectType(obliqueCartesianCSType);
				if (result == null) result = caseDefinitionType(obliqueCartesianCSType);
				if (result == null) result = caseDefinitionBaseType(obliqueCartesianCSType);
				if (result == null) result = caseAbstractGMLType(obliqueCartesianCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OBSERVATION_TYPE: {
				ObservationType observationType = (ObservationType)theEObject;
				T result = caseObservationType(observationType);
				if (result == null) result = caseAbstractFeatureType(observationType);
				if (result == null) result = caseAbstractGMLType(observationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OFFSET_CURVE_TYPE: {
				OffsetCurveType offsetCurveType = (OffsetCurveType)theEObject;
				T result = caseOffsetCurveType(offsetCurveType);
				if (result == null) result = caseAbstractCurveSegmentType(offsetCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_METHOD_PROPERTY_TYPE: {
				OperationMethodPropertyType operationMethodPropertyType = (OperationMethodPropertyType)theEObject;
				T result = caseOperationMethodPropertyType(operationMethodPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_METHOD_TYPE: {
				OperationMethodType operationMethodType = (OperationMethodType)theEObject;
				T result = caseOperationMethodType(operationMethodType);
				if (result == null) result = caseIdentifiedObjectType(operationMethodType);
				if (result == null) result = caseDefinitionType(operationMethodType);
				if (result == null) result = caseDefinitionBaseType(operationMethodType);
				if (result == null) result = caseAbstractGMLType(operationMethodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_PARAMETER_GROUP_PROPERTY_TYPE: {
				OperationParameterGroupPropertyType operationParameterGroupPropertyType = (OperationParameterGroupPropertyType)theEObject;
				T result = caseOperationParameterGroupPropertyType(operationParameterGroupPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE: {
				OperationParameterGroupType operationParameterGroupType = (OperationParameterGroupType)theEObject;
				T result = caseOperationParameterGroupType(operationParameterGroupType);
				if (result == null) result = caseAbstractGeneralOperationParameterType(operationParameterGroupType);
				if (result == null) result = caseIdentifiedObjectType(operationParameterGroupType);
				if (result == null) result = caseDefinitionType(operationParameterGroupType);
				if (result == null) result = caseDefinitionBaseType(operationParameterGroupType);
				if (result == null) result = caseAbstractGMLType(operationParameterGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_PARAMETER_PROPERTY_TYPE: {
				OperationParameterPropertyType operationParameterPropertyType = (OperationParameterPropertyType)theEObject;
				T result = caseOperationParameterPropertyType(operationParameterPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_PARAMETER_TYPE: {
				OperationParameterType operationParameterType = (OperationParameterType)theEObject;
				T result = caseOperationParameterType(operationParameterType);
				if (result == null) result = caseAbstractGeneralOperationParameterType(operationParameterType);
				if (result == null) result = caseIdentifiedObjectType(operationParameterType);
				if (result == null) result = caseDefinitionType(operationParameterType);
				if (result == null) result = caseDefinitionBaseType(operationParameterType);
				if (result == null) result = caseAbstractGMLType(operationParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.OPERATION_PROPERTY_TYPE: {
				OperationPropertyType operationPropertyType = (OperationPropertyType)theEObject;
				T result = caseOperationPropertyType(operationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ORIENTABLE_CURVE_TYPE: {
				OrientableCurveType orientableCurveType = (OrientableCurveType)theEObject;
				T result = caseOrientableCurveType(orientableCurveType);
				if (result == null) result = caseAbstractCurveType(orientableCurveType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(orientableCurveType);
				if (result == null) result = caseAbstractGeometryType(orientableCurveType);
				if (result == null) result = caseAbstractGMLType(orientableCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ORIENTABLE_SURFACE_TYPE: {
				OrientableSurfaceType orientableSurfaceType = (OrientableSurfaceType)theEObject;
				T result = caseOrientableSurfaceType(orientableSurfaceType);
				if (result == null) result = caseAbstractCurveType(orientableSurfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(orientableSurfaceType);
				if (result == null) result = caseAbstractGeometryType(orientableSurfaceType);
				if (result == null) result = caseAbstractGMLType(orientableSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PARAMETER_VALUE_GROUP_TYPE: {
				ParameterValueGroupType parameterValueGroupType = (ParameterValueGroupType)theEObject;
				T result = caseParameterValueGroupType(parameterValueGroupType);
				if (result == null) result = caseAbstractGeneralParameterValueType(parameterValueGroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PARAMETER_VALUE_TYPE: {
				ParameterValueType parameterValueType = (ParameterValueType)theEObject;
				T result = caseParameterValueType(parameterValueType);
				if (result == null) result = caseAbstractGeneralParameterValueType(parameterValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PASS_THROUGH_OPERATION_PROPERTY_TYPE: {
				PassThroughOperationPropertyType passThroughOperationPropertyType = (PassThroughOperationPropertyType)theEObject;
				T result = casePassThroughOperationPropertyType(passThroughOperationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PASS_THROUGH_OPERATION_TYPE: {
				PassThroughOperationType passThroughOperationType = (PassThroughOperationType)theEObject;
				T result = casePassThroughOperationType(passThroughOperationType);
				if (result == null) result = caseAbstractCoordinateOperationType(passThroughOperationType);
				if (result == null) result = caseIdentifiedObjectType(passThroughOperationType);
				if (result == null) result = caseDefinitionType(passThroughOperationType);
				if (result == null) result = caseDefinitionBaseType(passThroughOperationType);
				if (result == null) result = caseAbstractGMLType(passThroughOperationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POINT_ARRAY_PROPERTY_TYPE: {
				PointArrayPropertyType pointArrayPropertyType = (PointArrayPropertyType)theEObject;
				T result = casePointArrayPropertyType(pointArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POINT_PROPERTY_TYPE: {
				PointPropertyType pointPropertyType = (PointPropertyType)theEObject;
				T result = casePointPropertyType(pointPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POINT_TYPE: {
				PointType pointType = (PointType)theEObject;
				T result = casePointType(pointType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(pointType);
				if (result == null) result = caseAbstractGeometryType(pointType);
				if (result == null) result = caseAbstractGMLType(pointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POLAR_CS_PROPERTY_TYPE: {
				PolarCSPropertyType polarCSPropertyType = (PolarCSPropertyType)theEObject;
				T result = casePolarCSPropertyType(polarCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POLAR_CS_TYPE: {
				PolarCSType polarCSType = (PolarCSType)theEObject;
				T result = casePolarCSType(polarCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(polarCSType);
				if (result == null) result = caseIdentifiedObjectType(polarCSType);
				if (result == null) result = caseDefinitionType(polarCSType);
				if (result == null) result = caseDefinitionBaseType(polarCSType);
				if (result == null) result = caseAbstractGMLType(polarCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POLYGON_PATCH_TYPE: {
				PolygonPatchType polygonPatchType = (PolygonPatchType)theEObject;
				T result = casePolygonPatchType(polygonPatchType);
				if (result == null) result = caseAbstractSurfacePatchType(polygonPatchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.POLYGON_TYPE: {
				PolygonType polygonType = (PolygonType)theEObject;
				T result = casePolygonType(polygonType);
				if (result == null) result = caseAbstractSurfaceType(polygonType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(polygonType);
				if (result == null) result = caseAbstractGeometryType(polygonType);
				if (result == null) result = caseAbstractGMLType(polygonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PRIME_MERIDIAN_PROPERTY_TYPE: {
				PrimeMeridianPropertyType primeMeridianPropertyType = (PrimeMeridianPropertyType)theEObject;
				T result = casePrimeMeridianPropertyType(primeMeridianPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PRIME_MERIDIAN_TYPE: {
				PrimeMeridianType primeMeridianType = (PrimeMeridianType)theEObject;
				T result = casePrimeMeridianType(primeMeridianType);
				if (result == null) result = caseIdentifiedObjectType(primeMeridianType);
				if (result == null) result = caseDefinitionType(primeMeridianType);
				if (result == null) result = caseDefinitionBaseType(primeMeridianType);
				if (result == null) result = caseAbstractGMLType(primeMeridianType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PRIORITY_LOCATION_PROPERTY_TYPE: {
				PriorityLocationPropertyType priorityLocationPropertyType = (PriorityLocationPropertyType)theEObject;
				T result = casePriorityLocationPropertyType(priorityLocationPropertyType);
				if (result == null) result = caseLocationPropertyType(priorityLocationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PROCEDURE_PROPERTY_TYPE: {
				ProcedurePropertyType procedurePropertyType = (ProcedurePropertyType)theEObject;
				T result = caseProcedurePropertyType(procedurePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PROJECTED_CRS_PROPERTY_TYPE: {
				ProjectedCRSPropertyType projectedCRSPropertyType = (ProjectedCRSPropertyType)theEObject;
				T result = caseProjectedCRSPropertyType(projectedCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.PROJECTED_CRS_TYPE: {
				ProjectedCRSType projectedCRSType = (ProjectedCRSType)theEObject;
				T result = caseProjectedCRSType(projectedCRSType);
				if (result == null) result = caseAbstractGeneralDerivedCRSType(projectedCRSType);
				if (result == null) result = caseAbstractCRSType(projectedCRSType);
				if (result == null) result = caseIdentifiedObjectType(projectedCRSType);
				if (result == null) result = caseDefinitionType(projectedCRSType);
				if (result == null) result = caseDefinitionBaseType(projectedCRSType);
				if (result == null) result = caseAbstractGMLType(projectedCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.QUANTITY_EXTENT_TYPE: {
				QuantityExtentType quantityExtentType = (QuantityExtentType)theEObject;
				T result = caseQuantityExtentType(quantityExtentType);
				if (result == null) result = caseMeasureOrNilReasonListType(quantityExtentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.QUANTITY_PROPERTY_TYPE: {
				QuantityPropertyType quantityPropertyType = (QuantityPropertyType)theEObject;
				T result = caseQuantityPropertyType(quantityPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.QUANTITY_TYPE: {
				QuantityType quantityType = (QuantityType)theEObject;
				T result = caseQuantityType(quantityType);
				if (result == null) result = caseMeasureType(quantityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RANGE_SET_TYPE: {
				RangeSetType rangeSetType = (RangeSetType)theEObject;
				T result = caseRangeSetType(rangeSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RECTANGLE_TYPE: {
				RectangleType rectangleType = (RectangleType)theEObject;
				T result = caseRectangleType(rectangleType);
				if (result == null) result = caseAbstractSurfacePatchType(rectangleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RECTIFIED_GRID_TYPE: {
				RectifiedGridType rectifiedGridType = (RectifiedGridType)theEObject;
				T result = caseRectifiedGridType(rectifiedGridType);
				if (result == null) result = caseGridType(rectifiedGridType);
				if (result == null) result = caseAbstractGeometryType(rectifiedGridType);
				if (result == null) result = caseAbstractGMLType(rectifiedGridType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.REF_LOCATION_TYPE: {
				RefLocationType refLocationType = (RefLocationType)theEObject;
				T result = caseRefLocationType(refLocationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RELATED_TIME_TYPE: {
				RelatedTimeType relatedTimeType = (RelatedTimeType)theEObject;
				T result = caseRelatedTimeType(relatedTimeType);
				if (result == null) result = caseTimePrimitivePropertyType(relatedTimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RING_PROPERTY_TYPE: {
				RingPropertyType ringPropertyType = (RingPropertyType)theEObject;
				T result = caseRingPropertyType(ringPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.RING_TYPE: {
				RingType ringType = (RingType)theEObject;
				T result = caseRingType(ringType);
				if (result == null) result = caseAbstractRingType(ringType);
				if (result == null) result = caseAbstractCurveType(ringType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(ringType);
				if (result == null) result = caseAbstractGeometryType(ringType);
				if (result == null) result = caseAbstractGMLType(ringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ROWS_TYPE: {
				RowsType rowsType = (RowsType)theEObject;
				T result = caseRowsType(rowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.ROW_TYPE: {
				RowType rowType = (RowType)theEObject;
				T result = caseRowType(rowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SCALE_TYPE: {
				ScaleType scaleType = (ScaleType)theEObject;
				T result = caseScaleType(scaleType);
				if (result == null) result = caseMeasureType(scaleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE: {
				SecondDefiningParameterType secondDefiningParameterType = (SecondDefiningParameterType)theEObject;
				T result = caseSecondDefiningParameterType(secondDefiningParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE1: {
				SecondDefiningParameterType1 secondDefiningParameterType1 = (SecondDefiningParameterType1)theEObject;
				T result = caseSecondDefiningParameterType1(secondDefiningParameterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE2: {
				SecondDefiningParameterType2 secondDefiningParameterType2 = (SecondDefiningParameterType2)theEObject;
				T result = caseSecondDefiningParameterType2(secondDefiningParameterType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SECOND_DEFINING_PARAMETER_TYPE3: {
				SecondDefiningParameterType3 secondDefiningParameterType3 = (SecondDefiningParameterType3)theEObject;
				T result = caseSecondDefiningParameterType3(secondDefiningParameterType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SEQUENCE_RULE_TYPE: {
				SequenceRuleType sequenceRuleType = (SequenceRuleType)theEObject;
				T result = caseSequenceRuleType(sequenceRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SHELL_PROPERTY_TYPE: {
				ShellPropertyType shellPropertyType = (ShellPropertyType)theEObject;
				T result = caseShellPropertyType(shellPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SHELL_TYPE: {
				ShellType shellType = (ShellType)theEObject;
				T result = caseShellType(shellType);
				if (result == null) result = caseAbstractSurfaceType(shellType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(shellType);
				if (result == null) result = caseAbstractGeometryType(shellType);
				if (result == null) result = caseAbstractGMLType(shellType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SINGLE_CRS_PROPERTY_TYPE: {
				SingleCRSPropertyType singleCRSPropertyType = (SingleCRSPropertyType)theEObject;
				T result = caseSingleCRSPropertyType(singleCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SINGLE_OPERATION_PROPERTY_TYPE: {
				SingleOperationPropertyType singleOperationPropertyType = (SingleOperationPropertyType)theEObject;
				T result = caseSingleOperationPropertyType(singleOperationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SOLID_ARRAY_PROPERTY_TYPE: {
				SolidArrayPropertyType solidArrayPropertyType = (SolidArrayPropertyType)theEObject;
				T result = caseSolidArrayPropertyType(solidArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SOLID_PROPERTY_TYPE: {
				SolidPropertyType solidPropertyType = (SolidPropertyType)theEObject;
				T result = caseSolidPropertyType(solidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SOLID_TYPE: {
				SolidType solidType = (SolidType)theEObject;
				T result = caseSolidType(solidType);
				if (result == null) result = caseAbstractSolidType(solidType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(solidType);
				if (result == null) result = caseAbstractGeometryType(solidType);
				if (result == null) result = caseAbstractGMLType(solidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SPEED_TYPE: {
				SpeedType speedType = (SpeedType)theEObject;
				T result = caseSpeedType(speedType);
				if (result == null) result = caseMeasureType(speedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SPHERE_TYPE: {
				SphereType sphereType = (SphereType)theEObject;
				T result = caseSphereType(sphereType);
				if (result == null) result = caseAbstractGriddedSurfaceType(sphereType);
				if (result == null) result = caseAbstractParametricCurveSurfaceType(sphereType);
				if (result == null) result = caseAbstractSurfacePatchType(sphereType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SPHERICAL_CS_PROPERTY_TYPE: {
				SphericalCSPropertyType sphericalCSPropertyType = (SphericalCSPropertyType)theEObject;
				T result = caseSphericalCSPropertyType(sphericalCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SPHERICAL_CS_TYPE: {
				SphericalCSType sphericalCSType = (SphericalCSType)theEObject;
				T result = caseSphericalCSType(sphericalCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(sphericalCSType);
				if (result == null) result = caseIdentifiedObjectType(sphericalCSType);
				if (result == null) result = caseDefinitionType(sphericalCSType);
				if (result == null) result = caseDefinitionBaseType(sphericalCSType);
				if (result == null) result = caseAbstractGMLType(sphericalCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.STRING_OR_REF_TYPE: {
				StringOrRefType stringOrRefType = (StringOrRefType)theEObject;
				T result = caseStringOrRefType(stringOrRefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SURFACE_ARRAY_PROPERTY_TYPE: {
				SurfaceArrayPropertyType surfaceArrayPropertyType = (SurfaceArrayPropertyType)theEObject;
				T result = caseSurfaceArrayPropertyType(surfaceArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SURFACE_PATCH_ARRAY_PROPERTY_TYPE: {
				SurfacePatchArrayPropertyType surfacePatchArrayPropertyType = (SurfacePatchArrayPropertyType)theEObject;
				T result = caseSurfacePatchArrayPropertyType(surfacePatchArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SURFACE_PROPERTY_TYPE: {
				SurfacePropertyType surfacePropertyType = (SurfacePropertyType)theEObject;
				T result = caseSurfacePropertyType(surfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.SURFACE_TYPE: {
				SurfaceType surfaceType = (SurfaceType)theEObject;
				T result = caseSurfaceType(surfaceType);
				if (result == null) result = caseAbstractSurfaceType(surfaceType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(surfaceType);
				if (result == null) result = caseAbstractGeometryType(surfaceType);
				if (result == null) result = caseAbstractGMLType(surfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TARGET_PROPERTY_TYPE: {
				TargetPropertyType targetPropertyType = (TargetPropertyType)theEObject;
				T result = caseTargetPropertyType(targetPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_CRS_PROPERTY_TYPE: {
				TemporalCRSPropertyType temporalCRSPropertyType = (TemporalCRSPropertyType)theEObject;
				T result = caseTemporalCRSPropertyType(temporalCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_CRS_TYPE: {
				TemporalCRSType temporalCRSType = (TemporalCRSType)theEObject;
				T result = caseTemporalCRSType(temporalCRSType);
				if (result == null) result = caseAbstractCRSType(temporalCRSType);
				if (result == null) result = caseIdentifiedObjectType(temporalCRSType);
				if (result == null) result = caseDefinitionType(temporalCRSType);
				if (result == null) result = caseDefinitionBaseType(temporalCRSType);
				if (result == null) result = caseAbstractGMLType(temporalCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_CS_PROPERTY_TYPE: {
				TemporalCSPropertyType temporalCSPropertyType = (TemporalCSPropertyType)theEObject;
				T result = caseTemporalCSPropertyType(temporalCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_CS_TYPE: {
				TemporalCSType temporalCSType = (TemporalCSType)theEObject;
				T result = caseTemporalCSType(temporalCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(temporalCSType);
				if (result == null) result = caseIdentifiedObjectType(temporalCSType);
				if (result == null) result = caseDefinitionType(temporalCSType);
				if (result == null) result = caseDefinitionBaseType(temporalCSType);
				if (result == null) result = caseAbstractGMLType(temporalCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_DATUM_BASE_TYPE: {
				TemporalDatumBaseType temporalDatumBaseType = (TemporalDatumBaseType)theEObject;
				T result = caseTemporalDatumBaseType(temporalDatumBaseType);
				if (result == null) result = caseAbstractDatumType(temporalDatumBaseType);
				if (result == null) result = caseIdentifiedObjectType(temporalDatumBaseType);
				if (result == null) result = caseDefinitionType(temporalDatumBaseType);
				if (result == null) result = caseDefinitionBaseType(temporalDatumBaseType);
				if (result == null) result = caseAbstractGMLType(temporalDatumBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_DATUM_PROPERTY_TYPE: {
				TemporalDatumPropertyType temporalDatumPropertyType = (TemporalDatumPropertyType)theEObject;
				T result = caseTemporalDatumPropertyType(temporalDatumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TEMPORAL_DATUM_TYPE: {
				TemporalDatumType temporalDatumType = (TemporalDatumType)theEObject;
				T result = caseTemporalDatumType(temporalDatumType);
				if (result == null) result = caseTemporalDatumBaseType(temporalDatumType);
				if (result == null) result = caseAbstractDatumType(temporalDatumType);
				if (result == null) result = caseIdentifiedObjectType(temporalDatumType);
				if (result == null) result = caseDefinitionType(temporalDatumType);
				if (result == null) result = caseDefinitionBaseType(temporalDatumType);
				if (result == null) result = caseAbstractGMLType(temporalDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CALENDAR_ERA_PROPERTY_TYPE: {
				TimeCalendarEraPropertyType timeCalendarEraPropertyType = (TimeCalendarEraPropertyType)theEObject;
				T result = caseTimeCalendarEraPropertyType(timeCalendarEraPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CALENDAR_ERA_TYPE: {
				TimeCalendarEraType timeCalendarEraType = (TimeCalendarEraType)theEObject;
				T result = caseTimeCalendarEraType(timeCalendarEraType);
				if (result == null) result = caseDefinitionType(timeCalendarEraType);
				if (result == null) result = caseDefinitionBaseType(timeCalendarEraType);
				if (result == null) result = caseAbstractGMLType(timeCalendarEraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CALENDAR_PROPERTY_TYPE: {
				TimeCalendarPropertyType timeCalendarPropertyType = (TimeCalendarPropertyType)theEObject;
				T result = caseTimeCalendarPropertyType(timeCalendarPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CALENDAR_TYPE: {
				TimeCalendarType timeCalendarType = (TimeCalendarType)theEObject;
				T result = caseTimeCalendarType(timeCalendarType);
				if (result == null) result = caseTimeReferenceSystemType(timeCalendarType);
				if (result == null) result = caseDefinitionType(timeCalendarType);
				if (result == null) result = caseDefinitionBaseType(timeCalendarType);
				if (result == null) result = caseAbstractGMLType(timeCalendarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CLOCK_PROPERTY_TYPE: {
				TimeClockPropertyType timeClockPropertyType = (TimeClockPropertyType)theEObject;
				T result = caseTimeClockPropertyType(timeClockPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CLOCK_TYPE: {
				TimeClockType timeClockType = (TimeClockType)theEObject;
				T result = caseTimeClockType(timeClockType);
				if (result == null) result = caseTimeReferenceSystemType(timeClockType);
				if (result == null) result = caseDefinitionType(timeClockType);
				if (result == null) result = caseDefinitionBaseType(timeClockType);
				if (result == null) result = caseAbstractGMLType(timeClockType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_COORDINATE_SYSTEM_TYPE: {
				TimeCoordinateSystemType timeCoordinateSystemType = (TimeCoordinateSystemType)theEObject;
				T result = caseTimeCoordinateSystemType(timeCoordinateSystemType);
				if (result == null) result = caseTimeReferenceSystemType(timeCoordinateSystemType);
				if (result == null) result = caseDefinitionType(timeCoordinateSystemType);
				if (result == null) result = caseDefinitionBaseType(timeCoordinateSystemType);
				if (result == null) result = caseAbstractGMLType(timeCoordinateSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CS_PROPERTY_TYPE: {
				TimeCSPropertyType timeCSPropertyType = (TimeCSPropertyType)theEObject;
				T result = caseTimeCSPropertyType(timeCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_CS_TYPE: {
				TimeCSType timeCSType = (TimeCSType)theEObject;
				T result = caseTimeCSType(timeCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(timeCSType);
				if (result == null) result = caseIdentifiedObjectType(timeCSType);
				if (result == null) result = caseDefinitionType(timeCSType);
				if (result == null) result = caseDefinitionBaseType(timeCSType);
				if (result == null) result = caseAbstractGMLType(timeCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_EDGE_PROPERTY_TYPE: {
				TimeEdgePropertyType timeEdgePropertyType = (TimeEdgePropertyType)theEObject;
				T result = caseTimeEdgePropertyType(timeEdgePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_EDGE_TYPE: {
				TimeEdgeType timeEdgeType = (TimeEdgeType)theEObject;
				T result = caseTimeEdgeType(timeEdgeType);
				if (result == null) result = caseAbstractTimeTopologyPrimitiveType(timeEdgeType);
				if (result == null) result = caseAbstractTimePrimitiveType(timeEdgeType);
				if (result == null) result = caseAbstractTimeObjectType(timeEdgeType);
				if (result == null) result = caseAbstractGMLType(timeEdgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_INSTANT_PROPERTY_TYPE: {
				TimeInstantPropertyType timeInstantPropertyType = (TimeInstantPropertyType)theEObject;
				T result = caseTimeInstantPropertyType(timeInstantPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_INSTANT_TYPE: {
				TimeInstantType timeInstantType = (TimeInstantType)theEObject;
				T result = caseTimeInstantType(timeInstantType);
				if (result == null) result = caseAbstractTimeGeometricPrimitiveType(timeInstantType);
				if (result == null) result = caseAbstractTimePrimitiveType(timeInstantType);
				if (result == null) result = caseAbstractTimeObjectType(timeInstantType);
				if (result == null) result = caseAbstractGMLType(timeInstantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_INTERVAL_LENGTH_TYPE: {
				TimeIntervalLengthType timeIntervalLengthType = (TimeIntervalLengthType)theEObject;
				T result = caseTimeIntervalLengthType(timeIntervalLengthType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_NODE_PROPERTY_TYPE: {
				TimeNodePropertyType timeNodePropertyType = (TimeNodePropertyType)theEObject;
				T result = caseTimeNodePropertyType(timeNodePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_NODE_TYPE: {
				TimeNodeType timeNodeType = (TimeNodeType)theEObject;
				T result = caseTimeNodeType(timeNodeType);
				if (result == null) result = caseAbstractTimeTopologyPrimitiveType(timeNodeType);
				if (result == null) result = caseAbstractTimePrimitiveType(timeNodeType);
				if (result == null) result = caseAbstractTimeObjectType(timeNodeType);
				if (result == null) result = caseAbstractGMLType(timeNodeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_ORDINAL_ERA_PROPERTY_TYPE: {
				TimeOrdinalEraPropertyType timeOrdinalEraPropertyType = (TimeOrdinalEraPropertyType)theEObject;
				T result = caseTimeOrdinalEraPropertyType(timeOrdinalEraPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_ORDINAL_ERA_TYPE: {
				TimeOrdinalEraType timeOrdinalEraType = (TimeOrdinalEraType)theEObject;
				T result = caseTimeOrdinalEraType(timeOrdinalEraType);
				if (result == null) result = caseDefinitionType(timeOrdinalEraType);
				if (result == null) result = caseDefinitionBaseType(timeOrdinalEraType);
				if (result == null) result = caseAbstractGMLType(timeOrdinalEraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_ORDINAL_REFERENCE_SYSTEM_TYPE: {
				TimeOrdinalReferenceSystemType timeOrdinalReferenceSystemType = (TimeOrdinalReferenceSystemType)theEObject;
				T result = caseTimeOrdinalReferenceSystemType(timeOrdinalReferenceSystemType);
				if (result == null) result = caseTimeReferenceSystemType(timeOrdinalReferenceSystemType);
				if (result == null) result = caseDefinitionType(timeOrdinalReferenceSystemType);
				if (result == null) result = caseDefinitionBaseType(timeOrdinalReferenceSystemType);
				if (result == null) result = caseAbstractGMLType(timeOrdinalReferenceSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_PERIOD_PROPERTY_TYPE: {
				TimePeriodPropertyType timePeriodPropertyType = (TimePeriodPropertyType)theEObject;
				T result = caseTimePeriodPropertyType(timePeriodPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_PERIOD_TYPE: {
				TimePeriodType timePeriodType = (TimePeriodType)theEObject;
				T result = caseTimePeriodType(timePeriodType);
				if (result == null) result = caseAbstractTimeGeometricPrimitiveType(timePeriodType);
				if (result == null) result = caseAbstractTimePrimitiveType(timePeriodType);
				if (result == null) result = caseAbstractTimeObjectType(timePeriodType);
				if (result == null) result = caseAbstractGMLType(timePeriodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_POSITION_TYPE: {
				TimePositionType timePositionType = (TimePositionType)theEObject;
				T result = caseTimePositionType(timePositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_PRIMITIVE_PROPERTY_TYPE: {
				TimePrimitivePropertyType timePrimitivePropertyType = (TimePrimitivePropertyType)theEObject;
				T result = caseTimePrimitivePropertyType(timePrimitivePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_REFERENCE_SYSTEM_TYPE: {
				TimeReferenceSystemType timeReferenceSystemType = (TimeReferenceSystemType)theEObject;
				T result = caseTimeReferenceSystemType(timeReferenceSystemType);
				if (result == null) result = caseDefinitionType(timeReferenceSystemType);
				if (result == null) result = caseDefinitionBaseType(timeReferenceSystemType);
				if (result == null) result = caseAbstractGMLType(timeReferenceSystemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_PROPERTY_TYPE: {
				TimeTopologyComplexPropertyType timeTopologyComplexPropertyType = (TimeTopologyComplexPropertyType)theEObject;
				T result = caseTimeTopologyComplexPropertyType(timeTopologyComplexPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_TOPOLOGY_COMPLEX_TYPE: {
				TimeTopologyComplexType timeTopologyComplexType = (TimeTopologyComplexType)theEObject;
				T result = caseTimeTopologyComplexType(timeTopologyComplexType);
				if (result == null) result = caseAbstractTimeComplexType(timeTopologyComplexType);
				if (result == null) result = caseAbstractTimeObjectType(timeTopologyComplexType);
				if (result == null) result = caseAbstractGMLType(timeTopologyComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_TOPOLOGY_PRIMITIVE_PROPERTY_TYPE: {
				TimeTopologyPrimitivePropertyType timeTopologyPrimitivePropertyType = (TimeTopologyPrimitivePropertyType)theEObject;
				T result = caseTimeTopologyPrimitivePropertyType(timeTopologyPrimitivePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIME_TYPE: {
				TimeType timeType = (TimeType)theEObject;
				T result = caseTimeType(timeType);
				if (result == null) result = caseMeasureType(timeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TIN_TYPE: {
				TinType tinType = (TinType)theEObject;
				T result = caseTinType(tinType);
				if (result == null) result = caseSurfaceType(tinType);
				if (result == null) result = caseAbstractSurfaceType(tinType);
				if (result == null) result = caseAbstractGeometricPrimitiveType(tinType);
				if (result == null) result = caseAbstractGeometryType(tinType);
				if (result == null) result = caseAbstractGMLType(tinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_COMPLEX_PROPERTY_TYPE: {
				TopoComplexPropertyType topoComplexPropertyType = (TopoComplexPropertyType)theEObject;
				T result = caseTopoComplexPropertyType(topoComplexPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_COMPLEX_TYPE: {
				TopoComplexType topoComplexType = (TopoComplexType)theEObject;
				T result = caseTopoComplexType(topoComplexType);
				if (result == null) result = caseAbstractTopologyType(topoComplexType);
				if (result == null) result = caseAbstractGMLType(topoComplexType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_CURVE_PROPERTY_TYPE: {
				TopoCurvePropertyType topoCurvePropertyType = (TopoCurvePropertyType)theEObject;
				T result = caseTopoCurvePropertyType(topoCurvePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_CURVE_TYPE: {
				TopoCurveType topoCurveType = (TopoCurveType)theEObject;
				T result = caseTopoCurveType(topoCurveType);
				if (result == null) result = caseAbstractTopologyType(topoCurveType);
				if (result == null) result = caseAbstractGMLType(topoCurveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_POINT_PROPERTY_TYPE: {
				TopoPointPropertyType topoPointPropertyType = (TopoPointPropertyType)theEObject;
				T result = caseTopoPointPropertyType(topoPointPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_POINT_TYPE: {
				TopoPointType topoPointType = (TopoPointType)theEObject;
				T result = caseTopoPointType(topoPointType);
				if (result == null) result = caseAbstractTopologyType(topoPointType);
				if (result == null) result = caseAbstractGMLType(topoPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_PRIMITIVE_ARRAY_ASSOCIATION_TYPE: {
				TopoPrimitiveArrayAssociationType topoPrimitiveArrayAssociationType = (TopoPrimitiveArrayAssociationType)theEObject;
				T result = caseTopoPrimitiveArrayAssociationType(topoPrimitiveArrayAssociationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_PRIMITIVE_MEMBER_TYPE: {
				TopoPrimitiveMemberType topoPrimitiveMemberType = (TopoPrimitiveMemberType)theEObject;
				T result = caseTopoPrimitiveMemberType(topoPrimitiveMemberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_SOLID_PROPERTY_TYPE: {
				TopoSolidPropertyType topoSolidPropertyType = (TopoSolidPropertyType)theEObject;
				T result = caseTopoSolidPropertyType(topoSolidPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_SOLID_TYPE: {
				TopoSolidType topoSolidType = (TopoSolidType)theEObject;
				T result = caseTopoSolidType(topoSolidType);
				if (result == null) result = caseAbstractTopoPrimitiveType(topoSolidType);
				if (result == null) result = caseAbstractTopologyType(topoSolidType);
				if (result == null) result = caseAbstractGMLType(topoSolidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_SURFACE_PROPERTY_TYPE: {
				TopoSurfacePropertyType topoSurfacePropertyType = (TopoSurfacePropertyType)theEObject;
				T result = caseTopoSurfacePropertyType(topoSurfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_SURFACE_TYPE: {
				TopoSurfaceType topoSurfaceType = (TopoSurfaceType)theEObject;
				T result = caseTopoSurfaceType(topoSurfaceType);
				if (result == null) result = caseAbstractTopologyType(topoSurfaceType);
				if (result == null) result = caseAbstractGMLType(topoSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_VOLUME_PROPERTY_TYPE: {
				TopoVolumePropertyType topoVolumePropertyType = (TopoVolumePropertyType)theEObject;
				T result = caseTopoVolumePropertyType(topoVolumePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TOPO_VOLUME_TYPE: {
				TopoVolumeType topoVolumeType = (TopoVolumeType)theEObject;
				T result = caseTopoVolumeType(topoVolumeType);
				if (result == null) result = caseAbstractTopologyType(topoVolumeType);
				if (result == null) result = caseAbstractGMLType(topoVolumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TRANSFORMATION_PROPERTY_TYPE: {
				TransformationPropertyType transformationPropertyType = (TransformationPropertyType)theEObject;
				T result = caseTransformationPropertyType(transformationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TRANSFORMATION_TYPE: {
				TransformationType transformationType = (TransformationType)theEObject;
				T result = caseTransformationType(transformationType);
				if (result == null) result = caseAbstractGeneralTransformationType(transformationType);
				if (result == null) result = caseAbstractCoordinateOperationType(transformationType);
				if (result == null) result = caseIdentifiedObjectType(transformationType);
				if (result == null) result = caseDefinitionType(transformationType);
				if (result == null) result = caseDefinitionBaseType(transformationType);
				if (result == null) result = caseAbstractGMLType(transformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.TRIANGLE_TYPE: {
				TriangleType triangleType = (TriangleType)theEObject;
				T result = caseTriangleType(triangleType);
				if (result == null) result = caseAbstractSurfacePatchType(triangleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.UNIT_DEFINITION_TYPE: {
				UnitDefinitionType unitDefinitionType = (UnitDefinitionType)theEObject;
				T result = caseUnitDefinitionType(unitDefinitionType);
				if (result == null) result = caseDefinitionType(unitDefinitionType);
				if (result == null) result = caseDefinitionBaseType(unitDefinitionType);
				if (result == null) result = caseAbstractGMLType(unitDefinitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.UNIT_OF_MEASURE_TYPE: {
				UnitOfMeasureType unitOfMeasureType = (UnitOfMeasureType)theEObject;
				T result = caseUnitOfMeasureType(unitOfMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.USER_DEFINED_CS_PROPERTY_TYPE: {
				UserDefinedCSPropertyType userDefinedCSPropertyType = (UserDefinedCSPropertyType)theEObject;
				T result = caseUserDefinedCSPropertyType(userDefinedCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.USER_DEFINED_CS_TYPE: {
				UserDefinedCSType userDefinedCSType = (UserDefinedCSType)theEObject;
				T result = caseUserDefinedCSType(userDefinedCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(userDefinedCSType);
				if (result == null) result = caseIdentifiedObjectType(userDefinedCSType);
				if (result == null) result = caseDefinitionType(userDefinedCSType);
				if (result == null) result = caseDefinitionBaseType(userDefinedCSType);
				if (result == null) result = caseAbstractGMLType(userDefinedCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VALUE_ARRAY_PROPERTY_TYPE: {
				ValueArrayPropertyType valueArrayPropertyType = (ValueArrayPropertyType)theEObject;
				T result = caseValueArrayPropertyType(valueArrayPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VALUE_ARRAY_TYPE: {
				ValueArrayType valueArrayType = (ValueArrayType)theEObject;
				T result = caseValueArrayType(valueArrayType);
				if (result == null) result = caseCompositeValueType(valueArrayType);
				if (result == null) result = caseAbstractGMLType(valueArrayType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VALUE_PROPERTY_TYPE: {
				ValuePropertyType valuePropertyType = (ValuePropertyType)theEObject;
				T result = caseValuePropertyType(valuePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VECTOR_TYPE: {
				VectorType vectorType = (VectorType)theEObject;
				T result = caseVectorType(vectorType);
				if (result == null) result = caseDirectPositionType(vectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_CRS_PROPERTY_TYPE: {
				VerticalCRSPropertyType verticalCRSPropertyType = (VerticalCRSPropertyType)theEObject;
				T result = caseVerticalCRSPropertyType(verticalCRSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_CRS_TYPE: {
				VerticalCRSType verticalCRSType = (VerticalCRSType)theEObject;
				T result = caseVerticalCRSType(verticalCRSType);
				if (result == null) result = caseAbstractCRSType(verticalCRSType);
				if (result == null) result = caseIdentifiedObjectType(verticalCRSType);
				if (result == null) result = caseDefinitionType(verticalCRSType);
				if (result == null) result = caseDefinitionBaseType(verticalCRSType);
				if (result == null) result = caseAbstractGMLType(verticalCRSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_CS_PROPERTY_TYPE: {
				VerticalCSPropertyType verticalCSPropertyType = (VerticalCSPropertyType)theEObject;
				T result = caseVerticalCSPropertyType(verticalCSPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_CS_TYPE: {
				VerticalCSType verticalCSType = (VerticalCSType)theEObject;
				T result = caseVerticalCSType(verticalCSType);
				if (result == null) result = caseAbstractCoordinateSystemType(verticalCSType);
				if (result == null) result = caseIdentifiedObjectType(verticalCSType);
				if (result == null) result = caseDefinitionType(verticalCSType);
				if (result == null) result = caseDefinitionBaseType(verticalCSType);
				if (result == null) result = caseAbstractGMLType(verticalCSType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_DATUM_PROPERTY_TYPE: {
				VerticalDatumPropertyType verticalDatumPropertyType = (VerticalDatumPropertyType)theEObject;
				T result = caseVerticalDatumPropertyType(verticalDatumPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VERTICAL_DATUM_TYPE: {
				VerticalDatumType verticalDatumType = (VerticalDatumType)theEObject;
				T result = caseVerticalDatumType(verticalDatumType);
				if (result == null) result = caseAbstractDatumType(verticalDatumType);
				if (result == null) result = caseIdentifiedObjectType(verticalDatumType);
				if (result == null) result = caseDefinitionType(verticalDatumType);
				if (result == null) result = caseDefinitionBaseType(verticalDatumType);
				if (result == null) result = caseAbstractGMLType(verticalDatumType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMLPackage.VOLUME_TYPE: {
				VolumeType volumeType = (VolumeType)theEObject;
				T result = caseVolumeType(volumeType);
				if (result == null) result = caseMeasureType(volumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Continuous Coverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Continuous Coverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractContinuousCoverageType(AbstractContinuousCoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordinate Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordinate Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinateOperationType(AbstractCoordinateOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordinate System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordinate System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinateSystemType(AbstractCoordinateSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoverageType(AbstractCoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCRSType(AbstractCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Curve Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Curve Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCurveSegmentType(AbstractCurveSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCurveType(AbstractCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDatumType(AbstractDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureMemberType(AbstractFeatureMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFeatureType(AbstractFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Conversion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Conversion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralConversionType(AbstractGeneralConversionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Derived CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Derived CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralDerivedCRSType(AbstractGeneralDerivedCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Operation Parameter Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Operation Parameter Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralOperationParameterPropertyType(AbstractGeneralOperationParameterPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Operation Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Operation Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralOperationParameterType(AbstractGeneralOperationParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Parameter Value Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Parameter Value Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralParameterValuePropertyType(AbstractGeneralParameterValuePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Parameter Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Parameter Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralParameterValueType(AbstractGeneralParameterValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract General Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract General Transformation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeneralTransformationType(AbstractGeneralTransformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometric Aggregate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometric Aggregate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometricAggregateType(AbstractGeometricAggregateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometric Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGeometryType(AbstractGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract GML Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGMLType(AbstractGMLType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Gridded Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Gridded Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGriddedSurfaceType(AbstractGriddedSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMemberType(AbstractMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Metadata Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Metadata Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMetadataPropertyType(AbstractMetadataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMetaDataType(AbstractMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parametric Curve Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parametric Curve Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParametricCurveSurfaceType(AbstractParametricCurveSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ring Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ring Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRingPropertyType(AbstractRingPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRingType(AbstractRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Solid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Solid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSolidType(AbstractSolidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Patch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Patch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfacePatchType(AbstractSurfacePatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSurfaceType(AbstractSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeComplexType(AbstractTimeComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Geometric Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Geometric Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeGeometricPrimitiveType(AbstractTimeGeometricPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeObjectType(AbstractTimeObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimePrimitiveType(AbstractTimePrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Slice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Slice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeSliceType(AbstractTimeSliceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Time Topology Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Time Topology Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTimeTopologyPrimitiveType(AbstractTimeTopologyPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topology Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topology Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTopologyType(AbstractTopologyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topo Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topo Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTopoPrimitiveType(AbstractTopoPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affine CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affine CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffineCSPropertyType(AffineCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affine CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affine CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffineCSType(AffineCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affine Placement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affine Placement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffinePlacementType(AffinePlacementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleChoiceType(AngleChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Angle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Angle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAngleType(AngleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc By Bulge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc By Bulge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcByBulgeType(ArcByBulgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc By Center Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc By Center Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcByCenterPointType(ArcByCenterPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc String By Bulge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc String By Bulge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcStringByBulgeType(ArcStringByBulgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcStringType(ArcStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArcType(ArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayAssociationType(ArrayAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayType(ArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationRoleType(AssociationRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBagType(BagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseUnitType(BaseUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bezier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bezier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBezierType(BezierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanPropertyType(BooleanPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanType(BooleanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedFeatureType(BoundedFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingShapeType(BoundingShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSpline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSpline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSplineType(BSplineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianCSPropertyType(CartesianCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianCSType(CartesianCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryExtentType(CategoryExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryPropertyType(CategoryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategoryType(CategoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle By Center Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle By Center Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircleByCenterPointType(CircleByCenterPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircleType(CircleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clothoid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clothoid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClothoidType(ClothoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeListType(CodeListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Or Nil Reason List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Or Nil Reason List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeOrNilReasonListType(CodeOrNilReasonListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code With Authority Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code With Authority Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeWithAuthorityType(CodeWithAuthorityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCurveType(CompositeCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Solid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Solid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSolidType(CompositeSolidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSurfaceType(CompositeSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeValueType(CompositeValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCRSPropertyType(CompoundCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundCRSType(CompoundCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenated Operation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenated Operation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenatedOperationPropertyType(ConcatenatedOperationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenated Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenated Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenatedOperationType(ConcatenatedOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cone Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cone Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConeType(ConeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlPointType(ControlPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conventional Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conventional Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConventionalUnitType(ConventionalUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionPropertyType(ConversionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion To Preferred Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion To Preferred Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionToPreferredUnitType(ConversionToPreferredUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conversion Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conversion Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConversionType(ConversionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate Operation Accuracy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate Operation Accuracy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateOperationAccuracyType(CoordinateOperationAccuracyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate Operation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate Operation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateOperationPropertyType(CoordinateOperationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinatesType(CoordinatesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System Axis Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System Axis Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystemAxisPropertyType(CoordinateSystemAxisPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System Axis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System Axis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystemAxisType(CoordinateSystemAxisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinate System Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinate System Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinateSystemPropertyType(CoordinateSystemPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountPropertyType(CountPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCountType(CountType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageFunctionType(CoverageFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCRSPropertyType(CRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cubic Spline Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cubic Spline Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCubicSplineType(CubicSplineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveArrayPropertyType(CurveArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvePropertyType(CurvePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Segment Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Segment Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveSegmentArrayPropertyType(CurveSegmentArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurveType(CurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylinder Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylinder Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylinderType(CylinderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylindrical CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylindrical CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylindricalCSPropertyType(CylindricalCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cylindrical CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cylindrical CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCylindricalCSType(CylindricalCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Block Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Block Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataBlockType(DataBlockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatumPropertyType(DatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionBaseType(DefinitionBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Proxy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Proxy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionProxyType(DefinitionProxyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionType(DefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degrees Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degrees Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegreesType(DegreesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Unit Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Unit Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationUnitTermType(DerivationUnitTermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedCRSPropertyType(DerivedCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedCRSType(DerivedCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Unit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Unit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnitType(DerivedUnitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionaryEntryType(DictionaryEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dictionary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dictionary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDictionaryType(DictionaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Edge Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Edge Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedEdgePropertyType(DirectedEdgePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Face Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Face Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedFacePropertyType(DirectedFacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Node Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Node Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedNodePropertyType(DirectedNodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Observation At Distance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Observation At Distance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedObservationAtDistanceType(DirectedObservationAtDistanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Observation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Observation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedObservationType(DirectedObservationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Topo Solid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Topo Solid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedTopoSolidPropertyType(DirectedTopoSolidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionDescriptionType(DirectionDescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionPropertyType(DirectionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direction Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direction Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectionVectorType(DirectionVectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Position List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Position List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectPositionListType(DirectPositionListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectPositionType(DirectPositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discrete Coverage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discrete Coverage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteCoverageType(DiscreteCoverageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DMS Angle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DMS Angle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMSAngleType(DMSAngleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGMLDocumentRoot(GMLDocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Of Validity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Of Validity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainOfValidityType(DomainOfValidityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainSetType(DomainSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicFeatureCollectionType(DynamicFeatureCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Feature Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Feature Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicFeatureMemberType(DynamicFeatureMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Feature Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Feature Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicFeatureType(DynamicFeatureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdgeType(EdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipsoidal CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipsoidal CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsoidalCSPropertyType(EllipsoidalCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipsoidal CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipsoidal CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsoidalCSType(EllipsoidalCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipsoid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipsoid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsoidPropertyType(EllipsoidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipsoid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipsoid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEllipsoidType(EllipsoidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringCRSPropertyType(EngineeringCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringCRSType(EngineeringCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringDatumPropertyType(EngineeringDatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Engineering Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Engineering Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEngineeringDatumType(EngineeringDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvelopeType(EnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envelope With Time Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envelope With Time Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face Or Topo Solid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face Or Topo Solid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaceOrTopoSolidPropertyType(FaceOrTopoSolidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Face Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Face Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFaceType(FaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureArrayPropertyType(FeatureArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureCollectionType(FeatureCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeaturePropertyType(FeaturePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileType(FileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Citation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Citation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaCitationType(FormulaCitationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaType(FormulaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Conversion Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Conversion Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralConversionPropertyType(GeneralConversionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Transformation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Transformation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralTransformationPropertyType(GeneralTransformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Meta Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Meta Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericMetaDataType(GenericMetaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geocentric CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geocentric CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeocentricCRSPropertyType(GeocentricCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geocentric CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geocentric CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeocentricCRSType(GeocentricCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodesic String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodesic String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodesicStringType(GeodesicStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodesic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodesic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodesicType(GeodesicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodetic CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodetic CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodeticCRSPropertyType(GeodeticCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodetic CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodetic CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodeticCRSType(GeodeticCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodetic Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodetic Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodeticDatumPropertyType(GeodeticDatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geodetic Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geodetic Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeodeticDatumType(GeodeticDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicCRSPropertyType(GeographicCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geographic CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geographic CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeographicCRSType(GeographicCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometric Complex Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometric Complex Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometricComplexPropertyType(GeometricComplexPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometric Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometric Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometricComplexType(GeometricComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometric Primitive Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometric Primitive Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometricPrimitivePropertyType(GeometricPrimitivePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryArrayPropertyType(GeometryArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryPropertyType(GeometryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Envelope Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Envelope Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridEnvelopeType(GridEnvelopeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridFunctionType(GridFunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLengthType(GridLengthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Limits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Limits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridLimitsType(GridLimitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridType(GridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryPropertyType(HistoryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedObjectType(IdentifiedObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageCRSPropertyType(ImageCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageCRSType(ImageCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageDatumPropertyType(ImageDatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageDatumType(ImageDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indirect Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indirect Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndirectEntryType(IndirectEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlinePropertyType(InlinePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knot Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knot Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnotPropertyType(KnotPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnotType(KnotType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLengthType(LengthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearCSPropertyType(LinearCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearCSType(LinearCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRingPropertyType(LinearRingPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRingType(LinearRingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Segment Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Segment Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringSegmentArrayPropertyType(LineStringSegmentArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Segment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Segment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringSegmentType(LineStringSegmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineStringType(LineStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationPropertyType(LocationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingRuleType(MappingRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureListType(MeasureListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Or Nil Reason List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Or Nil Reason List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureOrNilReasonListType(MeasureOrNilReasonListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureType(MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Data Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Data Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaDataPropertyType(MetaDataPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moving Object Status Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moving Object Status Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovingObjectStatusType(MovingObjectStatusType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Curve Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Curve Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiCurvePropertyType(MultiCurvePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiCurveType(MultiCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Geometry Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Geometry Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiGeometryPropertyType(MultiGeometryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiGeometryType(MultiGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Point Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPointPropertyType(MultiPointPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPointType(MultiPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Solid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Solid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSolidPropertyType(MultiSolidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Solid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Solid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSolidType(MultiSolidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSurfacePropertyType(MultiSurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSurfaceType(MultiSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Or Edge Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Or Edge Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeOrEdgePropertyType(NodeOrEdgePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodePropertyType(NodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeType(NodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oblique Cartesian CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oblique Cartesian CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObliqueCartesianCSPropertyType(ObliqueCartesianCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oblique Cartesian CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oblique Cartesian CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObliqueCartesianCSType(ObliqueCartesianCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservationType(ObservationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Offset Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Offset Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOffsetCurveType(OffsetCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Method Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Method Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationMethodPropertyType(OperationMethodPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationMethodType(OperationMethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Group Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Group Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterGroupPropertyType(OperationParameterGroupPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterGroupType(OperationParameterGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterPropertyType(OperationParameterPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationParameterType(OperationParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationPropertyType(OperationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientable Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientable Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientableCurveType(OrientableCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orientable Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orientable Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrientableSurfaceType(OrientableSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueGroupType(ParameterValueGroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterValueType(ParameterValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pass Through Operation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pass Through Operation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassThroughOperationPropertyType(PassThroughOperationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pass Through Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pass Through Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassThroughOperationType(PassThroughOperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointArrayPropertyType(PointArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointPropertyType(PointPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointType(PointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polar CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polar CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolarCSPropertyType(PolarCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polar CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polar CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolarCSType(PolarCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Patch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Patch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonPatchType(PolygonPatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolygonType(PolygonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prime Meridian Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prime Meridian Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimeMeridianPropertyType(PrimeMeridianPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prime Meridian Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prime Meridian Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimeMeridianType(PrimeMeridianType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Location Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Location Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityLocationPropertyType(PriorityLocationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedurePropertyType(ProcedurePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projected CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projected CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectedCRSPropertyType(ProjectedCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projected CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projected CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectedCRSType(ProjectedCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Extent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Extent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityExtentType(QuantityExtentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityPropertyType(QuantityPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityType(QuantityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeSetType(RangeSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleType(RectangleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectified Grid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectified Grid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectifiedGridType(RectifiedGridType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Location Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Location Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefLocationType(RefLocationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedTimeType(RelatedTimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingPropertyType(RingPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingType(RingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowsType(RowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowType(RowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleType(ScaleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second Defining Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second Defining Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondDefiningParameterType(SecondDefiningParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second Defining Parameter Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second Defining Parameter Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondDefiningParameterType1(SecondDefiningParameterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second Defining Parameter Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second Defining Parameter Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondDefiningParameterType2(SecondDefiningParameterType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second Defining Parameter Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second Defining Parameter Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondDefiningParameterType3(SecondDefiningParameterType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceRuleType(SequenceRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShellPropertyType(ShellPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shell Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shell Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShellType(ShellType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleCRSPropertyType(SingleCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Operation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Operation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleOperationPropertyType(SingleOperationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidArrayPropertyType(SolidArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidPropertyType(SolidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidType(SolidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Speed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Speed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpeedType(SpeedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sphere Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sphere Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSphereType(SphereType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSphericalCSPropertyType(SphericalCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spherical CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spherical CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSphericalCSType(SphericalCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Or Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Or Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringOrRefType(StringOrRefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceArrayPropertyType(SurfaceArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Patch Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Patch Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfacePatchArrayPropertyType(SurfacePatchArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfacePropertyType(SurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurfaceType(SurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetPropertyType(TargetPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCRSPropertyType(TemporalCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCRSType(TemporalCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCSPropertyType(TemporalCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalCSType(TemporalCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Datum Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Datum Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDatumBaseType(TemporalDatumBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDatumPropertyType(TemporalDatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Temporal Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Temporal Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemporalDatumType(TemporalDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Calendar Era Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Calendar Era Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCalendarEraPropertyType(TimeCalendarEraPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Calendar Era Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Calendar Era Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCalendarEraType(TimeCalendarEraType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Calendar Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Calendar Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCalendarPropertyType(TimeCalendarPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Calendar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Calendar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCalendarType(TimeCalendarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Clock Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Clock Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeClockPropertyType(TimeClockPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Clock Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Clock Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeClockType(TimeClockType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Coordinate System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Coordinate System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCoordinateSystemType(TimeCoordinateSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCSPropertyType(TimeCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeCSType(TimeCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Edge Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Edge Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEdgePropertyType(TimeEdgePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeEdgeType(TimeEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Instant Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Instant Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInstantPropertyType(TimeInstantPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Instant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Instant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInstantType(TimeInstantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval Length Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval Length Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeIntervalLengthType(TimeIntervalLengthType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Node Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Node Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeNodePropertyType(TimeNodePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Node Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Node Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeNodeType(TimeNodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Ordinal Era Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Ordinal Era Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOrdinalEraPropertyType(TimeOrdinalEraPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Ordinal Era Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Ordinal Era Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOrdinalEraType(TimeOrdinalEraType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Ordinal Reference System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Ordinal Reference System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOrdinalReferenceSystemType(TimeOrdinalReferenceSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodPropertyType(TimePeriodPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Period Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePeriodType(TimePeriodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Position Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Position Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePositionType(TimePositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Primitive Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Primitive Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimePrimitivePropertyType(TimePrimitivePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Reference System Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Reference System Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeReferenceSystemType(TimeReferenceSystemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Topology Complex Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Topology Complex Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTopologyComplexPropertyType(TimeTopologyComplexPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Topology Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Topology Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTopologyComplexType(TimeTopologyComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Topology Primitive Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Topology Primitive Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTopologyPrimitivePropertyType(TimeTopologyPrimitivePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeType(TimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tin Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tin Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTinType(TinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Complex Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Complex Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoComplexPropertyType(TopoComplexPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Complex Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Complex Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoComplexType(TopoComplexType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Curve Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Curve Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoCurvePropertyType(TopoCurvePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Curve Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Curve Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoCurveType(TopoCurveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Point Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoPointPropertyType(TopoPointPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoPointType(TopoPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Primitive Array Association Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Primitive Array Association Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoPrimitiveArrayAssociationType(TopoPrimitiveArrayAssociationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Primitive Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Primitive Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoPrimitiveMemberType(TopoPrimitiveMemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Solid Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Solid Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoSolidPropertyType(TopoSolidPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Solid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Solid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoSolidType(TopoSolidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoSurfacePropertyType(TopoSurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoSurfaceType(TopoSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Volume Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Volume Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoVolumePropertyType(TopoVolumePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Topo Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Topo Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopoVolumeType(TopoVolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationPropertyType(TransformationPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationType(TransformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangleType(TriangleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitDefinitionType(UnitDefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Of Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Of Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitOfMeasureType(UnitOfMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedCSPropertyType(UserDefinedCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedCSType(UserDefinedCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Array Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Array Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueArrayPropertyType(ValueArrayPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Array Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Array Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueArrayType(ValueArrayType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePropertyType(ValuePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVectorType(VectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical CRS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical CRS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalCRSPropertyType(VerticalCRSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical CRS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical CRS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalCRSType(VerticalCRSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical CS Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical CS Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalCSPropertyType(VerticalCSPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical CS Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical CS Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalCSType(VerticalCSType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Datum Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Datum Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalDatumPropertyType(VerticalDatumPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Datum Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Datum Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalDatumType(VerticalDatumType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeType(VolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GMLSwitch
