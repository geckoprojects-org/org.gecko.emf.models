/**
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
package de.online.adv.namespaces.adv.sk.xml.skadv.util;

import de.online.adv.namespaces.adv.sk.xml.skadv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage
 * @generated
 */
public class AAAAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AAAPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAAAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AAAPackage.eINSTANCE;
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
	protected AAASwitch<Adapter> modelSwitch =
		new AAASwitch<Adapter>() {
			@Override
			public Adapter caseAdditionalFilterType(AdditionalFilterType object) {
				return createAdditionalFilterTypeAdapter();
			}
			@Override
			public Adapter caseAdditionalFilterType1(AdditionalFilterType1 object) {
				return createAdditionalFilterType1Adapter();
			}
			@Override
			public Adapter caseAdditionalSymbolizersPropertyType(AdditionalSymbolizersPropertyType object) {
				return createAdditionalSymbolizersPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAdditionalSymbolizersType(AdditionalSymbolizersType object) {
				return createAdditionalSymbolizersTypeAdapter();
			}
			@Override
			public Adapter caseAdditionalSymbolizersType1(AdditionalSymbolizersType1 object) {
				return createAdditionalSymbolizersType1Adapter();
			}
			@Override
			public Adapter caseAreaGraphicPropertyType(AreaGraphicPropertyType object) {
				return createAreaGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAreaGraphicType(AreaGraphicType object) {
				return createAreaGraphicTypeAdapter();
			}
			@Override
			public Adapter caseAreaSymbolizerPropertyType(AreaSymbolizerPropertyType object) {
				return createAreaSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseAreaSymbolizerType(AreaSymbolizerType object) {
				return createAreaSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseBackgroundBorderType(BackgroundBorderType object) {
				return createBackgroundBorderTypeAdapter();
			}
			@Override
			public Adapter caseBackgroundFillType(BackgroundFillType object) {
				return createBackgroundFillTypeAdapter();
			}
			@Override
			public Adapter caseBottomEdgeType(BottomEdgeType object) {
				return createBottomEdgeTypeAdapter();
			}
			@Override
			public Adapter caseBoundaryType(BoundaryType object) {
				return createBoundaryTypeAdapter();
			}
			@Override
			public Adapter caseBoundaryType1(BoundaryType1 object) {
				return createBoundaryType1Adapter();
			}
			@Override
			public Adapter caseBoundaryType2(BoundaryType2 object) {
				return createBoundaryType2Adapter();
			}
			@Override
			public Adapter caseBoundingBoxPointPropertyType(BoundingBoxPointPropertyType object) {
				return createBoundingBoxPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseBoundingBoxPointType(BoundingBoxPointType object) {
				return createBoundingBoxPointTypeAdapter();
			}
			@Override
			public Adapter caseCenterPointPropertyType(CenterPointPropertyType object) {
				return createCenterPointPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCenterPointType(CenterPointType object) {
				return createCenterPointTypeAdapter();
			}
			@Override
			public Adapter caseCircularArcPropertyType(CircularArcPropertyType object) {
				return createCircularArcPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCircularArcType(CircularArcType object) {
				return createCircularArcTypeAdapter();
			}
			@Override
			public Adapter caseClosePropertyType(ClosePropertyType object) {
				return createClosePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCloseType(CloseType object) {
				return createCloseTypeAdapter();
			}
			@Override
			public Adapter caseColorCMYKPropertyType(ColorCMYKPropertyType object) {
				return createColorCMYKPropertyTypeAdapter();
			}
			@Override
			public Adapter caseColorCMYKType(ColorCMYKType object) {
				return createColorCMYKTypeAdapter();
			}
			@Override
			public Adapter caseColorPropertyType(ColorPropertyType object) {
				return createColorPropertyTypeAdapter();
			}
			@Override
			public Adapter caseColorRGBPropertyType(ColorRGBPropertyType object) {
				return createColorRGBPropertyTypeAdapter();
			}
			@Override
			public Adapter caseColorRGBType(ColorRGBType object) {
				return createColorRGBTypeAdapter();
			}
			@Override
			public Adapter caseColorType(ColorType object) {
				return createColorTypeAdapter();
			}
			@Override
			public Adapter caseColorType1(ColorType1 object) {
				return createColorType1Adapter();
			}
			@Override
			public Adapter caseColorType2(ColorType2 object) {
				return createColorType2Adapter();
			}
			@Override
			public Adapter caseCompositeGraphicPropertyType(CompositeGraphicPropertyType object) {
				return createCompositeGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompositeGraphicType(CompositeGraphicType object) {
				return createCompositeGraphicTypeAdapter();
			}
			@Override
			public Adapter caseCompoundStrokePropertyType(CompoundStrokePropertyType object) {
				return createCompoundStrokePropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompoundStrokeSectionPropertyType(CompoundStrokeSectionPropertyType object) {
				return createCompoundStrokeSectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCompoundStrokeSectionType(CompoundStrokeSectionType object) {
				return createCompoundStrokeSectionTypeAdapter();
			}
			@Override
			public Adapter caseCompoundStrokeType(CompoundStrokeType object) {
				return createCompoundStrokeTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseCurrentStepPropertyType(CurrentStepPropertyType object) {
				return createCurrentStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurrentStepType(CurrentStepType object) {
				return createCurrentStepTypeAdapter();
			}
			@Override
			public Adapter caseCurvetoPropertyType(CurvetoPropertyType object) {
				return createCurvetoPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCurvetoType(CurvetoType object) {
				return createCurvetoTypeAdapter();
			}
			@Override
			public Adapter caseDashedStrokePropertyType(DashedStrokePropertyType object) {
				return createDashedStrokePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDashedStrokeType(DashedStrokeType object) {
				return createDashedStrokeTypeAdapter();
			}
			@Override
			public Adapter caseDesignRulePropertyType(DesignRulePropertyType object) {
				return createDesignRulePropertyTypeAdapter();
			}
			@Override
			public Adapter caseDesignRuleType(DesignRuleType object) {
				return createDesignRuleTypeAdapter();
			}
			@Override
			public Adapter caseDesignRuleType1(DesignRuleType1 object) {
				return createDesignRuleType1Adapter();
			}
			@Override
			public Adapter caseDisplacementPropertyType(DisplacementPropertyType object) {
				return createDisplacementPropertyTypeAdapter();
			}
			@Override
			public Adapter caseDisplacementType(DisplacementType object) {
				return createDisplacementTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseElementPropertyType(ElementPropertyType object) {
				return createElementPropertyTypeAdapter();
			}
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseElementType1(ElementType1 object) {
				return createElementType1Adapter();
			}
			@Override
			public Adapter caseElseType(ElseType object) {
				return createElseTypeAdapter();
			}
			@Override
			public Adapter caseEmitPropertyType(EmitPropertyType object) {
				return createEmitPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEmitType(EmitType object) {
				return createEmitTypeAdapter();
			}
			@Override
			public Adapter caseEmitType1(EmitType1 object) {
				return createEmitType1Adapter();
			}
			@Override
			public Adapter caseEveryPropertyType(EveryPropertyType object) {
				return createEveryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseEveryType(EveryType object) {
				return createEveryTypeAdapter();
			}
			@Override
			public Adapter caseExpressionPropertyType(ExpressionPropertyType object) {
				return createExpressionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseExpressionType(ExpressionType object) {
				return createExpressionTypeAdapter();
			}
			@Override
			public Adapter caseExpressionType1(ExpressionType1 object) {
				return createExpressionType1Adapter();
			}
			@Override
			public Adapter caseFeatureTypeStepPropertyType(FeatureTypeStepPropertyType object) {
				return createFeatureTypeStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFeatureTypeStepType(FeatureTypeStepType object) {
				return createFeatureTypeStepTypeAdapter();
			}
			@Override
			public Adapter caseFillPropertyType(FillPropertyType object) {
				return createFillPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFillType(FillType object) {
				return createFillTypeAdapter();
			}
			@Override
			public Adapter caseFilteredSymbolizerPropertyType(FilteredSymbolizerPropertyType object) {
				return createFilteredSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFilteredSymbolizerType(FilteredSymbolizerType object) {
				return createFilteredSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseFilterPropertyType(FilterPropertyType object) {
				return createFilterPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFilterType(FilterType object) {
				return createFilterTypeAdapter();
			}
			@Override
			public Adapter caseFilterType1(FilterType1 object) {
				return createFilterType1Adapter();
			}
			@Override
			public Adapter caseFirstStepPropertyType(FirstStepPropertyType object) {
				return createFirstStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFirstStepType(FirstStepType object) {
				return createFirstStepTypeAdapter();
			}
			@Override
			public Adapter caseFirstStepType1(FirstStepType1 object) {
				return createFirstStepType1Adapter();
			}
			@Override
			public Adapter caseFontPropertyType(FontPropertyType object) {
				return createFontPropertyTypeAdapter();
			}
			@Override
			public Adapter caseFontType(FontType object) {
				return createFontTypeAdapter();
			}
			@Override
			public Adapter caseFontType1(FontType1 object) {
				return createFontType1Adapter();
			}
			@Override
			public Adapter caseForPropertyType(ForPropertyType object) {
				return createForPropertyTypeAdapter();
			}
			@Override
			public Adapter caseForType(ForType object) {
				return createForTypeAdapter();
			}
			@Override
			public Adapter caseGapPropertyType(GapPropertyType object) {
				return createGapPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGapType(GapType object) {
				return createGapTypeAdapter();
			}
			@Override
			public Adapter caseGeometryType(GeometryType object) {
				return createGeometryTypeAdapter();
			}
			@Override
			public Adapter caseGeometryType1(GeometryType1 object) {
				return createGeometryType1Adapter();
			}
			@Override
			public Adapter caseGeometryType2(GeometryType2 object) {
				return createGeometryType2Adapter();
			}
			@Override
			public Adapter caseGraphicFillPropertyType(GraphicFillPropertyType object) {
				return createGraphicFillPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGraphicFillType(GraphicFillType object) {
				return createGraphicFillTypeAdapter();
			}
			@Override
			public Adapter caseGraphicPropertyType(GraphicPropertyType object) {
				return createGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseGraphicType(GraphicType object) {
				return createGraphicTypeAdapter();
			}
			@Override
			public Adapter caseGraphicType1(GraphicType1 object) {
				return createGraphicType1Adapter();
			}
			@Override
			public Adapter caseGraphicType2(GraphicType2 object) {
				return createGraphicType2Adapter();
			}
			@Override
			public Adapter caseGraphicType3(GraphicType3 object) {
				return createGraphicType3Adapter();
			}
			@Override
			public Adapter caseHaloColorType(HaloColorType object) {
				return createHaloColorTypeAdapter();
			}
			@Override
			public Adapter caseHaloPropertyType(HaloPropertyType object) {
				return createHaloPropertyTypeAdapter();
			}
			@Override
			public Adapter caseHaloType(HaloType object) {
				return createHaloTypeAdapter();
			}
			@Override
			public Adapter caseHaloType1(HaloType1 object) {
				return createHaloType1Adapter();
			}
			@Override
			public Adapter caseHaloType2(HaloType2 object) {
				return createHaloType2Adapter();
			}
			@Override
			public Adapter caseHatchDefinitionLongestSidePropertyType(HatchDefinitionLongestSidePropertyType object) {
				return createHatchDefinitionLongestSidePropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchDefinitionPropertyType(HatchDefinitionPropertyType object) {
				return createHatchDefinitionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchFillLongestSidePropertyType(HatchFillLongestSidePropertyType object) {
				return createHatchFillLongestSidePropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchFillLongestSideType(HatchFillLongestSideType object) {
				return createHatchFillLongestSideTypeAdapter();
			}
			@Override
			public Adapter caseHatchFillPropertyType(HatchFillPropertyType object) {
				return createHatchFillPropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchFillType(HatchFillType object) {
				return createHatchFillTypeAdapter();
			}
			@Override
			public Adapter caseHatchLinesLongestSidePropertyType(HatchLinesLongestSidePropertyType object) {
				return createHatchLinesLongestSidePropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchLinesLongestSideType(HatchLinesLongestSideType object) {
				return createHatchLinesLongestSideTypeAdapter();
			}
			@Override
			public Adapter caseHatchLinesPropertyType(HatchLinesPropertyType object) {
				return createHatchLinesPropertyTypeAdapter();
			}
			@Override
			public Adapter caseHatchLinesType(HatchLinesType object) {
				return createHatchLinesTypeAdapter();
			}
			@Override
			public Adapter caseIfPropertyType(IfPropertyType object) {
				return createIfPropertyTypeAdapter();
			}
			@Override
			public Adapter caseIfType(IfType object) {
				return createIfTypeAdapter();
			}
			@Override
			public Adapter caseInteriorType(InteriorType object) {
				return createInteriorTypeAdapter();
			}
			@Override
			public Adapter caseInteriorType1(InteriorType1 object) {
				return createInteriorType1Adapter();
			}
			@Override
			public Adapter caseInType(InType object) {
				return createInTypeAdapter();
			}
			@Override
			public Adapter caseInType1(InType1 object) {
				return createInType1Adapter();
			}
			@Override
			public Adapter caseLabelPropertyType(LabelPropertyType object) {
				return createLabelPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLabelTextType(LabelTextType object) {
				return createLabelTextTypeAdapter();
			}
			@Override
			public Adapter caseLabelTextType1(LabelTextType1 object) {
				return createLabelTextType1Adapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLabelType1(LabelType1 object) {
				return createLabelType1Adapter();
			}
			@Override
			public Adapter caseLabelType2(LabelType2 object) {
				return createLabelType2Adapter();
			}
			@Override
			public Adapter caseLabelType3(LabelType3 object) {
				return createLabelType3Adapter();
			}
			@Override
			public Adapter caseLayerPropertyType(LayerPropertyType object) {
				return createLayerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLayerType(LayerType object) {
				return createLayerTypeAdapter();
			}
			@Override
			public Adapter caseLayerType1(LayerType1 object) {
				return createLayerType1Adapter();
			}
			@Override
			public Adapter caseLineGraphicPropertyType(LineGraphicPropertyType object) {
				return createLineGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineGraphicType(LineGraphicType object) {
				return createLineGraphicTypeAdapter();
			}
			@Override
			public Adapter caseLineLabelPropertyType(LineLabelPropertyType object) {
				return createLineLabelPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineLabelType(LineLabelType object) {
				return createLineLabelTypeAdapter();
			}
			@Override
			public Adapter caseLinePlacedGraphicPropertyType(LinePlacedGraphicPropertyType object) {
				return createLinePlacedGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinePlacedGraphicType(LinePlacedGraphicType object) {
				return createLinePlacedGraphicTypeAdapter();
			}
			@Override
			public Adapter caseLineSymbolizerPropertyType(LineSymbolizerPropertyType object) {
				return createLineSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLineSymbolizerType(LineSymbolizerType object) {
				return createLineSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseLinetoPropertyType(LinetoPropertyType object) {
				return createLinetoPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLinetoType(LinetoType object) {
				return createLinetoTypeAdapter();
			}
			@Override
			public Adapter caseLiteralPropertyType(LiteralPropertyType object) {
				return createLiteralPropertyTypeAdapter();
			}
			@Override
			public Adapter caseLiteralType(LiteralType object) {
				return createLiteralTypeAdapter();
			}
			@Override
			public Adapter caseMaximumAdjacentLineStringPropertyType(MaximumAdjacentLineStringPropertyType object) {
				return createMaximumAdjacentLineStringPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMaximumAdjacentLineStringType(MaximumAdjacentLineStringType object) {
				return createMaximumAdjacentLineStringTypeAdapter();
			}
			@Override
			public Adapter caseMaximumAdjacentSurfacePropertyType(MaximumAdjacentSurfacePropertyType object) {
				return createMaximumAdjacentSurfacePropertyTypeAdapter();
			}
			@Override
			public Adapter caseMaximumAdjacentSurfaceType(MaximumAdjacentSurfaceType object) {
				return createMaximumAdjacentSurfaceTypeAdapter();
			}
			@Override
			public Adapter caseMeasureLiteralPropertyType(MeasureLiteralPropertyType object) {
				return createMeasureLiteralPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMeasureLiteralType(MeasureLiteralType object) {
				return createMeasureLiteralTypeAdapter();
			}
			@Override
			public Adapter caseMemberType(MemberType object) {
				return createMemberTypeAdapter();
			}
			@Override
			public Adapter caseMovetoPropertyType(MovetoPropertyType object) {
				return createMovetoPropertyTypeAdapter();
			}
			@Override
			public Adapter caseMovetoType(MovetoType object) {
				return createMovetoTypeAdapter();
			}
			@Override
			public Adapter caseNeighborhoodFilterType(NeighborhoodFilterType object) {
				return createNeighborhoodFilterTypeAdapter();
			}
			@Override
			public Adapter caseNullColorPropertyType(NullColorPropertyType object) {
				return createNullColorPropertyTypeAdapter();
			}
			@Override
			public Adapter caseNullColorType(NullColorType object) {
				return createNullColorTypeAdapter();
			}
			@Override
			public Adapter caseNullSymbolizerPropertyType(NullSymbolizerPropertyType object) {
				return createNullSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseNullSymbolizerType(NullSymbolizerType object) {
				return createNullSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseOperandType(OperandType object) {
				return createOperandTypeAdapter();
			}
			@Override
			public Adapter caseOperationPropertyType(OperationPropertyType object) {
				return createOperationPropertyTypeAdapter();
			}
			@Override
			public Adapter caseOperationType(OperationType object) {
				return createOperationTypeAdapter();
			}
			@Override
			public Adapter casePathElementPropertyType(PathElementPropertyType object) {
				return createPathElementPropertyTypeAdapter();
			}
			@Override
			public Adapter casePathElementType(PathElementType object) {
				return createPathElementTypeAdapter();
			}
			@Override
			public Adapter casePathPropertyType(PathPropertyType object) {
				return createPathPropertyTypeAdapter();
			}
			@Override
			public Adapter casePathType(PathType object) {
				return createPathTypeAdapter();
			}
			@Override
			public Adapter casePerpendicularOffsetPropertyType(PerpendicularOffsetPropertyType object) {
				return createPerpendicularOffsetPropertyTypeAdapter();
			}
			@Override
			public Adapter casePerpendicularOffsetType(PerpendicularOffsetType object) {
				return createPerpendicularOffsetTypeAdapter();
			}
			@Override
			public Adapter casePlacementRulePropertyType(PlacementRulePropertyType object) {
				return createPlacementRulePropertyTypeAdapter();
			}
			@Override
			public Adapter casePlacementRuleType(PlacementRuleType object) {
				return createPlacementRuleTypeAdapter();
			}
			@Override
			public Adapter casePlacementType(PlacementType object) {
				return createPlacementTypeAdapter();
			}
			@Override
			public Adapter casePointLabelPropertyType(PointLabelPropertyType object) {
				return createPointLabelPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointLabelType(PointLabelType object) {
				return createPointLabelTypeAdapter();
			}
			@Override
			public Adapter casePointsInAreaDefinitionPropertyType(PointsInAreaDefinitionPropertyType object) {
				return createPointsInAreaDefinitionPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointsInAreaPropertyType(PointsInAreaPropertyType object) {
				return createPointsInAreaPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointsInAreaType(PointsInAreaType object) {
				return createPointsInAreaTypeAdapter();
			}
			@Override
			public Adapter casePointsOnLinePropertyType(PointsOnLinePropertyType object) {
				return createPointsOnLinePropertyTypeAdapter();
			}
			@Override
			public Adapter casePointsOnLineType(PointsOnLineType object) {
				return createPointsOnLineTypeAdapter();
			}
			@Override
			public Adapter casePointSymbolizerPropertyType(PointSymbolizerPropertyType object) {
				return createPointSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter casePointSymbolizerType(PointSymbolizerType object) {
				return createPointSymbolizerTypeAdapter();
			}
			@Override
			public Adapter casePostGraphicType(PostGraphicType object) {
				return createPostGraphicTypeAdapter();
			}
			@Override
			public Adapter casePredicateType(PredicateType object) {
				return createPredicateTypeAdapter();
			}
			@Override
			public Adapter casePredicateType1(PredicateType1 object) {
				return createPredicateType1Adapter();
			}
			@Override
			public Adapter casePreGraphicType(PreGraphicType object) {
				return createPreGraphicTypeAdapter();
			}
			@Override
			public Adapter casePropertyPropertyType(PropertyPropertyType object) {
				return createPropertyPropertyTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter casePureSymbolizerPropertyType(PureSymbolizerPropertyType object) {
				return createPureSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter casePureSymbolizerType(PureSymbolizerType object) {
				return createPureSymbolizerTypeAdapter();
			}
			@Override
			public Adapter casePureSymbolizerType1(PureSymbolizerType1 object) {
				return createPureSymbolizerType1Adapter();
			}
			@Override
			public Adapter caseQuantifierPropertyType(QuantifierPropertyType object) {
				return createQuantifierPropertyTypeAdapter();
			}
			@Override
			public Adapter caseQuantifierType(QuantifierType object) {
				return createQuantifierTypeAdapter();
			}
			@Override
			public Adapter caseRelateFilterType(RelateFilterType object) {
				return createRelateFilterTypeAdapter();
			}
			@Override
			public Adapter caseRelateGeometryPropertyType(RelateGeometryPropertyType object) {
				return createRelateGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRelateGeometryType(RelateGeometryType object) {
				return createRelateGeometryTypeAdapter();
			}
			@Override
			public Adapter caseRelateTopologyPropertyType(RelateTopologyPropertyType object) {
				return createRelateTopologyPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRelateTopologyType(RelateTopologyType object) {
				return createRelateTopologyTypeAdapter();
			}
			@Override
			public Adapter caseReturnType(ReturnType object) {
				return createReturnTypeAdapter();
			}
			@Override
			public Adapter caseRulePropertyType(RulePropertyType object) {
				return createRulePropertyTypeAdapter();
			}
			@Override
			public Adapter caseRuleSetPropertyType(RuleSetPropertyType object) {
				return createRuleSetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseRuleSetType(RuleSetType object) {
				return createRuleSetTypeAdapter();
			}
			@Override
			public Adapter caseRuleSetType1(RuleSetType1 object) {
				return createRuleSetType1Adapter();
			}
			@Override
			public Adapter caseRulesToConsiderType(RulesToConsiderType object) {
				return createRulesToConsiderTypeAdapter();
			}
			@Override
			public Adapter caseRuleType(RuleType object) {
				return createRuleTypeAdapter();
			}
			@Override
			public Adapter caseRuleType1(RuleType1 object) {
				return createRuleType1Adapter();
			}
			@Override
			public Adapter caseSatisfiesType(SatisfiesType object) {
				return createSatisfiesTypeAdapter();
			}
			@Override
			public Adapter caseSectionType(SectionType object) {
				return createSectionTypeAdapter();
			}
			@Override
			public Adapter caseSelfStepPropertyType(SelfStepPropertyType object) {
				return createSelfStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSelfStepType(SelfStepType object) {
				return createSelfStepTypeAdapter();
			}
			@Override
			public Adapter caseShieldedPointLabelPropertyType(ShieldedPointLabelPropertyType object) {
				return createShieldedPointLabelPropertyTypeAdapter();
			}
			@Override
			public Adapter caseShieldedPointLabelType(ShieldedPointLabelType object) {
				return createShieldedPointLabelTypeAdapter();
			}
			@Override
			public Adapter caseSimpleGraphicPropertyType(SimpleGraphicPropertyType object) {
				return createSimpleGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSimpleGraphicType(SimpleGraphicType object) {
				return createSimpleGraphicTypeAdapter();
			}
			@Override
			public Adapter caseSkeletonLinePropertyType(SkeletonLinePropertyType object) {
				return createSkeletonLinePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSkeletonLineType(SkeletonLineType object) {
				return createSkeletonLineTypeAdapter();
			}
			@Override
			public Adapter caseSlopeHatchLinesPropertyType(SlopeHatchLinesPropertyType object) {
				return createSlopeHatchLinesPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSlopeHatchLinesType(SlopeHatchLinesType object) {
				return createSlopeHatchLinesTypeAdapter();
			}
			@Override
			public Adapter caseSolidFillPropertyType(SolidFillPropertyType object) {
				return createSolidFillPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidFillType(SolidFillType object) {
				return createSolidFillTypeAdapter();
			}
			@Override
			public Adapter caseSolidOrDashedStrokePropertyType(SolidOrDashedStrokePropertyType object) {
				return createSolidOrDashedStrokePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidOrDashedStrokeType(SolidOrDashedStrokeType object) {
				return createSolidOrDashedStrokeTypeAdapter();
			}
			@Override
			public Adapter caseSolidSectionPropertyType(SolidSectionPropertyType object) {
				return createSolidSectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidSectionType(SolidSectionType object) {
				return createSolidSectionTypeAdapter();
			}
			@Override
			public Adapter caseSolidStrokePropertyType(SolidStrokePropertyType object) {
				return createSolidStrokePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSolidStrokeType(SolidStrokeType object) {
				return createSolidStrokeTypeAdapter();
			}
			@Override
			public Adapter caseSomePropertyType(SomePropertyType object) {
				return createSomePropertyTypeAdapter();
			}
			@Override
			public Adapter caseSomeType(SomeType object) {
				return createSomeTypeAdapter();
			}
			@Override
			public Adapter caseStepPropertyType(StepPropertyType object) {
				return createStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseStepType1(StepType1 object) {
				return createStepType1Adapter();
			}
			@Override
			public Adapter caseStrokePropertyType(StrokePropertyType object) {
				return createStrokePropertyTypeAdapter();
			}
			@Override
			public Adapter caseStrokeType(StrokeType object) {
				return createStrokeTypeAdapter();
			}
			@Override
			public Adapter caseStrokeType1(StrokeType1 object) {
				return createStrokeType1Adapter();
			}
			@Override
			public Adapter caseStrokeType2(StrokeType2 object) {
				return createStrokeType2Adapter();
			}
			@Override
			public Adapter caseStrokeType3(StrokeType3 object) {
				return createStrokeType3Adapter();
			}
			@Override
			public Adapter caseStrokeType4(StrokeType4 object) {
				return createStrokeType4Adapter();
			}
			@Override
			public Adapter caseStrokeType5(StrokeType5 object) {
				return createStrokeType5Adapter();
			}
			@Override
			public Adapter caseStylePropertyType(StylePropertyType object) {
				return createStylePropertyTypeAdapter();
			}
			@Override
			public Adapter caseStyleType(StyleType object) {
				return createStyleTypeAdapter();
			}
			@Override
			public Adapter caseStyleType1(StyleType1 object) {
				return createStyleType1Adapter();
			}
			@Override
			public Adapter caseSymbolizerPredicateType(SymbolizerPredicateType object) {
				return createSymbolizerPredicateTypeAdapter();
			}
			@Override
			public Adapter caseSymbolizerPropertyType(SymbolizerPropertyType object) {
				return createSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSymbolizerType(SymbolizerType object) {
				return createSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseSymbolizerType1(SymbolizerType1 object) {
				return createSymbolizerType1Adapter();
			}
			@Override
			public Adapter caseSymbolizerType2(SymbolizerType2 object) {
				return createSymbolizerType2Adapter();
			}
			@Override
			public Adapter caseSymbologyCatalogPropertyType(SymbologyCatalogPropertyType object) {
				return createSymbologyCatalogPropertyTypeAdapter();
			}
			@Override
			public Adapter caseSymbologyCatalogType(SymbologyCatalogType object) {
				return createSymbologyCatalogTypeAdapter();
			}
			@Override
			public Adapter caseTagPropertyType(TagPropertyType object) {
				return createTagPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTagSetPropertyType(TagSetPropertyType object) {
				return createTagSetPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTagSetType(TagSetType object) {
				return createTagSetTypeAdapter();
			}
			@Override
			public Adapter caseTagType(TagType object) {
				return createTagTypeAdapter();
			}
			@Override
			public Adapter caseTagType1(TagType1 object) {
				return createTagType1Adapter();
			}
			@Override
			public Adapter caseTargetColorType(TargetColorType object) {
				return createTargetColorTypeAdapter();
			}
			@Override
			public Adapter caseTextBodyFillType(TextBodyFillType object) {
				return createTextBodyFillTypeAdapter();
			}
			@Override
			public Adapter caseTextGraphicPropertyType(TextGraphicPropertyType object) {
				return createTextGraphicPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTextGraphicType(TextGraphicType object) {
				return createTextGraphicTypeAdapter();
			}
			@Override
			public Adapter caseTextSectionPropertyType(TextSectionPropertyType object) {
				return createTextSectionPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTextSectionType(TextSectionType object) {
				return createTextSectionTypeAdapter();
			}
			@Override
			public Adapter caseTextSymbolizerPropertyType(TextSymbolizerPropertyType object) {
				return createTextSymbolizerPropertyTypeAdapter();
			}
			@Override
			public Adapter caseTextSymbolizerType(TextSymbolizerType object) {
				return createTextSymbolizerTypeAdapter();
			}
			@Override
			public Adapter caseThenType(ThenType object) {
				return createThenTypeAdapter();
			}
			@Override
			public Adapter caseTopEdgeType(TopEdgeType object) {
				return createTopEdgeTypeAdapter();
			}
			@Override
			public Adapter caseTubePropertyType(TubePropertyType object) {
				return createTubePropertyTypeAdapter();
			}
			@Override
			public Adapter caseTubeType(TubeType object) {
				return createTubeTypeAdapter();
			}
			@Override
			public Adapter caseVariablePropertyType(VariablePropertyType object) {
				return createVariablePropertyTypeAdapter();
			}
			@Override
			public Adapter caseVariableStepPropertyType(VariableStepPropertyType object) {
				return createVariableStepPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVariableStepType(VariableStepType object) {
				return createVariableStepTypeAdapter();
			}
			@Override
			public Adapter caseVariableType(VariableType object) {
				return createVariableTypeAdapter();
			}
			@Override
			public Adapter caseVariableType1(VariableType1 object) {
				return createVariableType1Adapter();
			}
			@Override
			public Adapter caseVariableType2(VariableType2 object) {
				return createVariableType2Adapter();
			}
			@Override
			public Adapter caseVariableType3(VariableType3 object) {
				return createVariableType3Adapter();
			}
			@Override
			public Adapter caseVariantGeometryPropertyType(VariantGeometryPropertyType object) {
				return createVariantGeometryPropertyTypeAdapter();
			}
			@Override
			public Adapter caseVariantGeometryType(VariantGeometryType object) {
				return createVariantGeometryTypeAdapter();
			}
			@Override
			public Adapter caseVendorSpecificType(VendorSpecificType object) {
				return createVendorSpecificTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType <em>Additional Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType
	 * @generated
	 */
	public Adapter createAdditionalFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType1 <em>Additional Filter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalFilterType1
	 * @generated
	 */
	public Adapter createAdditionalFilterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersPropertyType <em>Additional Symbolizers Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersPropertyType
	 * @generated
	 */
	public Adapter createAdditionalSymbolizersPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType <em>Additional Symbolizers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType
	 * @generated
	 */
	public Adapter createAdditionalSymbolizersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1 <em>Additional Symbolizers Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdditionalSymbolizersType1
	 * @generated
	 */
	public Adapter createAdditionalSymbolizersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicPropertyType <em>Area Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicPropertyType
	 * @generated
	 */
	public Adapter createAreaGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType <em>Area Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AreaGraphicType
	 * @generated
	 */
	public Adapter createAreaGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerPropertyType <em>Area Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createAreaSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType <em>Area Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AreaSymbolizerType
	 * @generated
	 */
	public Adapter createAreaSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundBorderType <em>Background Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundBorderType
	 * @generated
	 */
	public Adapter createBackgroundBorderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundFillType <em>Background Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BackgroundFillType
	 * @generated
	 */
	public Adapter createBackgroundFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BottomEdgeType <em>Bottom Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BottomEdgeType
	 * @generated
	 */
	public Adapter createBottomEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType <em>Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType
	 * @generated
	 */
	public Adapter createBoundaryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType1 <em>Boundary Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType1
	 * @generated
	 */
	public Adapter createBoundaryType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType2 <em>Boundary Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BoundaryType2
	 * @generated
	 */
	public Adapter createBoundaryType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointPropertyType <em>Bounding Box Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointPropertyType
	 * @generated
	 */
	public Adapter createBoundingBoxPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType <em>Bounding Box Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BoundingBoxPointType
	 * @generated
	 */
	public Adapter createBoundingBoxPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CenterPointPropertyType <em>Center Point Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CenterPointPropertyType
	 * @generated
	 */
	public Adapter createCenterPointPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CenterPointType <em>Center Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CenterPointType
	 * @generated
	 */
	public Adapter createCenterPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcPropertyType <em>Circular Arc Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcPropertyType
	 * @generated
	 */
	public Adapter createCircularArcPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType <em>Circular Arc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CircularArcType
	 * @generated
	 */
	public Adapter createCircularArcTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ClosePropertyType <em>Close Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ClosePropertyType
	 * @generated
	 */
	public Adapter createClosePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CloseType <em>Close Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CloseType
	 * @generated
	 */
	public Adapter createCloseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKPropertyType <em>Color CMYK Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKPropertyType
	 * @generated
	 */
	public Adapter createColorCMYKPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType <em>Color CMYK Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorCMYKType
	 * @generated
	 */
	public Adapter createColorCMYKTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorPropertyType <em>Color Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorPropertyType
	 * @generated
	 */
	public Adapter createColorPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBPropertyType <em>Color RGB Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBPropertyType
	 * @generated
	 */
	public Adapter createColorRGBPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType <em>Color RGB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorRGBType
	 * @generated
	 */
	public Adapter createColorRGBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorType <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorType
	 * @generated
	 */
	public Adapter createColorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorType1 <em>Color Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorType1
	 * @generated
	 */
	public Adapter createColorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorType2 <em>Color Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ColorType2
	 * @generated
	 */
	public Adapter createColorType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicPropertyType <em>Composite Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicPropertyType
	 * @generated
	 */
	public Adapter createCompositeGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicType <em>Composite Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompositeGraphicType
	 * @generated
	 */
	public Adapter createCompositeGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokePropertyType <em>Compound Stroke Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokePropertyType
	 * @generated
	 */
	public Adapter createCompoundStrokePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionPropertyType <em>Compound Stroke Section Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionPropertyType
	 * @generated
	 */
	public Adapter createCompoundStrokeSectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType <em>Compound Stroke Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeSectionType
	 * @generated
	 */
	public Adapter createCompoundStrokeSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType <em>Compound Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CompoundStrokeType
	 * @generated
	 */
	public Adapter createCompoundStrokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurrentStepPropertyType <em>Current Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CurrentStepPropertyType
	 * @generated
	 */
	public Adapter createCurrentStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurrentStepType <em>Current Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CurrentStepType
	 * @generated
	 */
	public Adapter createCurrentStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoPropertyType <em>Curveto Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoPropertyType
	 * @generated
	 */
	public Adapter createCurvetoPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType <em>Curveto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.CurvetoType
	 * @generated
	 */
	public Adapter createCurvetoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokePropertyType <em>Dashed Stroke Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokePropertyType
	 * @generated
	 */
	public Adapter createDashedStrokePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType <em>Dashed Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType
	 * @generated
	 */
	public Adapter createDashedStrokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRulePropertyType <em>Design Rule Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DesignRulePropertyType
	 * @generated
	 */
	public Adapter createDesignRulePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType <em>Design Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType
	 * @generated
	 */
	public Adapter createDesignRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1 <em>Design Rule Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DesignRuleType1
	 * @generated
	 */
	public Adapter createDesignRuleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementPropertyType <em>Displacement Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementPropertyType
	 * @generated
	 */
	public Adapter createDisplacementPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType <em>Displacement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DisplacementType
	 * @generated
	 */
	public Adapter createDisplacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementPropertyType <em>Element Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ElementPropertyType
	 * @generated
	 */
	public Adapter createElementPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1 <em>Element Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ElementType1
	 * @generated
	 */
	public Adapter createElementType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ElseType <em>Else Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ElseType
	 * @generated
	 */
	public Adapter createElseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitPropertyType <em>Emit Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.EmitPropertyType
	 * @generated
	 */
	public Adapter createEmitPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType <em>Emit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.EmitType
	 * @generated
	 */
	public Adapter createEmitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1 <em>Emit Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.EmitType1
	 * @generated
	 */
	public Adapter createEmitType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EveryPropertyType <em>Every Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.EveryPropertyType
	 * @generated
	 */
	public Adapter createEveryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.EveryType <em>Every Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.EveryType
	 * @generated
	 */
	public Adapter createEveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionPropertyType <em>Expression Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionPropertyType
	 * @generated
	 */
	public Adapter createExpressionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType
	 * @generated
	 */
	public Adapter createExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType1 <em>Expression Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ExpressionType1
	 * @generated
	 */
	public Adapter createExpressionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepPropertyType <em>Feature Type Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepPropertyType
	 * @generated
	 */
	public Adapter createFeatureTypeStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepType <em>Feature Type Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FeatureTypeStepType
	 * @generated
	 */
	public Adapter createFeatureTypeStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FillPropertyType <em>Fill Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FillPropertyType
	 * @generated
	 */
	public Adapter createFillPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FillType <em>Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FillType
	 * @generated
	 */
	public Adapter createFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerPropertyType <em>Filtered Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createFilteredSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType <em>Filtered Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FilteredSymbolizerType
	 * @generated
	 */
	public Adapter createFilteredSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterPropertyType <em>Filter Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FilterPropertyType
	 * @generated
	 */
	public Adapter createFilterPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FilterType
	 * @generated
	 */
	public Adapter createFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1 <em>Filter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1
	 * @generated
	 */
	public Adapter createFilterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepPropertyType <em>First Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepPropertyType
	 * @generated
	 */
	public Adapter createFirstStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType <em>First Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType
	 * @generated
	 */
	public Adapter createFirstStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType1 <em>First Step Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FirstStepType1
	 * @generated
	 */
	public Adapter createFirstStepType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontPropertyType <em>Font Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontPropertyType
	 * @generated
	 */
	public Adapter createFontPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontType
	 * @generated
	 */
	public Adapter createFontTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FontType1 <em>Font Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.FontType1
	 * @generated
	 */
	public Adapter createFontType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForPropertyType <em>For Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ForPropertyType
	 * @generated
	 */
	public Adapter createForPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ForType <em>For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ForType
	 * @generated
	 */
	public Adapter createForTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GapPropertyType <em>Gap Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GapPropertyType
	 * @generated
	 */
	public Adapter createGapPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GapType <em>Gap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GapType
	 * @generated
	 */
	public Adapter createGapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType <em>Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType
	 * @generated
	 */
	public Adapter createGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType1 <em>Geometry Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType1
	 * @generated
	 */
	public Adapter createGeometryType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType2 <em>Geometry Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryType2
	 * @generated
	 */
	public Adapter createGeometryType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillPropertyType <em>Graphic Fill Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillPropertyType
	 * @generated
	 */
	public Adapter createGraphicFillPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillType <em>Graphic Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicFillType
	 * @generated
	 */
	public Adapter createGraphicFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicPropertyType <em>Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicPropertyType
	 * @generated
	 */
	public Adapter createGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType <em>Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType
	 * @generated
	 */
	public Adapter createGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType1 <em>Graphic Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType1
	 * @generated
	 */
	public Adapter createGraphicType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType2 <em>Graphic Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType2
	 * @generated
	 */
	public Adapter createGraphicType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3 <em>Graphic Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GraphicType3
	 * @generated
	 */
	public Adapter createGraphicType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloColorType <em>Halo Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HaloColorType
	 * @generated
	 */
	public Adapter createHaloColorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloPropertyType <em>Halo Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HaloPropertyType
	 * @generated
	 */
	public Adapter createHaloPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType <em>Halo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HaloType
	 * @generated
	 */
	public Adapter createHaloTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1 <em>Halo Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HaloType1
	 * @generated
	 */
	public Adapter createHaloType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HaloType2 <em>Halo Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HaloType2
	 * @generated
	 */
	public Adapter createHaloType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchDefinitionLongestSidePropertyType <em>Hatch Definition Longest Side Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchDefinitionLongestSidePropertyType
	 * @generated
	 */
	public Adapter createHatchDefinitionLongestSidePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchDefinitionPropertyType <em>Hatch Definition Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchDefinitionPropertyType
	 * @generated
	 */
	public Adapter createHatchDefinitionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillLongestSidePropertyType <em>Hatch Fill Longest Side Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillLongestSidePropertyType
	 * @generated
	 */
	public Adapter createHatchFillLongestSidePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillLongestSideType <em>Hatch Fill Longest Side Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillLongestSideType
	 * @generated
	 */
	public Adapter createHatchFillLongestSideTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillPropertyType <em>Hatch Fill Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillPropertyType
	 * @generated
	 */
	public Adapter createHatchFillPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillType <em>Hatch Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchFillType
	 * @generated
	 */
	public Adapter createHatchFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesLongestSidePropertyType <em>Hatch Lines Longest Side Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesLongestSidePropertyType
	 * @generated
	 */
	public Adapter createHatchLinesLongestSidePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesLongestSideType <em>Hatch Lines Longest Side Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesLongestSideType
	 * @generated
	 */
	public Adapter createHatchLinesLongestSideTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesPropertyType <em>Hatch Lines Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesPropertyType
	 * @generated
	 */
	public Adapter createHatchLinesPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType <em>Hatch Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.HatchLinesType
	 * @generated
	 */
	public Adapter createHatchLinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfPropertyType <em>If Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.IfPropertyType
	 * @generated
	 */
	public Adapter createIfPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.IfType <em>If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.IfType
	 * @generated
	 */
	public Adapter createIfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType <em>Interior Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType
	 * @generated
	 */
	public Adapter createInteriorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType1 <em>Interior Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.InteriorType1
	 * @generated
	 */
	public Adapter createInteriorType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.InType <em>In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.InType
	 * @generated
	 */
	public Adapter createInTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.InType1 <em>In Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.InType1
	 * @generated
	 */
	public Adapter createInType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType <em>Label Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelPropertyType
	 * @generated
	 */
	public Adapter createLabelPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType <em>Label Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType
	 * @generated
	 */
	public Adapter createLabelTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType1 <em>Label Text Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelTextType1
	 * @generated
	 */
	public Adapter createLabelTextType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType1 <em>Label Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelType1
	 * @generated
	 */
	public Adapter createLabelType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2 <em>Label Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelType2
	 * @generated
	 */
	public Adapter createLabelType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3 <em>Label Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LabelType3
	 * @generated
	 */
	public Adapter createLabelType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerPropertyType <em>Layer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LayerPropertyType
	 * @generated
	 */
	public Adapter createLayerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType <em>Layer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LayerType
	 * @generated
	 */
	public Adapter createLayerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1 <em>Layer Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LayerType1
	 * @generated
	 */
	public Adapter createLayerType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineGraphicPropertyType <em>Line Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineGraphicPropertyType
	 * @generated
	 */
	public Adapter createLineGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineGraphicType <em>Line Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineGraphicType
	 * @generated
	 */
	public Adapter createLineGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelPropertyType <em>Line Label Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelPropertyType
	 * @generated
	 */
	public Adapter createLineLabelPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType <em>Line Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineLabelType
	 * @generated
	 */
	public Adapter createLineLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicPropertyType <em>Line Placed Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicPropertyType
	 * @generated
	 */
	public Adapter createLinePlacedGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType <em>Line Placed Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LinePlacedGraphicType
	 * @generated
	 */
	public Adapter createLinePlacedGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerPropertyType <em>Line Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createLineSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerType <em>Line Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineSymbolizerType
	 * @generated
	 */
	public Adapter createLineSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinetoPropertyType <em>Lineto Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LinetoPropertyType
	 * @generated
	 */
	public Adapter createLinetoPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LinetoType <em>Lineto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LinetoType
	 * @generated
	 */
	public Adapter createLinetoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LiteralPropertyType <em>Literal Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LiteralPropertyType
	 * @generated
	 */
	public Adapter createLiteralPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LiteralType
	 * @generated
	 */
	public Adapter createLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringPropertyType <em>Maximum Adjacent Line String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringPropertyType
	 * @generated
	 */
	public Adapter createMaximumAdjacentLineStringPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType <em>Maximum Adjacent Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentLineStringType
	 * @generated
	 */
	public Adapter createMaximumAdjacentLineStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentSurfacePropertyType <em>Maximum Adjacent Surface Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentSurfacePropertyType
	 * @generated
	 */
	public Adapter createMaximumAdjacentSurfacePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentSurfaceType <em>Maximum Adjacent Surface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MaximumAdjacentSurfaceType
	 * @generated
	 */
	public Adapter createMaximumAdjacentSurfaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralPropertyType <em>Measure Literal Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralPropertyType
	 * @generated
	 */
	public Adapter createMeasureLiteralPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType <em>Measure Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MeasureLiteralType
	 * @generated
	 */
	public Adapter createMeasureLiteralTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MemberType
	 * @generated
	 */
	public Adapter createMemberTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MovetoPropertyType <em>Moveto Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MovetoPropertyType
	 * @generated
	 */
	public Adapter createMovetoPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.MovetoType <em>Moveto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.MovetoType
	 * @generated
	 */
	public Adapter createMovetoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.NeighborhoodFilterType <em>Neighborhood Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NeighborhoodFilterType
	 * @generated
	 */
	public Adapter createNeighborhoodFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.NullColorPropertyType <em>Null Color Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NullColorPropertyType
	 * @generated
	 */
	public Adapter createNullColorPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.NullColorType <em>Null Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NullColorType
	 * @generated
	 */
	public Adapter createNullColorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.NullSymbolizerPropertyType <em>Null Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NullSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createNullSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.NullSymbolizerType <em>Null Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NullSymbolizerType
	 * @generated
	 */
	public Adapter createNullSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.OperandType <em>Operand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.OperandType
	 * @generated
	 */
	public Adapter createOperandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.OperationPropertyType <em>Operation Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.OperationPropertyType
	 * @generated
	 */
	public Adapter createOperationPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.OperationType
	 * @generated
	 */
	public Adapter createOperationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathElementPropertyType <em>Path Element Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PathElementPropertyType
	 * @generated
	 */
	public Adapter createPathElementPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathElementType <em>Path Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PathElementType
	 * @generated
	 */
	public Adapter createPathElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathPropertyType <em>Path Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PathPropertyType
	 * @generated
	 */
	public Adapter createPathPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PathType <em>Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PathType
	 * @generated
	 */
	public Adapter createPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetPropertyType <em>Perpendicular Offset Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetPropertyType
	 * @generated
	 */
	public Adapter createPerpendicularOffsetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType <em>Perpendicular Offset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PerpendicularOffsetType
	 * @generated
	 */
	public Adapter createPerpendicularOffsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PlacementRulePropertyType <em>Placement Rule Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PlacementRulePropertyType
	 * @generated
	 */
	public Adapter createPlacementRulePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PlacementRuleType <em>Placement Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PlacementRuleType
	 * @generated
	 */
	public Adapter createPlacementRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PlacementType <em>Placement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PlacementType
	 * @generated
	 */
	public Adapter createPlacementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelPropertyType <em>Point Label Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelPropertyType
	 * @generated
	 */
	public Adapter createPointLabelPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType <em>Point Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointLabelType
	 * @generated
	 */
	public Adapter createPointLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaDefinitionPropertyType <em>Points In Area Definition Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaDefinitionPropertyType
	 * @generated
	 */
	public Adapter createPointsInAreaDefinitionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaPropertyType <em>Points In Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaPropertyType
	 * @generated
	 */
	public Adapter createPointsInAreaPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType <em>Points In Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointsInAreaType
	 * @generated
	 */
	public Adapter createPointsInAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLinePropertyType <em>Points On Line Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLinePropertyType
	 * @generated
	 */
	public Adapter createPointsOnLinePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType <em>Points On Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointsOnLineType
	 * @generated
	 */
	public Adapter createPointsOnLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointSymbolizerPropertyType <em>Point Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createPointSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PointSymbolizerType <em>Point Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PointSymbolizerType
	 * @generated
	 */
	public Adapter createPointSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PostGraphicType <em>Post Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PostGraphicType
	 * @generated
	 */
	public Adapter createPostGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PredicateType <em>Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PredicateType
	 * @generated
	 */
	public Adapter createPredicateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PredicateType1 <em>Predicate Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PredicateType1
	 * @generated
	 */
	public Adapter createPredicateType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PreGraphicType <em>Pre Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PreGraphicType
	 * @generated
	 */
	public Adapter createPreGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PropertyPropertyType <em>Property Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PropertyPropertyType
	 * @generated
	 */
	public Adapter createPropertyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerPropertyType <em>Pure Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createPureSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType <em>Pure Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType
	 * @generated
	 */
	public Adapter createPureSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1 <em>Pure Symbolizer Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.PureSymbolizerType1
	 * @generated
	 */
	public Adapter createPureSymbolizerType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierPropertyType <em>Quantifier Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierPropertyType
	 * @generated
	 */
	public Adapter createQuantifierPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType <em>Quantifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.QuantifierType
	 * @generated
	 */
	public Adapter createQuantifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateFilterType <em>Relate Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateFilterType
	 * @generated
	 */
	public Adapter createRelateFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryPropertyType <em>Relate Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryPropertyType
	 * @generated
	 */
	public Adapter createRelateGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType <em>Relate Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateGeometryType
	 * @generated
	 */
	public Adapter createRelateGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyPropertyType <em>Relate Topology Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyPropertyType
	 * @generated
	 */
	public Adapter createRelateTopologyPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType <em>Relate Topology Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType
	 * @generated
	 */
	public Adapter createRelateTopologyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ReturnType
	 * @generated
	 */
	public Adapter createReturnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RulePropertyType <em>Rule Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RulePropertyType
	 * @generated
	 */
	public Adapter createRulePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetPropertyType <em>Rule Set Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetPropertyType
	 * @generated
	 */
	public Adapter createRuleSetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType <em>Rule Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType
	 * @generated
	 */
	public Adapter createRuleSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType1 <em>Rule Set Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RuleSetType1
	 * @generated
	 */
	public Adapter createRuleSetType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RulesToConsiderType <em>Rules To Consider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RulesToConsiderType
	 * @generated
	 */
	public Adapter createRulesToConsiderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RuleType
	 * @generated
	 */
	public Adapter createRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RuleType1 <em>Rule Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.RuleType1
	 * @generated
	 */
	public Adapter createRuleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SatisfiesType <em>Satisfies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SatisfiesType
	 * @generated
	 */
	public Adapter createSatisfiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SectionType
	 * @generated
	 */
	public Adapter createSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SelfStepPropertyType <em>Self Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SelfStepPropertyType
	 * @generated
	 */
	public Adapter createSelfStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SelfStepType <em>Self Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SelfStepType
	 * @generated
	 */
	public Adapter createSelfStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelPropertyType <em>Shielded Point Label Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelPropertyType
	 * @generated
	 */
	public Adapter createShieldedPointLabelPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType <em>Shielded Point Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ShieldedPointLabelType
	 * @generated
	 */
	public Adapter createShieldedPointLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicPropertyType <em>Simple Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicPropertyType
	 * @generated
	 */
	public Adapter createSimpleGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicType <em>Simple Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SimpleGraphicType
	 * @generated
	 */
	public Adapter createSimpleGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SkeletonLinePropertyType <em>Skeleton Line Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SkeletonLinePropertyType
	 * @generated
	 */
	public Adapter createSkeletonLinePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SkeletonLineType <em>Skeleton Line Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SkeletonLineType
	 * @generated
	 */
	public Adapter createSkeletonLineTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesPropertyType <em>Slope Hatch Lines Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesPropertyType
	 * @generated
	 */
	public Adapter createSlopeHatchLinesPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType <em>Slope Hatch Lines Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SlopeHatchLinesType
	 * @generated
	 */
	public Adapter createSlopeHatchLinesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillPropertyType <em>Solid Fill Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillPropertyType
	 * @generated
	 */
	public Adapter createSolidFillPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillType <em>Solid Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidFillType
	 * @generated
	 */
	public Adapter createSolidFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokePropertyType <em>Solid Or Dashed Stroke Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokePropertyType
	 * @generated
	 */
	public Adapter createSolidOrDashedStrokePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType <em>Solid Or Dashed Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType
	 * @generated
	 */
	public Adapter createSolidOrDashedStrokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionPropertyType <em>Solid Section Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionPropertyType
	 * @generated
	 */
	public Adapter createSolidSectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionType <em>Solid Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidSectionType
	 * @generated
	 */
	public Adapter createSolidSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokePropertyType <em>Solid Stroke Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokePropertyType
	 * @generated
	 */
	public Adapter createSolidStrokePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokeType <em>Solid Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SolidStrokeType
	 * @generated
	 */
	public Adapter createSolidStrokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SomePropertyType <em>Some Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SomePropertyType
	 * @generated
	 */
	public Adapter createSomePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SomeType <em>Some Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SomeType
	 * @generated
	 */
	public Adapter createSomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepPropertyType <em>Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StepPropertyType
	 * @generated
	 */
	public Adapter createStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StepType1 <em>Step Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StepType1
	 * @generated
	 */
	public Adapter createStepType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokePropertyType <em>Stroke Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokePropertyType
	 * @generated
	 */
	public Adapter createStrokePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType <em>Stroke Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType
	 * @generated
	 */
	public Adapter createStrokeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType1 <em>Stroke Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType1
	 * @generated
	 */
	public Adapter createStrokeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType2 <em>Stroke Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType2
	 * @generated
	 */
	public Adapter createStrokeType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType3 <em>Stroke Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType3
	 * @generated
	 */
	public Adapter createStrokeType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType4 <em>Stroke Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType4
	 * @generated
	 */
	public Adapter createStrokeType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5 <em>Stroke Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StrokeType5
	 * @generated
	 */
	public Adapter createStrokeType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StylePropertyType <em>Style Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StylePropertyType
	 * @generated
	 */
	public Adapter createStylePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StyleType
	 * @generated
	 */
	public Adapter createStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.StyleType1 <em>Style Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.StyleType1
	 * @generated
	 */
	public Adapter createStyleType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerPredicateType <em>Symbolizer Predicate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerPredicateType
	 * @generated
	 */
	public Adapter createSymbolizerPredicateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerPropertyType <em>Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerPropertyType
	 * @generated
	 */
	public Adapter createSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType <em>Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType
	 * @generated
	 */
	public Adapter createSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType1 <em>Symbolizer Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType1
	 * @generated
	 */
	public Adapter createSymbolizerType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType2 <em>Symbolizer Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbolizerType2
	 * @generated
	 */
	public Adapter createSymbolizerType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogPropertyType <em>Symbology Catalog Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogPropertyType
	 * @generated
	 */
	public Adapter createSymbologyCatalogPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType <em>Symbology Catalog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.SymbologyCatalogType
	 * @generated
	 */
	public Adapter createSymbologyCatalogTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagPropertyType <em>Tag Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TagPropertyType
	 * @generated
	 */
	public Adapter createTagPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagSetPropertyType <em>Tag Set Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TagSetPropertyType
	 * @generated
	 */
	public Adapter createTagSetPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagSetType <em>Tag Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TagSetType
	 * @generated
	 */
	public Adapter createTagSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TagType
	 * @generated
	 */
	public Adapter createTagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TagType1 <em>Tag Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TagType1
	 * @generated
	 */
	public Adapter createTagType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TargetColorType <em>Target Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TargetColorType
	 * @generated
	 */
	public Adapter createTargetColorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextBodyFillType <em>Text Body Fill Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextBodyFillType
	 * @generated
	 */
	public Adapter createTextBodyFillTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextGraphicPropertyType <em>Text Graphic Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextGraphicPropertyType
	 * @generated
	 */
	public Adapter createTextGraphicPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextGraphicType <em>Text Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextGraphicType
	 * @generated
	 */
	public Adapter createTextGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSectionPropertyType <em>Text Section Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextSectionPropertyType
	 * @generated
	 */
	public Adapter createTextSectionPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSectionType <em>Text Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextSectionType
	 * @generated
	 */
	public Adapter createTextSectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerPropertyType <em>Text Symbolizer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerPropertyType
	 * @generated
	 */
	public Adapter createTextSymbolizerPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerType <em>Text Symbolizer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TextSymbolizerType
	 * @generated
	 */
	public Adapter createTextSymbolizerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.ThenType <em>Then Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.ThenType
	 * @generated
	 */
	public Adapter createThenTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TopEdgeType <em>Top Edge Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TopEdgeType
	 * @generated
	 */
	public Adapter createTopEdgeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubePropertyType <em>Tube Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TubePropertyType
	 * @generated
	 */
	public Adapter createTubePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType <em>Tube Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.TubeType
	 * @generated
	 */
	public Adapter createTubeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariablePropertyType <em>Variable Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariablePropertyType
	 * @generated
	 */
	public Adapter createVariablePropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepPropertyType <em>Variable Step Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepPropertyType
	 * @generated
	 */
	public Adapter createVariableStepPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepType <em>Variable Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableStepType
	 * @generated
	 */
	public Adapter createVariableStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableType
	 * @generated
	 */
	public Adapter createVariableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType1 <em>Variable Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableType1
	 * @generated
	 */
	public Adapter createVariableType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType2 <em>Variable Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableType2
	 * @generated
	 */
	public Adapter createVariableType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariableType3 <em>Variable Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariableType3
	 * @generated
	 */
	public Adapter createVariableType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryPropertyType <em>Variant Geometry Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryPropertyType
	 * @generated
	 */
	public Adapter createVariantGeometryPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType <em>Variant Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VariantGeometryType
	 * @generated
	 */
	public Adapter createVariantGeometryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.online.adv.namespaces.adv.sk.xml.skadv.VendorSpecificType <em>Vendor Specific Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.VendorSpecificType
	 * @generated
	 */
	public Adapter createVendorSpecificTypeAdapter() {
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

} //AAAAdapterFactory
