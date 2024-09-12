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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.opengis.gml.gml.GMLPackage
 * @generated
 */
public class GMLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GMLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GMLSwitch<Adapter> modelSwitch =
		new GMLSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractContinuousCoverageType(AbstractContinuousCoverageType object) {
				return createAbstractContinuousCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateOperationType(AbstractCoordinateOperationType object) {
				return createAbstractCoordinateOperationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoordinateSystemType(AbstractCoordinateSystemType object) {
				return createAbstractCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCoverageType(AbstractCoverageType object) {
				return createAbstractCoverageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCRSType(AbstractCRSType object) {
				return createAbstractCRSTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveSegmentType(AbstractCurveSegmentType object) {
				return createAbstractCurveSegmentTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCurveType(AbstractCurveType object) {
				return createAbstractCurveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractDatumType(AbstractDatumType object) {
				return createAbstractDatumTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureCollectionType(AbstractFeatureCollectionType object) {
				return createAbstractFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureMemberType(AbstractFeatureMemberType object) {
				return createAbstractFeatureMemberTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureType(AbstractFeatureType object) {
				return createAbstractFeatureTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralConversionType(AbstractGeneralConversionType object) {
				return createAbstractGeneralConversionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralDerivedCRSType(AbstractGeneralDerivedCRSType object) {
				return createAbstractGeneralDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterPropertyType(AbstractGeneralOperationParameterPropertyType object) {
				return createAbstractGeneralOperationParameterPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralOperationParameterType(AbstractGeneralOperationParameterType object) {
				return createAbstractGeneralOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralParameterValuePropertyType(AbstractGeneralParameterValuePropertyType object) {
				return createAbstractGeneralParameterValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralParameterValueType(AbstractGeneralParameterValueType object) {
				return createAbstractGeneralParameterValueTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeneralTransformationType(AbstractGeneralTransformationType object) {
				return createAbstractGeneralTransformationTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricAggregateType(AbstractGeometricAggregateType object) {
				return createAbstractGeometricAggregateTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometricPrimitiveType(AbstractGeometricPrimitiveType object) {
				return createAbstractGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGeometryType(AbstractGeometryType object) {
				return createAbstractGeometryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGMLType(AbstractGMLType object) {
				return createAbstractGMLTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGriddedSurfaceType(AbstractGriddedSurfaceType object) {
				return createAbstractGriddedSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMemberType(AbstractMemberType object) {
				return createAbstractMemberTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetadataPropertyType(AbstractMetadataPropertyType object) {
				return createAbstractMetadataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractMetaDataType(AbstractMetaDataType object) {
				return createAbstractMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseAbstractParametricCurveSurfaceType(AbstractParametricCurveSurfaceType object) {
				return createAbstractParametricCurveSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingPropertyType(AbstractRingPropertyType object) {
				return createAbstractRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractRingType(AbstractRingType object) {
				return createAbstractRingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSolidType(AbstractSolidType object) {
				return createAbstractSolidTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfacePatchType(AbstractSurfacePatchType object) {
				return createAbstractSurfacePatchTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSurfaceType(AbstractSurfaceType object) {
				return createAbstractSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeComplexType(AbstractTimeComplexType object) {
				return createAbstractTimeComplexTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeGeometricPrimitiveType(AbstractTimeGeometricPrimitiveType object) {
				return createAbstractTimeGeometricPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeObjectType(AbstractTimeObjectType object) {
				return createAbstractTimeObjectTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimePrimitiveType(AbstractTimePrimitiveType object) {
				return createAbstractTimePrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeSliceType(AbstractTimeSliceType object) {
				return createAbstractTimeSliceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTimeTopologyPrimitiveType(AbstractTimeTopologyPrimitiveType object) {
				return createAbstractTimeTopologyPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopologyType(AbstractTopologyType object) {
				return createAbstractTopologyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTopoPrimitiveType(AbstractTopoPrimitiveType object) {
				return createAbstractTopoPrimitiveTypeAdapter();
			}
			@Override
			public Adapter caseAffineCSPropertyType(AffineCSPropertyType object) {
				return createAffineCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAffineCSType(AffineCSType object) {
				return createAffineCSTypeAdapter();
			}
			@Override
			public Adapter caseAffinePlacementType(AffinePlacementType object) {
				return createAffinePlacementTypeAdapter();
			}
			@Override
			public Adapter caseAngleChoiceType(AngleChoiceType object) {
				return createAngleChoiceTypeAdapter();
			}
			@Override
			public Adapter caseAngleType(AngleType object) {
				return createAngleTypeAdapter();
			}
			@Override
			public Adapter caseArcByBulgeType(ArcByBulgeType object) {
				return createArcByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcByCenterPointType(ArcByCenterPointType object) {
				return createArcByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseArcStringByBulgeType(ArcStringByBulgeType object) {
				return createArcStringByBulgeTypeAdapter();
			}
			@Override
			public Adapter caseArcStringType(ArcStringType object) {
				return createArcStringTypeAdapter();
			}
			@Override
			public Adapter caseArcType(ArcType object) {
				return createArcTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseArrayAssociationType(ArrayAssociationType object) {
				return createArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseArrayType(ArrayType object) {
				return createArrayTypeAdapter();
			}
			@Override
			public Adapter caseAssociationRoleType(AssociationRoleType object) {
				return createAssociationRoleTypeAdapter();
			}
			@Override
			public Adapter caseBagType(BagType object) {
				return createBagTypeAdapter();
			}
			@Override
			public Adapter caseBaseUnitType(BaseUnitType object) {
				return createBaseUnitTypeAdapter();
			}
			@Override
			public Adapter caseBezierType(BezierType object) {
				return createBezierTypeAdapter();
			}
			@Override
			public Adapter caseBooleanPropertyType(BooleanPropertyType object) {
				return createBooleanPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBooleanType(BooleanType object) {
				return createBooleanTypeAdapter();
			}
			@Override
			public Adapter caseBoundedFeatureType(BoundedFeatureType object) {
				return createBoundedFeatureTypeAdapter();
			}
			@Override
			public Adapter caseBoundingShapeType(BoundingShapeType object) {
				return createBoundingShapeTypeAdapter();
			}
			@Override
			public Adapter caseBSplineType(BSplineType object) {
				return createBSplineTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSPropertyType(CartesianCSPropertyType object) {
				return createCartesianCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCartesianCSType(CartesianCSType object) {
				return createCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseCategoryExtentType(CategoryExtentType object) {
				return createCategoryExtentTypeAdapter();
			}
			@Override
			public Adapter caseCategoryPropertyType(CategoryPropertyType object) {
				return createCategoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCategoryType(CategoryType object) {
				return createCategoryTypeAdapter();
			}
			@Override
			public Adapter caseCircleByCenterPointType(CircleByCenterPointType object) {
				return createCircleByCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseCircleType(CircleType object) {
				return createCircleTypeAdapter();
			}
			@Override
			public Adapter caseClothoidType(ClothoidType object) {
				return createClothoidTypeAdapter();
			}
			@Override
			public Adapter caseCodeListType(CodeListType object) {
				return createCodeListTypeAdapter();
			}
			@Override
			public Adapter caseCodeOrNilReasonListType(CodeOrNilReasonListType object) {
				return createCodeOrNilReasonListTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseCodeWithAuthorityType(CodeWithAuthorityType object) {
				return createCodeWithAuthorityTypeAdapter();
			}
			@Override
			public Adapter caseCompositeCurveType(CompositeCurveType object) {
				return createCompositeCurveTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSolidType(CompositeSolidType object) {
				return createCompositeSolidTypeAdapter();
			}
			@Override
			public Adapter caseCompositeSurfaceType(CompositeSurfaceType object) {
				return createCompositeSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseCompositeValueType(CompositeValueType object) {
				return createCompositeValueTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSPropertyType(CompoundCRSPropertyType object) {
				return createCompoundCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompoundCRSType(CompoundCRSType object) {
				return createCompoundCRSTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationPropertyType(ConcatenatedOperationPropertyType object) {
				return createConcatenatedOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseConcatenatedOperationType(ConcatenatedOperationType object) {
				return createConcatenatedOperationTypeAdapter();
			}
			@Override
			public Adapter caseConeType(ConeType object) {
				return createConeTypeAdapter();
			}
			@Override
			public Adapter caseControlPointType(ControlPointType object) {
				return createControlPointTypeAdapter();
			}
			@Override
			public Adapter caseConventionalUnitType(ConventionalUnitType object) {
				return createConventionalUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionPropertyType(ConversionPropertyType object) {
				return createConversionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseConversionToPreferredUnitType(ConversionToPreferredUnitType object) {
				return createConversionToPreferredUnitTypeAdapter();
			}
			@Override
			public Adapter caseConversionType(ConversionType object) {
				return createConversionTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateOperationAccuracyType(CoordinateOperationAccuracyType object) {
				return createCoordinateOperationAccuracyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateOperationPropertyType(CoordinateOperationPropertyType object) {
				return createCoordinateOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinatesType(CoordinatesType object) {
				return createCoordinatesTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisPropertyType(CoordinateSystemAxisPropertyType object) {
				return createCoordinateSystemAxisPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemAxisType(CoordinateSystemAxisType object) {
				return createCoordinateSystemAxisTypeAdapter();
			}
			@Override
			public Adapter caseCoordinateSystemPropertyType(CoordinateSystemPropertyType object) {
				return createCoordinateSystemPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCountPropertyType(CountPropertyType object) {
				return createCountPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCountType(CountType object) {
				return createCountTypeAdapter();
			}
			@Override
			public Adapter caseCoverageFunctionType(CoverageFunctionType object) {
				return createCoverageFunctionTypeAdapter();
			}
			@Override
			public Adapter caseCRSPropertyType(CRSPropertyType object) {
				return createCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCubicSplineType(CubicSplineType object) {
				return createCubicSplineTypeAdapter();
			}
			@Override
			public Adapter caseCurveArrayPropertyType(CurveArrayPropertyType object) {
				return createCurveArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurvePropertyType(CurvePropertyType object) {
				return createCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveSegmentArrayPropertyType(CurveSegmentArrayPropertyType object) {
				return createCurveSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurveType(CurveType object) {
				return createCurveTypeAdapter();
			}
			@Override
			public Adapter caseCylinderType(CylinderType object) {
				return createCylinderTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSPropertyType(CylindricalCSPropertyType object) {
				return createCylindricalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCylindricalCSType(CylindricalCSType object) {
				return createCylindricalCSTypeAdapter();
			}
			@Override
			public Adapter caseDataBlockType(DataBlockType object) {
				return createDataBlockTypeAdapter();
			}
			@Override
			public Adapter caseDatumPropertyType(DatumPropertyType object) {
				return createDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionBaseType(DefinitionBaseType object) {
				return createDefinitionBaseTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionProxyType(DefinitionProxyType object) {
				return createDefinitionProxyTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionType(DefinitionType object) {
				return createDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDegreesType(DegreesType object) {
				return createDegreesTypeAdapter();
			}
			@Override
			public Adapter caseDerivationUnitTermType(DerivationUnitTermType object) {
				return createDerivationUnitTermTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSPropertyType(DerivedCRSPropertyType object) {
				return createDerivedCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDerivedCRSType(DerivedCRSType object) {
				return createDerivedCRSTypeAdapter();
			}
			@Override
			public Adapter caseDerivedUnitType(DerivedUnitType object) {
				return createDerivedUnitTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryEntryType(DictionaryEntryType object) {
				return createDictionaryEntryTypeAdapter();
			}
			@Override
			public Adapter caseDictionaryType(DictionaryType object) {
				return createDictionaryTypeAdapter();
			}
			@Override
			public Adapter caseDirectedEdgePropertyType(DirectedEdgePropertyType object) {
				return createDirectedEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedFacePropertyType(DirectedFacePropertyType object) {
				return createDirectedFacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedNodePropertyType(DirectedNodePropertyType object) {
				return createDirectedNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationAtDistanceType(DirectedObservationAtDistanceType object) {
				return createDirectedObservationAtDistanceTypeAdapter();
			}
			@Override
			public Adapter caseDirectedObservationType(DirectedObservationType object) {
				return createDirectedObservationTypeAdapter();
			}
			@Override
			public Adapter caseDirectedTopoSolidPropertyType(DirectedTopoSolidPropertyType object) {
				return createDirectedTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionDescriptionType(DirectionDescriptionType object) {
				return createDirectionDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDirectionPropertyType(DirectionPropertyType object) {
				return createDirectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDirectionVectorType(DirectionVectorType object) {
				return createDirectionVectorTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionListType(DirectPositionListType object) {
				return createDirectPositionListTypeAdapter();
			}
			@Override
			public Adapter caseDirectPositionType(DirectPositionType object) {
				return createDirectPositionTypeAdapter();
			}
			@Override
			public Adapter caseDiscreteCoverageType(DiscreteCoverageType object) {
				return createDiscreteCoverageTypeAdapter();
			}
			@Override
			public Adapter caseDMSAngleType(DMSAngleType object) {
				return createDMSAngleTypeAdapter();
			}
			@Override
			public Adapter caseGMLDocumentRoot(GMLDocumentRoot object) {
				return createGMLDocumentRootAdapter();
			}
			@Override
			public Adapter caseDomainOfValidityType(DomainOfValidityType object) {
				return createDomainOfValidityTypeAdapter();
			}
			@Override
			public Adapter caseDomainSetType(DomainSetType object) {
				return createDomainSetTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureCollectionType(DynamicFeatureCollectionType object) {
				return createDynamicFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureMemberType(DynamicFeatureMemberType object) {
				return createDynamicFeatureMemberTypeAdapter();
			}
			@Override
			public Adapter caseDynamicFeatureType(DynamicFeatureType object) {
				return createDynamicFeatureTypeAdapter();
			}
			@Override
			public Adapter caseEdgeType(EdgeType object) {
				return createEdgeTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSPropertyType(EllipsoidalCSPropertyType object) {
				return createEllipsoidalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidalCSType(EllipsoidalCSType object) {
				return createEllipsoidalCSTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidPropertyType(EllipsoidPropertyType object) {
				return createEllipsoidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEllipsoidType(EllipsoidType object) {
				return createEllipsoidTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSPropertyType(EngineeringCRSPropertyType object) {
				return createEngineeringCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringCRSType(EngineeringCRSType object) {
				return createEngineeringCRSTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumPropertyType(EngineeringDatumPropertyType object) {
				return createEngineeringDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEngineeringDatumType(EngineeringDatumType object) {
				return createEngineeringDatumTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeType(EnvelopeType object) {
				return createEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseEnvelopeWithTimePeriodType(EnvelopeWithTimePeriodType object) {
				return createEnvelopeWithTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseFaceOrTopoSolidPropertyType(FaceOrTopoSolidPropertyType object) {
				return createFaceOrTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFaceType(FaceType object) {
				return createFaceTypeAdapter();
			}
			@Override
			public Adapter caseFeatureArrayPropertyType(FeatureArrayPropertyType object) {
				return createFeatureArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureCollectionType(FeatureCollectionType object) {
				return createFeatureCollectionTypeAdapter();
			}
			@Override
			public Adapter caseFeaturePropertyType(FeaturePropertyType object) {
				return createFeaturePropertyTypeAdapter();
			}
			@Override
			public Adapter caseFileType(FileType object) {
				return createFileTypeAdapter();
			}
			@Override
			public Adapter caseFormulaCitationType(FormulaCitationType object) {
				return createFormulaCitationTypeAdapter();
			}
			@Override
			public Adapter caseFormulaType(FormulaType object) {
				return createFormulaTypeAdapter();
			}
			@Override
			public Adapter caseGeneralConversionPropertyType(GeneralConversionPropertyType object) {
				return createGeneralConversionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeneralTransformationPropertyType(GeneralTransformationPropertyType object) {
				return createGeneralTransformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGenericMetaDataType(GenericMetaDataType object) {
				return createGenericMetaDataTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSPropertyType(GeocentricCRSPropertyType object) {
				return createGeocentricCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeocentricCRSType(GeocentricCRSType object) {
				return createGeocentricCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicStringType(GeodesicStringType object) {
				return createGeodesicStringTypeAdapter();
			}
			@Override
			public Adapter caseGeodesicType(GeodesicType object) {
				return createGeodesicTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticCRSPropertyType(GeodeticCRSPropertyType object) {
				return createGeodeticCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticCRSType(GeodeticCRSType object) {
				return createGeodeticCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumPropertyType(GeodeticDatumPropertyType object) {
				return createGeodeticDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeodeticDatumType(GeodeticDatumType object) {
				return createGeodeticDatumTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSPropertyType(GeographicCRSPropertyType object) {
				return createGeographicCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeographicCRSType(GeographicCRSType object) {
				return createGeographicCRSTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexPropertyType(GeometricComplexPropertyType object) {
				return createGeometricComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometricComplexType(GeometricComplexType object) {
				return createGeometricComplexTypeAdapter();
			}
			@Override
			public Adapter caseGeometricPrimitivePropertyType(GeometricPrimitivePropertyType object) {
				return createGeometricPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryArrayPropertyType(GeometryArrayPropertyType object) {
				return createGeometryArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGeometryPropertyType(GeometryPropertyType object) {
				return createGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGridEnvelopeType(GridEnvelopeType object) {
				return createGridEnvelopeTypeAdapter();
			}
			@Override
			public Adapter caseGridFunctionType(GridFunctionType object) {
				return createGridFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGridLengthType(GridLengthType object) {
				return createGridLengthTypeAdapter();
			}
			@Override
			public Adapter caseGridLimitsType(GridLimitsType object) {
				return createGridLimitsTypeAdapter();
			}
			@Override
			public Adapter caseGridType(GridType object) {
				return createGridTypeAdapter();
			}
			@Override
			public Adapter caseHistoryPropertyType(HistoryPropertyType object) {
				return createHistoryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiedObjectType(IdentifiedObjectType object) {
				return createIdentifiedObjectTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSPropertyType(ImageCRSPropertyType object) {
				return createImageCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseImageCRSType(ImageCRSType object) {
				return createImageCRSTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumPropertyType(ImageDatumPropertyType object) {
				return createImageDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseImageDatumType(ImageDatumType object) {
				return createImageDatumTypeAdapter();
			}
			@Override
			public Adapter caseIndirectEntryType(IndirectEntryType object) {
				return createIndirectEntryTypeAdapter();
			}
			@Override
			public Adapter caseInlinePropertyType(InlinePropertyType object) {
				return createInlinePropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotPropertyType(KnotPropertyType object) {
				return createKnotPropertyTypeAdapter();
			}
			@Override
			public Adapter caseKnotType(KnotType object) {
				return createKnotTypeAdapter();
			}
			@Override
			public Adapter caseLengthType(LengthType object) {
				return createLengthTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSPropertyType(LinearCSPropertyType object) {
				return createLinearCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinearCSType(LinearCSType object) {
				return createLinearCSTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingPropertyType(LinearRingPropertyType object) {
				return createLinearRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinearRingType(LinearRingType object) {
				return createLinearRingTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentArrayPropertyType(LineStringSegmentArrayPropertyType object) {
				return createLineStringSegmentArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineStringSegmentType(LineStringSegmentType object) {
				return createLineStringSegmentTypeAdapter();
			}
			@Override
			public Adapter caseLineStringType(LineStringType object) {
				return createLineStringTypeAdapter();
			}
			@Override
			public Adapter caseLocationPropertyType(LocationPropertyType object) {
				return createLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMappingRuleType(MappingRuleType object) {
				return createMappingRuleTypeAdapter();
			}
			@Override
			public Adapter caseMeasureListType(MeasureListType object) {
				return createMeasureListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureOrNilReasonListType(MeasureOrNilReasonListType object) {
				return createMeasureOrNilReasonListTypeAdapter();
			}
			@Override
			public Adapter caseMeasureType(MeasureType object) {
				return createMeasureTypeAdapter();
			}
			@Override
			public Adapter caseMetaDataPropertyType(MetaDataPropertyType object) {
				return createMetaDataPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMovingObjectStatusType(MovingObjectStatusType object) {
				return createMovingObjectStatusTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurvePropertyType(MultiCurvePropertyType object) {
				return createMultiCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiCurveType(MultiCurveType object) {
				return createMultiCurveTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryPropertyType(MultiGeometryPropertyType object) {
				return createMultiGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiGeometryType(MultiGeometryType object) {
				return createMultiGeometryTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointPropertyType(MultiPointPropertyType object) {
				return createMultiPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiPointType(MultiPointType object) {
				return createMultiPointTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidPropertyType(MultiSolidPropertyType object) {
				return createMultiSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSolidType(MultiSolidType object) {
				return createMultiSolidTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfacePropertyType(MultiSurfacePropertyType object) {
				return createMultiSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMultiSurfaceType(MultiSurfaceType object) {
				return createMultiSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseNodeOrEdgePropertyType(NodeOrEdgePropertyType object) {
				return createNodeOrEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseNodePropertyType(NodePropertyType object) {
				return createNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseNodeType(NodeType object) {
				return createNodeTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSPropertyType(ObliqueCartesianCSPropertyType object) {
				return createObliqueCartesianCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseObliqueCartesianCSType(ObliqueCartesianCSType object) {
				return createObliqueCartesianCSTypeAdapter();
			}
			@Override
			public Adapter caseObservationType(ObservationType object) {
				return createObservationTypeAdapter();
			}
			@Override
			public Adapter caseOffsetCurveType(OffsetCurveType object) {
				return createOffsetCurveTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodPropertyType(OperationMethodPropertyType object) {
				return createOperationMethodPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationMethodType(OperationMethodType object) {
				return createOperationMethodTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupPropertyType(OperationParameterGroupPropertyType object) {
				return createOperationParameterGroupPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterGroupType(OperationParameterGroupType object) {
				return createOperationParameterGroupTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterPropertyType(OperationParameterPropertyType object) {
				return createOperationParameterPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationParameterType(OperationParameterType object) {
				return createOperationParameterTypeAdapter();
			}
			@Override
			public Adapter caseOperationPropertyType(OperationPropertyType object) {
				return createOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOrientableCurveType(OrientableCurveType object) {
				return createOrientableCurveTypeAdapter();
			}
			@Override
			public Adapter caseOrientableSurfaceType(OrientableSurfaceType object) {
				return createOrientableSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueGroupType(ParameterValueGroupType object) {
				return createParameterValueGroupTypeAdapter();
			}
			@Override
			public Adapter caseParameterValueType(ParameterValueType object) {
				return createParameterValueTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationPropertyType(PassThroughOperationPropertyType object) {
				return createPassThroughOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter casePassThroughOperationType(PassThroughOperationType object) {
				return createPassThroughOperationTypeAdapter();
			}
			@Override
			public Adapter casePointArrayPropertyType(PointArrayPropertyType object) {
				return createPointArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointPropertyType(PointPropertyType object) {
				return createPointPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointType(PointType object) {
				return createPointTypeAdapter();
			}
			@Override
			public Adapter casePolarCSPropertyType(PolarCSPropertyType object) {
				return createPolarCSPropertyTypeAdapter();
			}
			@Override
			public Adapter casePolarCSType(PolarCSType object) {
				return createPolarCSTypeAdapter();
			}
			@Override
			public Adapter casePolygonPatchType(PolygonPatchType object) {
				return createPolygonPatchTypeAdapter();
			}
			@Override
			public Adapter casePolygonType(PolygonType object) {
				return createPolygonTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianPropertyType(PrimeMeridianPropertyType object) {
				return createPrimeMeridianPropertyTypeAdapter();
			}
			@Override
			public Adapter casePrimeMeridianType(PrimeMeridianType object) {
				return createPrimeMeridianTypeAdapter();
			}
			@Override
			public Adapter casePriorityLocationPropertyType(PriorityLocationPropertyType object) {
				return createPriorityLocationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProcedurePropertyType(ProcedurePropertyType object) {
				return createProcedurePropertyTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSPropertyType(ProjectedCRSPropertyType object) {
				return createProjectedCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProjectedCRSType(ProjectedCRSType object) {
				return createProjectedCRSTypeAdapter();
			}
			@Override
			public Adapter caseQuantityExtentType(QuantityExtentType object) {
				return createQuantityExtentTypeAdapter();
			}
			@Override
			public Adapter caseQuantityPropertyType(QuantityPropertyType object) {
				return createQuantityPropertyTypeAdapter();
			}
			@Override
			public Adapter caseQuantityType(QuantityType object) {
				return createQuantityTypeAdapter();
			}
			@Override
			public Adapter caseRangeSetType(RangeSetType object) {
				return createRangeSetTypeAdapter();
			}
			@Override
			public Adapter caseRectangleType(RectangleType object) {
				return createRectangleTypeAdapter();
			}
			@Override
			public Adapter caseRectifiedGridType(RectifiedGridType object) {
				return createRectifiedGridTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRefLocationType(RefLocationType object) {
				return createRefLocationTypeAdapter();
			}
			@Override
			public Adapter caseRelatedTimeType(RelatedTimeType object) {
				return createRelatedTimeTypeAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseRingPropertyType(RingPropertyType object) {
				return createRingPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRingType(RingType object) {
				return createRingTypeAdapter();
			}
			@Override
			public Adapter caseRowsType(RowsType object) {
				return createRowsTypeAdapter();
			}
			@Override
			public Adapter caseRowType(RowType object) {
				return createRowTypeAdapter();
			}
			@Override
			public Adapter caseScaleType(ScaleType object) {
				return createScaleTypeAdapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType(SecondDefiningParameterType object) {
				return createSecondDefiningParameterTypeAdapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType1(SecondDefiningParameterType1 object) {
				return createSecondDefiningParameterType1Adapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType2(SecondDefiningParameterType2 object) {
				return createSecondDefiningParameterType2Adapter();
			}
			@Override
			public Adapter caseSecondDefiningParameterType3(SecondDefiningParameterType3 object) {
				return createSecondDefiningParameterType3Adapter();
			}
			@Override
			public Adapter caseSequenceRuleType(SequenceRuleType object) {
				return createSequenceRuleTypeAdapter();
			}
			@Override
			public Adapter caseShellPropertyType(ShellPropertyType object) {
				return createShellPropertyTypeAdapter();
			}
			@Override
			public Adapter caseShellType(ShellType object) {
				return createShellTypeAdapter();
			}
			@Override
			public Adapter caseSingleCRSPropertyType(SingleCRSPropertyType object) {
				return createSingleCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSingleOperationPropertyType(SingleOperationPropertyType object) {
				return createSingleOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidArrayPropertyType(SolidArrayPropertyType object) {
				return createSolidArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidPropertyType(SolidPropertyType object) {
				return createSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidType(SolidType object) {
				return createSolidTypeAdapter();
			}
			@Override
			public Adapter caseSpeedType(SpeedType object) {
				return createSpeedTypeAdapter();
			}
			@Override
			public Adapter caseSphereType(SphereType object) {
				return createSphereTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSPropertyType(SphericalCSPropertyType object) {
				return createSphericalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSphericalCSType(SphericalCSType object) {
				return createSphericalCSTypeAdapter();
			}
			@Override
			public Adapter caseStringOrRefType(StringOrRefType object) {
				return createStringOrRefTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceArrayPropertyType(SurfaceArrayPropertyType object) {
				return createSurfaceArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePatchArrayPropertyType(SurfacePatchArrayPropertyType object) {
				return createSurfacePatchArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfacePropertyType(SurfacePropertyType object) {
				return createSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSurfaceType(SurfaceType object) {
				return createSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseTargetPropertyType(TargetPropertyType object) {
				return createTargetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSPropertyType(TemporalCRSPropertyType object) {
				return createTemporalCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCRSType(TemporalCRSType object) {
				return createTemporalCRSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSPropertyType(TemporalCSPropertyType object) {
				return createTemporalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalCSType(TemporalCSType object) {
				return createTemporalCSTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumBaseType(TemporalDatumBaseType object) {
				return createTemporalDatumBaseTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumPropertyType(TemporalDatumPropertyType object) {
				return createTemporalDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTemporalDatumType(TemporalDatumType object) {
				return createTemporalDatumTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraPropertyType(TimeCalendarEraPropertyType object) {
				return createTimeCalendarEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarEraType(TimeCalendarEraType object) {
				return createTimeCalendarEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarPropertyType(TimeCalendarPropertyType object) {
				return createTimeCalendarPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCalendarType(TimeCalendarType object) {
				return createTimeCalendarTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockPropertyType(TimeClockPropertyType object) {
				return createTimeClockPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeClockType(TimeClockType object) {
				return createTimeClockTypeAdapter();
			}
			@Override
			public Adapter caseTimeCoordinateSystemType(TimeCoordinateSystemType object) {
				return createTimeCoordinateSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimeCSPropertyType(TimeCSPropertyType object) {
				return createTimeCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeCSType(TimeCSType object) {
				return createTimeCSTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgePropertyType(TimeEdgePropertyType object) {
				return createTimeEdgePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeEdgeType(TimeEdgeType object) {
				return createTimeEdgeTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantPropertyType(TimeInstantPropertyType object) {
				return createTimeInstantPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeInstantType(TimeInstantType object) {
				return createTimeInstantTypeAdapter();
			}
			@Override
			public Adapter caseTimeIntervalLengthType(TimeIntervalLengthType object) {
				return createTimeIntervalLengthTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodePropertyType(TimeNodePropertyType object) {
				return createTimeNodePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeNodeType(TimeNodeType object) {
				return createTimeNodeTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraPropertyType(TimeOrdinalEraPropertyType object) {
				return createTimeOrdinalEraPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalEraType(TimeOrdinalEraType object) {
				return createTimeOrdinalEraTypeAdapter();
			}
			@Override
			public Adapter caseTimeOrdinalReferenceSystemType(TimeOrdinalReferenceSystemType object) {
				return createTimeOrdinalReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodPropertyType(TimePeriodPropertyType object) {
				return createTimePeriodPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimePeriodType(TimePeriodType object) {
				return createTimePeriodTypeAdapter();
			}
			@Override
			public Adapter caseTimePositionType(TimePositionType object) {
				return createTimePositionTypeAdapter();
			}
			@Override
			public Adapter caseTimePrimitivePropertyType(TimePrimitivePropertyType object) {
				return createTimePrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeReferenceSystemType(TimeReferenceSystemType object) {
				return createTimeReferenceSystemTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexPropertyType(TimeTopologyComplexPropertyType object) {
				return createTimeTopologyComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyComplexType(TimeTopologyComplexType object) {
				return createTimeTopologyComplexTypeAdapter();
			}
			@Override
			public Adapter caseTimeTopologyPrimitivePropertyType(TimeTopologyPrimitivePropertyType object) {
				return createTimeTopologyPrimitivePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTinType(TinType object) {
				return createTinTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexPropertyType(TopoComplexPropertyType object) {
				return createTopoComplexPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoComplexType(TopoComplexType object) {
				return createTopoComplexTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurvePropertyType(TopoCurvePropertyType object) {
				return createTopoCurvePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoCurveType(TopoCurveType object) {
				return createTopoCurveTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointPropertyType(TopoPointPropertyType object) {
				return createTopoPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoPointType(TopoPointType object) {
				return createTopoPointTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveArrayAssociationType(TopoPrimitiveArrayAssociationType object) {
				return createTopoPrimitiveArrayAssociationTypeAdapter();
			}
			@Override
			public Adapter caseTopoPrimitiveMemberType(TopoPrimitiveMemberType object) {
				return createTopoPrimitiveMemberTypeAdapter();
			}
			@Override
			public Adapter caseTopoSolidPropertyType(TopoSolidPropertyType object) {
				return createTopoSolidPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoSolidType(TopoSolidType object) {
				return createTopoSolidTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfacePropertyType(TopoSurfacePropertyType object) {
				return createTopoSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoSurfaceType(TopoSurfaceType object) {
				return createTopoSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumePropertyType(TopoVolumePropertyType object) {
				return createTopoVolumePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTopoVolumeType(TopoVolumeType object) {
				return createTopoVolumeTypeAdapter();
			}
			@Override
			public Adapter caseTransformationPropertyType(TransformationPropertyType object) {
				return createTransformationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTransformationType(TransformationType object) {
				return createTransformationTypeAdapter();
			}
			@Override
			public Adapter caseTriangleType(TriangleType object) {
				return createTriangleTypeAdapter();
			}
			@Override
			public Adapter caseUnitDefinitionType(UnitDefinitionType object) {
				return createUnitDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseUnitOfMeasureType(UnitOfMeasureType object) {
				return createUnitOfMeasureTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSPropertyType(UserDefinedCSPropertyType object) {
				return createUserDefinedCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseUserDefinedCSType(UserDefinedCSType object) {
				return createUserDefinedCSTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayPropertyType(ValueArrayPropertyType object) {
				return createValueArrayPropertyTypeAdapter();
			}
			@Override
			public Adapter caseValueArrayType(ValueArrayType object) {
				return createValueArrayTypeAdapter();
			}
			@Override
			public Adapter caseValuePropertyType(ValuePropertyType object) {
				return createValuePropertyTypeAdapter();
			}
			@Override
			public Adapter caseVectorType(VectorType object) {
				return createVectorTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSPropertyType(VerticalCRSPropertyType object) {
				return createVerticalCRSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCRSType(VerticalCRSType object) {
				return createVerticalCRSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSPropertyType(VerticalCSPropertyType object) {
				return createVerticalCSPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalCSType(VerticalCSType object) {
				return createVerticalCSTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumPropertyType(VerticalDatumPropertyType object) {
				return createVerticalDatumPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVerticalDatumType(VerticalDatumType object) {
				return createVerticalDatumTypeAdapter();
			}
			@Override
			public Adapter caseVolumeType(VolumeType object) {
				return createVolumeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractContinuousCoverageType <em>Abstract Continuous Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractContinuousCoverageType
	 * @generated
	 */
	public Adapter createAbstractContinuousCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCoordinateOperationType <em>Abstract Coordinate Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCoordinateOperationType
	 * @generated
	 */
	public Adapter createAbstractCoordinateOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCoordinateSystemType <em>Abstract Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCoordinateSystemType
	 * @generated
	 */
	public Adapter createAbstractCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCoverageType <em>Abstract Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCoverageType
	 * @generated
	 */
	public Adapter createAbstractCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCRSType <em>Abstract CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCRSType
	 * @generated
	 */
	public Adapter createAbstractCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCurveSegmentType <em>Abstract Curve Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCurveSegmentType
	 * @generated
	 */
	public Adapter createAbstractCurveSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractCurveType <em>Abstract Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractCurveType
	 * @generated
	 */
	public Adapter createAbstractCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractDatumType <em>Abstract Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractDatumType
	 * @generated
	 */
	public Adapter createAbstractDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractFeatureCollectionType <em>Abstract Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractFeatureCollectionType
	 * @generated
	 */
	public Adapter createAbstractFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractFeatureMemberType <em>Abstract Feature Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractFeatureMemberType
	 * @generated
	 */
	public Adapter createAbstractFeatureMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractFeatureType
	 * @generated
	 */
	public Adapter createAbstractFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralConversionType <em>Abstract General Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralConversionType
	 * @generated
	 */
	public Adapter createAbstractGeneralConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralDerivedCRSType <em>Abstract General Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralDerivedCRSType
	 * @generated
	 */
	public Adapter createAbstractGeneralDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType <em>Abstract General Operation Parameter Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralOperationParameterType <em>Abstract General Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralOperationParameterType
	 * @generated
	 */
	public Adapter createAbstractGeneralOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType <em>Abstract General Parameter Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralParameterValuePropertyType
	 * @generated
	 */
	public Adapter createAbstractGeneralParameterValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralParameterValueType <em>Abstract General Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralParameterValueType
	 * @generated
	 */
	public Adapter createAbstractGeneralParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeneralTransformationType <em>Abstract General Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeneralTransformationType
	 * @generated
	 */
	public Adapter createAbstractGeneralTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeometricAggregateType <em>Abstract Geometric Aggregate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeometricAggregateType
	 * @generated
	 */
	public Adapter createAbstractGeometricAggregateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeometricPrimitiveType <em>Abstract Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGeometryType <em>Abstract Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGeometryType
	 * @generated
	 */
	public Adapter createAbstractGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGMLType <em>Abstract GML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGMLType
	 * @generated
	 */
	public Adapter createAbstractGMLTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractGriddedSurfaceType <em>Abstract Gridded Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractGriddedSurfaceType
	 * @generated
	 */
	public Adapter createAbstractGriddedSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractMemberType <em>Abstract Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractMemberType
	 * @generated
	 */
	public Adapter createAbstractMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractMetadataPropertyType <em>Abstract Metadata Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractMetadataPropertyType
	 * @generated
	 */
	public Adapter createAbstractMetadataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractMetaDataType <em>Abstract Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractMetaDataType
	 * @generated
	 */
	public Adapter createAbstractMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractParametricCurveSurfaceType <em>Abstract Parametric Curve Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractParametricCurveSurfaceType
	 * @generated
	 */
	public Adapter createAbstractParametricCurveSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractRingPropertyType <em>Abstract Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractRingPropertyType
	 * @generated
	 */
	public Adapter createAbstractRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractRingType <em>Abstract Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractRingType
	 * @generated
	 */
	public Adapter createAbstractRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractSolidType <em>Abstract Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractSolidType
	 * @generated
	 */
	public Adapter createAbstractSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractSurfacePatchType <em>Abstract Surface Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractSurfacePatchType
	 * @generated
	 */
	public Adapter createAbstractSurfacePatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractSurfaceType <em>Abstract Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractSurfaceType
	 * @generated
	 */
	public Adapter createAbstractSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimeComplexType <em>Abstract Time Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimeComplexType
	 * @generated
	 */
	public Adapter createAbstractTimeComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimeGeometricPrimitiveType <em>Abstract Time Geometric Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimeGeometricPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeGeometricPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimeObjectType <em>Abstract Time Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimeObjectType
	 * @generated
	 */
	public Adapter createAbstractTimeObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimePrimitiveType <em>Abstract Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimePrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimePrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimeSliceType <em>Abstract Time Slice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimeSliceType
	 * @generated
	 */
	public Adapter createAbstractTimeSliceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType <em>Abstract Time Topology Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTimeTopologyPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTimeTopologyPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTopologyType <em>Abstract Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTopologyType
	 * @generated
	 */
	public Adapter createAbstractTopologyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AbstractTopoPrimitiveType <em>Abstract Topo Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AbstractTopoPrimitiveType
	 * @generated
	 */
	public Adapter createAbstractTopoPrimitiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AffineCSPropertyType <em>Affine CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AffineCSPropertyType
	 * @generated
	 */
	public Adapter createAffineCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AffineCSType <em>Affine CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AffineCSType
	 * @generated
	 */
	public Adapter createAffineCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AffinePlacementType <em>Affine Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AffinePlacementType
	 * @generated
	 */
	public Adapter createAffinePlacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AngleChoiceType <em>Angle Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AngleChoiceType
	 * @generated
	 */
	public Adapter createAngleChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AngleType <em>Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AngleType
	 * @generated
	 */
	public Adapter createAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArcByBulgeType <em>Arc By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArcByBulgeType
	 * @generated
	 */
	public Adapter createArcByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArcByCenterPointType <em>Arc By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArcByCenterPointType
	 * @generated
	 */
	public Adapter createArcByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArcStringByBulgeType <em>Arc String By Bulge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArcStringByBulgeType
	 * @generated
	 */
	public Adapter createArcStringByBulgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArcStringType <em>Arc String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArcStringType
	 * @generated
	 */
	public Adapter createArcStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArcType <em>Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArcType
	 * @generated
	 */
	public Adapter createArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArrayAssociationType <em>Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArrayAssociationType
	 * @generated
	 */
	public Adapter createArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ArrayType <em>Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ArrayType
	 * @generated
	 */
	public Adapter createArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.AssociationRoleType <em>Association Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.AssociationRoleType
	 * @generated
	 */
	public Adapter createAssociationRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BagType
	 * @generated
	 */
	public Adapter createBagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BaseUnitType <em>Base Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BaseUnitType
	 * @generated
	 */
	public Adapter createBaseUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BezierType <em>Bezier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BezierType
	 * @generated
	 */
	public Adapter createBezierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BooleanPropertyType <em>Boolean Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BooleanPropertyType
	 * @generated
	 */
	public Adapter createBooleanPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BooleanType
	 * @generated
	 */
	public Adapter createBooleanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BoundedFeatureType <em>Bounded Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BoundedFeatureType
	 * @generated
	 */
	public Adapter createBoundedFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BoundingShapeType <em>Bounding Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BoundingShapeType
	 * @generated
	 */
	public Adapter createBoundingShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.BSplineType <em>BSpline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.BSplineType
	 * @generated
	 */
	public Adapter createBSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CartesianCSPropertyType <em>Cartesian CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CartesianCSPropertyType
	 * @generated
	 */
	public Adapter createCartesianCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CartesianCSType <em>Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CartesianCSType
	 * @generated
	 */
	public Adapter createCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CategoryExtentType <em>Category Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CategoryExtentType
	 * @generated
	 */
	public Adapter createCategoryExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CategoryPropertyType <em>Category Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CategoryPropertyType
	 * @generated
	 */
	public Adapter createCategoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CategoryType <em>Category Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CategoryType
	 * @generated
	 */
	public Adapter createCategoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CircleByCenterPointType <em>Circle By Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CircleByCenterPointType
	 * @generated
	 */
	public Adapter createCircleByCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CircleType <em>Circle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CircleType
	 * @generated
	 */
	public Adapter createCircleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ClothoidType <em>Clothoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ClothoidType
	 * @generated
	 */
	public Adapter createClothoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CodeListType <em>Code List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CodeListType
	 * @generated
	 */
	public Adapter createCodeListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CodeOrNilReasonListType <em>Code Or Nil Reason List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CodeOrNilReasonListType
	 * @generated
	 */
	public Adapter createCodeOrNilReasonListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CodeWithAuthorityType <em>Code With Authority Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CodeWithAuthorityType
	 * @generated
	 */
	public Adapter createCodeWithAuthorityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompositeCurveType <em>Composite Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompositeCurveType
	 * @generated
	 */
	public Adapter createCompositeCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompositeSolidType <em>Composite Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompositeSolidType
	 * @generated
	 */
	public Adapter createCompositeSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompositeSurfaceType <em>Composite Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompositeSurfaceType
	 * @generated
	 */
	public Adapter createCompositeSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompositeValueType <em>Composite Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompositeValueType
	 * @generated
	 */
	public Adapter createCompositeValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompoundCRSPropertyType <em>Compound CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompoundCRSPropertyType
	 * @generated
	 */
	public Adapter createCompoundCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CompoundCRSType <em>Compound CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CompoundCRSType
	 * @generated
	 */
	public Adapter createCompoundCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConcatenatedOperationPropertyType <em>Concatenated Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConcatenatedOperationPropertyType
	 * @generated
	 */
	public Adapter createConcatenatedOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConcatenatedOperationType <em>Concatenated Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConcatenatedOperationType
	 * @generated
	 */
	public Adapter createConcatenatedOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConeType <em>Cone Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConeType
	 * @generated
	 */
	public Adapter createConeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ControlPointType <em>Control Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ControlPointType
	 * @generated
	 */
	public Adapter createControlPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConventionalUnitType <em>Conventional Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConventionalUnitType
	 * @generated
	 */
	public Adapter createConventionalUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConversionPropertyType <em>Conversion Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConversionPropertyType
	 * @generated
	 */
	public Adapter createConversionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConversionToPreferredUnitType <em>Conversion To Preferred Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConversionToPreferredUnitType
	 * @generated
	 */
	public Adapter createConversionToPreferredUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ConversionType <em>Conversion Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ConversionType
	 * @generated
	 */
	public Adapter createConversionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinateOperationAccuracyType <em>Coordinate Operation Accuracy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinateOperationAccuracyType
	 * @generated
	 */
	public Adapter createCoordinateOperationAccuracyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinateOperationPropertyType <em>Coordinate Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinateOperationPropertyType
	 * @generated
	 */
	public Adapter createCoordinateOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinatesType <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinatesType
	 * @generated
	 */
	public Adapter createCoordinatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinateSystemAxisPropertyType <em>Coordinate System Axis Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinateSystemAxisPropertyType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinateSystemAxisType <em>Coordinate System Axis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinateSystemAxisType
	 * @generated
	 */
	public Adapter createCoordinateSystemAxisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoordinateSystemPropertyType <em>Coordinate System Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoordinateSystemPropertyType
	 * @generated
	 */
	public Adapter createCoordinateSystemPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CountPropertyType <em>Count Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CountPropertyType
	 * @generated
	 */
	public Adapter createCountPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CountType <em>Count Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CountType
	 * @generated
	 */
	public Adapter createCountTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CoverageFunctionType <em>Coverage Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CoverageFunctionType
	 * @generated
	 */
	public Adapter createCoverageFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CRSPropertyType <em>CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CRSPropertyType
	 * @generated
	 */
	public Adapter createCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CubicSplineType <em>Cubic Spline Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CubicSplineType
	 * @generated
	 */
	public Adapter createCubicSplineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CurveArrayPropertyType <em>Curve Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CurveArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CurvePropertyType <em>Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CurvePropertyType
	 * @generated
	 */
	public Adapter createCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CurveSegmentArrayPropertyType <em>Curve Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CurveSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createCurveSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CurveType <em>Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CurveType
	 * @generated
	 */
	public Adapter createCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CylinderType <em>Cylinder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CylinderType
	 * @generated
	 */
	public Adapter createCylinderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CylindricalCSPropertyType <em>Cylindrical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CylindricalCSPropertyType
	 * @generated
	 */
	public Adapter createCylindricalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.CylindricalCSType <em>Cylindrical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.CylindricalCSType
	 * @generated
	 */
	public Adapter createCylindricalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DataBlockType <em>Data Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DataBlockType
	 * @generated
	 */
	public Adapter createDataBlockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DatumPropertyType <em>Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DatumPropertyType
	 * @generated
	 */
	public Adapter createDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DefinitionBaseType <em>Definition Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DefinitionBaseType
	 * @generated
	 */
	public Adapter createDefinitionBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DefinitionProxyType <em>Definition Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DefinitionProxyType
	 * @generated
	 */
	public Adapter createDefinitionProxyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DegreesType <em>Degrees Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DegreesType
	 * @generated
	 */
	public Adapter createDegreesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DerivationUnitTermType <em>Derivation Unit Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DerivationUnitTermType
	 * @generated
	 */
	public Adapter createDerivationUnitTermTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DerivedCRSPropertyType <em>Derived CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DerivedCRSPropertyType
	 * @generated
	 */
	public Adapter createDerivedCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DerivedCRSType <em>Derived CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DerivedCRSType
	 * @generated
	 */
	public Adapter createDerivedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DerivedUnitType <em>Derived Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DerivedUnitType
	 * @generated
	 */
	public Adapter createDerivedUnitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DictionaryEntryType <em>Dictionary Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DictionaryEntryType
	 * @generated
	 */
	public Adapter createDictionaryEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DictionaryType <em>Dictionary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DictionaryType
	 * @generated
	 */
	public Adapter createDictionaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedEdgePropertyType <em>Directed Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedEdgePropertyType
	 * @generated
	 */
	public Adapter createDirectedEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedFacePropertyType <em>Directed Face Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedFacePropertyType
	 * @generated
	 */
	public Adapter createDirectedFacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedNodePropertyType <em>Directed Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedNodePropertyType
	 * @generated
	 */
	public Adapter createDirectedNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedObservationAtDistanceType <em>Directed Observation At Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedObservationAtDistanceType
	 * @generated
	 */
	public Adapter createDirectedObservationAtDistanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedObservationType <em>Directed Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedObservationType
	 * @generated
	 */
	public Adapter createDirectedObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectedTopoSolidPropertyType <em>Directed Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectedTopoSolidPropertyType
	 * @generated
	 */
	public Adapter createDirectedTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectionDescriptionType <em>Direction Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectionDescriptionType
	 * @generated
	 */
	public Adapter createDirectionDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectionPropertyType <em>Direction Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectionPropertyType
	 * @generated
	 */
	public Adapter createDirectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectionVectorType <em>Direction Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectionVectorType
	 * @generated
	 */
	public Adapter createDirectionVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectPositionListType <em>Direct Position List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectPositionListType
	 * @generated
	 */
	public Adapter createDirectPositionListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DirectPositionType <em>Direct Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DirectPositionType
	 * @generated
	 */
	public Adapter createDirectPositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DiscreteCoverageType <em>Discrete Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DiscreteCoverageType
	 * @generated
	 */
	public Adapter createDiscreteCoverageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DMSAngleType <em>DMS Angle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DMSAngleType
	 * @generated
	 */
	public Adapter createDMSAngleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GMLDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GMLDocumentRoot
	 * @generated
	 */
	public Adapter createGMLDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DomainOfValidityType <em>Domain Of Validity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DomainOfValidityType
	 * @generated
	 */
	public Adapter createDomainOfValidityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DomainSetType <em>Domain Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DomainSetType
	 * @generated
	 */
	public Adapter createDomainSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DynamicFeatureCollectionType <em>Dynamic Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DynamicFeatureCollectionType
	 * @generated
	 */
	public Adapter createDynamicFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DynamicFeatureMemberType <em>Dynamic Feature Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DynamicFeatureMemberType
	 * @generated
	 */
	public Adapter createDynamicFeatureMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.DynamicFeatureType <em>Dynamic Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.DynamicFeatureType
	 * @generated
	 */
	public Adapter createDynamicFeatureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EdgeType <em>Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EdgeType
	 * @generated
	 */
	public Adapter createEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EllipsoidalCSPropertyType <em>Ellipsoidal CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EllipsoidalCSPropertyType
	 * @generated
	 */
	public Adapter createEllipsoidalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EllipsoidalCSType <em>Ellipsoidal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EllipsoidalCSType
	 * @generated
	 */
	public Adapter createEllipsoidalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EllipsoidPropertyType <em>Ellipsoid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EllipsoidPropertyType
	 * @generated
	 */
	public Adapter createEllipsoidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EllipsoidType <em>Ellipsoid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EllipsoidType
	 * @generated
	 */
	public Adapter createEllipsoidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EngineeringCRSPropertyType <em>Engineering CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EngineeringCRSPropertyType
	 * @generated
	 */
	public Adapter createEngineeringCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EngineeringCRSType <em>Engineering CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EngineeringCRSType
	 * @generated
	 */
	public Adapter createEngineeringCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EngineeringDatumPropertyType <em>Engineering Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EngineeringDatumPropertyType
	 * @generated
	 */
	public Adapter createEngineeringDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EngineeringDatumType <em>Engineering Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EngineeringDatumType
	 * @generated
	 */
	public Adapter createEngineeringDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EnvelopeType <em>Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EnvelopeType
	 * @generated
	 */
	public Adapter createEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.EnvelopeWithTimePeriodType <em>Envelope With Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.EnvelopeWithTimePeriodType
	 * @generated
	 */
	public Adapter createEnvelopeWithTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FaceOrTopoSolidPropertyType <em>Face Or Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FaceOrTopoSolidPropertyType
	 * @generated
	 */
	public Adapter createFaceOrTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FaceType <em>Face Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FaceType
	 * @generated
	 */
	public Adapter createFaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FeatureArrayPropertyType <em>Feature Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FeatureArrayPropertyType
	 * @generated
	 */
	public Adapter createFeatureArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FeatureCollectionType <em>Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FeatureCollectionType
	 * @generated
	 */
	public Adapter createFeatureCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FeaturePropertyType <em>Feature Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FeaturePropertyType
	 * @generated
	 */
	public Adapter createFeaturePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FileType
	 * @generated
	 */
	public Adapter createFileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FormulaCitationType <em>Formula Citation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FormulaCitationType
	 * @generated
	 */
	public Adapter createFormulaCitationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.FormulaType <em>Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.FormulaType
	 * @generated
	 */
	public Adapter createFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeneralConversionPropertyType <em>General Conversion Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeneralConversionPropertyType
	 * @generated
	 */
	public Adapter createGeneralConversionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeneralTransformationPropertyType <em>General Transformation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeneralTransformationPropertyType
	 * @generated
	 */
	public Adapter createGeneralTransformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GenericMetaDataType <em>Generic Meta Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GenericMetaDataType
	 * @generated
	 */
	public Adapter createGenericMetaDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeocentricCRSPropertyType <em>Geocentric CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeocentricCRSPropertyType
	 * @generated
	 */
	public Adapter createGeocentricCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeocentricCRSType <em>Geocentric CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeocentricCRSType
	 * @generated
	 */
	public Adapter createGeocentricCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodesicStringType <em>Geodesic String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodesicStringType
	 * @generated
	 */
	public Adapter createGeodesicStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodesicType <em>Geodesic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodesicType
	 * @generated
	 */
	public Adapter createGeodesicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodeticCRSPropertyType <em>Geodetic CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodeticCRSPropertyType
	 * @generated
	 */
	public Adapter createGeodeticCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodeticCRSType <em>Geodetic CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodeticCRSType
	 * @generated
	 */
	public Adapter createGeodeticCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodeticDatumPropertyType <em>Geodetic Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodeticDatumPropertyType
	 * @generated
	 */
	public Adapter createGeodeticDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeodeticDatumType <em>Geodetic Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeodeticDatumType
	 * @generated
	 */
	public Adapter createGeodeticDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeographicCRSPropertyType <em>Geographic CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeographicCRSPropertyType
	 * @generated
	 */
	public Adapter createGeographicCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeographicCRSType <em>Geographic CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeographicCRSType
	 * @generated
	 */
	public Adapter createGeographicCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeometricComplexPropertyType <em>Geometric Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeometricComplexPropertyType
	 * @generated
	 */
	public Adapter createGeometricComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeometricComplexType <em>Geometric Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeometricComplexType
	 * @generated
	 */
	public Adapter createGeometricComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeometricPrimitivePropertyType <em>Geometric Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeometricPrimitivePropertyType
	 * @generated
	 */
	public Adapter createGeometricPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeometryArrayPropertyType <em>Geometry Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeometryArrayPropertyType
	 * @generated
	 */
	public Adapter createGeometryArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GeometryPropertyType <em>Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GeometryPropertyType
	 * @generated
	 */
	public Adapter createGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GridEnvelopeType <em>Grid Envelope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GridEnvelopeType
	 * @generated
	 */
	public Adapter createGridEnvelopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GridFunctionType <em>Grid Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GridFunctionType
	 * @generated
	 */
	public Adapter createGridFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GridLengthType <em>Grid Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GridLengthType
	 * @generated
	 */
	public Adapter createGridLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GridLimitsType <em>Grid Limits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GridLimitsType
	 * @generated
	 */
	public Adapter createGridLimitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.GridType <em>Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.GridType
	 * @generated
	 */
	public Adapter createGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.HistoryPropertyType <em>History Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.HistoryPropertyType
	 * @generated
	 */
	public Adapter createHistoryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.IdentifiedObjectType <em>Identified Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.IdentifiedObjectType
	 * @generated
	 */
	public Adapter createIdentifiedObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ImageCRSPropertyType <em>Image CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ImageCRSPropertyType
	 * @generated
	 */
	public Adapter createImageCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ImageCRSType <em>Image CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ImageCRSType
	 * @generated
	 */
	public Adapter createImageCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ImageDatumPropertyType <em>Image Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ImageDatumPropertyType
	 * @generated
	 */
	public Adapter createImageDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ImageDatumType <em>Image Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ImageDatumType
	 * @generated
	 */
	public Adapter createImageDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.IndirectEntryType <em>Indirect Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.IndirectEntryType
	 * @generated
	 */
	public Adapter createIndirectEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.InlinePropertyType <em>Inline Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.InlinePropertyType
	 * @generated
	 */
	public Adapter createInlinePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.KnotPropertyType <em>Knot Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.KnotPropertyType
	 * @generated
	 */
	public Adapter createKnotPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.KnotType <em>Knot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.KnotType
	 * @generated
	 */
	public Adapter createKnotTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LengthType <em>Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LengthType
	 * @generated
	 */
	public Adapter createLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LinearCSPropertyType <em>Linear CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LinearCSPropertyType
	 * @generated
	 */
	public Adapter createLinearCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LinearCSType <em>Linear CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LinearCSType
	 * @generated
	 */
	public Adapter createLinearCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LinearRingPropertyType <em>Linear Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LinearRingPropertyType
	 * @generated
	 */
	public Adapter createLinearRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LinearRingType
	 * @generated
	 */
	public Adapter createLinearRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LineStringSegmentArrayPropertyType <em>Line String Segment Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LineStringSegmentArrayPropertyType
	 * @generated
	 */
	public Adapter createLineStringSegmentArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LineStringSegmentType <em>Line String Segment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LineStringSegmentType
	 * @generated
	 */
	public Adapter createLineStringSegmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LineStringType
	 * @generated
	 */
	public Adapter createLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.LocationPropertyType <em>Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.LocationPropertyType
	 * @generated
	 */
	public Adapter createLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MappingRuleType <em>Mapping Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MappingRuleType
	 * @generated
	 */
	public Adapter createMappingRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MeasureListType <em>Measure List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MeasureListType
	 * @generated
	 */
	public Adapter createMeasureListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MeasureOrNilReasonListType <em>Measure Or Nil Reason List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MeasureOrNilReasonListType
	 * @generated
	 */
	public Adapter createMeasureOrNilReasonListTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MeasureType <em>Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MeasureType
	 * @generated
	 */
	public Adapter createMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MetaDataPropertyType <em>Meta Data Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MetaDataPropertyType
	 * @generated
	 */
	public Adapter createMetaDataPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MovingObjectStatusType <em>Moving Object Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MovingObjectStatusType
	 * @generated
	 */
	public Adapter createMovingObjectStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiCurvePropertyType <em>Multi Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiCurvePropertyType
	 * @generated
	 */
	public Adapter createMultiCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiCurveType <em>Multi Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiCurveType
	 * @generated
	 */
	public Adapter createMultiCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiGeometryPropertyType <em>Multi Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiGeometryPropertyType
	 * @generated
	 */
	public Adapter createMultiGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiGeometryType
	 * @generated
	 */
	public Adapter createMultiGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiPointPropertyType <em>Multi Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiPointPropertyType
	 * @generated
	 */
	public Adapter createMultiPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiPointType <em>Multi Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiPointType
	 * @generated
	 */
	public Adapter createMultiPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiSolidPropertyType <em>Multi Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiSolidPropertyType
	 * @generated
	 */
	public Adapter createMultiSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiSolidType <em>Multi Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiSolidType
	 * @generated
	 */
	public Adapter createMultiSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiSurfacePropertyType <em>Multi Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiSurfacePropertyType
	 * @generated
	 */
	public Adapter createMultiSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.MultiSurfaceType <em>Multi Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.MultiSurfaceType
	 * @generated
	 */
	public Adapter createMultiSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.NodeOrEdgePropertyType <em>Node Or Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.NodeOrEdgePropertyType
	 * @generated
	 */
	public Adapter createNodeOrEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.NodePropertyType <em>Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.NodePropertyType
	 * @generated
	 */
	public Adapter createNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.NodeType <em>Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.NodeType
	 * @generated
	 */
	public Adapter createNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ObliqueCartesianCSPropertyType <em>Oblique Cartesian CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ObliqueCartesianCSPropertyType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ObliqueCartesianCSType <em>Oblique Cartesian CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ObliqueCartesianCSType
	 * @generated
	 */
	public Adapter createObliqueCartesianCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ObservationType <em>Observation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ObservationType
	 * @generated
	 */
	public Adapter createObservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OffsetCurveType <em>Offset Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OffsetCurveType
	 * @generated
	 */
	public Adapter createOffsetCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationMethodPropertyType <em>Operation Method Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationMethodPropertyType
	 * @generated
	 */
	public Adapter createOperationMethodPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationMethodType <em>Operation Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationMethodType
	 * @generated
	 */
	public Adapter createOperationMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationParameterGroupPropertyType <em>Operation Parameter Group Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationParameterGroupPropertyType
	 * @generated
	 */
	public Adapter createOperationParameterGroupPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationParameterGroupType <em>Operation Parameter Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationParameterGroupType
	 * @generated
	 */
	public Adapter createOperationParameterGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationParameterPropertyType <em>Operation Parameter Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationParameterPropertyType
	 * @generated
	 */
	public Adapter createOperationParameterPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationParameterType <em>Operation Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationParameterType
	 * @generated
	 */
	public Adapter createOperationParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OperationPropertyType <em>Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OperationPropertyType
	 * @generated
	 */
	public Adapter createOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OrientableCurveType <em>Orientable Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OrientableCurveType
	 * @generated
	 */
	public Adapter createOrientableCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.OrientableSurfaceType <em>Orientable Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.OrientableSurfaceType
	 * @generated
	 */
	public Adapter createOrientableSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ParameterValueGroupType <em>Parameter Value Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ParameterValueGroupType
	 * @generated
	 */
	public Adapter createParameterValueGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ParameterValueType <em>Parameter Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ParameterValueType
	 * @generated
	 */
	public Adapter createParameterValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PassThroughOperationPropertyType <em>Pass Through Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PassThroughOperationPropertyType
	 * @generated
	 */
	public Adapter createPassThroughOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PassThroughOperationType <em>Pass Through Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PassThroughOperationType
	 * @generated
	 */
	public Adapter createPassThroughOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PointArrayPropertyType <em>Point Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PointArrayPropertyType
	 * @generated
	 */
	public Adapter createPointArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PointPropertyType <em>Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PointPropertyType
	 * @generated
	 */
	public Adapter createPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PointType
	 * @generated
	 */
	public Adapter createPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PolarCSPropertyType <em>Polar CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PolarCSPropertyType
	 * @generated
	 */
	public Adapter createPolarCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PolarCSType <em>Polar CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PolarCSType
	 * @generated
	 */
	public Adapter createPolarCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PolygonPatchType <em>Polygon Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PolygonPatchType
	 * @generated
	 */
	public Adapter createPolygonPatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PolygonType
	 * @generated
	 */
	public Adapter createPolygonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PrimeMeridianPropertyType <em>Prime Meridian Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PrimeMeridianPropertyType
	 * @generated
	 */
	public Adapter createPrimeMeridianPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PrimeMeridianType <em>Prime Meridian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PrimeMeridianType
	 * @generated
	 */
	public Adapter createPrimeMeridianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.PriorityLocationPropertyType <em>Priority Location Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.PriorityLocationPropertyType
	 * @generated
	 */
	public Adapter createPriorityLocationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ProcedurePropertyType <em>Procedure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ProcedurePropertyType
	 * @generated
	 */
	public Adapter createProcedurePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ProjectedCRSPropertyType <em>Projected CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ProjectedCRSPropertyType
	 * @generated
	 */
	public Adapter createProjectedCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ProjectedCRSType <em>Projected CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ProjectedCRSType
	 * @generated
	 */
	public Adapter createProjectedCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.QuantityExtentType <em>Quantity Extent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.QuantityExtentType
	 * @generated
	 */
	public Adapter createQuantityExtentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.QuantityPropertyType <em>Quantity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.QuantityPropertyType
	 * @generated
	 */
	public Adapter createQuantityPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.QuantityType <em>Quantity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.QuantityType
	 * @generated
	 */
	public Adapter createQuantityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RangeSetType <em>Range Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RangeSetType
	 * @generated
	 */
	public Adapter createRangeSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RectangleType <em>Rectangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RectangleType
	 * @generated
	 */
	public Adapter createRectangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RectifiedGridType <em>Rectified Grid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RectifiedGridType
	 * @generated
	 */
	public Adapter createRectifiedGridTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RefLocationType <em>Ref Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RefLocationType
	 * @generated
	 */
	public Adapter createRefLocationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RelatedTimeType <em>Related Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RelatedTimeType
	 * @generated
	 */
	public Adapter createRelatedTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RingPropertyType <em>Ring Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RingPropertyType
	 * @generated
	 */
	public Adapter createRingPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RingType <em>Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RingType
	 * @generated
	 */
	public Adapter createRingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RowsType <em>Rows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RowsType
	 * @generated
	 */
	public Adapter createRowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.RowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.RowType
	 * @generated
	 */
	public Adapter createRowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ScaleType
	 * @generated
	 */
	public Adapter createScaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SecondDefiningParameterType <em>Second Defining Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SecondDefiningParameterType
	 * @generated
	 */
	public Adapter createSecondDefiningParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SecondDefiningParameterType1 <em>Second Defining Parameter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SecondDefiningParameterType1
	 * @generated
	 */
	public Adapter createSecondDefiningParameterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SecondDefiningParameterType2 <em>Second Defining Parameter Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SecondDefiningParameterType2
	 * @generated
	 */
	public Adapter createSecondDefiningParameterType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SecondDefiningParameterType3 <em>Second Defining Parameter Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SecondDefiningParameterType3
	 * @generated
	 */
	public Adapter createSecondDefiningParameterType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SequenceRuleType <em>Sequence Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SequenceRuleType
	 * @generated
	 */
	public Adapter createSequenceRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ShellPropertyType <em>Shell Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ShellPropertyType
	 * @generated
	 */
	public Adapter createShellPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ShellType <em>Shell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ShellType
	 * @generated
	 */
	public Adapter createShellTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SingleCRSPropertyType <em>Single CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SingleCRSPropertyType
	 * @generated
	 */
	public Adapter createSingleCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SingleOperationPropertyType <em>Single Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SingleOperationPropertyType
	 * @generated
	 */
	public Adapter createSingleOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SolidArrayPropertyType <em>Solid Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SolidArrayPropertyType
	 * @generated
	 */
	public Adapter createSolidArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SolidPropertyType <em>Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SolidPropertyType
	 * @generated
	 */
	public Adapter createSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SolidType <em>Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SolidType
	 * @generated
	 */
	public Adapter createSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SpeedType <em>Speed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SpeedType
	 * @generated
	 */
	public Adapter createSpeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SphereType <em>Sphere Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SphereType
	 * @generated
	 */
	public Adapter createSphereTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SphericalCSPropertyType <em>Spherical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SphericalCSPropertyType
	 * @generated
	 */
	public Adapter createSphericalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SphericalCSType <em>Spherical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SphericalCSType
	 * @generated
	 */
	public Adapter createSphericalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.StringOrRefType <em>String Or Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.StringOrRefType
	 * @generated
	 */
	public Adapter createStringOrRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SurfaceArrayPropertyType <em>Surface Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SurfaceArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfaceArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SurfacePatchArrayPropertyType <em>Surface Patch Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SurfacePatchArrayPropertyType
	 * @generated
	 */
	public Adapter createSurfacePatchArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SurfacePropertyType <em>Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SurfacePropertyType
	 * @generated
	 */
	public Adapter createSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.SurfaceType <em>Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.SurfaceType
	 * @generated
	 */
	public Adapter createSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TargetPropertyType <em>Target Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TargetPropertyType
	 * @generated
	 */
	public Adapter createTargetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalCRSPropertyType <em>Temporal CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalCRSPropertyType
	 * @generated
	 */
	public Adapter createTemporalCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalCRSType <em>Temporal CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalCRSType
	 * @generated
	 */
	public Adapter createTemporalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalCSPropertyType <em>Temporal CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalCSPropertyType
	 * @generated
	 */
	public Adapter createTemporalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalCSType <em>Temporal CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalCSType
	 * @generated
	 */
	public Adapter createTemporalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalDatumBaseType <em>Temporal Datum Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalDatumBaseType
	 * @generated
	 */
	public Adapter createTemporalDatumBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalDatumPropertyType <em>Temporal Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalDatumPropertyType
	 * @generated
	 */
	public Adapter createTemporalDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TemporalDatumType <em>Temporal Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TemporalDatumType
	 * @generated
	 */
	public Adapter createTemporalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCalendarEraPropertyType <em>Time Calendar Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCalendarEraPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCalendarEraType <em>Time Calendar Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCalendarEraType
	 * @generated
	 */
	public Adapter createTimeCalendarEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCalendarPropertyType <em>Time Calendar Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCalendarPropertyType
	 * @generated
	 */
	public Adapter createTimeCalendarPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCalendarType <em>Time Calendar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCalendarType
	 * @generated
	 */
	public Adapter createTimeCalendarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeClockPropertyType <em>Time Clock Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeClockPropertyType
	 * @generated
	 */
	public Adapter createTimeClockPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeClockType <em>Time Clock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeClockType
	 * @generated
	 */
	public Adapter createTimeClockTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCoordinateSystemType <em>Time Coordinate System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCoordinateSystemType
	 * @generated
	 */
	public Adapter createTimeCoordinateSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCSPropertyType <em>Time CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCSPropertyType
	 * @generated
	 */
	public Adapter createTimeCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeCSType <em>Time CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeCSType
	 * @generated
	 */
	public Adapter createTimeCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeEdgePropertyType <em>Time Edge Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeEdgePropertyType
	 * @generated
	 */
	public Adapter createTimeEdgePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeEdgeType <em>Time Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeEdgeType
	 * @generated
	 */
	public Adapter createTimeEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeInstantPropertyType <em>Time Instant Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeInstantPropertyType
	 * @generated
	 */
	public Adapter createTimeInstantPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeInstantType <em>Time Instant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeInstantType
	 * @generated
	 */
	public Adapter createTimeInstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeIntervalLengthType <em>Time Interval Length Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeIntervalLengthType
	 * @generated
	 */
	public Adapter createTimeIntervalLengthTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeNodePropertyType <em>Time Node Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeNodePropertyType
	 * @generated
	 */
	public Adapter createTimeNodePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeNodeType <em>Time Node Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeNodeType
	 * @generated
	 */
	public Adapter createTimeNodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeOrdinalEraPropertyType <em>Time Ordinal Era Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeOrdinalEraPropertyType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeOrdinalEraType <em>Time Ordinal Era Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeOrdinalEraType
	 * @generated
	 */
	public Adapter createTimeOrdinalEraTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeOrdinalReferenceSystemType <em>Time Ordinal Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeOrdinalReferenceSystemType
	 * @generated
	 */
	public Adapter createTimeOrdinalReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimePeriodPropertyType <em>Time Period Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimePeriodPropertyType
	 * @generated
	 */
	public Adapter createTimePeriodPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimePeriodType <em>Time Period Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimePeriodType
	 * @generated
	 */
	public Adapter createTimePeriodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimePositionType <em>Time Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimePositionType
	 * @generated
	 */
	public Adapter createTimePositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimePrimitivePropertyType <em>Time Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimePrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimePrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeReferenceSystemType <em>Time Reference System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeReferenceSystemType
	 * @generated
	 */
	public Adapter createTimeReferenceSystemTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeTopologyComplexPropertyType <em>Time Topology Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeTopologyComplexPropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeTopologyComplexType <em>Time Topology Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeTopologyComplexType
	 * @generated
	 */
	public Adapter createTimeTopologyComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeTopologyPrimitivePropertyType <em>Time Topology Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeTopologyPrimitivePropertyType
	 * @generated
	 */
	public Adapter createTimeTopologyPrimitivePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TinType <em>Tin Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TinType
	 * @generated
	 */
	public Adapter createTinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoComplexPropertyType <em>Topo Complex Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoComplexPropertyType
	 * @generated
	 */
	public Adapter createTopoComplexPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoComplexType <em>Topo Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoComplexType
	 * @generated
	 */
	public Adapter createTopoComplexTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoCurvePropertyType <em>Topo Curve Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoCurvePropertyType
	 * @generated
	 */
	public Adapter createTopoCurvePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoCurveType <em>Topo Curve Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoCurveType
	 * @generated
	 */
	public Adapter createTopoCurveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoPointPropertyType <em>Topo Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoPointPropertyType
	 * @generated
	 */
	public Adapter createTopoPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoPointType <em>Topo Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoPointType
	 * @generated
	 */
	public Adapter createTopoPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoPrimitiveArrayAssociationType <em>Topo Primitive Array Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoPrimitiveArrayAssociationType
	 * @generated
	 */
	public Adapter createTopoPrimitiveArrayAssociationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoPrimitiveMemberType <em>Topo Primitive Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoPrimitiveMemberType
	 * @generated
	 */
	public Adapter createTopoPrimitiveMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoSolidPropertyType <em>Topo Solid Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoSolidPropertyType
	 * @generated
	 */
	public Adapter createTopoSolidPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoSolidType <em>Topo Solid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoSolidType
	 * @generated
	 */
	public Adapter createTopoSolidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoSurfacePropertyType <em>Topo Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoSurfacePropertyType
	 * @generated
	 */
	public Adapter createTopoSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoSurfaceType <em>Topo Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoSurfaceType
	 * @generated
	 */
	public Adapter createTopoSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoVolumePropertyType <em>Topo Volume Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoVolumePropertyType
	 * @generated
	 */
	public Adapter createTopoVolumePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TopoVolumeType <em>Topo Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TopoVolumeType
	 * @generated
	 */
	public Adapter createTopoVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TransformationPropertyType <em>Transformation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TransformationPropertyType
	 * @generated
	 */
	public Adapter createTransformationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TransformationType <em>Transformation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TransformationType
	 * @generated
	 */
	public Adapter createTransformationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.TriangleType <em>Triangle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.TriangleType
	 * @generated
	 */
	public Adapter createTriangleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.UnitDefinitionType <em>Unit Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.UnitDefinitionType
	 * @generated
	 */
	public Adapter createUnitDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.UnitOfMeasureType <em>Unit Of Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.UnitOfMeasureType
	 * @generated
	 */
	public Adapter createUnitOfMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.UserDefinedCSPropertyType <em>User Defined CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.UserDefinedCSPropertyType
	 * @generated
	 */
	public Adapter createUserDefinedCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.UserDefinedCSType <em>User Defined CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.UserDefinedCSType
	 * @generated
	 */
	public Adapter createUserDefinedCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ValueArrayPropertyType <em>Value Array Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ValueArrayPropertyType
	 * @generated
	 */
	public Adapter createValueArrayPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ValueArrayType <em>Value Array Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ValueArrayType
	 * @generated
	 */
	public Adapter createValueArrayTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.ValuePropertyType <em>Value Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.ValuePropertyType
	 * @generated
	 */
	public Adapter createValuePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VectorType <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VectorType
	 * @generated
	 */
	public Adapter createVectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalCRSPropertyType <em>Vertical CRS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalCRSPropertyType
	 * @generated
	 */
	public Adapter createVerticalCRSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalCRSType <em>Vertical CRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalCRSType
	 * @generated
	 */
	public Adapter createVerticalCRSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalCSPropertyType <em>Vertical CS Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalCSPropertyType
	 * @generated
	 */
	public Adapter createVerticalCSPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalCSType <em>Vertical CS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalCSType
	 * @generated
	 */
	public Adapter createVerticalCSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalDatumPropertyType <em>Vertical Datum Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalDatumPropertyType
	 * @generated
	 */
	public Adapter createVerticalDatumPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VerticalDatumType <em>Vertical Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VerticalDatumType
	 * @generated
	 */
	public Adapter createVerticalDatumTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.opengis.gml.gml.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.opengis.gml.gml.VolumeType
	 * @generated
	 */
	public Adapter createVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GMLAdapterFactory
