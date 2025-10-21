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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAFactory;
import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;

import de.online.adv.namespaces.adv.sk.xml.skadv.util.AAAValidator;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._1999.xlink.XlinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AAAPackageImpl extends EPackageImpl implements AAAPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "skadv.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalFilterType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalSymbolizersPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalSymbolizersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalSymbolizersType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundBorderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundFillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bottomEdgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingBoxPointPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundingBoxPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centerPointPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centerPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularArcPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circularArcTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass closeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorCMYKPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorCMYKTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorRGBPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorRGBTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundStrokePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundStrokeSectionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundStrokeSectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundStrokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass currentStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curvetoPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curvetoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashedStrokePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashedStrokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designRulePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designRuleType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displacementPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displacementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emitType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass everyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass everyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureTypeStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstStepType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geometryType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicFillPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicFillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haloColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haloPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haloTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haloType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haloType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchDefinitionLongestSidePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchDefinitionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchFillLongestSidePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchFillLongestSideTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchFillPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchFillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchLinesLongestSidePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchLinesLongestSideTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchLinesPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hatchLinesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interiorType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTextType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineLabelPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineLabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePlacedGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linePlacedGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linetoPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linetoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumAdjacentLineStringPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumAdjacentLineStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumAdjacentSurfacePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maximumAdjacentSurfaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureLiteralPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureLiteralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movetoPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movetoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neighborhoodFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullColorPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathElementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perpendicularOffsetPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perpendicularOffsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementRulePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointLabelPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointLabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsInAreaDefinitionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsInAreaPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsInAreaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsOnLinePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointsOnLineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pureSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pureSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pureSymbolizerType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relateFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relateGeometryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relateGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relateTopologyPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relateTopologyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rulesToConsiderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shieldedPointLabelPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shieldedPointLabelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeletonLinePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeletonLineTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeHatchLinesPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slopeHatchLinesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidFillPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidFillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidOrDashedStrokePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidOrDashedStrokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidSectionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidSectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidStrokePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidStrokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass somePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass someTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stylePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolizerPredicateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolizerType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolizerType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbologyCatalogPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbologyCatalogTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagSetPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textBodyFillTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textGraphicPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textGraphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSectionPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSymbolizerPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textSymbolizerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thenTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEdgeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tubeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variablePropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableStepPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableStepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantGeometryPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantGeometryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vendorSpecificTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjustmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basicObjectTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum boundaryOverlapTreatmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontWeightTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geometryTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum geometryUnionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum horizontalAlignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineCapsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineJoinTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum neighborSelModeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum presentationLogicTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum regularityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relativeRotationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textDecorationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitOfMeasureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType adjustmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType basicObjectTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType boundaryOverlapTreatmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dasharrayTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dasharrayTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStyleTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontWeightTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geometryTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geometryUnionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType horizontalAlignmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineCapsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lineJoinTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType neighborSelModeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patternTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patternTypeBaseEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType presentationLogicTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regularityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType relativeRotationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType textDecorationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitOfMeasureTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verticalAlignmentTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AAAPackageImpl() {
		super(eNS_URI, AAAFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AAAPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static AAAPackage init() {
		if (isInited) return (AAAPackage)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAAAPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AAAPackageImpl theAAAPackage = registeredAAAPackage instanceof AAAPackageImpl ? (AAAPackageImpl)registeredAAAPackage : new AAAPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XlinkPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theAAAPackage.loadPackage();

		// Fix loaded packages
		theAAAPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAAAPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return AAAValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAAAPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AAAPackage.eNS_URI, theAAAPackage);
		return theAAAPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalFilterType() {
		if (additionalFilterTypeEClass == null) {
			additionalFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(0);
		}
		return additionalFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalFilterType_ExpressionGroup() {
        return (EAttribute)getAdditionalFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalFilterType_Expression() {
        return (EReference)getAdditionalFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalFilterType1() {
		if (additionalFilterType1EClass == null) {
			additionalFilterType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(1);
		}
		return additionalFilterType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalFilterType1_ExpressionGroup() {
        return (EAttribute)getAdditionalFilterType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalFilterType1_Expression() {
        return (EReference)getAdditionalFilterType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalSymbolizersPropertyType() {
		if (additionalSymbolizersPropertyTypeEClass == null) {
			additionalSymbolizersPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(2);
		}
		return additionalSymbolizersPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalSymbolizersPropertyType_AdditionalSymbolizers() {
        return (EReference)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Actuate() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Arcrole() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Href() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Role() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Show() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Title() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdditionalSymbolizersPropertyType_Type() {
        return (EAttribute)getAdditionalSymbolizersPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalSymbolizersType() {
		if (additionalSymbolizersTypeEClass == null) {
			additionalSymbolizersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(3);
		}
		return additionalSymbolizersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalSymbolizersType_AdditionalSymbolizers() {
        return (EReference)getAdditionalSymbolizersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdditionalSymbolizersType1() {
		if (additionalSymbolizersType1EClass == null) {
			additionalSymbolizersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(4);
		}
		return additionalSymbolizersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdditionalSymbolizersType1_Symbolizer() {
        return (EReference)getAdditionalSymbolizersType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaGraphicPropertyType() {
		if (areaGraphicPropertyTypeEClass == null) {
			areaGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(7);
		}
		return areaGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaGraphicPropertyType_AreaGraphic() {
        return (EReference)getAreaGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Actuate() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Arcrole() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Href() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Role() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Show() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Title() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaGraphicPropertyType_Type() {
        return (EAttribute)getAreaGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaGraphicType() {
		if (areaGraphicTypeEClass == null) {
			areaGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(8);
		}
		return areaGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaGraphicType_Interior() {
        return (EReference)getAreaGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaGraphicType_Boundary() {
        return (EReference)getAreaGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaGraphicType_Geometry() {
        return (EReference)getAreaGraphicType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaSymbolizerPropertyType() {
		if (areaSymbolizerPropertyTypeEClass == null) {
			areaSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(9);
		}
		return areaSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaSymbolizerPropertyType_AreaSymbolizer() {
        return (EReference)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Actuate() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Href() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Role() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Show() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Title() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAreaSymbolizerPropertyType_Type() {
        return (EAttribute)getAreaSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAreaSymbolizerType() {
		if (areaSymbolizerTypeEClass == null) {
			areaSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(10);
		}
		return areaSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaSymbolizerType_Interior() {
        return (EReference)getAreaSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAreaSymbolizerType_Boundary() {
        return (EReference)getAreaSymbolizerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackgroundBorderType() {
		if (backgroundBorderTypeEClass == null) {
			backgroundBorderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(11);
		}
		return backgroundBorderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBackgroundBorderType_SolidOrDashedStrokeGroup() {
        return (EAttribute)getBackgroundBorderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackgroundBorderType_SolidOrDashedStroke() {
        return (EReference)getBackgroundBorderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBackgroundFillType() {
		if (backgroundFillTypeEClass == null) {
			backgroundFillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(12);
		}
		return backgroundFillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBackgroundFillType_SolidFill() {
        return (EReference)getBackgroundFillType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBottomEdgeType() {
		if (bottomEdgeTypeEClass == null) {
			bottomEdgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(15);
		}
		return bottomEdgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBottomEdgeType_ExpressionGroup() {
        return (EAttribute)getBottomEdgeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBottomEdgeType_Expression() {
        return (EReference)getBottomEdgeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryType() {
		if (boundaryTypeEClass == null) {
			boundaryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(18);
		}
		return boundaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryType_StrokeGroup() {
        return (EAttribute)getBoundaryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundaryType_Stroke() {
        return (EReference)getBoundaryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryType1() {
		if (boundaryType1EClass == null) {
			boundaryType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(19);
		}
		return boundaryType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryType1_SolidOrDashedStrokeGroup() {
        return (EAttribute)getBoundaryType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundaryType1_SolidOrDashedStroke() {
        return (EReference)getBoundaryType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundaryType2() {
		if (boundaryType2EClass == null) {
			boundaryType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(20);
		}
		return boundaryType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundaryType2_StrokeGroup() {
        return (EAttribute)getBoundaryType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundaryType2_Stroke() {
        return (EReference)getBoundaryType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundingBoxPointPropertyType() {
		if (boundingBoxPointPropertyTypeEClass == null) {
			boundingBoxPointPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(21);
		}
		return boundingBoxPointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundingBoxPointPropertyType_BoundingBoxPoint() {
        return (EReference)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Actuate() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Arcrole() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Href() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Role() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Show() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Title() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointPropertyType_Type() {
        return (EAttribute)getBoundingBoxPointPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundingBoxPointType() {
		if (boundingBoxPointTypeEClass == null) {
			boundingBoxPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(22);
		}
		return boundingBoxPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointType_BoxPositionX() {
        return (EAttribute)getBoundingBoxPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundingBoxPointType_BoxPositionY() {
        return (EAttribute)getBoundingBoxPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCenterPointPropertyType() {
		if (centerPointPropertyTypeEClass == null) {
			centerPointPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(23);
		}
		return centerPointPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCenterPointPropertyType_CenterPoint() {
        return (EReference)getCenterPointPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Actuate() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Arcrole() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Href() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Role() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Show() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Title() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCenterPointPropertyType_Type() {
        return (EAttribute)getCenterPointPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCenterPointType() {
		if (centerPointTypeEClass == null) {
			centerPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(24);
		}
		return centerPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircularArcPropertyType() {
		if (circularArcPropertyTypeEClass == null) {
			circularArcPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(25);
		}
		return circularArcPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCircularArcPropertyType_CircularArc() {
        return (EReference)getCircularArcPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Actuate() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Arcrole() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Href() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Role() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Show() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Title() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcPropertyType_Type() {
        return (EAttribute)getCircularArcPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircularArcType() {
		if (circularArcTypeEClass == null) {
			circularArcTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(26);
		}
		return circularArcTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcType_X() {
        return (EAttribute)getCircularArcType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcType_Xa() {
        return (EAttribute)getCircularArcType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcType_Y() {
        return (EAttribute)getCircularArcType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircularArcType_Ya() {
        return (EAttribute)getCircularArcType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClosePropertyType() {
		if (closePropertyTypeEClass == null) {
			closePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(27);
		}
		return closePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClosePropertyType_Close() {
        return (EReference)getClosePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Actuate() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Arcrole() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Href() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Role() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Show() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Title() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClosePropertyType_Type() {
        return (EAttribute)getClosePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCloseType() {
		if (closeTypeEClass == null) {
			closeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(28);
		}
		return closeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorCMYKPropertyType() {
		if (colorCMYKPropertyTypeEClass == null) {
			colorCMYKPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(29);
		}
		return colorCMYKPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColorCMYKPropertyType_ColorCMYK() {
        return (EReference)getColorCMYKPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Actuate() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Arcrole() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Href() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Role() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Show() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Title() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKPropertyType_Type() {
        return (EAttribute)getColorCMYKPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorCMYKType() {
		if (colorCMYKTypeEClass == null) {
			colorCMYKTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(30);
		}
		return colorCMYKTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKType_Cyan() {
        return (EAttribute)getColorCMYKType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKType_Magenta() {
        return (EAttribute)getColorCMYKType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKType_Yellow() {
        return (EAttribute)getColorCMYKType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorCMYKType_Black() {
        return (EAttribute)getColorCMYKType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorPropertyType() {
		if (colorPropertyTypeEClass == null) {
			colorPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(31);
		}
		return colorPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_ColorGroup() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColorPropertyType_Color() {
        return (EReference)getColorPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Actuate() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Arcrole() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Href() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Role() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Show() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Title() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorPropertyType_Type() {
        return (EAttribute)getColorPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorRGBPropertyType() {
		if (colorRGBPropertyTypeEClass == null) {
			colorRGBPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(32);
		}
		return colorRGBPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColorRGBPropertyType_ColorRGB() {
        return (EReference)getColorRGBPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Actuate() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Arcrole() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Href() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Role() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Show() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Title() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBPropertyType_Type() {
        return (EAttribute)getColorRGBPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorRGBType() {
		if (colorRGBTypeEClass == null) {
			colorRGBTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(33);
		}
		return colorRGBTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBType_Red() {
        return (EAttribute)getColorRGBType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBType_Green() {
        return (EAttribute)getColorRGBType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorRGBType_Blue() {
        return (EAttribute)getColorRGBType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorType() {
		if (colorTypeEClass == null) {
			colorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(34);
		}
		return colorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_ColorGroup() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColorType_Color() {
        return (EReference)getColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Actuate() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Arcrole() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Href() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Role() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Show() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Style() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Title() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType_Type() {
        return (EAttribute)getColorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorType1() {
		if (colorType1EClass == null) {
			colorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(35);
		}
		return colorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_ColorGroup() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getColorType1_Color() {
        return (EReference)getColorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Actuate() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Arcrole() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Href() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Role() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Show() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Style() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Title() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType1_Type() {
        return (EAttribute)getColorType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColorType2() {
		if (colorType2EClass == null) {
			colorType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(36);
		}
		return colorType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColorType2_Index() {
        return (EAttribute)getColorType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeGraphicPropertyType() {
		if (compositeGraphicPropertyTypeEClass == null) {
			compositeGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(37);
		}
		return compositeGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeGraphicPropertyType_CompositeGraphic() {
        return (EReference)getCompositeGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Actuate() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Arcrole() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Href() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Role() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Show() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Title() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositeGraphicPropertyType_Type() {
        return (EAttribute)getCompositeGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositeGraphicType() {
		if (compositeGraphicTypeEClass == null) {
			compositeGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(38);
		}
		return compositeGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositeGraphicType_Member() {
        return (EReference)getCompositeGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundStrokePropertyType() {
		if (compoundStrokePropertyTypeEClass == null) {
			compoundStrokePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(39);
		}
		return compoundStrokePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundStrokePropertyType_CompoundStroke() {
        return (EReference)getCompoundStrokePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Actuate() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Arcrole() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Href() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Role() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Show() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Title() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokePropertyType_Type() {
        return (EAttribute)getCompoundStrokePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundStrokeSectionPropertyType() {
		if (compoundStrokeSectionPropertyTypeEClass == null) {
			compoundStrokeSectionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(40);
		}
		return compoundStrokeSectionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_CompoundStrokeSectionGroup() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundStrokeSectionPropertyType_CompoundStrokeSection() {
        return (EReference)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Actuate() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Arcrole() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Href() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Role() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Show() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Title() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionPropertyType_Type() {
        return (EAttribute)getCompoundStrokeSectionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundStrokeSectionType() {
		if (compoundStrokeSectionTypeEClass == null) {
			compoundStrokeSectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(41);
		}
		return compoundStrokeSectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeSectionType_Length() {
        return (EAttribute)getCompoundStrokeSectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompoundStrokeType() {
		if (compoundStrokeTypeEClass == null) {
			compoundStrokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(42);
		}
		return compoundStrokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompoundStrokeType_Adjustment() {
        return (EAttribute)getCompoundStrokeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompoundStrokeType_Section() {
        return (EReference)getCompoundStrokeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionType() {
		if (conditionTypeEClass == null) {
			conditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(43);
		}
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_ExpressionGroup() {
        return (EAttribute)getConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionType_Expression() {
        return (EReference)getConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStepPropertyType() {
		if (currentStepPropertyTypeEClass == null) {
			currentStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(44);
		}
		return currentStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurrentStepPropertyType_CurrentStep() {
        return (EReference)getCurrentStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Actuate() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Arcrole() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Href() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Role() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Show() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Title() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurrentStepPropertyType_Type() {
        return (EAttribute)getCurrentStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurrentStepType() {
		if (currentStepTypeEClass == null) {
			currentStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(45);
		}
		return currentStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurvetoPropertyType() {
		if (curvetoPropertyTypeEClass == null) {
			curvetoPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(46);
		}
		return curvetoPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCurvetoPropertyType_Curveto() {
        return (EReference)getCurvetoPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Actuate() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Arcrole() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Href() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Role() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Show() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Title() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoPropertyType_Type() {
        return (EAttribute)getCurvetoPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCurvetoType() {
		if (curvetoTypeEClass == null) {
			curvetoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(47);
		}
		return curvetoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_X() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_X1() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_X2() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_Y() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_Y1() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCurvetoType_Y2() {
        return (EAttribute)getCurvetoType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDashedStrokePropertyType() {
		if (dashedStrokePropertyTypeEClass == null) {
			dashedStrokePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(50);
		}
		return dashedStrokePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDashedStrokePropertyType_DashedStroke() {
        return (EReference)getDashedStrokePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Actuate() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Arcrole() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Href() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Role() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Show() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Title() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokePropertyType_Type() {
        return (EAttribute)getDashedStrokePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDashedStrokeType() {
		if (dashedStrokeTypeEClass == null) {
			dashedStrokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(51);
		}
		return dashedStrokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokeType_Dasharray() {
        return (EAttribute)getDashedStrokeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDashedStrokeType_Adjustment() {
        return (EAttribute)getDashedStrokeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignRulePropertyType() {
		if (designRulePropertyTypeEClass == null) {
			designRulePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(54);
		}
		return designRulePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignRulePropertyType_DesignRule() {
        return (EReference)getDesignRulePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Actuate() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Arcrole() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Href() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Role() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Show() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Title() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRulePropertyType_Type() {
        return (EAttribute)getDesignRulePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignRuleType() {
		if (designRuleTypeEClass == null) {
			designRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(55);
		}
		return designRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignRuleType_DesignRule() {
        return (EReference)getDesignRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Actuate() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Arcrole() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Href() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Role() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Show() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Title() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType_Type() {
        return (EAttribute)getDesignRuleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesignRuleType1() {
		if (designRuleType1EClass == null) {
			designRuleType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(56);
		}
		return designRuleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDesignRuleType1_Positionierungsregel() {
        return (EAttribute)getDesignRuleType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignRuleType1_RulesToConsider() {
        return (EReference)getDesignRuleType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesignRuleType1_Placement() {
        return (EReference)getDesignRuleType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplacementPropertyType() {
		if (displacementPropertyTypeEClass == null) {
			displacementPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(57);
		}
		return displacementPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDisplacementPropertyType_Displacement() {
        return (EReference)getDisplacementPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Actuate() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Arcrole() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Href() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Role() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Show() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Title() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementPropertyType_Type() {
        return (EAttribute)getDisplacementPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDisplacementType() {
		if (displacementTypeEClass == null) {
			displacementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(58);
		}
		return displacementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementType_DisplacementX() {
        return (EAttribute)getDisplacementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDisplacementType_DisplacementY() {
        return (EAttribute)getDisplacementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(59);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AdditionalSymbolizers() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AreaGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SimpleGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Graphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Element() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_AreaSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PureSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Symbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_BoundingBoxPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PlacementRule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CenterPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CircularArc() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PathElement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Close() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Color() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ColorCMYK() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ColorRGB() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CompositeGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CompoundStroke() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Stroke() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CompoundStrokeSection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_CurrentStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FirstStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Curveto() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DashedStroke() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SolidOrDashedStroke() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_DesignRule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Displacement() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Emit() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Every() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Quantifier() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Expression() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FeatureTypeStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Fill() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Filter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_FilteredSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Font() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_For() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Gap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_GraphicFill() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Halo() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HatchFill() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HatchFillLongestSide() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HatchLines() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_HatchLinesLongestSide() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_If() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Label() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Layer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LineGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LineLabel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LinePlacedGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_LineSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Lineto() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Literal() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MaximumAdjacentLineString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MaximumAdjacentSurface() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_MeasureLiteral() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Moveto() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_NullColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_NullSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Operation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Path() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PerpendicularOffset() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PointLabel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PointsInArea() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PointsOnLine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PointSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Property() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RelateGeometry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RelateTopology() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Rule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_RuleSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SelfStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_ShieldedPointLabel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SkeletonLine() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SlopeHatchLines() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SolidFill() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SolidSection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SolidStroke() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Some() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Step() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Style() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_SymbologyCatalog() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tag() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TagSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TextGraphic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TextSection() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_TextSymbolizer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Tube() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Variable() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_VariableStep() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_VariantGeometry() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementPropertyType() {
		if (elementPropertyTypeEClass == null) {
			elementPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(60);
		}
		return elementPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_ElementGroup() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementPropertyType_Element() {
        return (EReference)getElementPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Actuate() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Arcrole() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Href() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Role() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Show() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Title() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementPropertyType_Type() {
        return (EAttribute)getElementPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementType() {
		if (elementTypeEClass == null) {
			elementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(61);
		}
		return elementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType_Group() {
        return (EAttribute)getElementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType_PathElementGroup() {
        return (EAttribute)getElementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementType_PathElement() {
        return (EReference)getElementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementType1() {
		if (elementType1EClass == null) {
			elementType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(62);
		}
		return elementType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType1_Description() {
        return (EAttribute)getElementType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType1_Synopsis() {
        return (EAttribute)getElementType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementType1_VendorSpecific() {
        return (EReference)getElementType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType1_Id() {
        return (EAttribute)getElementType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementType1_Name() {
        return (EAttribute)getElementType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElseType() {
		if (elseTypeEClass == null) {
			elseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(63);
		}
		return elseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElseType_ExpressionGroup() {
        return (EAttribute)getElseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElseType_Expression() {
        return (EReference)getElseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmitPropertyType() {
		if (emitPropertyTypeEClass == null) {
			emitPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(64);
		}
		return emitPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmitPropertyType_Emit() {
        return (EReference)getEmitPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Actuate() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Arcrole() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Href() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Role() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Show() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Title() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitPropertyType_Type() {
        return (EAttribute)getEmitPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmitType() {
		if (emitTypeEClass == null) {
			emitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(65);
		}
		return emitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmitType_Emit() {
        return (EReference)getEmitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Actuate() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Arcrole() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Href() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Role() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Show() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Style() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Title() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType_Type() {
        return (EAttribute)getEmitType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmitType1() {
		if (emitType1EClass == null) {
			emitType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(66);
		}
		return emitType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmitType1_LabelText() {
        return (EReference)getEmitType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType1_ZIndex() {
        return (EAttribute)getEmitType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType1_PermitApDarst() {
        return (EAttribute)getEmitType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType1_PermitPraesobj() {
        return (EAttribute)getEmitType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType1_PermitStdpraes() {
        return (EAttribute)getEmitType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmitType1_SymbolClass() {
        return (EAttribute)getEmitType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmitType1_DesignRule() {
        return (EReference)getEmitType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEmitType1_Symbolizer() {
        return (EReference)getEmitType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEveryPropertyType() {
		if (everyPropertyTypeEClass == null) {
			everyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(67);
		}
		return everyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEveryPropertyType_Every() {
        return (EReference)getEveryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Actuate() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Arcrole() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Href() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Role() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Show() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Title() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEveryPropertyType_Type() {
        return (EAttribute)getEveryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEveryType() {
		if (everyTypeEClass == null) {
			everyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(68);
		}
		return everyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionPropertyType() {
		if (expressionPropertyTypeEClass == null) {
			expressionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(69);
		}
		return expressionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_ExpressionGroup() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionPropertyType_Expression() {
        return (EReference)getExpressionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Actuate() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Arcrole() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Href() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Role() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Show() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Title() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionPropertyType_Type() {
        return (EAttribute)getExpressionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionType() {
		if (expressionTypeEClass == null) {
			expressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(70);
		}
		return expressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_ExpressionGroup() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionType_Expression() {
        return (EReference)getExpressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionType1() {
		if (expressionType1EClass == null) {
			expressionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(71);
		}
		return expressionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureTypeStepPropertyType() {
		if (featureTypeStepPropertyTypeEClass == null) {
			featureTypeStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(72);
		}
		return featureTypeStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeatureTypeStepPropertyType_FeatureTypeStep() {
        return (EReference)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Actuate() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Arcrole() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Href() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Role() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Show() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Title() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepPropertyType_Type() {
        return (EAttribute)getFeatureTypeStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeatureTypeStepType() {
		if (featureTypeStepTypeEClass == null) {
			featureTypeStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(73);
		}
		return featureTypeStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeatureTypeStepType_FeatureTypeName() {
        return (EAttribute)getFeatureTypeStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFillPropertyType() {
		if (fillPropertyTypeEClass == null) {
			fillPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(74);
		}
		return fillPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_FillGroup() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFillPropertyType_Fill() {
        return (EReference)getFillPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Actuate() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Arcrole() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Href() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Role() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Show() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Title() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFillPropertyType_Type() {
        return (EAttribute)getFillPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFillType() {
		if (fillTypeEClass == null) {
			fillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(75);
		}
		return fillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilteredSymbolizerPropertyType() {
		if (filteredSymbolizerPropertyTypeEClass == null) {
			filteredSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(76);
		}
		return filteredSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilteredSymbolizerPropertyType_FilteredSymbolizer() {
        return (EReference)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Actuate() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Href() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Role() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Show() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Title() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilteredSymbolizerPropertyType_Type() {
        return (EAttribute)getFilteredSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilteredSymbolizerType() {
		if (filteredSymbolizerTypeEClass == null) {
			filteredSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(77);
		}
		return filteredSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilteredSymbolizerType_SymbolizerPredicate() {
        return (EReference)getFilteredSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilteredSymbolizerType_PureSymbolizer() {
        return (EReference)getFilteredSymbolizerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterPropertyType() {
		if (filterPropertyTypeEClass == null) {
			filterPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(78);
		}
		return filterPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterPropertyType_Filter() {
        return (EReference)getFilterPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Actuate() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Arcrole() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Href() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Role() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Show() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Title() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterPropertyType_Type() {
        return (EAttribute)getFilterPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterType() {
		if (filterTypeEClass == null) {
			filterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(79);
		}
		return filterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType_Filter() {
        return (EReference)getFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Actuate() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Arcrole() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Href() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Role() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Show() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Title() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType_Type() {
        return (EAttribute)getFilterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFilterType1() {
		if (filterType1EClass == null) {
			filterType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(80);
		}
		return filterType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType1_GeometryType() {
        return (EAttribute)getFilterType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType1_ModelClass() {
        return (EAttribute)getFilterType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType1_FeatureTypeName() {
        return (EAttribute)getFilterType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType1_FeatureTypeNumber() {
        return (EAttribute)getFilterType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFilterType1_BasicObjectType() {
        return (EAttribute)getFilterType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFilterType1_Expression() {
        return (EReference)getFilterType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstStepPropertyType() {
		if (firstStepPropertyTypeEClass == null) {
			firstStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(81);
		}
		return firstStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_FirstStepGroup() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirstStepPropertyType_FirstStep() {
        return (EReference)getFirstStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Actuate() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Arcrole() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Href() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Role() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Show() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Title() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepPropertyType_Type() {
        return (EAttribute)getFirstStepPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstStepType() {
		if (firstStepTypeEClass == null) {
			firstStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(82);
		}
		return firstStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFirstStepType_FirstStepGroup() {
        return (EAttribute)getFirstStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirstStepType_FirstStep() {
        return (EReference)getFirstStepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFirstStepType1() {
		if (firstStepType1EClass == null) {
			firstStepType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(83);
		}
		return firstStepType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFirstStepType1_Predicate() {
        return (EReference)getFirstStepType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFontPropertyType() {
		if (fontPropertyTypeEClass == null) {
			fontPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(84);
		}
		return fontPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFontPropertyType_Font() {
        return (EReference)getFontPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Actuate() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Arcrole() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Href() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Role() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Show() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Title() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontPropertyType_Type() {
        return (EAttribute)getFontPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFontType() {
		if (fontTypeEClass == null) {
			fontTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(87);
		}
		return fontTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFontType_Font() {
        return (EReference)getFontType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Actuate() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Arcrole() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Href() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Role() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Show() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Title() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType_Type() {
        return (EAttribute)getFontType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFontType1() {
		if (fontType1EClass == null) {
			fontType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(88);
		}
		return fontType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType1_FontFamily() {
        return (EAttribute)getFontType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType1_FontStyle() {
        return (EAttribute)getFontType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFontType1_FontWeight() {
        return (EAttribute)getFontType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForPropertyType() {
		if (forPropertyTypeEClass == null) {
			forPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(91);
		}
		return forPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForPropertyType_For() {
        return (EReference)getForPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Actuate() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Arcrole() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Href() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Role() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Show() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Title() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getForPropertyType_Type() {
        return (EAttribute)getForPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForType() {
		if (forTypeEClass == null) {
			forTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(92);
		}
		return forTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForType_Variable() {
        return (EReference)getForType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForType_In() {
        return (EReference)getForType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForType_Return() {
        return (EReference)getForType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGapPropertyType() {
		if (gapPropertyTypeEClass == null) {
			gapPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(93);
		}
		return gapPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGapPropertyType_Gap() {
        return (EReference)getGapPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Actuate() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Arcrole() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Href() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Role() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Show() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Title() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGapPropertyType_Type() {
        return (EAttribute)getGapPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGapType() {
		if (gapTypeEClass == null) {
			gapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(94);
		}
		return gapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryType() {
		if (geometryTypeEClass == null) {
			geometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(95);
		}
		return geometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeometryType_ExpressionGroup() {
        return (EAttribute)getGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeometryType_Expression() {
        return (EReference)getGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryType1() {
		if (geometryType1EClass == null) {
			geometryType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(96);
		}
		return geometryType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeometryType1_Path() {
        return (EReference)getGeometryType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeometryType2() {
		if (geometryType2EClass == null) {
			geometryType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(97);
		}
		return geometryType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeometryType2_Path() {
        return (EReference)getGeometryType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicFillPropertyType() {
		if (graphicFillPropertyTypeEClass == null) {
			graphicFillPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(102);
		}
		return graphicFillPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicFillPropertyType_GraphicFill() {
        return (EReference)getGraphicFillPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Actuate() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Arcrole() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Href() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Role() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Show() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Title() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillPropertyType_Type() {
        return (EAttribute)getGraphicFillPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicFillType() {
		if (graphicFillTypeEClass == null) {
			graphicFillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(103);
		}
		return graphicFillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_HorizontalDisplacementX() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_HorizontalDisplacementY() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_VerticalDisplacementX() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_VerticalDisplacementY() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_OriginX() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_OriginY() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_Placement() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicFillType_BoundaryOverlapTreatment() {
        return (EAttribute)getGraphicFillType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicFillType_Graphic() {
        return (EReference)getGraphicFillType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicPropertyType() {
		if (graphicPropertyTypeEClass == null) {
			graphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(104);
		}
		return graphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_GraphicGroup() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicPropertyType_Graphic() {
        return (EReference)getGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Actuate() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Arcrole() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Href() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Role() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Show() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Title() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicPropertyType_Type() {
        return (EAttribute)getGraphicPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType() {
		if (graphicTypeEClass == null) {
			graphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(105);
		}
		return graphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_GraphicGroup() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType_Graphic() {
        return (EReference)getGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Actuate() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Arcrole() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Href() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Role() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Show() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Title() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Type() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType1() {
		if (graphicType1EClass == null) {
			graphicType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(106);
		}
		return graphicType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_GraphicGroup() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType1_Graphic() {
        return (EReference)getGraphicType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Actuate() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Arcrole() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Href() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Role() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Show() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Title() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Type() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType2() {
		if (graphicType2EClass == null) {
			graphicType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(107);
		}
		return graphicType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_GraphicGroup() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType2_Graphic() {
        return (EReference)getGraphicType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Actuate() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Arcrole() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Href() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Role() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Show() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Title() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType2_Type() {
        return (EAttribute)getGraphicType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType3() {
		if (graphicType3EClass == null) {
			graphicType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(108);
		}
		return graphicType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType3_DisplacementX() {
        return (EAttribute)getGraphicType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType3_DisplacementY() {
        return (EAttribute)getGraphicType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType3_Rotation() {
        return (EAttribute)getGraphicType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType3_Scalefactor() {
        return (EAttribute)getGraphicType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType3_Halo() {
        return (EReference)getGraphicType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaloColorType() {
		if (haloColorTypeEClass == null) {
			haloColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(109);
		}
		return haloColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_ColorGroup() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloColorType_Color() {
        return (EReference)getHaloColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Actuate() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Arcrole() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Href() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Role() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Show() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Style() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Title() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloColorType_Type() {
        return (EAttribute)getHaloColorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaloPropertyType() {
		if (haloPropertyTypeEClass == null) {
			haloPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(110);
		}
		return haloPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloPropertyType_Halo() {
        return (EReference)getHaloPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Actuate() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Arcrole() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Href() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Role() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Show() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Title() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloPropertyType_Type() {
        return (EAttribute)getHaloPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaloType() {
		if (haloTypeEClass == null) {
			haloTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(111);
		}
		return haloTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloType_Halo() {
        return (EReference)getHaloType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Actuate() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Arcrole() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Href() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Role() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Show() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Title() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType_Type() {
        return (EAttribute)getHaloType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaloType1() {
		if (haloType1EClass == null) {
			haloType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(112);
		}
		return haloType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType1_Radius() {
        return (EAttribute)getHaloType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloType1_HaloColor() {
        return (EReference)getHaloType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloType1_TargetColor() {
        return (EReference)getHaloType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaloType2() {
		if (haloType2EClass == null) {
			haloType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(113);
		}
		return haloType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHaloType2_Halo() {
        return (EReference)getHaloType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Actuate() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Arcrole() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Href() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Role() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Show() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Title() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaloType2_Type() {
        return (EAttribute)getHaloType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchDefinitionLongestSidePropertyType() {
		if (hatchDefinitionLongestSidePropertyTypeEClass == null) {
			hatchDefinitionLongestSidePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(114);
		}
		return hatchDefinitionLongestSidePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionLongestSidePropertyType_HatchFillLongestSide() {
        return (EReference)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionLongestSidePropertyType_HatchLinesLongestSide() {
        return (EReference)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Actuate() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Arcrole() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Href() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Role() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Show() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Title() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionLongestSidePropertyType_Type() {
        return (EAttribute)getHatchDefinitionLongestSidePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchDefinitionPropertyType() {
		if (hatchDefinitionPropertyTypeEClass == null) {
			hatchDefinitionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(115);
		}
		return hatchDefinitionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionPropertyType_HatchFill() {
        return (EReference)getHatchDefinitionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionPropertyType_HatchFillLongestSide() {
        return (EReference)getHatchDefinitionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionPropertyType_HatchLines() {
        return (EReference)getHatchDefinitionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchDefinitionPropertyType_HatchLinesLongestSide() {
        return (EReference)getHatchDefinitionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Actuate() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Arcrole() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Href() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Role() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Show() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Title() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchDefinitionPropertyType_Type() {
        return (EAttribute)getHatchDefinitionPropertyType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchFillLongestSidePropertyType() {
		if (hatchFillLongestSidePropertyTypeEClass == null) {
			hatchFillLongestSidePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(116);
		}
		return hatchFillLongestSidePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchFillLongestSidePropertyType_HatchFillLongestSide() {
        return (EReference)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Actuate() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Arcrole() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Href() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Role() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Show() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Title() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSidePropertyType_Type() {
        return (EAttribute)getHatchFillLongestSidePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchFillLongestSideType() {
		if (hatchFillLongestSideTypeEClass == null) {
			hatchFillLongestSideTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(117);
		}
		return hatchFillLongestSideTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_OffsetToAreaOutline() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_OriginX() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_OriginY() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_HatchRayDirectionX() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_HatchRayDirectionY() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_HatchDisplacementDirectionX() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_HatchDisplacementDirectionY() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillLongestSideType_HatchDisplacementOffset() {
        return (EAttribute)getHatchFillLongestSideType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchFillLongestSideType_Stroke() {
        return (EReference)getHatchFillLongestSideType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchFillPropertyType() {
		if (hatchFillPropertyTypeEClass == null) {
			hatchFillPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(118);
		}
		return hatchFillPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchFillPropertyType_HatchFill() {
        return (EReference)getHatchFillPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Actuate() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Arcrole() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Href() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Role() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Show() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Title() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillPropertyType_Type() {
        return (EAttribute)getHatchFillPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchFillType() {
		if (hatchFillTypeEClass == null) {
			hatchFillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(119);
		}
		return hatchFillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_OriginX() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_OriginY() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_HatchRayDirectionX() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_HatchRayDirectionY() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_HatchDisplacementDirectionX() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_HatchDisplacementDirectionY() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchFillType_HatchDisplacementOffset() {
        return (EAttribute)getHatchFillType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchFillType_Stroke() {
        return (EReference)getHatchFillType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchLinesLongestSidePropertyType() {
		if (hatchLinesLongestSidePropertyTypeEClass == null) {
			hatchLinesLongestSidePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(120);
		}
		return hatchLinesLongestSidePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchLinesLongestSidePropertyType_HatchLinesLongestSide() {
        return (EReference)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Actuate() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Arcrole() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Href() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Role() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Show() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Title() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSidePropertyType_Type() {
        return (EAttribute)getHatchLinesLongestSidePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchLinesLongestSideType() {
		if (hatchLinesLongestSideTypeEClass == null) {
			hatchLinesLongestSideTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(121);
		}
		return hatchLinesLongestSideTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_OffsetToAreaOutline() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_OriginX() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_OriginY() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_HatchRayDirectionX() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_HatchRayDirectionY() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_HatchDisplacementDirectionX() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_HatchDisplacementDirectionY() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesLongestSideType_HatchDisplacementOffset() {
        return (EAttribute)getHatchLinesLongestSideType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchLinesPropertyType() {
		if (hatchLinesPropertyTypeEClass == null) {
			hatchLinesPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(122);
		}
		return hatchLinesPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHatchLinesPropertyType_HatchLines() {
        return (EReference)getHatchLinesPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Actuate() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Arcrole() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Href() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Role() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Show() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Title() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesPropertyType_Type() {
        return (EAttribute)getHatchLinesPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHatchLinesType() {
		if (hatchLinesTypeEClass == null) {
			hatchLinesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(123);
		}
		return hatchLinesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_OriginX() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_OriginY() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_HatchRayDirectionX() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_HatchRayDirectionY() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_HatchDisplacementDirectionX() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_HatchDisplacementDirectionY() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHatchLinesType_HatchDisplacementOffset() {
        return (EAttribute)getHatchLinesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfPropertyType() {
		if (ifPropertyTypeEClass == null) {
			ifPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(126);
		}
		return ifPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfPropertyType_If() {
        return (EReference)getIfPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Actuate() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Arcrole() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Href() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Role() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Show() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Title() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfPropertyType_Type() {
        return (EAttribute)getIfPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfType() {
		if (ifTypeEClass == null) {
			ifTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(127);
		}
		return ifTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfType_Condition() {
        return (EReference)getIfType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfType_Then() {
        return (EReference)getIfType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIfType_Else() {
        return (EReference)getIfType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteriorType() {
		if (interiorTypeEClass == null) {
			interiorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(128);
		}
		return interiorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteriorType_FillGroup() {
        return (EAttribute)getInteriorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteriorType_Fill() {
        return (EReference)getInteriorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteriorType1() {
		if (interiorType1EClass == null) {
			interiorType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(129);
		}
		return interiorType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteriorType1_FillGroup() {
        return (EAttribute)getInteriorType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInteriorType1_Fill() {
        return (EReference)getInteriorType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInType() {
		if (inTypeEClass == null) {
			inTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(130);
		}
		return inTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInType_ExpressionGroup() {
        return (EAttribute)getInType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInType_Expression() {
        return (EReference)getInType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInType1() {
		if (inType1EClass == null) {
			inType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(131);
		}
		return inType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInType1_ExpressionGroup() {
        return (EAttribute)getInType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInType1_Expression() {
        return (EReference)getInType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelPropertyType() {
		if (labelPropertyTypeEClass == null) {
			labelPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(132);
		}
		return labelPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_LabelGroup() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelPropertyType_Label() {
        return (EReference)getLabelPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Actuate() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Arcrole() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Href() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Role() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Show() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Title() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelPropertyType_Type() {
        return (EAttribute)getLabelPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelTextType() {
		if (labelTextTypeEClass == null) {
			labelTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(133);
		}
		return labelTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelTextType_ExpressionGroup() {
        return (EAttribute)getLabelTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelTextType_Expression() {
        return (EReference)getLabelTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelTextType1() {
		if (labelTextType1EClass == null) {
			labelTextType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(134);
		}
		return labelTextType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelTextType1_ExpressionGroup() {
        return (EAttribute)getLabelTextType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelTextType1_Expression() {
        return (EReference)getLabelTextType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType() {
		if (labelTypeEClass == null) {
			labelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(135);
		}
		return labelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType_PointLabelGroup() {
        return (EAttribute)getLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType_PointLabel() {
        return (EReference)getLabelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType1() {
		if (labelType1EClass == null) {
			labelType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(136);
		}
		return labelType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType1_LineLabel() {
        return (EReference)getLabelType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType2() {
		if (labelType2EClass == null) {
			labelType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(137);
		}
		return labelType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType2_LabelGroup() {
        return (EAttribute)getLabelType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType2_Label() {
        return (EReference)getLabelType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabelType3() {
		if (labelType3EClass == null) {
			labelType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(138);
		}
		return labelType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType3_LabelText() {
        return (EReference)getLabelType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_Size() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_TextDecoration() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_Spacing() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_Scalefactor() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_HorizontalAlignment() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabelType3_VerticalAlignment() {
        return (EAttribute)getLabelType3().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType3_Font() {
        return (EReference)getLabelType3().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType3_TextBodyFill() {
        return (EReference)getLabelType3().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabelType3_Halo() {
        return (EReference)getLabelType3().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerPropertyType() {
		if (layerPropertyTypeEClass == null) {
			layerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(139);
		}
		return layerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerPropertyType_Layer() {
        return (EReference)getLayerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Actuate() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Arcrole() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Href() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Role() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Show() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Title() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerPropertyType_Type() {
        return (EAttribute)getLayerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerType() {
		if (layerTypeEClass == null) {
			layerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(140);
		}
		return layerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType_Layer() {
        return (EReference)getLayerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Actuate() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Arcrole() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Href() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Role() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Show() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Title() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerType_Type() {
        return (EAttribute)getLayerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerType1() {
		if (layerType1EClass == null) {
			layerType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(141);
		}
		return layerType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType1_Style() {
        return (EReference)getLayerType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType1_RuleSet() {
        return (EReference)getLayerType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerType1_AdditionalSymbolizers() {
        return (EReference)getLayerType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineGraphicPropertyType() {
		if (lineGraphicPropertyTypeEClass == null) {
			lineGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(144);
		}
		return lineGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineGraphicPropertyType_LineGraphic() {
        return (EReference)getLineGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Actuate() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Arcrole() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Href() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Role() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Show() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Title() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineGraphicPropertyType_Type() {
        return (EAttribute)getLineGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineGraphicType() {
		if (lineGraphicTypeEClass == null) {
			lineGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(145);
		}
		return lineGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineGraphicType_Stroke() {
        return (EReference)getLineGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineGraphicType_Geometry() {
        return (EReference)getLineGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineLabelPropertyType() {
		if (lineLabelPropertyTypeEClass == null) {
			lineLabelPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(148);
		}
		return lineLabelPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineLabelPropertyType_LineLabel() {
        return (EReference)getLineLabelPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Actuate() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Arcrole() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Href() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Role() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Show() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Title() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelPropertyType_Type() {
        return (EAttribute)getLineLabelPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineLabelType() {
		if (lineLabelTypeEClass == null) {
			lineLabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(149);
		}
		return lineLabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineLabelType_PerpendicularOffset() {
        return (EAttribute)getLineLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinePlacedGraphicPropertyType() {
		if (linePlacedGraphicPropertyTypeEClass == null) {
			linePlacedGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(150);
		}
		return linePlacedGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinePlacedGraphicPropertyType_LinePlacedGraphic() {
        return (EReference)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Actuate() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Arcrole() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Href() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Role() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Show() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Title() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicPropertyType_Type() {
        return (EAttribute)getLinePlacedGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinePlacedGraphicType() {
		if (linePlacedGraphicTypeEClass == null) {
			linePlacedGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(151);
		}
		return linePlacedGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinePlacedGraphicType_RelativeRotation() {
        return (EAttribute)getLinePlacedGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinePlacedGraphicType_Graphic() {
        return (EReference)getLinePlacedGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineSymbolizerPropertyType() {
		if (lineSymbolizerPropertyTypeEClass == null) {
			lineSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(152);
		}
		return lineSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineSymbolizerPropertyType_LineSymbolizer() {
        return (EReference)getLineSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Actuate() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Href() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Role() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Show() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Title() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineSymbolizerPropertyType_Type() {
        return (EAttribute)getLineSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineSymbolizerType() {
		if (lineSymbolizerTypeEClass == null) {
			lineSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(153);
		}
		return lineSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineSymbolizerType_Stroke() {
        return (EReference)getLineSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinetoPropertyType() {
		if (linetoPropertyTypeEClass == null) {
			linetoPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(154);
		}
		return linetoPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLinetoPropertyType_Lineto() {
        return (EReference)getLinetoPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Actuate() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Arcrole() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Href() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Role() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Show() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Title() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoPropertyType_Type() {
        return (EAttribute)getLinetoPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinetoType() {
		if (linetoTypeEClass == null) {
			linetoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(155);
		}
		return linetoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoType_X() {
        return (EAttribute)getLinetoType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinetoType_Y() {
        return (EAttribute)getLinetoType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralPropertyType() {
		if (literalPropertyTypeEClass == null) {
			literalPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(156);
		}
		return literalPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_LiteralGroup() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLiteralPropertyType_Literal() {
        return (EReference)getLiteralPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Actuate() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Arcrole() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Href() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Role() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Show() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Title() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralPropertyType_Type() {
        return (EAttribute)getLiteralPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLiteralType() {
		if (literalTypeEClass == null) {
			literalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(157);
		}
		return literalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralType_Type() {
        return (EAttribute)getLiteralType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLiteralType_Value() {
        return (EAttribute)getLiteralType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximumAdjacentLineStringPropertyType() {
		if (maximumAdjacentLineStringPropertyTypeEClass == null) {
			maximumAdjacentLineStringPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(158);
		}
		return maximumAdjacentLineStringPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaximumAdjacentLineStringPropertyType_MaximumAdjacentLineString() {
        return (EReference)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Actuate() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Arcrole() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Href() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Role() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Show() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Title() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentLineStringPropertyType_Type() {
        return (EAttribute)getMaximumAdjacentLineStringPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximumAdjacentLineStringType() {
		if (maximumAdjacentLineStringTypeEClass == null) {
			maximumAdjacentLineStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(159);
		}
		return maximumAdjacentLineStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaximumAdjacentLineStringType_AdditionalFilter() {
        return (EReference)getMaximumAdjacentLineStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximumAdjacentSurfacePropertyType() {
		if (maximumAdjacentSurfacePropertyTypeEClass == null) {
			maximumAdjacentSurfacePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(160);
		}
		return maximumAdjacentSurfacePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaximumAdjacentSurfacePropertyType_MaximumAdjacentSurface() {
        return (EReference)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Actuate() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Arcrole() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Href() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Role() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Show() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Title() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMaximumAdjacentSurfacePropertyType_Type() {
        return (EAttribute)getMaximumAdjacentSurfacePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMaximumAdjacentSurfaceType() {
		if (maximumAdjacentSurfaceTypeEClass == null) {
			maximumAdjacentSurfaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(161);
		}
		return maximumAdjacentSurfaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMaximumAdjacentSurfaceType_AdditionalFilter() {
        return (EReference)getMaximumAdjacentSurfaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasureLiteralPropertyType() {
		if (measureLiteralPropertyTypeEClass == null) {
			measureLiteralPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(162);
		}
		return measureLiteralPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasureLiteralPropertyType_MeasureLiteral() {
        return (EReference)getMeasureLiteralPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Actuate() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Arcrole() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Href() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Role() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Show() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Title() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralPropertyType_Type() {
        return (EAttribute)getMeasureLiteralPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasureLiteralType() {
		if (measureLiteralTypeEClass == null) {
			measureLiteralTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(163);
		}
		return measureLiteralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureLiteralType_Uom() {
        return (EAttribute)getMeasureLiteralType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMemberType() {
		if (memberTypeEClass == null) {
			memberTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(164);
		}
		return memberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMemberType_SimpleGraphicGroup() {
        return (EAttribute)getMemberType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMemberType_SimpleGraphic() {
        return (EReference)getMemberType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMovetoPropertyType() {
		if (movetoPropertyTypeEClass == null) {
			movetoPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(165);
		}
		return movetoPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMovetoPropertyType_Moveto() {
        return (EReference)getMovetoPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Actuate() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Arcrole() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Href() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Role() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Show() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Title() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoPropertyType_Type() {
        return (EAttribute)getMovetoPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMovetoType() {
		if (movetoTypeEClass == null) {
			movetoTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(166);
		}
		return movetoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoType_X() {
        return (EAttribute)getMovetoType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMovetoType_Y() {
        return (EAttribute)getMovetoType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNeighborhoodFilterType() {
		if (neighborhoodFilterTypeEClass == null) {
			neighborhoodFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(167);
		}
		return neighborhoodFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNeighborhoodFilterType_ExpressionGroup() {
        return (EAttribute)getNeighborhoodFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNeighborhoodFilterType_Expression() {
        return (EReference)getNeighborhoodFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullColorPropertyType() {
		if (nullColorPropertyTypeEClass == null) {
			nullColorPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(170);
		}
		return nullColorPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNullColorPropertyType_NullColor() {
        return (EReference)getNullColorPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Actuate() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Arcrole() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Href() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Role() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Show() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Title() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullColorPropertyType_Type() {
        return (EAttribute)getNullColorPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullColorType() {
		if (nullColorTypeEClass == null) {
			nullColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(171);
		}
		return nullColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullSymbolizerPropertyType() {
		if (nullSymbolizerPropertyTypeEClass == null) {
			nullSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(172);
		}
		return nullSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNullSymbolizerPropertyType_NullSymbolizer() {
        return (EReference)getNullSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Actuate() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Href() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Role() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Show() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Title() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNullSymbolizerPropertyType_Type() {
        return (EAttribute)getNullSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNullSymbolizerType() {
		if (nullSymbolizerTypeEClass == null) {
			nullSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(173);
		}
		return nullSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperandType() {
		if (operandTypeEClass == null) {
			operandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(174);
		}
		return operandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperandType_ExpressionGroup() {
        return (EAttribute)getOperandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperandType_Expression() {
        return (EReference)getOperandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationPropertyType() {
		if (operationPropertyTypeEClass == null) {
			operationPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(175);
		}
		return operationPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationPropertyType_Operation() {
        return (EReference)getOperationPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Actuate() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Arcrole() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Href() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Role() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Show() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Title() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationPropertyType_Type() {
        return (EAttribute)getOperationPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationType() {
		if (operationTypeEClass == null) {
			operationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(176);
		}
		return operationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationType_Operand() {
        return (EReference)getOperationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationType_OperationName() {
        return (EAttribute)getOperationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathElementPropertyType() {
		if (pathElementPropertyTypeEClass == null) {
			pathElementPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(177);
		}
		return pathElementPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_PathElementGroup() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathElementPropertyType_PathElement() {
        return (EReference)getPathElementPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Actuate() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Arcrole() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Href() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Role() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Show() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Title() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathElementPropertyType_Type() {
        return (EAttribute)getPathElementPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathElementType() {
		if (pathElementTypeEClass == null) {
			pathElementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(178);
		}
		return pathElementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathPropertyType() {
		if (pathPropertyTypeEClass == null) {
			pathPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(179);
		}
		return pathPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathPropertyType_Path() {
        return (EReference)getPathPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Actuate() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Arcrole() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Href() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Role() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Show() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Title() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPathPropertyType_Type() {
        return (EAttribute)getPathPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPathType() {
		if (pathTypeEClass == null) {
			pathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(180);
		}
		return pathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPathType_Element() {
        return (EReference)getPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerpendicularOffsetPropertyType() {
		if (perpendicularOffsetPropertyTypeEClass == null) {
			perpendicularOffsetPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(183);
		}
		return perpendicularOffsetPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerpendicularOffsetPropertyType_PerpendicularOffset() {
        return (EReference)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Actuate() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Arcrole() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Href() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Role() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Show() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Title() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetPropertyType_Type() {
        return (EAttribute)getPerpendicularOffsetPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerpendicularOffsetType() {
		if (perpendicularOffsetTypeEClass == null) {
			perpendicularOffsetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(184);
		}
		return perpendicularOffsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerpendicularOffsetType_Distance() {
        return (EAttribute)getPerpendicularOffsetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacementRulePropertyType() {
		if (placementRulePropertyTypeEClass == null) {
			placementRulePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(185);
		}
		return placementRulePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_PlacementRuleGroup() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlacementRulePropertyType_PlacementRule() {
        return (EReference)getPlacementRulePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Actuate() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Arcrole() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Href() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Role() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Show() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Title() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementRulePropertyType_Type() {
        return (EAttribute)getPlacementRulePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacementRuleType() {
		if (placementRuleTypeEClass == null) {
			placementRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(186);
		}
		return placementRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlacementType() {
		if (placementTypeEClass == null) {
			placementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(187);
		}
		return placementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_PlacementRuleGroup() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlacementType_PlacementRule() {
        return (EReference)getPlacementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Actuate() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Arcrole() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Href() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Role() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Show() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Title() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlacementType_Type() {
        return (EAttribute)getPlacementType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointLabelPropertyType() {
		if (pointLabelPropertyTypeEClass == null) {
			pointLabelPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(188);
		}
		return pointLabelPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_PointLabelGroup() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointLabelPropertyType_PointLabel() {
        return (EReference)getPointLabelPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Actuate() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Arcrole() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Href() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Role() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Show() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Title() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelPropertyType_Type() {
        return (EAttribute)getPointLabelPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointLabelType() {
		if (pointLabelTypeEClass == null) {
			pointLabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(189);
		}
		return pointLabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelType_Rotation() {
        return (EAttribute)getPointLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelType_DisplacementX() {
        return (EAttribute)getPointLabelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelType_DisplacementY() {
        return (EAttribute)getPointLabelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointLabelType_LineSpacing() {
        return (EAttribute)getPointLabelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointsInAreaDefinitionPropertyType() {
		if (pointsInAreaDefinitionPropertyTypeEClass == null) {
			pointsInAreaDefinitionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(190);
		}
		return pointsInAreaDefinitionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointsInAreaDefinitionPropertyType_GraphicFill() {
        return (EReference)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointsInAreaDefinitionPropertyType_PointsInArea() {
        return (EReference)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Actuate() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Arcrole() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Href() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Role() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Show() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Title() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaDefinitionPropertyType_Type() {
        return (EAttribute)getPointsInAreaDefinitionPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointsInAreaPropertyType() {
		if (pointsInAreaPropertyTypeEClass == null) {
			pointsInAreaPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(191);
		}
		return pointsInAreaPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointsInAreaPropertyType_PointsInArea() {
        return (EReference)getPointsInAreaPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Actuate() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Arcrole() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Href() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Role() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Show() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Title() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaPropertyType_Type() {
        return (EAttribute)getPointsInAreaPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointsInAreaType() {
		if (pointsInAreaTypeEClass == null) {
			pointsInAreaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(192);
		}
		return pointsInAreaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_HorizontalDisplacementX() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_HorizontalDisplacementY() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_VerticalDisplacementX() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_VerticalDisplacementY() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_OriginX() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_OriginY() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsInAreaType_Placement() {
        return (EAttribute)getPointsInAreaType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointsOnLinePropertyType() {
		if (pointsOnLinePropertyTypeEClass == null) {
			pointsOnLinePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(193);
		}
		return pointsOnLinePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointsOnLinePropertyType_PointsOnLine() {
        return (EReference)getPointsOnLinePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Actuate() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Arcrole() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Href() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Role() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Show() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Title() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLinePropertyType_Type() {
        return (EAttribute)getPointsOnLinePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointsOnLineType() {
		if (pointsOnLineTypeEClass == null) {
			pointsOnLineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(194);
		}
		return pointsOnLineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLineType_Pattern() {
        return (EAttribute)getPointsOnLineType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLineType_RelativeRotation() {
        return (EAttribute)getPointsOnLineType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLineType_Adjustment() {
        return (EAttribute)getPointsOnLineType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLineType_PreGap() {
        return (EAttribute)getPointsOnLineType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointsOnLineType_PostGap() {
        return (EAttribute)getPointsOnLineType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointSymbolizerPropertyType() {
		if (pointSymbolizerPropertyTypeEClass == null) {
			pointSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(195);
		}
		return pointSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointSymbolizerPropertyType_PointSymbolizer() {
        return (EReference)getPointSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Actuate() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Href() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Role() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Show() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Title() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPointSymbolizerPropertyType_Type() {
        return (EAttribute)getPointSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPointSymbolizerType() {
		if (pointSymbolizerTypeEClass == null) {
			pointSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(196);
		}
		return pointSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPointSymbolizerType_Graphic() {
        return (EReference)getPointSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostGraphicType() {
		if (postGraphicTypeEClass == null) {
			postGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(197);
		}
		return postGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPostGraphicType_LinePlacedGraphic() {
        return (EReference)getPostGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateType() {
		if (predicateTypeEClass == null) {
			predicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(198);
		}
		return predicateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicateType_ExpressionGroup() {
        return (EAttribute)getPredicateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateType_Expression() {
        return (EReference)getPredicateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicateType1() {
		if (predicateType1EClass == null) {
			predicateType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(199);
		}
		return predicateType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredicateType1_ExpressionGroup() {
        return (EAttribute)getPredicateType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPredicateType1_Expression() {
        return (EReference)getPredicateType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPreGraphicType() {
		if (preGraphicTypeEClass == null) {
			preGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(200);
		}
		return preGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPreGraphicType_LinePlacedGraphic() {
        return (EReference)getPreGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyPropertyType() {
		if (propertyPropertyTypeEClass == null) {
			propertyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(203);
		}
		return propertyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyPropertyType_Property() {
        return (EReference)getPropertyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Actuate() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Arcrole() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Href() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Role() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Show() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Title() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPropertyType_Type() {
        return (EAttribute)getPropertyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(204);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyType_FirstStep() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyType_Step() {
        return (EReference)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPureSymbolizerPropertyType() {
		if (pureSymbolizerPropertyTypeEClass == null) {
			pureSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(205);
		}
		return pureSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_PureSymbolizerGroup() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPureSymbolizerPropertyType_PureSymbolizer() {
        return (EReference)getPureSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Actuate() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Href() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Role() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Show() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Title() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerPropertyType_Type() {
        return (EAttribute)getPureSymbolizerPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPureSymbolizerType() {
		if (pureSymbolizerTypeEClass == null) {
			pureSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(206);
		}
		return pureSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_PureSymbolizerGroup() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPureSymbolizerType_PureSymbolizer() {
        return (EReference)getPureSymbolizerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Actuate() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Arcrole() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Href() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Role() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Show() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Title() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType_Type() {
        return (EAttribute)getPureSymbolizerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPureSymbolizerType1() {
		if (pureSymbolizerType1EClass == null) {
			pureSymbolizerType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(207);
		}
		return pureSymbolizerType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType1_Signaturnummer() {
        return (EAttribute)getPureSymbolizerType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPureSymbolizerType1_ZIndex() {
        return (EAttribute)getPureSymbolizerType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantifierPropertyType() {
		if (quantifierPropertyTypeEClass == null) {
			quantifierPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(208);
		}
		return quantifierPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_QuantifierGroup() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierPropertyType_Quantifier() {
        return (EReference)getQuantifierPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Actuate() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Arcrole() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Href() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Role() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Show() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Title() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQuantifierPropertyType_Type() {
        return (EAttribute)getQuantifierPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantifierType() {
		if (quantifierTypeEClass == null) {
			quantifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(209);
		}
		return quantifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierType_Variable() {
        return (EReference)getQuantifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierType_In() {
        return (EReference)getQuantifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantifierType_Satisfies() {
        return (EReference)getQuantifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelateFilterType() {
		if (relateFilterTypeEClass == null) {
			relateFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(212);
		}
		return relateFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateFilterType_ExpressionGroup() {
        return (EAttribute)getRelateFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelateFilterType_Expression() {
        return (EReference)getRelateFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelateGeometryPropertyType() {
		if (relateGeometryPropertyTypeEClass == null) {
			relateGeometryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(213);
		}
		return relateGeometryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelateGeometryPropertyType_RelateGeometry() {
        return (EReference)getRelateGeometryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Actuate() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Arcrole() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Href() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Role() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Show() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Title() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryPropertyType_Type() {
        return (EAttribute)getRelateGeometryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelateGeometryType() {
		if (relateGeometryTypeEClass == null) {
			relateGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(214);
		}
		return relateGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateGeometryType_Relate() {
        return (EAttribute)getRelateGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelateGeometryType_RelateFilter() {
        return (EReference)getRelateGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelateTopologyPropertyType() {
		if (relateTopologyPropertyTypeEClass == null) {
			relateTopologyPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(215);
		}
		return relateTopologyPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelateTopologyPropertyType_RelateTopology() {
        return (EReference)getRelateTopologyPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Actuate() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Arcrole() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Href() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Role() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Show() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Title() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyPropertyType_Type() {
        return (EAttribute)getRelateTopologyPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelateTopologyType() {
		if (relateTopologyTypeEClass == null) {
			relateTopologyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(216);
		}
		return relateTopologyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelateTopologyType_Selmode() {
        return (EAttribute)getRelateTopologyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelateTopologyType_NeighborhoodFilter() {
        return (EReference)getRelateTopologyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturnType() {
		if (returnTypeEClass == null) {
			returnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(221);
		}
		return returnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReturnType_ExpressionGroup() {
        return (EAttribute)getReturnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReturnType_Expression() {
        return (EReference)getReturnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRulePropertyType() {
		if (rulePropertyTypeEClass == null) {
			rulePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(222);
		}
		return rulePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRulePropertyType_Rule() {
        return (EReference)getRulePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Actuate() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Arcrole() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Href() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Role() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Show() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Title() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulePropertyType_Type() {
        return (EAttribute)getRulePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleSetPropertyType() {
		if (ruleSetPropertyTypeEClass == null) {
			ruleSetPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(223);
		}
		return ruleSetPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleSetPropertyType_RuleSet() {
        return (EReference)getRuleSetPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Actuate() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Arcrole() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Href() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Role() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Show() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Title() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetPropertyType_Type() {
        return (EAttribute)getRuleSetPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleSetType() {
		if (ruleSetTypeEClass == null) {
			ruleSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(224);
		}
		return ruleSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType_MaxScaleDenominator() {
        return (EAttribute)getRuleSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType_MinScaleDenominator() {
        return (EAttribute)getRuleSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType_TargetScaleDenominator() {
        return (EAttribute)getRuleSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleSetType_Rule() {
        return (EReference)getRuleSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleSetType1() {
		if (ruleSetType1EClass == null) {
			ruleSetType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(225);
		}
		return ruleSetType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleSetType1_RuleSet() {
        return (EReference)getRuleSetType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Actuate() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Arcrole() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Href() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Role() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Show() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Title() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleSetType1_Type() {
        return (EAttribute)getRuleSetType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRulesToConsiderType() {
		if (rulesToConsiderTypeEClass == null) {
			rulesToConsiderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(226);
		}
		return rulesToConsiderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRulesToConsiderType_DesignRule() {
        return (EReference)getRulesToConsiderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Actuate() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Arcrole() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Href() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Role() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Show() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Title() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRulesToConsiderType_Type() {
        return (EAttribute)getRulesToConsiderType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleType() {
		if (ruleTypeEClass == null) {
			ruleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(227);
		}
		return ruleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleType_Filter() {
        return (EReference)getRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleType_Emit() {
        return (EReference)getRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRuleType1() {
		if (ruleType1EClass == null) {
			ruleType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(228);
		}
		return ruleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRuleType1_Rule() {
        return (EReference)getRuleType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Actuate() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Arcrole() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Href() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Role() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Show() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Title() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRuleType1_Type() {
        return (EAttribute)getRuleType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfiesType() {
		if (satisfiesTypeEClass == null) {
			satisfiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(229);
		}
		return satisfiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSatisfiesType_ExpressionGroup() {
        return (EAttribute)getSatisfiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfiesType_Expression() {
        return (EReference)getSatisfiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSectionType() {
		if (sectionTypeEClass == null) {
			sectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(230);
		}
		return sectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSectionType_CompoundStrokeSectionGroup() {
        return (EAttribute)getSectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSectionType_CompoundStrokeSection() {
        return (EReference)getSectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfStepPropertyType() {
		if (selfStepPropertyTypeEClass == null) {
			selfStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(231);
		}
		return selfStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSelfStepPropertyType_SelfStep() {
        return (EReference)getSelfStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Actuate() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Arcrole() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Href() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Role() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Show() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Title() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSelfStepPropertyType_Type() {
        return (EAttribute)getSelfStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSelfStepType() {
		if (selfStepTypeEClass == null) {
			selfStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(232);
		}
		return selfStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShieldedPointLabelPropertyType() {
		if (shieldedPointLabelPropertyTypeEClass == null) {
			shieldedPointLabelPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(233);
		}
		return shieldedPointLabelPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShieldedPointLabelPropertyType_ShieldedPointLabel() {
        return (EReference)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Actuate() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Arcrole() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Href() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Role() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Show() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Title() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelPropertyType_Type() {
        return (EAttribute)getShieldedPointLabelPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShieldedPointLabelType() {
		if (shieldedPointLabelTypeEClass == null) {
			shieldedPointLabelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(234);
		}
		return shieldedPointLabelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelType_BoxEnlargementLeft() {
        return (EAttribute)getShieldedPointLabelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelType_BoxEnlargementRight() {
        return (EAttribute)getShieldedPointLabelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelType_BoxEnlargementTop() {
        return (EAttribute)getShieldedPointLabelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelType_BoxEnlargementBottom() {
        return (EAttribute)getShieldedPointLabelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShieldedPointLabelType_RoundedCornerRadius() {
        return (EAttribute)getShieldedPointLabelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShieldedPointLabelType_BackgroundFill() {
        return (EReference)getShieldedPointLabelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShieldedPointLabelType_BackgroundBorder() {
        return (EReference)getShieldedPointLabelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleGraphicPropertyType() {
		if (simpleGraphicPropertyTypeEClass == null) {
			simpleGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(235);
		}
		return simpleGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_SimpleGraphicGroup() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSimpleGraphicPropertyType_SimpleGraphic() {
        return (EReference)getSimpleGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Actuate() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Arcrole() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Href() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Role() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Show() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Title() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleGraphicPropertyType_Type() {
        return (EAttribute)getSimpleGraphicPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleGraphicType() {
		if (simpleGraphicTypeEClass == null) {
			simpleGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(236);
		}
		return simpleGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkeletonLinePropertyType() {
		if (skeletonLinePropertyTypeEClass == null) {
			skeletonLinePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(237);
		}
		return skeletonLinePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkeletonLinePropertyType_SkeletonLine() {
        return (EReference)getSkeletonLinePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Actuate() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Arcrole() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Href() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Role() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Show() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Title() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkeletonLinePropertyType_Type() {
        return (EAttribute)getSkeletonLinePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkeletonLineType() {
		if (skeletonLineTypeEClass == null) {
			skeletonLineTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(238);
		}
		return skeletonLineTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlopeHatchLinesPropertyType() {
		if (slopeHatchLinesPropertyTypeEClass == null) {
			slopeHatchLinesPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(239);
		}
		return slopeHatchLinesPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlopeHatchLinesPropertyType_SlopeHatchLines() {
        return (EReference)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Actuate() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Arcrole() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Href() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Role() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Show() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Title() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesPropertyType_Type() {
        return (EAttribute)getSlopeHatchLinesPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlopeHatchLinesType() {
		if (slopeHatchLinesTypeEClass == null) {
			slopeHatchLinesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(240);
		}
		return slopeHatchLinesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesType_SecondHatchLineFactor() {
        return (EAttribute)getSlopeHatchLinesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlopeHatchLinesType_HatchDistance() {
        return (EAttribute)getSlopeHatchLinesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlopeHatchLinesType_TopEdge() {
        return (EReference)getSlopeHatchLinesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlopeHatchLinesType_BottomEdge() {
        return (EReference)getSlopeHatchLinesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidFillPropertyType() {
		if (solidFillPropertyTypeEClass == null) {
			solidFillPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(241);
		}
		return solidFillPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidFillPropertyType_SolidFill() {
        return (EReference)getSolidFillPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Actuate() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Arcrole() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Href() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Role() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Show() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Title() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidFillPropertyType_Type() {
        return (EAttribute)getSolidFillPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidFillType() {
		if (solidFillTypeEClass == null) {
			solidFillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(242);
		}
		return solidFillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidFillType_Color() {
        return (EReference)getSolidFillType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidOrDashedStrokePropertyType() {
		if (solidOrDashedStrokePropertyTypeEClass == null) {
			solidOrDashedStrokePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(243);
		}
		return solidOrDashedStrokePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_SolidOrDashedStrokeGroup() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidOrDashedStrokePropertyType_SolidOrDashedStroke() {
        return (EReference)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Actuate() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Arcrole() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Href() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Role() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Show() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Title() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokePropertyType_Type() {
        return (EAttribute)getSolidOrDashedStrokePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidOrDashedStrokeType() {
		if (solidOrDashedStrokeTypeEClass == null) {
			solidOrDashedStrokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(244);
		}
		return solidOrDashedStrokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokeType_Linecaps() {
        return (EAttribute)getSolidOrDashedStrokeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokeType_Linejoin() {
        return (EAttribute)getSolidOrDashedStrokeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokeType_Miterlimit() {
        return (EAttribute)getSolidOrDashedStrokeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidOrDashedStrokeType_Width() {
        return (EAttribute)getSolidOrDashedStrokeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidOrDashedStrokeType_Color() {
        return (EReference)getSolidOrDashedStrokeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidOrDashedStrokeType_Boundary() {
        return (EReference)getSolidOrDashedStrokeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidSectionPropertyType() {
		if (solidSectionPropertyTypeEClass == null) {
			solidSectionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(245);
		}
		return solidSectionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidSectionPropertyType_SolidSection() {
        return (EReference)getSolidSectionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Actuate() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Arcrole() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Href() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Role() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Show() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Title() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidSectionPropertyType_Type() {
        return (EAttribute)getSolidSectionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidSectionType() {
		if (solidSectionTypeEClass == null) {
			solidSectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(246);
		}
		return solidSectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidSectionType_Stroke() {
        return (EReference)getSolidSectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidStrokePropertyType() {
		if (solidStrokePropertyTypeEClass == null) {
			solidStrokePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(247);
		}
		return solidStrokePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidStrokePropertyType_SolidStroke() {
        return (EReference)getSolidStrokePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Actuate() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Arcrole() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Href() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Role() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Show() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Title() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolidStrokePropertyType_Type() {
        return (EAttribute)getSolidStrokePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidStrokeType() {
		if (solidStrokeTypeEClass == null) {
			solidStrokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(248);
		}
		return solidStrokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSomePropertyType() {
		if (somePropertyTypeEClass == null) {
			somePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(249);
		}
		return somePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSomePropertyType_Some() {
        return (EReference)getSomePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Actuate() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Arcrole() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Href() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Role() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Show() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Title() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSomePropertyType_Type() {
        return (EAttribute)getSomePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSomeType() {
		if (someTypeEClass == null) {
			someTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(250);
		}
		return someTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepPropertyType() {
		if (stepPropertyTypeEClass == null) {
			stepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(251);
		}
		return stepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepPropertyType_Step() {
        return (EReference)getStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Actuate() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Arcrole() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Href() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Role() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Show() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Title() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepPropertyType_Type() {
        return (EAttribute)getStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepType() {
		if (stepTypeEClass == null) {
			stepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(252);
		}
		return stepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepType_Predicate() {
        return (EReference)getStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_IsAttr() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_StepName() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepType1() {
		if (stepType1EClass == null) {
			stepType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(253);
		}
		return stepType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepType1_Step() {
        return (EReference)getStepType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokePropertyType() {
		if (strokePropertyTypeEClass == null) {
			strokePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(254);
		}
		return strokePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_StrokeGroup() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokePropertyType_Stroke() {
        return (EReference)getStrokePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Actuate() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Arcrole() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Href() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Role() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Show() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Title() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokePropertyType_Type() {
        return (EAttribute)getStrokePropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType() {
		if (strokeTypeEClass == null) {
			strokeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(255);
		}
		return strokeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType_StrokeGroup() {
        return (EAttribute)getStrokeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType_Stroke() {
        return (EReference)getStrokeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType1() {
		if (strokeType1EClass == null) {
			strokeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(256);
		}
		return strokeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType1_StrokeGroup() {
        return (EAttribute)getStrokeType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType1_Stroke() {
        return (EReference)getStrokeType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType2() {
		if (strokeType2EClass == null) {
			strokeType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(257);
		}
		return strokeType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType2_StrokeGroup() {
        return (EAttribute)getStrokeType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType2_Stroke() {
        return (EReference)getStrokeType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType3() {
		if (strokeType3EClass == null) {
			strokeType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(258);
		}
		return strokeType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType3_StrokeGroup() {
        return (EAttribute)getStrokeType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType3_Stroke() {
        return (EReference)getStrokeType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType4() {
		if (strokeType4EClass == null) {
			strokeType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(259);
		}
		return strokeType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType4_SolidStroke() {
        return (EReference)getStrokeType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrokeType5() {
		if (strokeType5EClass == null) {
			strokeType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(260);
		}
		return strokeType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType5_PreGap() {
        return (EAttribute)getStrokeType5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrokeType5_PostGap() {
        return (EAttribute)getStrokeType5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType5_PreGraphic() {
        return (EReference)getStrokeType5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStrokeType5_PostGraphic() {
        return (EReference)getStrokeType5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStylePropertyType() {
		if (stylePropertyTypeEClass == null) {
			stylePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(261);
		}
		return stylePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStylePropertyType_Style() {
        return (EReference)getStylePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Actuate() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Arcrole() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Href() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Role() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Show() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Title() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStylePropertyType_Type() {
        return (EAttribute)getStylePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleType() {
		if (styleTypeEClass == null) {
			styleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(262);
		}
		return styleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleType1() {
		if (styleType1EClass == null) {
			styleType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(263);
		}
		return styleType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleType1_Style() {
        return (EReference)getStyleType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Actuate() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Arcrole() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Href() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Role() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Show() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Title() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleType1_Type() {
        return (EAttribute)getStyleType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolizerPredicateType() {
		if (symbolizerPredicateTypeEClass == null) {
			symbolizerPredicateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(264);
		}
		return symbolizerPredicateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPredicateType_ExpressionGroup() {
        return (EAttribute)getSymbolizerPredicateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolizerPredicateType_Expression() {
        return (EReference)getSymbolizerPredicateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolizerPropertyType() {
		if (symbolizerPropertyTypeEClass == null) {
			symbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(265);
		}
		return symbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_SymbolizerGroup() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolizerPropertyType_Symbolizer() {
        return (EReference)getSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Actuate() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Href() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Role() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Show() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Title() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerPropertyType_Type() {
        return (EAttribute)getSymbolizerPropertyType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolizerType() {
		if (symbolizerTypeEClass == null) {
			symbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(266);
		}
		return symbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_SymbolizerGroup() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolizerType_Symbolizer() {
        return (EReference)getSymbolizerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Actuate() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Arcrole() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Href() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Role() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Show() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Title() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType_Type() {
        return (EAttribute)getSymbolizerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolizerType1() {
		if (symbolizerType1EClass == null) {
			symbolizerType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(267);
		}
		return symbolizerType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbolizerType2() {
		if (symbolizerType2EClass == null) {
			symbolizerType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(268);
		}
		return symbolizerType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_PureSymbolizerGroup() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbolizerType2_PureSymbolizer() {
        return (EReference)getSymbolizerType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Actuate() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Arcrole() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Href() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Role() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Show() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Title() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbolizerType2_Type() {
        return (EAttribute)getSymbolizerType2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbologyCatalogPropertyType() {
		if (symbologyCatalogPropertyTypeEClass == null) {
			symbologyCatalogPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(269);
		}
		return symbologyCatalogPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbologyCatalogPropertyType_SymbologyCatalog() {
        return (EReference)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Actuate() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Arcrole() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Href() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Role() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Show() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Title() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogPropertyType_Type() {
        return (EAttribute)getSymbologyCatalogPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSymbologyCatalogType() {
		if (symbologyCatalogTypeEClass == null) {
			symbologyCatalogTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(270);
		}
		return symbologyCatalogTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_Version() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_VersionGeoInfoDok() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_DateOfIssue() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_PresentationLogic() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_MapLengthFactor() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_MapCharSizeFactor() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSymbologyCatalogType_MapAngleFactor() {
        return (EAttribute)getSymbologyCatalogType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSymbologyCatalogType_Layer() {
        return (EReference)getSymbologyCatalogType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagPropertyType() {
		if (tagPropertyTypeEClass == null) {
			tagPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(271);
		}
		return tagPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagPropertyType_Tag() {
        return (EReference)getTagPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Actuate() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Arcrole() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Href() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Role() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Show() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Title() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagPropertyType_Type() {
        return (EAttribute)getTagPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagSetPropertyType() {
		if (tagSetPropertyTypeEClass == null) {
			tagSetPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(272);
		}
		return tagSetPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagSetPropertyType_TagSet() {
        return (EReference)getTagSetPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Actuate() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Arcrole() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Href() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Role() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Show() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Title() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagSetPropertyType_Type() {
        return (EAttribute)getTagSetPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagSetType() {
		if (tagSetTypeEClass == null) {
			tagSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(273);
		}
		return tagSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagSetType_Tag() {
        return (EReference)getTagSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagType() {
		if (tagTypeEClass == null) {
			tagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(274);
		}
		return tagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType_Key() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType_Value() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagType1() {
		if (tagType1EClass == null) {
			tagType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(275);
		}
		return tagType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTagType1_Tag() {
        return (EReference)getTagType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Actuate() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Arcrole() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Href() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Role() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Show() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Title() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagType1_Type() {
        return (EAttribute)getTagType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetColorType() {
		if (targetColorTypeEClass == null) {
			targetColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(276);
		}
		return targetColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_ColorGroup() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetColorType_Color() {
        return (EReference)getTargetColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Actuate() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Arcrole() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Href() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Role() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Show() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Style() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Title() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetColorType_Type() {
        return (EAttribute)getTargetColorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextBodyFillType() {
		if (textBodyFillTypeEClass == null) {
			textBodyFillTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(277);
		}
		return textBodyFillTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextBodyFillType_SolidFill() {
        return (EReference)getTextBodyFillType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextGraphicPropertyType() {
		if (textGraphicPropertyTypeEClass == null) {
			textGraphicPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(280);
		}
		return textGraphicPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextGraphicPropertyType_TextGraphic() {
        return (EReference)getTextGraphicPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Actuate() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Arcrole() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Href() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Role() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Show() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Title() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextGraphicPropertyType_Type() {
        return (EAttribute)getTextGraphicPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextGraphicType() {
		if (textGraphicTypeEClass == null) {
			textGraphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(281);
		}
		return textGraphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextGraphicType_Label() {
        return (EReference)getTextGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextSectionPropertyType() {
		if (textSectionPropertyTypeEClass == null) {
			textSectionPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(282);
		}
		return textSectionPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextSectionPropertyType_TextSection() {
        return (EReference)getTextSectionPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Actuate() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Arcrole() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Href() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Role() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Show() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Title() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSectionPropertyType_Type() {
        return (EAttribute)getTextSectionPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextSectionType() {
		if (textSectionTypeEClass == null) {
			textSectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(283);
		}
		return textSectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextSectionType_Label() {
        return (EReference)getTextSectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextSymbolizerPropertyType() {
		if (textSymbolizerPropertyTypeEClass == null) {
			textSymbolizerPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(284);
		}
		return textSymbolizerPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextSymbolizerPropertyType_TextSymbolizer() {
        return (EReference)getTextSymbolizerPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Actuate() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Arcrole() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Href() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Role() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Show() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Title() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextSymbolizerPropertyType_Type() {
        return (EAttribute)getTextSymbolizerPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextSymbolizerType() {
		if (textSymbolizerTypeEClass == null) {
			textSymbolizerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(285);
		}
		return textSymbolizerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextSymbolizerType_Label() {
        return (EReference)getTextSymbolizerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getThenType() {
		if (thenTypeEClass == null) {
			thenTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(286);
		}
		return thenTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getThenType_ExpressionGroup() {
        return (EAttribute)getThenType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getThenType_Expression() {
        return (EReference)getThenType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopEdgeType() {
		if (topEdgeTypeEClass == null) {
			topEdgeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(287);
		}
		return topEdgeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTopEdgeType_ExpressionGroup() {
        return (EAttribute)getTopEdgeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTopEdgeType_Expression() {
        return (EReference)getTopEdgeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTubePropertyType() {
		if (tubePropertyTypeEClass == null) {
			tubePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(288);
		}
		return tubePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTubePropertyType_Tube() {
        return (EReference)getTubePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Actuate() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Arcrole() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Href() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Role() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Show() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Title() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubePropertyType_Type() {
        return (EAttribute)getTubePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTubeType() {
		if (tubeTypeEClass == null) {
			tubeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(289);
		}
		return tubeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubeType_Linecaps() {
        return (EAttribute)getTubeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubeType_Linejoin() {
        return (EAttribute)getTubeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubeType_Miterlimit() {
        return (EAttribute)getTubeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTubeType_Width() {
        return (EAttribute)getTubeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariablePropertyType() {
		if (variablePropertyTypeEClass == null) {
			variablePropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(292);
		}
		return variablePropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariablePropertyType_Variable() {
        return (EReference)getVariablePropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Actuate() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Arcrole() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Href() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Role() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Show() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Title() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariablePropertyType_Type() {
        return (EAttribute)getVariablePropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableStepPropertyType() {
		if (variableStepPropertyTypeEClass == null) {
			variableStepPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(293);
		}
		return variableStepPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableStepPropertyType_VariableStep() {
        return (EReference)getVariableStepPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Actuate() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Arcrole() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Href() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Role() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Show() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Title() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableStepPropertyType_Type() {
        return (EAttribute)getVariableStepPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableStepType() {
		if (variableStepTypeEClass == null) {
			variableStepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(294);
		}
		return variableStepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableStepType_Variable() {
        return (EReference)getVariableStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableType() {
		if (variableTypeEClass == null) {
			variableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(295);
		}
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableType_Variable() {
        return (EReference)getVariableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableType1() {
		if (variableType1EClass == null) {
			variableType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(296);
		}
		return variableType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariableType1_VariableName() {
        return (EAttribute)getVariableType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableType2() {
		if (variableType2EClass == null) {
			variableType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(297);
		}
		return variableType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableType2_Variable() {
        return (EReference)getVariableType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableType3() {
		if (variableType3EClass == null) {
			variableType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(298);
		}
		return variableType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableType3_Variable() {
        return (EReference)getVariableType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantGeometryPropertyType() {
		if (variantGeometryPropertyTypeEClass == null) {
			variantGeometryPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(299);
		}
		return variantGeometryPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantGeometryPropertyType_VariantGeometry() {
        return (EReference)getVariantGeometryPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Actuate() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Arcrole() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Href() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Role() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Show() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Title() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryPropertyType_Type() {
        return (EAttribute)getVariantGeometryPropertyType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariantGeometryType() {
		if (variantGeometryTypeEClass == null) {
			variantGeometryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(300);
		}
		return variantGeometryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariantGeometryType_Mode() {
        return (EAttribute)getVariantGeometryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariantGeometryType_Geometry() {
        return (EReference)getVariantGeometryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVendorSpecificType() {
		if (vendorSpecificTypeEClass == null) {
			vendorSpecificTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(301);
		}
		return vendorSpecificTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVendorSpecificType_TagSet() {
        return (EReference)getVendorSpecificType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Actuate() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Arcrole() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Href() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Role() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Show() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Title() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVendorSpecificType_Type() {
        return (EAttribute)getVendorSpecificType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAdjustmentType() {
		if (adjustmentTypeEEnum == null) {
			adjustmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(5);
		}
		return adjustmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBasicObjectTypeType() {
		if (basicObjectTypeTypeEEnum == null) {
			basicObjectTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(13);
		}
		return basicObjectTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBoundaryOverlapTreatmentType() {
		if (boundaryOverlapTreatmentTypeEEnum == null) {
			boundaryOverlapTreatmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(16);
		}
		return boundaryOverlapTreatmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataTypeType() {
		if (dataTypeTypeEEnum == null) {
			dataTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(52);
		}
		return dataTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontStyleType() {
		if (fontStyleTypeEEnum == null) {
			fontStyleTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(85);
		}
		return fontStyleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontWeightType() {
		if (fontWeightTypeEEnum == null) {
			fontWeightTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(89);
		}
		return fontWeightTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeometryTypeType() {
		if (geometryTypeTypeEEnum == null) {
			geometryTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(98);
		}
		return geometryTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGeometryUnionType() {
		if (geometryUnionTypeEEnum == null) {
			geometryUnionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(100);
		}
		return geometryUnionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHorizontalAlignmentType() {
		if (horizontalAlignmentTypeEEnum == null) {
			horizontalAlignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(124);
		}
		return horizontalAlignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLineCapsType() {
		if (lineCapsTypeEEnum == null) {
			lineCapsTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(142);
		}
		return lineCapsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLineJoinType() {
		if (lineJoinTypeEEnum == null) {
			lineJoinTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(146);
		}
		return lineJoinTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNeighborSelModeType() {
		if (neighborSelModeTypeEEnum == null) {
			neighborSelModeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(168);
		}
		return neighborSelModeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPresentationLogicType() {
		if (presentationLogicTypeEEnum == null) {
			presentationLogicTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(201);
		}
		return presentationLogicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRegularityType() {
		if (regularityTypeEEnum == null) {
			regularityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(210);
		}
		return regularityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelateType() {
		if (relateTypeEEnum == null) {
			relateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(217);
		}
		return relateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRelativeRotationType() {
		if (relativeRotationTypeEEnum == null) {
			relativeRotationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(219);
		}
		return relativeRotationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTextDecorationType() {
		if (textDecorationTypeEEnum == null) {
			textDecorationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(278);
		}
		return textDecorationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitOfMeasureType() {
		if (unitOfMeasureTypeEEnum == null) {
			unitOfMeasureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(290);
		}
		return unitOfMeasureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerticalAlignmentType() {
		if (verticalAlignmentTypeEEnum == null) {
			verticalAlignmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(302);
		}
		return verticalAlignmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAdjustmentTypeObject() {
		if (adjustmentTypeObjectEDataType == null) {
			adjustmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(6);
		}
		return adjustmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBasicObjectTypeTypeObject() {
		if (basicObjectTypeTypeObjectEDataType == null) {
			basicObjectTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(14);
		}
		return basicObjectTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBoundaryOverlapTreatmentTypeObject() {
		if (boundaryOverlapTreatmentTypeObjectEDataType == null) {
			boundaryOverlapTreatmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(17);
		}
		return boundaryOverlapTreatmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDasharrayType() {
		if (dasharrayTypeEDataType == null) {
			dasharrayTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(48);
		}
		return dasharrayTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDasharrayTypeBase() {
		if (dasharrayTypeBaseEDataType == null) {
			dasharrayTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(49);
		}
		return dasharrayTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataTypeTypeObject() {
		if (dataTypeTypeObjectEDataType == null) {
			dataTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(53);
		}
		return dataTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFontStyleTypeObject() {
		if (fontStyleTypeObjectEDataType == null) {
			fontStyleTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(86);
		}
		return fontStyleTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFontWeightTypeObject() {
		if (fontWeightTypeObjectEDataType == null) {
			fontWeightTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(90);
		}
		return fontWeightTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeometryTypeTypeObject() {
		if (geometryTypeTypeObjectEDataType == null) {
			geometryTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(99);
		}
		return geometryTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeometryUnionTypeObject() {
		if (geometryUnionTypeObjectEDataType == null) {
			geometryUnionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(101);
		}
		return geometryUnionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHorizontalAlignmentTypeObject() {
		if (horizontalAlignmentTypeObjectEDataType == null) {
			horizontalAlignmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(125);
		}
		return horizontalAlignmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLineCapsTypeObject() {
		if (lineCapsTypeObjectEDataType == null) {
			lineCapsTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(143);
		}
		return lineCapsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLineJoinTypeObject() {
		if (lineJoinTypeObjectEDataType == null) {
			lineJoinTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(147);
		}
		return lineJoinTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNeighborSelModeTypeObject() {
		if (neighborSelModeTypeObjectEDataType == null) {
			neighborSelModeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(169);
		}
		return neighborSelModeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPatternType() {
		if (patternTypeEDataType == null) {
			patternTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(181);
		}
		return patternTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPatternTypeBase() {
		if (patternTypeBaseEDataType == null) {
			patternTypeBaseEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(182);
		}
		return patternTypeBaseEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPresentationLogicTypeObject() {
		if (presentationLogicTypeObjectEDataType == null) {
			presentationLogicTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(202);
		}
		return presentationLogicTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegularityTypeObject() {
		if (regularityTypeObjectEDataType == null) {
			regularityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(211);
		}
		return regularityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRelateTypeObject() {
		if (relateTypeObjectEDataType == null) {
			relateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(218);
		}
		return relateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRelativeRotationTypeObject() {
		if (relativeRotationTypeObjectEDataType == null) {
			relativeRotationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(220);
		}
		return relativeRotationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTextDecorationTypeObject() {
		if (textDecorationTypeObjectEDataType == null) {
			textDecorationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(279);
		}
		return textDecorationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitOfMeasureTypeObject() {
		if (unitOfMeasureTypeObjectEDataType == null) {
			unitOfMeasureTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(291);
		}
		return unitOfMeasureTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerticalAlignmentTypeObject() {
		if (verticalAlignmentTypeObjectEDataType == null) {
			verticalAlignmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(AAAPackage.eNS_URI).getEClassifiers().get(303);
		}
		return verticalAlignmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AAAFactory getAAAFactory() {
		return (AAAFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.online.adv.namespaces.adv.sk.xml.skadv." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //AAAPackageImpl
