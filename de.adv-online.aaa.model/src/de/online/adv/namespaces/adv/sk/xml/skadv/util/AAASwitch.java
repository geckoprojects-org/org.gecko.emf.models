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
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage
 * @generated
 */
public class AAASwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AAAPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAASwitch() {
		if (modelPackage == null) {
			modelPackage = AAAPackage.eINSTANCE;
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
			case AAAPackage.ADDITIONAL_FILTER_TYPE: {
				AdditionalFilterType additionalFilterType = (AdditionalFilterType)theEObject;
				T result = caseAdditionalFilterType(additionalFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ADDITIONAL_FILTER_TYPE1: {
				AdditionalFilterType1 additionalFilterType1 = (AdditionalFilterType1)theEObject;
				T result = caseAdditionalFilterType1(additionalFilterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_PROPERTY_TYPE: {
				AdditionalSymbolizersPropertyType additionalSymbolizersPropertyType = (AdditionalSymbolizersPropertyType)theEObject;
				T result = caseAdditionalSymbolizersPropertyType(additionalSymbolizersPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE: {
				AdditionalSymbolizersType additionalSymbolizersType = (AdditionalSymbolizersType)theEObject;
				T result = caseAdditionalSymbolizersType(additionalSymbolizersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ADDITIONAL_SYMBOLIZERS_TYPE1: {
				AdditionalSymbolizersType1 additionalSymbolizersType1 = (AdditionalSymbolizersType1)theEObject;
				T result = caseAdditionalSymbolizersType1(additionalSymbolizersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.AREA_GRAPHIC_PROPERTY_TYPE: {
				AreaGraphicPropertyType areaGraphicPropertyType = (AreaGraphicPropertyType)theEObject;
				T result = caseAreaGraphicPropertyType(areaGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.AREA_GRAPHIC_TYPE: {
				AreaGraphicType areaGraphicType = (AreaGraphicType)theEObject;
				T result = caseAreaGraphicType(areaGraphicType);
				if (result == null) result = caseSimpleGraphicType(areaGraphicType);
				if (result == null) result = caseGraphicType3(areaGraphicType);
				if (result == null) result = caseElementType1(areaGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.AREA_SYMBOLIZER_PROPERTY_TYPE: {
				AreaSymbolizerPropertyType areaSymbolizerPropertyType = (AreaSymbolizerPropertyType)theEObject;
				T result = caseAreaSymbolizerPropertyType(areaSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.AREA_SYMBOLIZER_TYPE: {
				AreaSymbolizerType areaSymbolizerType = (AreaSymbolizerType)theEObject;
				T result = caseAreaSymbolizerType(areaSymbolizerType);
				if (result == null) result = casePureSymbolizerType1(areaSymbolizerType);
				if (result == null) result = caseSymbolizerType1(areaSymbolizerType);
				if (result == null) result = caseElementType1(areaSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BACKGROUND_BORDER_TYPE: {
				BackgroundBorderType backgroundBorderType = (BackgroundBorderType)theEObject;
				T result = caseBackgroundBorderType(backgroundBorderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BACKGROUND_FILL_TYPE: {
				BackgroundFillType backgroundFillType = (BackgroundFillType)theEObject;
				T result = caseBackgroundFillType(backgroundFillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOTTOM_EDGE_TYPE: {
				BottomEdgeType bottomEdgeType = (BottomEdgeType)theEObject;
				T result = caseBottomEdgeType(bottomEdgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOUNDARY_TYPE: {
				BoundaryType boundaryType = (BoundaryType)theEObject;
				T result = caseBoundaryType(boundaryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOUNDARY_TYPE1: {
				BoundaryType1 boundaryType1 = (BoundaryType1)theEObject;
				T result = caseBoundaryType1(boundaryType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOUNDARY_TYPE2: {
				BoundaryType2 boundaryType2 = (BoundaryType2)theEObject;
				T result = caseBoundaryType2(boundaryType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOUNDING_BOX_POINT_PROPERTY_TYPE: {
				BoundingBoxPointPropertyType boundingBoxPointPropertyType = (BoundingBoxPointPropertyType)theEObject;
				T result = caseBoundingBoxPointPropertyType(boundingBoxPointPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.BOUNDING_BOX_POINT_TYPE: {
				BoundingBoxPointType boundingBoxPointType = (BoundingBoxPointType)theEObject;
				T result = caseBoundingBoxPointType(boundingBoxPointType);
				if (result == null) result = casePlacementRuleType(boundingBoxPointType);
				if (result == null) result = caseElementType1(boundingBoxPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CENTER_POINT_PROPERTY_TYPE: {
				CenterPointPropertyType centerPointPropertyType = (CenterPointPropertyType)theEObject;
				T result = caseCenterPointPropertyType(centerPointPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CENTER_POINT_TYPE: {
				CenterPointType centerPointType = (CenterPointType)theEObject;
				T result = caseCenterPointType(centerPointType);
				if (result == null) result = casePlacementRuleType(centerPointType);
				if (result == null) result = caseElementType1(centerPointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CIRCULAR_ARC_PROPERTY_TYPE: {
				CircularArcPropertyType circularArcPropertyType = (CircularArcPropertyType)theEObject;
				T result = caseCircularArcPropertyType(circularArcPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CIRCULAR_ARC_TYPE: {
				CircularArcType circularArcType = (CircularArcType)theEObject;
				T result = caseCircularArcType(circularArcType);
				if (result == null) result = casePathElementType(circularArcType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CLOSE_PROPERTY_TYPE: {
				ClosePropertyType closePropertyType = (ClosePropertyType)theEObject;
				T result = caseClosePropertyType(closePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CLOSE_TYPE: {
				CloseType closeType = (CloseType)theEObject;
				T result = caseCloseType(closeType);
				if (result == null) result = casePathElementType(closeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_CMYK_PROPERTY_TYPE: {
				ColorCMYKPropertyType colorCMYKPropertyType = (ColorCMYKPropertyType)theEObject;
				T result = caseColorCMYKPropertyType(colorCMYKPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_CMYK_TYPE: {
				ColorCMYKType colorCMYKType = (ColorCMYKType)theEObject;
				T result = caseColorCMYKType(colorCMYKType);
				if (result == null) result = caseColorType2(colorCMYKType);
				if (result == null) result = caseElementType1(colorCMYKType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_PROPERTY_TYPE: {
				ColorPropertyType colorPropertyType = (ColorPropertyType)theEObject;
				T result = caseColorPropertyType(colorPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_RGB_PROPERTY_TYPE: {
				ColorRGBPropertyType colorRGBPropertyType = (ColorRGBPropertyType)theEObject;
				T result = caseColorRGBPropertyType(colorRGBPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_RGB_TYPE: {
				ColorRGBType colorRGBType = (ColorRGBType)theEObject;
				T result = caseColorRGBType(colorRGBType);
				if (result == null) result = caseColorType2(colorRGBType);
				if (result == null) result = caseElementType1(colorRGBType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_TYPE: {
				ColorType colorType = (ColorType)theEObject;
				T result = caseColorType(colorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_TYPE1: {
				ColorType1 colorType1 = (ColorType1)theEObject;
				T result = caseColorType1(colorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COLOR_TYPE2: {
				ColorType2 colorType2 = (ColorType2)theEObject;
				T result = caseColorType2(colorType2);
				if (result == null) result = caseElementType1(colorType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOSITE_GRAPHIC_PROPERTY_TYPE: {
				CompositeGraphicPropertyType compositeGraphicPropertyType = (CompositeGraphicPropertyType)theEObject;
				T result = caseCompositeGraphicPropertyType(compositeGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOSITE_GRAPHIC_TYPE: {
				CompositeGraphicType compositeGraphicType = (CompositeGraphicType)theEObject;
				T result = caseCompositeGraphicType(compositeGraphicType);
				if (result == null) result = caseGraphicType3(compositeGraphicType);
				if (result == null) result = caseElementType1(compositeGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOUND_STROKE_PROPERTY_TYPE: {
				CompoundStrokePropertyType compoundStrokePropertyType = (CompoundStrokePropertyType)theEObject;
				T result = caseCompoundStrokePropertyType(compoundStrokePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOUND_STROKE_SECTION_PROPERTY_TYPE: {
				CompoundStrokeSectionPropertyType compoundStrokeSectionPropertyType = (CompoundStrokeSectionPropertyType)theEObject;
				T result = caseCompoundStrokeSectionPropertyType(compoundStrokeSectionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOUND_STROKE_SECTION_TYPE: {
				CompoundStrokeSectionType compoundStrokeSectionType = (CompoundStrokeSectionType)theEObject;
				T result = caseCompoundStrokeSectionType(compoundStrokeSectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.COMPOUND_STROKE_TYPE: {
				CompoundStrokeType compoundStrokeType = (CompoundStrokeType)theEObject;
				T result = caseCompoundStrokeType(compoundStrokeType);
				if (result == null) result = caseStrokeType5(compoundStrokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CURRENT_STEP_PROPERTY_TYPE: {
				CurrentStepPropertyType currentStepPropertyType = (CurrentStepPropertyType)theEObject;
				T result = caseCurrentStepPropertyType(currentStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CURRENT_STEP_TYPE: {
				CurrentStepType currentStepType = (CurrentStepType)theEObject;
				T result = caseCurrentStepType(currentStepType);
				if (result == null) result = caseFirstStepType1(currentStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CURVETO_PROPERTY_TYPE: {
				CurvetoPropertyType curvetoPropertyType = (CurvetoPropertyType)theEObject;
				T result = caseCurvetoPropertyType(curvetoPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.CURVETO_TYPE: {
				CurvetoType curvetoType = (CurvetoType)theEObject;
				T result = caseCurvetoType(curvetoType);
				if (result == null) result = casePathElementType(curvetoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DASHED_STROKE_PROPERTY_TYPE: {
				DashedStrokePropertyType dashedStrokePropertyType = (DashedStrokePropertyType)theEObject;
				T result = caseDashedStrokePropertyType(dashedStrokePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DASHED_STROKE_TYPE: {
				DashedStrokeType dashedStrokeType = (DashedStrokeType)theEObject;
				T result = caseDashedStrokeType(dashedStrokeType);
				if (result == null) result = caseSolidOrDashedStrokeType(dashedStrokeType);
				if (result == null) result = caseStrokeType5(dashedStrokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DESIGN_RULE_PROPERTY_TYPE: {
				DesignRulePropertyType designRulePropertyType = (DesignRulePropertyType)theEObject;
				T result = caseDesignRulePropertyType(designRulePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DESIGN_RULE_TYPE: {
				DesignRuleType designRuleType = (DesignRuleType)theEObject;
				T result = caseDesignRuleType(designRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DESIGN_RULE_TYPE1: {
				DesignRuleType1 designRuleType1 = (DesignRuleType1)theEObject;
				T result = caseDesignRuleType1(designRuleType1);
				if (result == null) result = caseElementType1(designRuleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DISPLACEMENT_PROPERTY_TYPE: {
				DisplacementPropertyType displacementPropertyType = (DisplacementPropertyType)theEObject;
				T result = caseDisplacementPropertyType(displacementPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DISPLACEMENT_TYPE: {
				DisplacementType displacementType = (DisplacementType)theEObject;
				T result = caseDisplacementType(displacementType);
				if (result == null) result = casePlacementRuleType(displacementType);
				if (result == null) result = caseElementType1(displacementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ELEMENT_PROPERTY_TYPE: {
				ElementPropertyType elementPropertyType = (ElementPropertyType)theEObject;
				T result = caseElementPropertyType(elementPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ELEMENT_TYPE: {
				ElementType elementType = (ElementType)theEObject;
				T result = caseElementType(elementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ELEMENT_TYPE1: {
				ElementType1 elementType1 = (ElementType1)theEObject;
				T result = caseElementType1(elementType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.ELSE_TYPE: {
				ElseType elseType = (ElseType)theEObject;
				T result = caseElseType(elseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EMIT_PROPERTY_TYPE: {
				EmitPropertyType emitPropertyType = (EmitPropertyType)theEObject;
				T result = caseEmitPropertyType(emitPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EMIT_TYPE: {
				EmitType emitType = (EmitType)theEObject;
				T result = caseEmitType(emitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EMIT_TYPE1: {
				EmitType1 emitType1 = (EmitType1)theEObject;
				T result = caseEmitType1(emitType1);
				if (result == null) result = caseElementType1(emitType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EVERY_PROPERTY_TYPE: {
				EveryPropertyType everyPropertyType = (EveryPropertyType)theEObject;
				T result = caseEveryPropertyType(everyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EVERY_TYPE: {
				EveryType everyType = (EveryType)theEObject;
				T result = caseEveryType(everyType);
				if (result == null) result = caseQuantifierType(everyType);
				if (result == null) result = caseExpressionType1(everyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EXPRESSION_PROPERTY_TYPE: {
				ExpressionPropertyType expressionPropertyType = (ExpressionPropertyType)theEObject;
				T result = caseExpressionPropertyType(expressionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EXPRESSION_TYPE: {
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.EXPRESSION_TYPE1: {
				ExpressionType1 expressionType1 = (ExpressionType1)theEObject;
				T result = caseExpressionType1(expressionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FEATURE_TYPE_STEP_PROPERTY_TYPE: {
				FeatureTypeStepPropertyType featureTypeStepPropertyType = (FeatureTypeStepPropertyType)theEObject;
				T result = caseFeatureTypeStepPropertyType(featureTypeStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FEATURE_TYPE_STEP_TYPE: {
				FeatureTypeStepType featureTypeStepType = (FeatureTypeStepType)theEObject;
				T result = caseFeatureTypeStepType(featureTypeStepType);
				if (result == null) result = caseFirstStepType1(featureTypeStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILL_PROPERTY_TYPE: {
				FillPropertyType fillPropertyType = (FillPropertyType)theEObject;
				T result = caseFillPropertyType(fillPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILL_TYPE: {
				FillType fillType = (FillType)theEObject;
				T result = caseFillType(fillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILTERED_SYMBOLIZER_PROPERTY_TYPE: {
				FilteredSymbolizerPropertyType filteredSymbolizerPropertyType = (FilteredSymbolizerPropertyType)theEObject;
				T result = caseFilteredSymbolizerPropertyType(filteredSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILTERED_SYMBOLIZER_TYPE: {
				FilteredSymbolizerType filteredSymbolizerType = (FilteredSymbolizerType)theEObject;
				T result = caseFilteredSymbolizerType(filteredSymbolizerType);
				if (result == null) result = caseSymbolizerType1(filteredSymbolizerType);
				if (result == null) result = caseElementType1(filteredSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILTER_PROPERTY_TYPE: {
				FilterPropertyType filterPropertyType = (FilterPropertyType)theEObject;
				T result = caseFilterPropertyType(filterPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILTER_TYPE: {
				FilterType filterType = (FilterType)theEObject;
				T result = caseFilterType(filterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FILTER_TYPE1: {
				FilterType1 filterType1 = (FilterType1)theEObject;
				T result = caseFilterType1(filterType1);
				if (result == null) result = caseElementType1(filterType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FIRST_STEP_PROPERTY_TYPE: {
				FirstStepPropertyType firstStepPropertyType = (FirstStepPropertyType)theEObject;
				T result = caseFirstStepPropertyType(firstStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FIRST_STEP_TYPE: {
				FirstStepType firstStepType = (FirstStepType)theEObject;
				T result = caseFirstStepType(firstStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FIRST_STEP_TYPE1: {
				FirstStepType1 firstStepType1 = (FirstStepType1)theEObject;
				T result = caseFirstStepType1(firstStepType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FONT_PROPERTY_TYPE: {
				FontPropertyType fontPropertyType = (FontPropertyType)theEObject;
				T result = caseFontPropertyType(fontPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FONT_TYPE: {
				FontType fontType = (FontType)theEObject;
				T result = caseFontType(fontType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FONT_TYPE1: {
				FontType1 fontType1 = (FontType1)theEObject;
				T result = caseFontType1(fontType1);
				if (result == null) result = caseElementType1(fontType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FOR_PROPERTY_TYPE: {
				ForPropertyType forPropertyType = (ForPropertyType)theEObject;
				T result = caseForPropertyType(forPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.FOR_TYPE: {
				ForType forType = (ForType)theEObject;
				T result = caseForType(forType);
				if (result == null) result = caseExpressionType1(forType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GAP_PROPERTY_TYPE: {
				GapPropertyType gapPropertyType = (GapPropertyType)theEObject;
				T result = caseGapPropertyType(gapPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GAP_TYPE: {
				GapType gapType = (GapType)theEObject;
				T result = caseGapType(gapType);
				if (result == null) result = caseCompoundStrokeSectionType(gapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GEOMETRY_TYPE: {
				GeometryType geometryType = (GeometryType)theEObject;
				T result = caseGeometryType(geometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GEOMETRY_TYPE1: {
				GeometryType1 geometryType1 = (GeometryType1)theEObject;
				T result = caseGeometryType1(geometryType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GEOMETRY_TYPE2: {
				GeometryType2 geometryType2 = (GeometryType2)theEObject;
				T result = caseGeometryType2(geometryType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_FILL_PROPERTY_TYPE: {
				GraphicFillPropertyType graphicFillPropertyType = (GraphicFillPropertyType)theEObject;
				T result = caseGraphicFillPropertyType(graphicFillPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_FILL_TYPE: {
				GraphicFillType graphicFillType = (GraphicFillType)theEObject;
				T result = caseGraphicFillType(graphicFillType);
				if (result == null) result = caseFillType(graphicFillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_PROPERTY_TYPE: {
				GraphicPropertyType graphicPropertyType = (GraphicPropertyType)theEObject;
				T result = caseGraphicPropertyType(graphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_TYPE: {
				GraphicType graphicType = (GraphicType)theEObject;
				T result = caseGraphicType(graphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_TYPE1: {
				GraphicType1 graphicType1 = (GraphicType1)theEObject;
				T result = caseGraphicType1(graphicType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_TYPE2: {
				GraphicType2 graphicType2 = (GraphicType2)theEObject;
				T result = caseGraphicType2(graphicType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.GRAPHIC_TYPE3: {
				GraphicType3 graphicType3 = (GraphicType3)theEObject;
				T result = caseGraphicType3(graphicType3);
				if (result == null) result = caseElementType1(graphicType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HALO_COLOR_TYPE: {
				HaloColorType haloColorType = (HaloColorType)theEObject;
				T result = caseHaloColorType(haloColorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HALO_PROPERTY_TYPE: {
				HaloPropertyType haloPropertyType = (HaloPropertyType)theEObject;
				T result = caseHaloPropertyType(haloPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HALO_TYPE: {
				HaloType haloType = (HaloType)theEObject;
				T result = caseHaloType(haloType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HALO_TYPE1: {
				HaloType1 haloType1 = (HaloType1)theEObject;
				T result = caseHaloType1(haloType1);
				if (result == null) result = caseElementType1(haloType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HALO_TYPE2: {
				HaloType2 haloType2 = (HaloType2)theEObject;
				T result = caseHaloType2(haloType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_DEFINITION_LONGEST_SIDE_PROPERTY_TYPE: {
				HatchDefinitionLongestSidePropertyType hatchDefinitionLongestSidePropertyType = (HatchDefinitionLongestSidePropertyType)theEObject;
				T result = caseHatchDefinitionLongestSidePropertyType(hatchDefinitionLongestSidePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_DEFINITION_PROPERTY_TYPE: {
				HatchDefinitionPropertyType hatchDefinitionPropertyType = (HatchDefinitionPropertyType)theEObject;
				T result = caseHatchDefinitionPropertyType(hatchDefinitionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_PROPERTY_TYPE: {
				HatchFillLongestSidePropertyType hatchFillLongestSidePropertyType = (HatchFillLongestSidePropertyType)theEObject;
				T result = caseHatchFillLongestSidePropertyType(hatchFillLongestSidePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_FILL_LONGEST_SIDE_TYPE: {
				HatchFillLongestSideType hatchFillLongestSideType = (HatchFillLongestSideType)theEObject;
				T result = caseHatchFillLongestSideType(hatchFillLongestSideType);
				if (result == null) result = caseFillType(hatchFillLongestSideType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_FILL_PROPERTY_TYPE: {
				HatchFillPropertyType hatchFillPropertyType = (HatchFillPropertyType)theEObject;
				T result = caseHatchFillPropertyType(hatchFillPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_FILL_TYPE: {
				HatchFillType hatchFillType = (HatchFillType)theEObject;
				T result = caseHatchFillType(hatchFillType);
				if (result == null) result = caseFillType(hatchFillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_PROPERTY_TYPE: {
				HatchLinesLongestSidePropertyType hatchLinesLongestSidePropertyType = (HatchLinesLongestSidePropertyType)theEObject;
				T result = caseHatchLinesLongestSidePropertyType(hatchLinesLongestSidePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_LINES_LONGEST_SIDE_TYPE: {
				HatchLinesLongestSideType hatchLinesLongestSideType = (HatchLinesLongestSideType)theEObject;
				T result = caseHatchLinesLongestSideType(hatchLinesLongestSideType);
				if (result == null) result = casePlacementRuleType(hatchLinesLongestSideType);
				if (result == null) result = caseElementType1(hatchLinesLongestSideType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_LINES_PROPERTY_TYPE: {
				HatchLinesPropertyType hatchLinesPropertyType = (HatchLinesPropertyType)theEObject;
				T result = caseHatchLinesPropertyType(hatchLinesPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.HATCH_LINES_TYPE: {
				HatchLinesType hatchLinesType = (HatchLinesType)theEObject;
				T result = caseHatchLinesType(hatchLinesType);
				if (result == null) result = casePlacementRuleType(hatchLinesType);
				if (result == null) result = caseElementType1(hatchLinesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.IF_PROPERTY_TYPE: {
				IfPropertyType ifPropertyType = (IfPropertyType)theEObject;
				T result = caseIfPropertyType(ifPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.IF_TYPE: {
				IfType ifType = (IfType)theEObject;
				T result = caseIfType(ifType);
				if (result == null) result = caseExpressionType1(ifType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.INTERIOR_TYPE: {
				InteriorType interiorType = (InteriorType)theEObject;
				T result = caseInteriorType(interiorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.INTERIOR_TYPE1: {
				InteriorType1 interiorType1 = (InteriorType1)theEObject;
				T result = caseInteriorType1(interiorType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.IN_TYPE: {
				InType inType = (InType)theEObject;
				T result = caseInType(inType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.IN_TYPE1: {
				InType1 inType1 = (InType1)theEObject;
				T result = caseInType1(inType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_PROPERTY_TYPE: {
				LabelPropertyType labelPropertyType = (LabelPropertyType)theEObject;
				T result = caseLabelPropertyType(labelPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TEXT_TYPE: {
				LabelTextType labelTextType = (LabelTextType)theEObject;
				T result = caseLabelTextType(labelTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TEXT_TYPE1: {
				LabelTextType1 labelTextType1 = (LabelTextType1)theEObject;
				T result = caseLabelTextType1(labelTextType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TYPE1: {
				LabelType1 labelType1 = (LabelType1)theEObject;
				T result = caseLabelType1(labelType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TYPE2: {
				LabelType2 labelType2 = (LabelType2)theEObject;
				T result = caseLabelType2(labelType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LABEL_TYPE3: {
				LabelType3 labelType3 = (LabelType3)theEObject;
				T result = caseLabelType3(labelType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LAYER_PROPERTY_TYPE: {
				LayerPropertyType layerPropertyType = (LayerPropertyType)theEObject;
				T result = caseLayerPropertyType(layerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LAYER_TYPE: {
				LayerType layerType = (LayerType)theEObject;
				T result = caseLayerType(layerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LAYER_TYPE1: {
				LayerType1 layerType1 = (LayerType1)theEObject;
				T result = caseLayerType1(layerType1);
				if (result == null) result = caseElementType1(layerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_GRAPHIC_PROPERTY_TYPE: {
				LineGraphicPropertyType lineGraphicPropertyType = (LineGraphicPropertyType)theEObject;
				T result = caseLineGraphicPropertyType(lineGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_GRAPHIC_TYPE: {
				LineGraphicType lineGraphicType = (LineGraphicType)theEObject;
				T result = caseLineGraphicType(lineGraphicType);
				if (result == null) result = caseSimpleGraphicType(lineGraphicType);
				if (result == null) result = caseGraphicType3(lineGraphicType);
				if (result == null) result = caseElementType1(lineGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_LABEL_PROPERTY_TYPE: {
				LineLabelPropertyType lineLabelPropertyType = (LineLabelPropertyType)theEObject;
				T result = caseLineLabelPropertyType(lineLabelPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_LABEL_TYPE: {
				LineLabelType lineLabelType = (LineLabelType)theEObject;
				T result = caseLineLabelType(lineLabelType);
				if (result == null) result = caseLabelType3(lineLabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_PLACED_GRAPHIC_PROPERTY_TYPE: {
				LinePlacedGraphicPropertyType linePlacedGraphicPropertyType = (LinePlacedGraphicPropertyType)theEObject;
				T result = caseLinePlacedGraphicPropertyType(linePlacedGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_PLACED_GRAPHIC_TYPE: {
				LinePlacedGraphicType linePlacedGraphicType = (LinePlacedGraphicType)theEObject;
				T result = caseLinePlacedGraphicType(linePlacedGraphicType);
				if (result == null) result = caseCompoundStrokeSectionType(linePlacedGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_SYMBOLIZER_PROPERTY_TYPE: {
				LineSymbolizerPropertyType lineSymbolizerPropertyType = (LineSymbolizerPropertyType)theEObject;
				T result = caseLineSymbolizerPropertyType(lineSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINE_SYMBOLIZER_TYPE: {
				LineSymbolizerType lineSymbolizerType = (LineSymbolizerType)theEObject;
				T result = caseLineSymbolizerType(lineSymbolizerType);
				if (result == null) result = casePureSymbolizerType1(lineSymbolizerType);
				if (result == null) result = caseSymbolizerType1(lineSymbolizerType);
				if (result == null) result = caseElementType1(lineSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINETO_PROPERTY_TYPE: {
				LinetoPropertyType linetoPropertyType = (LinetoPropertyType)theEObject;
				T result = caseLinetoPropertyType(linetoPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LINETO_TYPE: {
				LinetoType linetoType = (LinetoType)theEObject;
				T result = caseLinetoType(linetoType);
				if (result == null) result = casePathElementType(linetoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LITERAL_PROPERTY_TYPE: {
				LiteralPropertyType literalPropertyType = (LiteralPropertyType)theEObject;
				T result = caseLiteralPropertyType(literalPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.LITERAL_TYPE: {
				LiteralType literalType = (LiteralType)theEObject;
				T result = caseLiteralType(literalType);
				if (result == null) result = caseExpressionType1(literalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_PROPERTY_TYPE: {
				MaximumAdjacentLineStringPropertyType maximumAdjacentLineStringPropertyType = (MaximumAdjacentLineStringPropertyType)theEObject;
				T result = caseMaximumAdjacentLineStringPropertyType(maximumAdjacentLineStringPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MAXIMUM_ADJACENT_LINE_STRING_TYPE: {
				MaximumAdjacentLineStringType maximumAdjacentLineStringType = (MaximumAdjacentLineStringType)theEObject;
				T result = caseMaximumAdjacentLineStringType(maximumAdjacentLineStringType);
				if (result == null) result = casePlacementRuleType(maximumAdjacentLineStringType);
				if (result == null) result = caseElementType1(maximumAdjacentLineStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_PROPERTY_TYPE: {
				MaximumAdjacentSurfacePropertyType maximumAdjacentSurfacePropertyType = (MaximumAdjacentSurfacePropertyType)theEObject;
				T result = caseMaximumAdjacentSurfacePropertyType(maximumAdjacentSurfacePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MAXIMUM_ADJACENT_SURFACE_TYPE: {
				MaximumAdjacentSurfaceType maximumAdjacentSurfaceType = (MaximumAdjacentSurfaceType)theEObject;
				T result = caseMaximumAdjacentSurfaceType(maximumAdjacentSurfaceType);
				if (result == null) result = casePlacementRuleType(maximumAdjacentSurfaceType);
				if (result == null) result = caseElementType1(maximumAdjacentSurfaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MEASURE_LITERAL_PROPERTY_TYPE: {
				MeasureLiteralPropertyType measureLiteralPropertyType = (MeasureLiteralPropertyType)theEObject;
				T result = caseMeasureLiteralPropertyType(measureLiteralPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MEASURE_LITERAL_TYPE: {
				MeasureLiteralType measureLiteralType = (MeasureLiteralType)theEObject;
				T result = caseMeasureLiteralType(measureLiteralType);
				if (result == null) result = caseLiteralType(measureLiteralType);
				if (result == null) result = caseExpressionType1(measureLiteralType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MEMBER_TYPE: {
				MemberType memberType = (MemberType)theEObject;
				T result = caseMemberType(memberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MOVETO_PROPERTY_TYPE: {
				MovetoPropertyType movetoPropertyType = (MovetoPropertyType)theEObject;
				T result = caseMovetoPropertyType(movetoPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.MOVETO_TYPE: {
				MovetoType movetoType = (MovetoType)theEObject;
				T result = caseMovetoType(movetoType);
				if (result == null) result = casePathElementType(movetoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.NEIGHBORHOOD_FILTER_TYPE: {
				NeighborhoodFilterType neighborhoodFilterType = (NeighborhoodFilterType)theEObject;
				T result = caseNeighborhoodFilterType(neighborhoodFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.NULL_COLOR_PROPERTY_TYPE: {
				NullColorPropertyType nullColorPropertyType = (NullColorPropertyType)theEObject;
				T result = caseNullColorPropertyType(nullColorPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.NULL_COLOR_TYPE: {
				NullColorType nullColorType = (NullColorType)theEObject;
				T result = caseNullColorType(nullColorType);
				if (result == null) result = caseColorType2(nullColorType);
				if (result == null) result = caseElementType1(nullColorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.NULL_SYMBOLIZER_PROPERTY_TYPE: {
				NullSymbolizerPropertyType nullSymbolizerPropertyType = (NullSymbolizerPropertyType)theEObject;
				T result = caseNullSymbolizerPropertyType(nullSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.NULL_SYMBOLIZER_TYPE: {
				NullSymbolizerType nullSymbolizerType = (NullSymbolizerType)theEObject;
				T result = caseNullSymbolizerType(nullSymbolizerType);
				if (result == null) result = casePureSymbolizerType1(nullSymbolizerType);
				if (result == null) result = caseSymbolizerType1(nullSymbolizerType);
				if (result == null) result = caseElementType1(nullSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.OPERAND_TYPE: {
				OperandType operandType = (OperandType)theEObject;
				T result = caseOperandType(operandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.OPERATION_PROPERTY_TYPE: {
				OperationPropertyType operationPropertyType = (OperationPropertyType)theEObject;
				T result = caseOperationPropertyType(operationPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.OPERATION_TYPE: {
				OperationType operationType = (OperationType)theEObject;
				T result = caseOperationType(operationType);
				if (result == null) result = caseExpressionType1(operationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PATH_ELEMENT_PROPERTY_TYPE: {
				PathElementPropertyType pathElementPropertyType = (PathElementPropertyType)theEObject;
				T result = casePathElementPropertyType(pathElementPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PATH_ELEMENT_TYPE: {
				PathElementType pathElementType = (PathElementType)theEObject;
				T result = casePathElementType(pathElementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PATH_PROPERTY_TYPE: {
				PathPropertyType pathPropertyType = (PathPropertyType)theEObject;
				T result = casePathPropertyType(pathPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PATH_TYPE: {
				PathType pathType = (PathType)theEObject;
				T result = casePathType(pathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PERPENDICULAR_OFFSET_PROPERTY_TYPE: {
				PerpendicularOffsetPropertyType perpendicularOffsetPropertyType = (PerpendicularOffsetPropertyType)theEObject;
				T result = casePerpendicularOffsetPropertyType(perpendicularOffsetPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PERPENDICULAR_OFFSET_TYPE: {
				PerpendicularOffsetType perpendicularOffsetType = (PerpendicularOffsetType)theEObject;
				T result = casePerpendicularOffsetType(perpendicularOffsetType);
				if (result == null) result = casePlacementRuleType(perpendicularOffsetType);
				if (result == null) result = caseElementType1(perpendicularOffsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PLACEMENT_RULE_PROPERTY_TYPE: {
				PlacementRulePropertyType placementRulePropertyType = (PlacementRulePropertyType)theEObject;
				T result = casePlacementRulePropertyType(placementRulePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PLACEMENT_RULE_TYPE: {
				PlacementRuleType placementRuleType = (PlacementRuleType)theEObject;
				T result = casePlacementRuleType(placementRuleType);
				if (result == null) result = caseElementType1(placementRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PLACEMENT_TYPE: {
				PlacementType placementType = (PlacementType)theEObject;
				T result = casePlacementType(placementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINT_LABEL_PROPERTY_TYPE: {
				PointLabelPropertyType pointLabelPropertyType = (PointLabelPropertyType)theEObject;
				T result = casePointLabelPropertyType(pointLabelPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINT_LABEL_TYPE: {
				PointLabelType pointLabelType = (PointLabelType)theEObject;
				T result = casePointLabelType(pointLabelType);
				if (result == null) result = caseLabelType3(pointLabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINTS_IN_AREA_DEFINITION_PROPERTY_TYPE: {
				PointsInAreaDefinitionPropertyType pointsInAreaDefinitionPropertyType = (PointsInAreaDefinitionPropertyType)theEObject;
				T result = casePointsInAreaDefinitionPropertyType(pointsInAreaDefinitionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINTS_IN_AREA_PROPERTY_TYPE: {
				PointsInAreaPropertyType pointsInAreaPropertyType = (PointsInAreaPropertyType)theEObject;
				T result = casePointsInAreaPropertyType(pointsInAreaPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINTS_IN_AREA_TYPE: {
				PointsInAreaType pointsInAreaType = (PointsInAreaType)theEObject;
				T result = casePointsInAreaType(pointsInAreaType);
				if (result == null) result = casePlacementRuleType(pointsInAreaType);
				if (result == null) result = caseElementType1(pointsInAreaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINTS_ON_LINE_PROPERTY_TYPE: {
				PointsOnLinePropertyType pointsOnLinePropertyType = (PointsOnLinePropertyType)theEObject;
				T result = casePointsOnLinePropertyType(pointsOnLinePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINTS_ON_LINE_TYPE: {
				PointsOnLineType pointsOnLineType = (PointsOnLineType)theEObject;
				T result = casePointsOnLineType(pointsOnLineType);
				if (result == null) result = casePlacementRuleType(pointsOnLineType);
				if (result == null) result = caseElementType1(pointsOnLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINT_SYMBOLIZER_PROPERTY_TYPE: {
				PointSymbolizerPropertyType pointSymbolizerPropertyType = (PointSymbolizerPropertyType)theEObject;
				T result = casePointSymbolizerPropertyType(pointSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POINT_SYMBOLIZER_TYPE: {
				PointSymbolizerType pointSymbolizerType = (PointSymbolizerType)theEObject;
				T result = casePointSymbolizerType(pointSymbolizerType);
				if (result == null) result = casePureSymbolizerType1(pointSymbolizerType);
				if (result == null) result = caseSymbolizerType1(pointSymbolizerType);
				if (result == null) result = caseElementType1(pointSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.POST_GRAPHIC_TYPE: {
				PostGraphicType postGraphicType = (PostGraphicType)theEObject;
				T result = casePostGraphicType(postGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PREDICATE_TYPE: {
				PredicateType predicateType = (PredicateType)theEObject;
				T result = casePredicateType(predicateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PREDICATE_TYPE1: {
				PredicateType1 predicateType1 = (PredicateType1)theEObject;
				T result = casePredicateType1(predicateType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PRE_GRAPHIC_TYPE: {
				PreGraphicType preGraphicType = (PreGraphicType)theEObject;
				T result = casePreGraphicType(preGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PROPERTY_PROPERTY_TYPE: {
				PropertyPropertyType propertyPropertyType = (PropertyPropertyType)theEObject;
				T result = casePropertyPropertyType(propertyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = caseExpressionType1(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PURE_SYMBOLIZER_PROPERTY_TYPE: {
				PureSymbolizerPropertyType pureSymbolizerPropertyType = (PureSymbolizerPropertyType)theEObject;
				T result = casePureSymbolizerPropertyType(pureSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PURE_SYMBOLIZER_TYPE: {
				PureSymbolizerType pureSymbolizerType = (PureSymbolizerType)theEObject;
				T result = casePureSymbolizerType(pureSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.PURE_SYMBOLIZER_TYPE1: {
				PureSymbolizerType1 pureSymbolizerType1 = (PureSymbolizerType1)theEObject;
				T result = casePureSymbolizerType1(pureSymbolizerType1);
				if (result == null) result = caseSymbolizerType1(pureSymbolizerType1);
				if (result == null) result = caseElementType1(pureSymbolizerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.QUANTIFIER_PROPERTY_TYPE: {
				QuantifierPropertyType quantifierPropertyType = (QuantifierPropertyType)theEObject;
				T result = caseQuantifierPropertyType(quantifierPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.QUANTIFIER_TYPE: {
				QuantifierType quantifierType = (QuantifierType)theEObject;
				T result = caseQuantifierType(quantifierType);
				if (result == null) result = caseExpressionType1(quantifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RELATE_FILTER_TYPE: {
				RelateFilterType relateFilterType = (RelateFilterType)theEObject;
				T result = caseRelateFilterType(relateFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RELATE_GEOMETRY_PROPERTY_TYPE: {
				RelateGeometryPropertyType relateGeometryPropertyType = (RelateGeometryPropertyType)theEObject;
				T result = caseRelateGeometryPropertyType(relateGeometryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RELATE_GEOMETRY_TYPE: {
				RelateGeometryType relateGeometryType = (RelateGeometryType)theEObject;
				T result = caseRelateGeometryType(relateGeometryType);
				if (result == null) result = casePlacementRuleType(relateGeometryType);
				if (result == null) result = caseElementType1(relateGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RELATE_TOPOLOGY_PROPERTY_TYPE: {
				RelateTopologyPropertyType relateTopologyPropertyType = (RelateTopologyPropertyType)theEObject;
				T result = caseRelateTopologyPropertyType(relateTopologyPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RELATE_TOPOLOGY_TYPE: {
				RelateTopologyType relateTopologyType = (RelateTopologyType)theEObject;
				T result = caseRelateTopologyType(relateTopologyType);
				if (result == null) result = casePlacementRuleType(relateTopologyType);
				if (result == null) result = caseElementType1(relateTopologyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RETURN_TYPE: {
				ReturnType returnType = (ReturnType)theEObject;
				T result = caseReturnType(returnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_PROPERTY_TYPE: {
				RulePropertyType rulePropertyType = (RulePropertyType)theEObject;
				T result = caseRulePropertyType(rulePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_SET_PROPERTY_TYPE: {
				RuleSetPropertyType ruleSetPropertyType = (RuleSetPropertyType)theEObject;
				T result = caseRuleSetPropertyType(ruleSetPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_SET_TYPE: {
				RuleSetType ruleSetType = (RuleSetType)theEObject;
				T result = caseRuleSetType(ruleSetType);
				if (result == null) result = caseElementType1(ruleSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_SET_TYPE1: {
				RuleSetType1 ruleSetType1 = (RuleSetType1)theEObject;
				T result = caseRuleSetType1(ruleSetType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULES_TO_CONSIDER_TYPE: {
				RulesToConsiderType rulesToConsiderType = (RulesToConsiderType)theEObject;
				T result = caseRulesToConsiderType(rulesToConsiderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_TYPE: {
				RuleType ruleType = (RuleType)theEObject;
				T result = caseRuleType(ruleType);
				if (result == null) result = caseElementType1(ruleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.RULE_TYPE1: {
				RuleType1 ruleType1 = (RuleType1)theEObject;
				T result = caseRuleType1(ruleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SATISFIES_TYPE: {
				SatisfiesType satisfiesType = (SatisfiesType)theEObject;
				T result = caseSatisfiesType(satisfiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SECTION_TYPE: {
				SectionType sectionType = (SectionType)theEObject;
				T result = caseSectionType(sectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SELF_STEP_PROPERTY_TYPE: {
				SelfStepPropertyType selfStepPropertyType = (SelfStepPropertyType)theEObject;
				T result = caseSelfStepPropertyType(selfStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SELF_STEP_TYPE: {
				SelfStepType selfStepType = (SelfStepType)theEObject;
				T result = caseSelfStepType(selfStepType);
				if (result == null) result = caseFirstStepType1(selfStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SHIELDED_POINT_LABEL_PROPERTY_TYPE: {
				ShieldedPointLabelPropertyType shieldedPointLabelPropertyType = (ShieldedPointLabelPropertyType)theEObject;
				T result = caseShieldedPointLabelPropertyType(shieldedPointLabelPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SHIELDED_POINT_LABEL_TYPE: {
				ShieldedPointLabelType shieldedPointLabelType = (ShieldedPointLabelType)theEObject;
				T result = caseShieldedPointLabelType(shieldedPointLabelType);
				if (result == null) result = casePointLabelType(shieldedPointLabelType);
				if (result == null) result = caseLabelType3(shieldedPointLabelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SIMPLE_GRAPHIC_PROPERTY_TYPE: {
				SimpleGraphicPropertyType simpleGraphicPropertyType = (SimpleGraphicPropertyType)theEObject;
				T result = caseSimpleGraphicPropertyType(simpleGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SIMPLE_GRAPHIC_TYPE: {
				SimpleGraphicType simpleGraphicType = (SimpleGraphicType)theEObject;
				T result = caseSimpleGraphicType(simpleGraphicType);
				if (result == null) result = caseGraphicType3(simpleGraphicType);
				if (result == null) result = caseElementType1(simpleGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SKELETON_LINE_PROPERTY_TYPE: {
				SkeletonLinePropertyType skeletonLinePropertyType = (SkeletonLinePropertyType)theEObject;
				T result = caseSkeletonLinePropertyType(skeletonLinePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SKELETON_LINE_TYPE: {
				SkeletonLineType skeletonLineType = (SkeletonLineType)theEObject;
				T result = caseSkeletonLineType(skeletonLineType);
				if (result == null) result = casePlacementRuleType(skeletonLineType);
				if (result == null) result = caseElementType1(skeletonLineType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SLOPE_HATCH_LINES_PROPERTY_TYPE: {
				SlopeHatchLinesPropertyType slopeHatchLinesPropertyType = (SlopeHatchLinesPropertyType)theEObject;
				T result = caseSlopeHatchLinesPropertyType(slopeHatchLinesPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SLOPE_HATCH_LINES_TYPE: {
				SlopeHatchLinesType slopeHatchLinesType = (SlopeHatchLinesType)theEObject;
				T result = caseSlopeHatchLinesType(slopeHatchLinesType);
				if (result == null) result = casePlacementRuleType(slopeHatchLinesType);
				if (result == null) result = caseElementType1(slopeHatchLinesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_FILL_PROPERTY_TYPE: {
				SolidFillPropertyType solidFillPropertyType = (SolidFillPropertyType)theEObject;
				T result = caseSolidFillPropertyType(solidFillPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_FILL_TYPE: {
				SolidFillType solidFillType = (SolidFillType)theEObject;
				T result = caseSolidFillType(solidFillType);
				if (result == null) result = caseFillType(solidFillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_OR_DASHED_STROKE_PROPERTY_TYPE: {
				SolidOrDashedStrokePropertyType solidOrDashedStrokePropertyType = (SolidOrDashedStrokePropertyType)theEObject;
				T result = caseSolidOrDashedStrokePropertyType(solidOrDashedStrokePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_OR_DASHED_STROKE_TYPE: {
				SolidOrDashedStrokeType solidOrDashedStrokeType = (SolidOrDashedStrokeType)theEObject;
				T result = caseSolidOrDashedStrokeType(solidOrDashedStrokeType);
				if (result == null) result = caseStrokeType5(solidOrDashedStrokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_SECTION_PROPERTY_TYPE: {
				SolidSectionPropertyType solidSectionPropertyType = (SolidSectionPropertyType)theEObject;
				T result = caseSolidSectionPropertyType(solidSectionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_SECTION_TYPE: {
				SolidSectionType solidSectionType = (SolidSectionType)theEObject;
				T result = caseSolidSectionType(solidSectionType);
				if (result == null) result = caseCompoundStrokeSectionType(solidSectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_STROKE_PROPERTY_TYPE: {
				SolidStrokePropertyType solidStrokePropertyType = (SolidStrokePropertyType)theEObject;
				T result = caseSolidStrokePropertyType(solidStrokePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOLID_STROKE_TYPE: {
				SolidStrokeType solidStrokeType = (SolidStrokeType)theEObject;
				T result = caseSolidStrokeType(solidStrokeType);
				if (result == null) result = caseSolidOrDashedStrokeType(solidStrokeType);
				if (result == null) result = caseStrokeType5(solidStrokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOME_PROPERTY_TYPE: {
				SomePropertyType somePropertyType = (SomePropertyType)theEObject;
				T result = caseSomePropertyType(somePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SOME_TYPE: {
				SomeType someType = (SomeType)theEObject;
				T result = caseSomeType(someType);
				if (result == null) result = caseQuantifierType(someType);
				if (result == null) result = caseExpressionType1(someType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STEP_PROPERTY_TYPE: {
				StepPropertyType stepPropertyType = (StepPropertyType)theEObject;
				T result = caseStepPropertyType(stepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STEP_TYPE: {
				StepType stepType = (StepType)theEObject;
				T result = caseStepType(stepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STEP_TYPE1: {
				StepType1 stepType1 = (StepType1)theEObject;
				T result = caseStepType1(stepType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_PROPERTY_TYPE: {
				StrokePropertyType strokePropertyType = (StrokePropertyType)theEObject;
				T result = caseStrokePropertyType(strokePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE: {
				StrokeType strokeType = (StrokeType)theEObject;
				T result = caseStrokeType(strokeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE1: {
				StrokeType1 strokeType1 = (StrokeType1)theEObject;
				T result = caseStrokeType1(strokeType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE2: {
				StrokeType2 strokeType2 = (StrokeType2)theEObject;
				T result = caseStrokeType2(strokeType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE3: {
				StrokeType3 strokeType3 = (StrokeType3)theEObject;
				T result = caseStrokeType3(strokeType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE4: {
				StrokeType4 strokeType4 = (StrokeType4)theEObject;
				T result = caseStrokeType4(strokeType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STROKE_TYPE5: {
				StrokeType5 strokeType5 = (StrokeType5)theEObject;
				T result = caseStrokeType5(strokeType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STYLE_PROPERTY_TYPE: {
				StylePropertyType stylePropertyType = (StylePropertyType)theEObject;
				T result = caseStylePropertyType(stylePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STYLE_TYPE: {
				StyleType styleType = (StyleType)theEObject;
				T result = caseStyleType(styleType);
				if (result == null) result = caseElementType1(styleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.STYLE_TYPE1: {
				StyleType1 styleType1 = (StyleType1)theEObject;
				T result = caseStyleType1(styleType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLIZER_PREDICATE_TYPE: {
				SymbolizerPredicateType symbolizerPredicateType = (SymbolizerPredicateType)theEObject;
				T result = caseSymbolizerPredicateType(symbolizerPredicateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLIZER_PROPERTY_TYPE: {
				SymbolizerPropertyType symbolizerPropertyType = (SymbolizerPropertyType)theEObject;
				T result = caseSymbolizerPropertyType(symbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLIZER_TYPE: {
				SymbolizerType symbolizerType = (SymbolizerType)theEObject;
				T result = caseSymbolizerType(symbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLIZER_TYPE1: {
				SymbolizerType1 symbolizerType1 = (SymbolizerType1)theEObject;
				T result = caseSymbolizerType1(symbolizerType1);
				if (result == null) result = caseElementType1(symbolizerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLIZER_TYPE2: {
				SymbolizerType2 symbolizerType2 = (SymbolizerType2)theEObject;
				T result = caseSymbolizerType2(symbolizerType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLOGY_CATALOG_PROPERTY_TYPE: {
				SymbologyCatalogPropertyType symbologyCatalogPropertyType = (SymbologyCatalogPropertyType)theEObject;
				T result = caseSymbologyCatalogPropertyType(symbologyCatalogPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.SYMBOLOGY_CATALOG_TYPE: {
				SymbologyCatalogType symbologyCatalogType = (SymbologyCatalogType)theEObject;
				T result = caseSymbologyCatalogType(symbologyCatalogType);
				if (result == null) result = caseElementType1(symbologyCatalogType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TAG_PROPERTY_TYPE: {
				TagPropertyType tagPropertyType = (TagPropertyType)theEObject;
				T result = caseTagPropertyType(tagPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TAG_SET_PROPERTY_TYPE: {
				TagSetPropertyType tagSetPropertyType = (TagSetPropertyType)theEObject;
				T result = caseTagSetPropertyType(tagSetPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TAG_SET_TYPE: {
				TagSetType tagSetType = (TagSetType)theEObject;
				T result = caseTagSetType(tagSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TAG_TYPE: {
				TagType tagType = (TagType)theEObject;
				T result = caseTagType(tagType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TAG_TYPE1: {
				TagType1 tagType1 = (TagType1)theEObject;
				T result = caseTagType1(tagType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TARGET_COLOR_TYPE: {
				TargetColorType targetColorType = (TargetColorType)theEObject;
				T result = caseTargetColorType(targetColorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_BODY_FILL_TYPE: {
				TextBodyFillType textBodyFillType = (TextBodyFillType)theEObject;
				T result = caseTextBodyFillType(textBodyFillType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_GRAPHIC_PROPERTY_TYPE: {
				TextGraphicPropertyType textGraphicPropertyType = (TextGraphicPropertyType)theEObject;
				T result = caseTextGraphicPropertyType(textGraphicPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_GRAPHIC_TYPE: {
				TextGraphicType textGraphicType = (TextGraphicType)theEObject;
				T result = caseTextGraphicType(textGraphicType);
				if (result == null) result = caseSimpleGraphicType(textGraphicType);
				if (result == null) result = caseGraphicType3(textGraphicType);
				if (result == null) result = caseElementType1(textGraphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_SECTION_PROPERTY_TYPE: {
				TextSectionPropertyType textSectionPropertyType = (TextSectionPropertyType)theEObject;
				T result = caseTextSectionPropertyType(textSectionPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_SECTION_TYPE: {
				TextSectionType textSectionType = (TextSectionType)theEObject;
				T result = caseTextSectionType(textSectionType);
				if (result == null) result = caseCompoundStrokeSectionType(textSectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_SYMBOLIZER_PROPERTY_TYPE: {
				TextSymbolizerPropertyType textSymbolizerPropertyType = (TextSymbolizerPropertyType)theEObject;
				T result = caseTextSymbolizerPropertyType(textSymbolizerPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TEXT_SYMBOLIZER_TYPE: {
				TextSymbolizerType textSymbolizerType = (TextSymbolizerType)theEObject;
				T result = caseTextSymbolizerType(textSymbolizerType);
				if (result == null) result = casePureSymbolizerType1(textSymbolizerType);
				if (result == null) result = caseSymbolizerType1(textSymbolizerType);
				if (result == null) result = caseElementType1(textSymbolizerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.THEN_TYPE: {
				ThenType thenType = (ThenType)theEObject;
				T result = caseThenType(thenType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TOP_EDGE_TYPE: {
				TopEdgeType topEdgeType = (TopEdgeType)theEObject;
				T result = caseTopEdgeType(topEdgeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TUBE_PROPERTY_TYPE: {
				TubePropertyType tubePropertyType = (TubePropertyType)theEObject;
				T result = caseTubePropertyType(tubePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.TUBE_TYPE: {
				TubeType tubeType = (TubeType)theEObject;
				T result = caseTubeType(tubeType);
				if (result == null) result = casePlacementRuleType(tubeType);
				if (result == null) result = caseElementType1(tubeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_PROPERTY_TYPE: {
				VariablePropertyType variablePropertyType = (VariablePropertyType)theEObject;
				T result = caseVariablePropertyType(variablePropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_STEP_PROPERTY_TYPE: {
				VariableStepPropertyType variableStepPropertyType = (VariableStepPropertyType)theEObject;
				T result = caseVariableStepPropertyType(variableStepPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_STEP_TYPE: {
				VariableStepType variableStepType = (VariableStepType)theEObject;
				T result = caseVariableStepType(variableStepType);
				if (result == null) result = caseFirstStepType1(variableStepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_TYPE: {
				VariableType variableType = (VariableType)theEObject;
				T result = caseVariableType(variableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_TYPE1: {
				VariableType1 variableType1 = (VariableType1)theEObject;
				T result = caseVariableType1(variableType1);
				if (result == null) result = caseExpressionType1(variableType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_TYPE2: {
				VariableType2 variableType2 = (VariableType2)theEObject;
				T result = caseVariableType2(variableType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIABLE_TYPE3: {
				VariableType3 variableType3 = (VariableType3)theEObject;
				T result = caseVariableType3(variableType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIANT_GEOMETRY_PROPERTY_TYPE: {
				VariantGeometryPropertyType variantGeometryPropertyType = (VariantGeometryPropertyType)theEObject;
				T result = caseVariantGeometryPropertyType(variantGeometryPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VARIANT_GEOMETRY_TYPE: {
				VariantGeometryType variantGeometryType = (VariantGeometryType)theEObject;
				T result = caseVariantGeometryType(variantGeometryType);
				if (result == null) result = casePlacementRuleType(variantGeometryType);
				if (result == null) result = caseElementType1(variantGeometryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AAAPackage.VENDOR_SPECIFIC_TYPE: {
				VendorSpecificType vendorSpecificType = (VendorSpecificType)theEObject;
				T result = caseVendorSpecificType(vendorSpecificType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalFilterType(AdditionalFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Filter Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Filter Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalFilterType1(AdditionalFilterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Symbolizers Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Symbolizers Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalSymbolizersPropertyType(AdditionalSymbolizersPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Symbolizers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Symbolizers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalSymbolizersType(AdditionalSymbolizersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Symbolizers Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Symbolizers Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalSymbolizersType1(AdditionalSymbolizersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaGraphicPropertyType(AreaGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaGraphicType(AreaGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaSymbolizerPropertyType(AreaSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaSymbolizerType(AreaSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Border Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Border Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundBorderType(BackgroundBorderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundFillType(BackgroundFillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bottom Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bottom Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBottomEdgeType(BottomEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryType(BoundaryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryType1(BoundaryType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundaryType2(BoundaryType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box Point Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBoxPointPropertyType(BoundingBoxPointPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounding Box Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounding Box Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundingBoxPointType(BoundingBoxPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Point Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Point Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterPointPropertyType(CenterPointPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center Point Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center Point Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenterPointType(CenterPointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Arc Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Arc Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircularArcPropertyType(CircularArcPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circular Arc Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circular Arc Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircularArcType(CircularArcType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClosePropertyType(ClosePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseType(CloseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color CMYK Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color CMYK Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorCMYKPropertyType(ColorCMYKPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color CMYK Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color CMYK Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorCMYKType(ColorCMYKType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorPropertyType(ColorPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color RGB Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color RGB Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorRGBPropertyType(ColorRGBPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color RGB Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color RGB Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorRGBType(ColorRGBType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorType(ColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorType1(ColorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColorType2(ColorType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeGraphicPropertyType(CompositeGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeGraphicType(CompositeGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Stroke Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Stroke Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundStrokePropertyType(CompoundStrokePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Stroke Section Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Stroke Section Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundStrokeSectionPropertyType(CompoundStrokeSectionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Stroke Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Stroke Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundStrokeSectionType(CompoundStrokeSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Stroke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Stroke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundStrokeType(CompoundStrokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStepPropertyType(CurrentStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Current Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Current Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurrentStepType(CurrentStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curveto Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curveto Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvetoPropertyType(CurvetoPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curveto Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curveto Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvetoType(CurvetoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashed Stroke Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashed Stroke Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashedStrokePropertyType(DashedStrokePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dashed Stroke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dashed Stroke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDashedStrokeType(DashedStrokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Rule Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Rule Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignRulePropertyType(DesignRulePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignRuleType(DesignRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design Rule Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design Rule Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesignRuleType1(DesignRuleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displacement Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displacement Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplacementPropertyType(DisplacementPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Displacement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Displacement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplacementType(DisplacementType object) {
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
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPropertyType(ElementPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType(ElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementType1(ElementType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Else Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Else Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElseType(ElseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emit Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emit Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmitPropertyType(EmitPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmitType(EmitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emit Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emit Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmitType1(EmitType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Every Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Every Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveryPropertyType(EveryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Every Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Every Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEveryType(EveryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionPropertyType(ExpressionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType1(ExpressionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTypeStepPropertyType(FeatureTypeStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Type Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Type Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureTypeStepType(FeatureTypeStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillPropertyType(FillPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFillType(FillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredSymbolizerPropertyType(FilteredSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredSymbolizerType(FilteredSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterPropertyType(FilterPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType(FilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterType1(FilterType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstStepPropertyType(FirstStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstStepType(FirstStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>First Step Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>First Step Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstStepType1(FirstStepType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontPropertyType(FontPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontType(FontType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Font Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Font Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFontType1(FontType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForPropertyType(ForPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForType(ForType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGapPropertyType(GapPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gap Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gap Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGapType(GapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryType(GeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryType1(GeometryType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geometry Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geometry Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeometryType2(GeometryType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Fill Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Fill Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicFillPropertyType(GraphicFillPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicFillType(GraphicFillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicPropertyType(GraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType(GraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType1(GraphicType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType2(GraphicType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType3(GraphicType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Halo Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Halo Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaloColorType(HaloColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Halo Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Halo Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaloPropertyType(HaloPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Halo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Halo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaloType(HaloType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Halo Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Halo Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaloType1(HaloType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Halo Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Halo Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHaloType2(HaloType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Definition Longest Side Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Definition Longest Side Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchDefinitionLongestSidePropertyType(HatchDefinitionLongestSidePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Definition Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Definition Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchDefinitionPropertyType(HatchDefinitionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Fill Longest Side Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Fill Longest Side Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchFillLongestSidePropertyType(HatchFillLongestSidePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Fill Longest Side Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Fill Longest Side Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchFillLongestSideType(HatchFillLongestSideType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Fill Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Fill Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchFillPropertyType(HatchFillPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchFillType(HatchFillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Lines Longest Side Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Lines Longest Side Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchLinesLongestSidePropertyType(HatchLinesLongestSidePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Lines Longest Side Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Lines Longest Side Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchLinesLongestSideType(HatchLinesLongestSideType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Lines Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Lines Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchLinesPropertyType(HatchLinesPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hatch Lines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hatch Lines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHatchLinesType(HatchLinesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfPropertyType(IfPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfType(IfType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteriorType(InteriorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interior Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interior Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteriorType1(InteriorType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInType(InType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInType1(InType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelPropertyType(LabelPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelTextType(LabelTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Text Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Text Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelTextType1(LabelTextType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType1(LabelType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType2(LabelType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType3(LabelType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerPropertyType(LayerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerType(LayerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerType1(LayerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineGraphicPropertyType(LineGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineGraphicType(LineGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Label Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Label Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineLabelPropertyType(LineLabelPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineLabelType(LineLabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Placed Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Placed Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePlacedGraphicPropertyType(LinePlacedGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Placed Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Placed Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinePlacedGraphicType(LinePlacedGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineSymbolizerPropertyType(LineSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLineSymbolizerType(LineSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lineto Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lineto Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinetoPropertyType(LinetoPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lineto Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lineto Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinetoType(LinetoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralPropertyType(LiteralPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralType(LiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Adjacent Line String Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Adjacent Line String Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumAdjacentLineStringPropertyType(MaximumAdjacentLineStringPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Adjacent Line String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Adjacent Line String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumAdjacentLineStringType(MaximumAdjacentLineStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Adjacent Surface Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Adjacent Surface Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumAdjacentSurfacePropertyType(MaximumAdjacentSurfacePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Maximum Adjacent Surface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Maximum Adjacent Surface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaximumAdjacentSurfaceType(MaximumAdjacentSurfaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Literal Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Literal Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureLiteralPropertyType(MeasureLiteralPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureLiteralType(MeasureLiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberType(MemberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moveto Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moveto Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovetoPropertyType(MovetoPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moveto Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moveto Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovetoType(MovetoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neighborhood Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neighborhood Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeighborhoodFilterType(NeighborhoodFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Color Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Color Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullColorPropertyType(NullColorPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullColorType(NullColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullSymbolizerPropertyType(NullSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullSymbolizerType(NullSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operand Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operand Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperandType(OperandType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationType(OperationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElementPropertyType(PathElementPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathElementType(PathElementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathPropertyType(PathPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathType(PathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perpendicular Offset Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perpendicular Offset Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerpendicularOffsetPropertyType(PerpendicularOffsetPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perpendicular Offset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perpendicular Offset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerpendicularOffsetType(PerpendicularOffsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Rule Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Rule Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementRulePropertyType(PlacementRulePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementRuleType(PlacementRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementType(PlacementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Label Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Label Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointLabelPropertyType(PointLabelPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointLabelType(PointLabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points In Area Definition Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points In Area Definition Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointsInAreaDefinitionPropertyType(PointsInAreaDefinitionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points In Area Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points In Area Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointsInAreaPropertyType(PointsInAreaPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points In Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points In Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointsInAreaType(PointsInAreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points On Line Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points On Line Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointsOnLinePropertyType(PointsOnLinePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Points On Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Points On Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointsOnLineType(PointsOnLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointSymbolizerPropertyType(PointSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePointSymbolizerType(PointSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostGraphicType(PostGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateType(PredicateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicateType1(PredicateType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreGraphicType(PreGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPropertyType(PropertyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pure Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pure Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePureSymbolizerPropertyType(PureSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pure Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pure Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePureSymbolizerType(PureSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pure Symbolizer Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pure Symbolizer Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePureSymbolizerType1(PureSymbolizerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierPropertyType(QuantifierPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantifierType(QuantifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relate Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relate Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelateFilterType(RelateFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relate Geometry Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relate Geometry Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelateGeometryPropertyType(RelateGeometryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relate Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relate Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelateGeometryType(RelateGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relate Topology Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relate Topology Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelateTopologyPropertyType(RelateTopologyPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relate Topology Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relate Topology Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelateTopologyType(RelateTopologyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnType(ReturnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulePropertyType(RulePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSetPropertyType(RuleSetPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSetType(RuleSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSetType1(RuleSetType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rules To Consider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rules To Consider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRulesToConsiderType(RulesToConsiderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleType(RuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleType1(RuleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfiesType(SatisfiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionType(SectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfStepPropertyType(SelfStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfStepType(SelfStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shielded Point Label Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shielded Point Label Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShieldedPointLabelPropertyType(ShieldedPointLabelPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shielded Point Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shielded Point Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShieldedPointLabelType(ShieldedPointLabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleGraphicPropertyType(SimpleGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleGraphicType(SimpleGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeleton Line Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeleton Line Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeletonLinePropertyType(SkeletonLinePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeleton Line Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeleton Line Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeletonLineType(SkeletonLineType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Hatch Lines Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Hatch Lines Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeHatchLinesPropertyType(SlopeHatchLinesPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slope Hatch Lines Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slope Hatch Lines Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlopeHatchLinesType(SlopeHatchLinesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Fill Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Fill Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidFillPropertyType(SolidFillPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidFillType(SolidFillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Or Dashed Stroke Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Or Dashed Stroke Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidOrDashedStrokePropertyType(SolidOrDashedStrokePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Or Dashed Stroke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Or Dashed Stroke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidOrDashedStrokeType(SolidOrDashedStrokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Section Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Section Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidSectionPropertyType(SolidSectionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidSectionType(SolidSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Stroke Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Stroke Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidStrokePropertyType(SolidStrokePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Stroke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Stroke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolidStrokeType(SolidStrokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomePropertyType(SomePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Some Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Some Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSomeType(SomeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepPropertyType(StepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType(StepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType1(StepType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokePropertyType(StrokePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType(StrokeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType1(StrokeType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType2(StrokeType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType3(StrokeType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType4(StrokeType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrokeType5(StrokeType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStylePropertyType(StylePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType(StyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType1(StyleType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolizer Predicate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolizer Predicate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolizerPredicateType(SymbolizerPredicateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolizerPropertyType(SymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolizerType(SymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolizer Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolizer Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolizerType1(SymbolizerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbolizer Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbolizer Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolizerType2(SymbolizerType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbology Catalog Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbology Catalog Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbologyCatalogPropertyType(SymbologyCatalogPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbology Catalog Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbology Catalog Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbologyCatalogType(SymbologyCatalogType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagPropertyType(TagPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Set Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Set Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagSetPropertyType(TagSetPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagSetType(TagSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagType(TagType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagType1(TagType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetColorType(TargetColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Body Fill Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Body Fill Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextBodyFillType(TextBodyFillType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Graphic Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Graphic Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextGraphicPropertyType(TextGraphicPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextGraphicType(TextGraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Section Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Section Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSectionPropertyType(TextSectionPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSectionType(TextSectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Symbolizer Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Symbolizer Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSymbolizerPropertyType(TextSymbolizerPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Symbolizer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Symbolizer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextSymbolizerType(TextSymbolizerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Then Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Then Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThenType(ThenType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Edge Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Edge Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopEdgeType(TopEdgeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubePropertyType(TubePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tube Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tube Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTubeType(TubeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariablePropertyType(VariablePropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Step Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Step Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableStepPropertyType(VariableStepPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableStepType(VariableStepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType(VariableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType1(VariableType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType2(VariableType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableType3(VariableType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Geometry Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Geometry Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantGeometryPropertyType(VariantGeometryPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variant Geometry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variant Geometry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariantGeometryType(VariantGeometryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vendor Specific Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vendor Specific Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVendorSpecificType(VendorSpecificType object) {
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

} //AAASwitch
