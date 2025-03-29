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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.dmn.dc.DCPackage;

import org.omg.spec.dmn.dc.impl.DCPackageImpl;

import org.omg.spec.dmn.di.DIPackage;

import org.omg.spec.dmn.di.impl.DIPackageImpl;

import org.omg.spec.dmn.dmn.DMNFactory;
import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.DMNRoot;
import org.omg.spec.dmn.dmn.ExtensionElementsType;
import org.omg.spec.dmn.dmn.TArtifact;
import org.omg.spec.dmn.dmn.TAssociation;
import org.omg.spec.dmn.dmn.TAssociationDirection;
import org.omg.spec.dmn.dmn.TAuthorityRequirement;
import org.omg.spec.dmn.dmn.TBinding;
import org.omg.spec.dmn.dmn.TBuiltinAggregator;
import org.omg.spec.dmn.dmn.TBusinessContextElement;
import org.omg.spec.dmn.dmn.TBusinessKnowledgeModel;
import org.omg.spec.dmn.dmn.TChildExpression;
import org.omg.spec.dmn.dmn.TConditional;
import org.omg.spec.dmn.dmn.TContext;
import org.omg.spec.dmn.dmn.TContextEntry;
import org.omg.spec.dmn.dmn.TDMNElement;
import org.omg.spec.dmn.dmn.TDMNElementReference;
import org.omg.spec.dmn.dmn.TDRGElement;
import org.omg.spec.dmn.dmn.TDecision;
import org.omg.spec.dmn.dmn.TDecisionRule;
import org.omg.spec.dmn.dmn.TDecisionService;
import org.omg.spec.dmn.dmn.TDecisionTable;
import org.omg.spec.dmn.dmn.TDecisionTableOrientation;
import org.omg.spec.dmn.dmn.TDefinitions;
import org.omg.spec.dmn.dmn.TElementCollection;
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TFilter;
import org.omg.spec.dmn.dmn.TFor;
import org.omg.spec.dmn.dmn.TFunctionDefinition;
import org.omg.spec.dmn.dmn.TFunctionItem;
import org.omg.spec.dmn.dmn.TFunctionKind;
import org.omg.spec.dmn.dmn.TGroup;
import org.omg.spec.dmn.dmn.THitPolicy;
import org.omg.spec.dmn.dmn.TImport;
import org.omg.spec.dmn.dmn.TImportedValues;
import org.omg.spec.dmn.dmn.TInformationItem;
import org.omg.spec.dmn.dmn.TInformationRequirement;
import org.omg.spec.dmn.dmn.TInputClause;
import org.omg.spec.dmn.dmn.TInputData;
import org.omg.spec.dmn.dmn.TInvocable;
import org.omg.spec.dmn.dmn.TInvocation;
import org.omg.spec.dmn.dmn.TItemDefinition;
import org.omg.spec.dmn.dmn.TIterator;
import org.omg.spec.dmn.dmn.TKnowledgeRequirement;
import org.omg.spec.dmn.dmn.TKnowledgeSource;
import org.omg.spec.dmn.dmn.TList;
import org.omg.spec.dmn.dmn.TLiteralExpression;
import org.omg.spec.dmn.dmn.TNamedElement;
import org.omg.spec.dmn.dmn.TOrganizationUnit;
import org.omg.spec.dmn.dmn.TOutputClause;
import org.omg.spec.dmn.dmn.TPerformanceIndicator;
import org.omg.spec.dmn.dmn.TQuantified;
import org.omg.spec.dmn.dmn.TRelation;
import org.omg.spec.dmn.dmn.TRuleAnnotation;
import org.omg.spec.dmn.dmn.TRuleAnnotationClause;
import org.omg.spec.dmn.dmn.TTextAnnotation;
import org.omg.spec.dmn.dmn.TTypedChildExpression;
import org.omg.spec.dmn.dmn.TUnaryTests;

import org.omg.spec.dmn.dmndi.DMNDIPackage;

import org.omg.spec.dmn.dmndi.impl.DMNDIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DMNPackageImpl extends EPackageImpl implements DMNPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dmnRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAuthorityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBusinessContextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tBusinessKnowledgeModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tChildExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tConditionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tContextEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdmnElementReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tdrgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tElementCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tForEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFunctionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tFunctionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImportedValuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInformationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInformationRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInputClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInputDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInvocableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tInvocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIteratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tKnowledgeRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tKnowledgeSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tLiteralExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOrganizationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOutputClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPerformanceIndicatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tQuantifiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRuleAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRuleAnnotationClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTypedChildExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tUnaryTestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAssociationDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tBuiltinAggregatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tDecisionTableOrientationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tFunctionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tHitPolicyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAssociationDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tBuiltinAggregatorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tDecisionTableOrientationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tFunctionKindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tHitPolicyObjectEDataType = null;

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
	 * @see org.omg.spec.dmn.dmn.DMNPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DMNPackageImpl() {
		super(eNS_URI, DMNFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DMNPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DMNPackage init() {
		if (isInited) return (DMNPackage)EPackage.Registry.INSTANCE.getEPackage(DMNPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDMNPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DMNPackageImpl theDMNPackage = registeredDMNPackage instanceof DMNPackageImpl ? (DMNPackageImpl)registeredDMNPackage : new DMNPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DMNDIPackage.eNS_URI);
		DMNDIPackageImpl theDMNDIPackage = (DMNDIPackageImpl)(registeredPackage instanceof DMNDIPackageImpl ? registeredPackage : DMNDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Create package meta-data objects
		theDMNPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theDMNDIPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theDMNPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theDMNDIPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDMNPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DMNPackage.eNS_URI, theDMNPackage);
		return theDMNPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDMNRoot() {
		return dmnRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDMNRoot_Mixed() {
		return (EAttribute)dmnRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_XMLNSPrefixMap() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_XSISchemaLocation() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Artifact() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_DMNElement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Association() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_AuthorityRequirement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_BusinessContextElement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_BusinessKnowledgeModel() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Invocable() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_DrgElement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_NamedElement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Conditional() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Expression() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Context() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_ContextEntry() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Decision() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_DecisionService() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_DecisionTable() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Definitions() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_ElementCollection() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Every() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Filter() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_For() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_FunctionDefinition() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_FunctionItem() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Group() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Import() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_InformationItem() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_InformationRequirement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_InputData() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Invocation() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_ItemDefinition() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_KnowledgeRequirement() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_KnowledgeSource() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_List() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_LiteralExpression() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_OrganizationUnit() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_PerformanceIndicator() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Relation() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_Some() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDMNRoot_TextAnnotation() {
		return (EReference)dmnRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtensionElementsType() {
		return extensionElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtensionElementsType_Any() {
		return (EAttribute)extensionElementsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTArtifact() {
		return tArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAssociation() {
		return tAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAssociation_SourceRef() {
		return (EReference)tAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAssociation_TargetRef() {
		return (EReference)tAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAssociation_AssociationDirection() {
		return (EAttribute)tAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAuthorityRequirement() {
		return tAuthorityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAuthorityRequirement_RequiredDecision() {
		return (EReference)tAuthorityRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAuthorityRequirement_RequiredInput() {
		return (EReference)tAuthorityRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTAuthorityRequirement_RequiredAuthority() {
		return (EReference)tAuthorityRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBinding() {
		return tBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTBinding_Parameter() {
		return (EReference)tBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBinding_ExpressionGroup() {
		return (EAttribute)tBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTBinding_Expression() {
		return (EReference)tBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBusinessContextElement() {
		return tBusinessContextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTBusinessContextElement_URI() {
		return (EAttribute)tBusinessContextElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTBusinessKnowledgeModel() {
		return tBusinessKnowledgeModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTBusinessKnowledgeModel_EncapsulatedLogic() {
		return (EReference)tBusinessKnowledgeModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTBusinessKnowledgeModel_KnowledgeRequirement() {
		return (EReference)tBusinessKnowledgeModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTBusinessKnowledgeModel_AuthorityRequirement() {
		return (EReference)tBusinessKnowledgeModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTChildExpression() {
		return tChildExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTChildExpression_ExpressionGroup() {
		return (EAttribute)tChildExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTChildExpression_Expression() {
		return (EReference)tChildExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTChildExpression_Id() {
		return (EAttribute)tChildExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTConditional() {
		return tConditionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTConditional_If() {
		return (EReference)tConditionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTConditional_Then() {
		return (EReference)tConditionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTConditional_Else() {
		return (EReference)tConditionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTContext() {
		return tContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTContext_ContextEntry() {
		return (EReference)tContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTContextEntry() {
		return tContextEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTContextEntry_Variable() {
		return (EReference)tContextEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTContextEntry_ExpressionGroup() {
		return (EAttribute)tContextEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTContextEntry_Expression() {
		return (EReference)tContextEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecision() {
		return tDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_Question() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_AllowedAnswers() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_Variable() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_InformationRequirement() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_KnowledgeRequirement() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_AuthorityRequirement() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_SupportedObjective() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_ImpactedPerformanceIndicator() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_DecisionMaker() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_DecisionOwner() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_UsingProcess() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_UsingTask() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_ExpressionGroup() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_Expression() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecisionRule() {
		return tDecisionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionRule_InputEntry() {
		return (EReference)tDecisionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionRule_OutputEntry() {
		return (EReference)tDecisionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionRule_AnnotationEntry() {
		return (EReference)tDecisionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecisionService() {
		return tDecisionServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionService_OutputDecision() {
		return (EReference)tDecisionServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionService_EncapsulatedDecision() {
		return (EReference)tDecisionServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionService_InputDecision() {
		return (EReference)tDecisionServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionService_InputData() {
		return (EReference)tDecisionServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecisionTable() {
		return tDecisionTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTable_Input() {
		return (EReference)tDecisionTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTable_Output() {
		return (EReference)tDecisionTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTable_Annotation() {
		return (EReference)tDecisionTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTable_Rule() {
		return (EReference)tDecisionTableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecisionTable_Aggregation() {
		return (EAttribute)tDecisionTableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecisionTable_HitPolicy() {
		return (EAttribute)tDecisionTableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecisionTable_OutputLabel() {
		return (EAttribute)tDecisionTableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecisionTable_PreferredOrientation() {
		return (EAttribute)tDecisionTableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDefinitions() {
		return tDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Import() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_ItemDefinition() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_DrgElementGroup() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_DrgElement() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ArtifactGroup() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Artifact() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_ElementCollection() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_BusinessContextElementGroup() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_BusinessContextElement() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_DMNDI() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Exporter() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ExporterVersion() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ExpressionLanguage() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Namespace() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_TypeLanguage() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDMNElement() {
		return tdmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDMNElement_Description() {
		return (EAttribute)tdmnElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDMNElement_ExtensionElements() {
		return (EReference)tdmnElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDMNElement_Id() {
		return (EAttribute)tdmnElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDMNElement_Label() {
		return (EAttribute)tdmnElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDMNElement_AnyAttribute() {
		return (EAttribute)tdmnElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDMNElementReference() {
		return tdmnElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDMNElementReference_Href() {
		return (EAttribute)tdmnElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDRGElement() {
		return tdrgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTElementCollection() {
		return tElementCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTElementCollection_DrgElement() {
		return (EReference)tElementCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTExpression() {
		return tExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTExpression_TypeRef() {
		return (EAttribute)tExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFilter() {
		return tFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFilter_In() {
		return (EReference)tFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFilter_Match() {
		return (EReference)tFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFor() {
		return tForEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFor_Return() {
		return (EReference)tForEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFunctionDefinition() {
		return tFunctionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunctionDefinition_FormalParameter() {
		return (EReference)tFunctionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionDefinition_ExpressionGroup() {
		return (EAttribute)tFunctionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunctionDefinition_Expression() {
		return (EReference)tFunctionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionDefinition_Kind() {
		return (EAttribute)tFunctionDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTFunctionItem() {
		return tFunctionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTFunctionItem_Parameters() {
		return (EReference)tFunctionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTFunctionItem_OutputTypeRef() {
		return (EAttribute)tFunctionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTGroup() {
		return tGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTGroup_Name() {
		return (EAttribute)tGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTImport() {
		return tImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_ImportType() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_LocationURI() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_Namespace() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTImportedValues() {
		return tImportedValuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImportedValues_ImportedElement() {
		return (EAttribute)tImportedValuesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImportedValues_ExpressionLanguage() {
		return (EAttribute)tImportedValuesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInformationItem() {
		return tInformationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTInformationItem_TypeRef() {
		return (EAttribute)tInformationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInformationRequirement() {
		return tInformationRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInformationRequirement_RequiredDecision() {
		return (EReference)tInformationRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInformationRequirement_RequiredInput() {
		return (EReference)tInformationRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInputClause() {
		return tInputClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInputClause_InputExpression() {
		return (EReference)tInputClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInputClause_InputValues() {
		return (EReference)tInputClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInputData() {
		return tInputDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInputData_Variable() {
		return (EReference)tInputDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInvocable() {
		return tInvocableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInvocable_Variable() {
		return (EReference)tInvocableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTInvocation() {
		return tInvocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTInvocation_ExpressionGroup() {
		return (EAttribute)tInvocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInvocation_Expression() {
		return (EReference)tInvocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTInvocation_Binding() {
		return (EReference)tInvocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTItemDefinition() {
		return tItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTItemDefinition_TypeRef() {
		return (EAttribute)tItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTItemDefinition_AllowedValues() {
		return (EReference)tItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTItemDefinition_TypeConstraint() {
		return (EReference)tItemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTItemDefinition_ItemComponent() {
		return (EReference)tItemDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTItemDefinition_FunctionItem() {
		return (EReference)tItemDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTItemDefinition_IsCollection() {
		return (EAttribute)tItemDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTItemDefinition_TypeLanguage() {
		return (EAttribute)tItemDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIterator() {
		return tIteratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIterator_In() {
		return (EReference)tIteratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIterator_IteratorVariable() {
		return (EAttribute)tIteratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTKnowledgeRequirement() {
		return tKnowledgeRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTKnowledgeRequirement_RequiredKnowledge() {
		return (EReference)tKnowledgeRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTKnowledgeSource() {
		return tKnowledgeSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTKnowledgeSource_AuthorityRequirement() {
		return (EReference)tKnowledgeSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTKnowledgeSource_Type() {
		return (EAttribute)tKnowledgeSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTKnowledgeSource_Owner() {
		return (EReference)tKnowledgeSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTKnowledgeSource_LocationURI() {
		return (EAttribute)tKnowledgeSourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTList() {
		return tListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTList_ExpressionGroup() {
		return (EAttribute)tListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTList_Expression() {
		return (EReference)tListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLiteralExpression() {
		return tLiteralExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLiteralExpression_Text() {
		return (EAttribute)tLiteralExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLiteralExpression_ImportedValues() {
		return (EReference)tLiteralExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLiteralExpression_ExpressionLanguage() {
		return (EAttribute)tLiteralExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTNamedElement() {
		return tNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTNamedElement_Name() {
		return (EAttribute)tNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOrganizationUnit() {
		return tOrganizationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOrganizationUnit_DecisionMade() {
		return (EReference)tOrganizationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOrganizationUnit_DecisionOwned() {
		return (EReference)tOrganizationUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOutputClause() {
		return tOutputClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOutputClause_OutputValues() {
		return (EReference)tOutputClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTOutputClause_DefaultOutputEntry() {
		return (EReference)tOutputClauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOutputClause_Name() {
		return (EAttribute)tOutputClauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOutputClause_TypeRef() {
		return (EAttribute)tOutputClauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPerformanceIndicator() {
		return tPerformanceIndicatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPerformanceIndicator_ImpactingDecision() {
		return (EReference)tPerformanceIndicatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTQuantified() {
		return tQuantifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTQuantified_Satisfies() {
		return (EReference)tQuantifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRelation() {
		return tRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRelation_Column() {
		return (EReference)tRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRelation_Row() {
		return (EReference)tRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRuleAnnotation() {
		return tRuleAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRuleAnnotation_Text() {
		return (EAttribute)tRuleAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRuleAnnotationClause() {
		return tRuleAnnotationClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRuleAnnotationClause_Name() {
		return (EAttribute)tRuleAnnotationClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTextAnnotation() {
		return tTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextAnnotation_Text() {
		return (EAttribute)tTextAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextAnnotation_TextFormat() {
		return (EAttribute)tTextAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTypedChildExpression() {
		return tTypedChildExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTypedChildExpression_TypeRef() {
		return (EAttribute)tTypedChildExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTUnaryTests() {
		return tUnaryTestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTUnaryTests_Text() {
		return (EAttribute)tUnaryTestsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTUnaryTests_ExpressionLanguage() {
		return (EAttribute)tUnaryTestsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTAssociationDirection() {
		return tAssociationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTBuiltinAggregator() {
		return tBuiltinAggregatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTDecisionTableOrientation() {
		return tDecisionTableOrientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTFunctionKind() {
		return tFunctionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTHitPolicy() {
		return tHitPolicyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAssociationDirectionObject() {
		return tAssociationDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTBuiltinAggregatorObject() {
		return tBuiltinAggregatorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTDecisionTableOrientationObject() {
		return tDecisionTableOrientationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTFunctionKindObject() {
		return tFunctionKindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTHitPolicyObject() {
		return tHitPolicyObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNFactory getDMNFactory() {
		return (DMNFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dmnRootEClass = createEClass(DMN_ROOT);
		createEAttribute(dmnRootEClass, DMN_ROOT__MIXED);
		createEReference(dmnRootEClass, DMN_ROOT__XMLNS_PREFIX_MAP);
		createEReference(dmnRootEClass, DMN_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(dmnRootEClass, DMN_ROOT__ARTIFACT);
		createEReference(dmnRootEClass, DMN_ROOT__DMN_ELEMENT);
		createEReference(dmnRootEClass, DMN_ROOT__ASSOCIATION);
		createEReference(dmnRootEClass, DMN_ROOT__AUTHORITY_REQUIREMENT);
		createEReference(dmnRootEClass, DMN_ROOT__BUSINESS_CONTEXT_ELEMENT);
		createEReference(dmnRootEClass, DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL);
		createEReference(dmnRootEClass, DMN_ROOT__INVOCABLE);
		createEReference(dmnRootEClass, DMN_ROOT__DRG_ELEMENT);
		createEReference(dmnRootEClass, DMN_ROOT__NAMED_ELEMENT);
		createEReference(dmnRootEClass, DMN_ROOT__CONDITIONAL);
		createEReference(dmnRootEClass, DMN_ROOT__EXPRESSION);
		createEReference(dmnRootEClass, DMN_ROOT__CONTEXT);
		createEReference(dmnRootEClass, DMN_ROOT__CONTEXT_ENTRY);
		createEReference(dmnRootEClass, DMN_ROOT__DECISION);
		createEReference(dmnRootEClass, DMN_ROOT__DECISION_SERVICE);
		createEReference(dmnRootEClass, DMN_ROOT__DECISION_TABLE);
		createEReference(dmnRootEClass, DMN_ROOT__DEFINITIONS);
		createEReference(dmnRootEClass, DMN_ROOT__ELEMENT_COLLECTION);
		createEReference(dmnRootEClass, DMN_ROOT__EVERY);
		createEReference(dmnRootEClass, DMN_ROOT__FILTER);
		createEReference(dmnRootEClass, DMN_ROOT__FOR);
		createEReference(dmnRootEClass, DMN_ROOT__FUNCTION_DEFINITION);
		createEReference(dmnRootEClass, DMN_ROOT__FUNCTION_ITEM);
		createEReference(dmnRootEClass, DMN_ROOT__GROUP);
		createEReference(dmnRootEClass, DMN_ROOT__IMPORT);
		createEReference(dmnRootEClass, DMN_ROOT__INFORMATION_ITEM);
		createEReference(dmnRootEClass, DMN_ROOT__INFORMATION_REQUIREMENT);
		createEReference(dmnRootEClass, DMN_ROOT__INPUT_DATA);
		createEReference(dmnRootEClass, DMN_ROOT__INVOCATION);
		createEReference(dmnRootEClass, DMN_ROOT__ITEM_DEFINITION);
		createEReference(dmnRootEClass, DMN_ROOT__KNOWLEDGE_REQUIREMENT);
		createEReference(dmnRootEClass, DMN_ROOT__KNOWLEDGE_SOURCE);
		createEReference(dmnRootEClass, DMN_ROOT__LIST);
		createEReference(dmnRootEClass, DMN_ROOT__LITERAL_EXPRESSION);
		createEReference(dmnRootEClass, DMN_ROOT__ORGANIZATION_UNIT);
		createEReference(dmnRootEClass, DMN_ROOT__PERFORMANCE_INDICATOR);
		createEReference(dmnRootEClass, DMN_ROOT__RELATION);
		createEReference(dmnRootEClass, DMN_ROOT__SOME);
		createEReference(dmnRootEClass, DMN_ROOT__TEXT_ANNOTATION);

		extensionElementsTypeEClass = createEClass(EXTENSION_ELEMENTS_TYPE);
		createEAttribute(extensionElementsTypeEClass, EXTENSION_ELEMENTS_TYPE__ANY);

		tArtifactEClass = createEClass(TARTIFACT);

		tAssociationEClass = createEClass(TASSOCIATION);
		createEReference(tAssociationEClass, TASSOCIATION__SOURCE_REF);
		createEReference(tAssociationEClass, TASSOCIATION__TARGET_REF);
		createEAttribute(tAssociationEClass, TASSOCIATION__ASSOCIATION_DIRECTION);

		tAuthorityRequirementEClass = createEClass(TAUTHORITY_REQUIREMENT);
		createEReference(tAuthorityRequirementEClass, TAUTHORITY_REQUIREMENT__REQUIRED_DECISION);
		createEReference(tAuthorityRequirementEClass, TAUTHORITY_REQUIREMENT__REQUIRED_INPUT);
		createEReference(tAuthorityRequirementEClass, TAUTHORITY_REQUIREMENT__REQUIRED_AUTHORITY);

		tBindingEClass = createEClass(TBINDING);
		createEReference(tBindingEClass, TBINDING__PARAMETER);
		createEAttribute(tBindingEClass, TBINDING__EXPRESSION_GROUP);
		createEReference(tBindingEClass, TBINDING__EXPRESSION);

		tBusinessContextElementEClass = createEClass(TBUSINESS_CONTEXT_ELEMENT);
		createEAttribute(tBusinessContextElementEClass, TBUSINESS_CONTEXT_ELEMENT__URI);

		tBusinessKnowledgeModelEClass = createEClass(TBUSINESS_KNOWLEDGE_MODEL);
		createEReference(tBusinessKnowledgeModelEClass, TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC);
		createEReference(tBusinessKnowledgeModelEClass, TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT);
		createEReference(tBusinessKnowledgeModelEClass, TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT);

		tChildExpressionEClass = createEClass(TCHILD_EXPRESSION);
		createEAttribute(tChildExpressionEClass, TCHILD_EXPRESSION__EXPRESSION_GROUP);
		createEReference(tChildExpressionEClass, TCHILD_EXPRESSION__EXPRESSION);
		createEAttribute(tChildExpressionEClass, TCHILD_EXPRESSION__ID);

		tConditionalEClass = createEClass(TCONDITIONAL);
		createEReference(tConditionalEClass, TCONDITIONAL__IF);
		createEReference(tConditionalEClass, TCONDITIONAL__THEN);
		createEReference(tConditionalEClass, TCONDITIONAL__ELSE);

		tContextEClass = createEClass(TCONTEXT);
		createEReference(tContextEClass, TCONTEXT__CONTEXT_ENTRY);

		tContextEntryEClass = createEClass(TCONTEXT_ENTRY);
		createEReference(tContextEntryEClass, TCONTEXT_ENTRY__VARIABLE);
		createEAttribute(tContextEntryEClass, TCONTEXT_ENTRY__EXPRESSION_GROUP);
		createEReference(tContextEntryEClass, TCONTEXT_ENTRY__EXPRESSION);

		tDecisionEClass = createEClass(TDECISION);
		createEAttribute(tDecisionEClass, TDECISION__QUESTION);
		createEAttribute(tDecisionEClass, TDECISION__ALLOWED_ANSWERS);
		createEReference(tDecisionEClass, TDECISION__VARIABLE);
		createEReference(tDecisionEClass, TDECISION__INFORMATION_REQUIREMENT);
		createEReference(tDecisionEClass, TDECISION__KNOWLEDGE_REQUIREMENT);
		createEReference(tDecisionEClass, TDECISION__AUTHORITY_REQUIREMENT);
		createEReference(tDecisionEClass, TDECISION__SUPPORTED_OBJECTIVE);
		createEReference(tDecisionEClass, TDECISION__IMPACTED_PERFORMANCE_INDICATOR);
		createEReference(tDecisionEClass, TDECISION__DECISION_MAKER);
		createEReference(tDecisionEClass, TDECISION__DECISION_OWNER);
		createEReference(tDecisionEClass, TDECISION__USING_PROCESS);
		createEReference(tDecisionEClass, TDECISION__USING_TASK);
		createEAttribute(tDecisionEClass, TDECISION__EXPRESSION_GROUP);
		createEReference(tDecisionEClass, TDECISION__EXPRESSION);

		tDecisionRuleEClass = createEClass(TDECISION_RULE);
		createEReference(tDecisionRuleEClass, TDECISION_RULE__INPUT_ENTRY);
		createEReference(tDecisionRuleEClass, TDECISION_RULE__OUTPUT_ENTRY);
		createEReference(tDecisionRuleEClass, TDECISION_RULE__ANNOTATION_ENTRY);

		tDecisionServiceEClass = createEClass(TDECISION_SERVICE);
		createEReference(tDecisionServiceEClass, TDECISION_SERVICE__OUTPUT_DECISION);
		createEReference(tDecisionServiceEClass, TDECISION_SERVICE__ENCAPSULATED_DECISION);
		createEReference(tDecisionServiceEClass, TDECISION_SERVICE__INPUT_DECISION);
		createEReference(tDecisionServiceEClass, TDECISION_SERVICE__INPUT_DATA);

		tDecisionTableEClass = createEClass(TDECISION_TABLE);
		createEReference(tDecisionTableEClass, TDECISION_TABLE__INPUT);
		createEReference(tDecisionTableEClass, TDECISION_TABLE__OUTPUT);
		createEReference(tDecisionTableEClass, TDECISION_TABLE__ANNOTATION);
		createEReference(tDecisionTableEClass, TDECISION_TABLE__RULE);
		createEAttribute(tDecisionTableEClass, TDECISION_TABLE__AGGREGATION);
		createEAttribute(tDecisionTableEClass, TDECISION_TABLE__HIT_POLICY);
		createEAttribute(tDecisionTableEClass, TDECISION_TABLE__OUTPUT_LABEL);
		createEAttribute(tDecisionTableEClass, TDECISION_TABLE__PREFERRED_ORIENTATION);

		tDefinitionsEClass = createEClass(TDEFINITIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__IMPORT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ITEM_DEFINITION);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__DRG_ELEMENT_GROUP);
		createEReference(tDefinitionsEClass, TDEFINITIONS__DRG_ELEMENT);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__ARTIFACT_GROUP);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ARTIFACT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ELEMENT_COLLECTION);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP);
		createEReference(tDefinitionsEClass, TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__DMNDI);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPORTER);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPORTER_VERSION);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPRESSION_LANGUAGE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__NAMESPACE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__TYPE_LANGUAGE);

		tdmnElementEClass = createEClass(TDMN_ELEMENT);
		createEAttribute(tdmnElementEClass, TDMN_ELEMENT__DESCRIPTION);
		createEReference(tdmnElementEClass, TDMN_ELEMENT__EXTENSION_ELEMENTS);
		createEAttribute(tdmnElementEClass, TDMN_ELEMENT__ID);
		createEAttribute(tdmnElementEClass, TDMN_ELEMENT__LABEL);
		createEAttribute(tdmnElementEClass, TDMN_ELEMENT__ANY_ATTRIBUTE);

		tdmnElementReferenceEClass = createEClass(TDMN_ELEMENT_REFERENCE);
		createEAttribute(tdmnElementReferenceEClass, TDMN_ELEMENT_REFERENCE__HREF);

		tdrgElementEClass = createEClass(TDRG_ELEMENT);

		tElementCollectionEClass = createEClass(TELEMENT_COLLECTION);
		createEReference(tElementCollectionEClass, TELEMENT_COLLECTION__DRG_ELEMENT);

		tExpressionEClass = createEClass(TEXPRESSION);
		createEAttribute(tExpressionEClass, TEXPRESSION__TYPE_REF);

		tFilterEClass = createEClass(TFILTER);
		createEReference(tFilterEClass, TFILTER__IN);
		createEReference(tFilterEClass, TFILTER__MATCH);

		tForEClass = createEClass(TFOR);
		createEReference(tForEClass, TFOR__RETURN);

		tFunctionDefinitionEClass = createEClass(TFUNCTION_DEFINITION);
		createEReference(tFunctionDefinitionEClass, TFUNCTION_DEFINITION__FORMAL_PARAMETER);
		createEAttribute(tFunctionDefinitionEClass, TFUNCTION_DEFINITION__EXPRESSION_GROUP);
		createEReference(tFunctionDefinitionEClass, TFUNCTION_DEFINITION__EXPRESSION);
		createEAttribute(tFunctionDefinitionEClass, TFUNCTION_DEFINITION__KIND);

		tFunctionItemEClass = createEClass(TFUNCTION_ITEM);
		createEReference(tFunctionItemEClass, TFUNCTION_ITEM__PARAMETERS);
		createEAttribute(tFunctionItemEClass, TFUNCTION_ITEM__OUTPUT_TYPE_REF);

		tGroupEClass = createEClass(TGROUP);
		createEAttribute(tGroupEClass, TGROUP__NAME);

		tImportEClass = createEClass(TIMPORT);
		createEAttribute(tImportEClass, TIMPORT__IMPORT_TYPE);
		createEAttribute(tImportEClass, TIMPORT__LOCATION_URI);
		createEAttribute(tImportEClass, TIMPORT__NAMESPACE);

		tImportedValuesEClass = createEClass(TIMPORTED_VALUES);
		createEAttribute(tImportedValuesEClass, TIMPORTED_VALUES__IMPORTED_ELEMENT);
		createEAttribute(tImportedValuesEClass, TIMPORTED_VALUES__EXPRESSION_LANGUAGE);

		tInformationItemEClass = createEClass(TINFORMATION_ITEM);
		createEAttribute(tInformationItemEClass, TINFORMATION_ITEM__TYPE_REF);

		tInformationRequirementEClass = createEClass(TINFORMATION_REQUIREMENT);
		createEReference(tInformationRequirementEClass, TINFORMATION_REQUIREMENT__REQUIRED_DECISION);
		createEReference(tInformationRequirementEClass, TINFORMATION_REQUIREMENT__REQUIRED_INPUT);

		tInputClauseEClass = createEClass(TINPUT_CLAUSE);
		createEReference(tInputClauseEClass, TINPUT_CLAUSE__INPUT_EXPRESSION);
		createEReference(tInputClauseEClass, TINPUT_CLAUSE__INPUT_VALUES);

		tInputDataEClass = createEClass(TINPUT_DATA);
		createEReference(tInputDataEClass, TINPUT_DATA__VARIABLE);

		tInvocableEClass = createEClass(TINVOCABLE);
		createEReference(tInvocableEClass, TINVOCABLE__VARIABLE);

		tInvocationEClass = createEClass(TINVOCATION);
		createEAttribute(tInvocationEClass, TINVOCATION__EXPRESSION_GROUP);
		createEReference(tInvocationEClass, TINVOCATION__EXPRESSION);
		createEReference(tInvocationEClass, TINVOCATION__BINDING);

		tItemDefinitionEClass = createEClass(TITEM_DEFINITION);
		createEAttribute(tItemDefinitionEClass, TITEM_DEFINITION__TYPE_REF);
		createEReference(tItemDefinitionEClass, TITEM_DEFINITION__ALLOWED_VALUES);
		createEReference(tItemDefinitionEClass, TITEM_DEFINITION__TYPE_CONSTRAINT);
		createEReference(tItemDefinitionEClass, TITEM_DEFINITION__ITEM_COMPONENT);
		createEReference(tItemDefinitionEClass, TITEM_DEFINITION__FUNCTION_ITEM);
		createEAttribute(tItemDefinitionEClass, TITEM_DEFINITION__IS_COLLECTION);
		createEAttribute(tItemDefinitionEClass, TITEM_DEFINITION__TYPE_LANGUAGE);

		tIteratorEClass = createEClass(TITERATOR);
		createEReference(tIteratorEClass, TITERATOR__IN);
		createEAttribute(tIteratorEClass, TITERATOR__ITERATOR_VARIABLE);

		tKnowledgeRequirementEClass = createEClass(TKNOWLEDGE_REQUIREMENT);
		createEReference(tKnowledgeRequirementEClass, TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE);

		tKnowledgeSourceEClass = createEClass(TKNOWLEDGE_SOURCE);
		createEReference(tKnowledgeSourceEClass, TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT);
		createEAttribute(tKnowledgeSourceEClass, TKNOWLEDGE_SOURCE__TYPE);
		createEReference(tKnowledgeSourceEClass, TKNOWLEDGE_SOURCE__OWNER);
		createEAttribute(tKnowledgeSourceEClass, TKNOWLEDGE_SOURCE__LOCATION_URI);

		tListEClass = createEClass(TLIST);
		createEAttribute(tListEClass, TLIST__EXPRESSION_GROUP);
		createEReference(tListEClass, TLIST__EXPRESSION);

		tLiteralExpressionEClass = createEClass(TLITERAL_EXPRESSION);
		createEAttribute(tLiteralExpressionEClass, TLITERAL_EXPRESSION__TEXT);
		createEReference(tLiteralExpressionEClass, TLITERAL_EXPRESSION__IMPORTED_VALUES);
		createEAttribute(tLiteralExpressionEClass, TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE);

		tNamedElementEClass = createEClass(TNAMED_ELEMENT);
		createEAttribute(tNamedElementEClass, TNAMED_ELEMENT__NAME);

		tOrganizationUnitEClass = createEClass(TORGANIZATION_UNIT);
		createEReference(tOrganizationUnitEClass, TORGANIZATION_UNIT__DECISION_MADE);
		createEReference(tOrganizationUnitEClass, TORGANIZATION_UNIT__DECISION_OWNED);

		tOutputClauseEClass = createEClass(TOUTPUT_CLAUSE);
		createEReference(tOutputClauseEClass, TOUTPUT_CLAUSE__OUTPUT_VALUES);
		createEReference(tOutputClauseEClass, TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY);
		createEAttribute(tOutputClauseEClass, TOUTPUT_CLAUSE__NAME);
		createEAttribute(tOutputClauseEClass, TOUTPUT_CLAUSE__TYPE_REF);

		tPerformanceIndicatorEClass = createEClass(TPERFORMANCE_INDICATOR);
		createEReference(tPerformanceIndicatorEClass, TPERFORMANCE_INDICATOR__IMPACTING_DECISION);

		tQuantifiedEClass = createEClass(TQUANTIFIED);
		createEReference(tQuantifiedEClass, TQUANTIFIED__SATISFIES);

		tRelationEClass = createEClass(TRELATION);
		createEReference(tRelationEClass, TRELATION__COLUMN);
		createEReference(tRelationEClass, TRELATION__ROW);

		tRuleAnnotationEClass = createEClass(TRULE_ANNOTATION);
		createEAttribute(tRuleAnnotationEClass, TRULE_ANNOTATION__TEXT);

		tRuleAnnotationClauseEClass = createEClass(TRULE_ANNOTATION_CLAUSE);
		createEAttribute(tRuleAnnotationClauseEClass, TRULE_ANNOTATION_CLAUSE__NAME);

		tTextAnnotationEClass = createEClass(TTEXT_ANNOTATION);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT_FORMAT);

		tTypedChildExpressionEClass = createEClass(TTYPED_CHILD_EXPRESSION);
		createEAttribute(tTypedChildExpressionEClass, TTYPED_CHILD_EXPRESSION__TYPE_REF);

		tUnaryTestsEClass = createEClass(TUNARY_TESTS);
		createEAttribute(tUnaryTestsEClass, TUNARY_TESTS__TEXT);
		createEAttribute(tUnaryTestsEClass, TUNARY_TESTS__EXPRESSION_LANGUAGE);

		// Create enums
		tAssociationDirectionEEnum = createEEnum(TASSOCIATION_DIRECTION);
		tBuiltinAggregatorEEnum = createEEnum(TBUILTIN_AGGREGATOR);
		tDecisionTableOrientationEEnum = createEEnum(TDECISION_TABLE_ORIENTATION);
		tFunctionKindEEnum = createEEnum(TFUNCTION_KIND);
		tHitPolicyEEnum = createEEnum(THIT_POLICY);

		// Create data types
		tAssociationDirectionObjectEDataType = createEDataType(TASSOCIATION_DIRECTION_OBJECT);
		tBuiltinAggregatorObjectEDataType = createEDataType(TBUILTIN_AGGREGATOR_OBJECT);
		tDecisionTableOrientationObjectEDataType = createEDataType(TDECISION_TABLE_ORIENTATION_OBJECT);
		tFunctionKindObjectEDataType = createEDataType(TFUNCTION_KIND_OBJECT);
		tHitPolicyObjectEDataType = createEDataType(THIT_POLICY_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		DMNDIPackage theDMNDIPackage = (DMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(DMNDIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tArtifactEClass.getESuperTypes().add(this.getTDMNElement());
		tAssociationEClass.getESuperTypes().add(this.getTArtifact());
		tAuthorityRequirementEClass.getESuperTypes().add(this.getTDMNElement());
		tBusinessContextElementEClass.getESuperTypes().add(this.getTNamedElement());
		tBusinessKnowledgeModelEClass.getESuperTypes().add(this.getTInvocable());
		tConditionalEClass.getESuperTypes().add(this.getTExpression());
		tContextEClass.getESuperTypes().add(this.getTExpression());
		tContextEntryEClass.getESuperTypes().add(this.getTDMNElement());
		tDecisionEClass.getESuperTypes().add(this.getTDRGElement());
		tDecisionRuleEClass.getESuperTypes().add(this.getTDMNElement());
		tDecisionServiceEClass.getESuperTypes().add(this.getTInvocable());
		tDecisionTableEClass.getESuperTypes().add(this.getTExpression());
		tDefinitionsEClass.getESuperTypes().add(this.getTNamedElement());
		tdrgElementEClass.getESuperTypes().add(this.getTNamedElement());
		tElementCollectionEClass.getESuperTypes().add(this.getTNamedElement());
		tExpressionEClass.getESuperTypes().add(this.getTDMNElement());
		tFilterEClass.getESuperTypes().add(this.getTExpression());
		tForEClass.getESuperTypes().add(this.getTIterator());
		tFunctionDefinitionEClass.getESuperTypes().add(this.getTExpression());
		tFunctionItemEClass.getESuperTypes().add(this.getTDMNElement());
		tGroupEClass.getESuperTypes().add(this.getTArtifact());
		tImportEClass.getESuperTypes().add(this.getTNamedElement());
		tImportedValuesEClass.getESuperTypes().add(this.getTImport());
		tInformationItemEClass.getESuperTypes().add(this.getTNamedElement());
		tInformationRequirementEClass.getESuperTypes().add(this.getTDMNElement());
		tInputClauseEClass.getESuperTypes().add(this.getTDMNElement());
		tInputDataEClass.getESuperTypes().add(this.getTDRGElement());
		tInvocableEClass.getESuperTypes().add(this.getTDRGElement());
		tInvocationEClass.getESuperTypes().add(this.getTExpression());
		tItemDefinitionEClass.getESuperTypes().add(this.getTNamedElement());
		tIteratorEClass.getESuperTypes().add(this.getTExpression());
		tKnowledgeRequirementEClass.getESuperTypes().add(this.getTDMNElement());
		tKnowledgeSourceEClass.getESuperTypes().add(this.getTDRGElement());
		tListEClass.getESuperTypes().add(this.getTExpression());
		tLiteralExpressionEClass.getESuperTypes().add(this.getTExpression());
		tNamedElementEClass.getESuperTypes().add(this.getTDMNElement());
		tOrganizationUnitEClass.getESuperTypes().add(this.getTBusinessContextElement());
		tOutputClauseEClass.getESuperTypes().add(this.getTDMNElement());
		tPerformanceIndicatorEClass.getESuperTypes().add(this.getTBusinessContextElement());
		tQuantifiedEClass.getESuperTypes().add(this.getTIterator());
		tRelationEClass.getESuperTypes().add(this.getTExpression());
		tTextAnnotationEClass.getESuperTypes().add(this.getTArtifact());
		tTypedChildExpressionEClass.getESuperTypes().add(this.getTChildExpression());
		tUnaryTestsEClass.getESuperTypes().add(this.getTExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(dmnRootEClass, DMNRoot.class, "DMNRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDMNRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Artifact(), this.getTArtifact(), null, "artifact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_DMNElement(), this.getTDMNElement(), null, "dMNElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Association(), this.getTAssociation(), null, "association", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_AuthorityRequirement(), this.getTAuthorityRequirement(), null, "authorityRequirement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_BusinessContextElement(), this.getTBusinessContextElement(), null, "businessContextElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_BusinessKnowledgeModel(), this.getTBusinessKnowledgeModel(), null, "businessKnowledgeModel", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Invocable(), this.getTInvocable(), null, "invocable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_DrgElement(), this.getTDRGElement(), null, "drgElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_NamedElement(), this.getTNamedElement(), null, "namedElement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Conditional(), this.getTConditional(), null, "conditional", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Expression(), this.getTExpression(), null, "expression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Context(), this.getTContext(), null, "context", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_ContextEntry(), this.getTContextEntry(), null, "contextEntry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Decision(), this.getTDecision(), null, "decision", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_DecisionService(), this.getTDecisionService(), null, "decisionService", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_DecisionTable(), this.getTDecisionTable(), null, "decisionTable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Definitions(), this.getTDefinitions(), null, "definitions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_ElementCollection(), this.getTElementCollection(), null, "elementCollection", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Every(), this.getTQuantified(), null, "every", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Filter(), this.getTFilter(), null, "filter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_For(), this.getTFor(), null, "for", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_FunctionDefinition(), this.getTFunctionDefinition(), null, "functionDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_FunctionItem(), this.getTFunctionItem(), null, "functionItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Group(), this.getTGroup(), null, "group", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Import(), this.getTImport(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_InformationItem(), this.getTInformationItem(), null, "informationItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_InformationRequirement(), this.getTInformationRequirement(), null, "informationRequirement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_InputData(), this.getTInputData(), null, "inputData", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Invocation(), this.getTInvocation(), null, "invocation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_ItemDefinition(), this.getTItemDefinition(), null, "itemDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_KnowledgeRequirement(), this.getTKnowledgeRequirement(), null, "knowledgeRequirement", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_KnowledgeSource(), this.getTKnowledgeSource(), null, "knowledgeSource", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_List(), this.getTList(), null, "list", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_LiteralExpression(), this.getTLiteralExpression(), null, "literalExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_OrganizationUnit(), this.getTOrganizationUnit(), null, "organizationUnit", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_PerformanceIndicator(), this.getTPerformanceIndicator(), null, "performanceIndicator", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Relation(), this.getTRelation(), null, "relation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_Some(), this.getTQuantified(), null, "some", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDMNRoot_TextAnnotation(), this.getTTextAnnotation(), null, "textAnnotation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionElementsTypeEClass, ExtensionElementsType.class, "ExtensionElementsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionElementsType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExtensionElementsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tArtifactEClass, TArtifact.class, "TArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAssociationEClass, TAssociation.class, "TAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAssociation_SourceRef(), this.getTDMNElementReference(), null, "sourceRef", null, 1, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAssociation_TargetRef(), this.getTDMNElementReference(), null, "targetRef", null, 1, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTAssociation_AssociationDirection(), this.getTAssociationDirection(), "associationDirection", "None", 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tAuthorityRequirementEClass, TAuthorityRequirement.class, "TAuthorityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTAuthorityRequirement_RequiredDecision(), this.getTDMNElementReference(), null, "requiredDecision", null, 0, 1, TAuthorityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAuthorityRequirement_RequiredInput(), this.getTDMNElementReference(), null, "requiredInput", null, 0, 1, TAuthorityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTAuthorityRequirement_RequiredAuthority(), this.getTDMNElementReference(), null, "requiredAuthority", null, 0, 1, TAuthorityRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBindingEClass, TBinding.class, "TBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBinding_Parameter(), this.getTInformationItem(), null, "parameter", null, 1, 1, TBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTBinding_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, 1, TBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBinding_Expression(), this.getTExpression(), null, "expression", null, 0, 1, TBinding.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tBusinessContextElementEClass, TBusinessContextElement.class, "TBusinessContextElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTBusinessContextElement_URI(), theXMLTypePackage.getAnyURI(), "uRI", null, 0, 1, TBusinessContextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tBusinessKnowledgeModelEClass, TBusinessKnowledgeModel.class, "TBusinessKnowledgeModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTBusinessKnowledgeModel_EncapsulatedLogic(), this.getTFunctionDefinition(), null, "encapsulatedLogic", null, 0, 1, TBusinessKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBusinessKnowledgeModel_KnowledgeRequirement(), this.getTKnowledgeRequirement(), null, "knowledgeRequirement", null, 0, -1, TBusinessKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTBusinessKnowledgeModel_AuthorityRequirement(), this.getTAuthorityRequirement(), null, "authorityRequirement", null, 0, -1, TBusinessKnowledgeModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tChildExpressionEClass, TChildExpression.class, "TChildExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTChildExpression_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 1, 1, TChildExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTChildExpression_Expression(), this.getTExpression(), null, "expression", null, 1, 1, TChildExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTChildExpression_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TChildExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tConditionalEClass, TConditional.class, "TConditional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTConditional_If(), this.getTChildExpression(), null, "if", null, 1, 1, TConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTConditional_Then(), this.getTChildExpression(), null, "then", null, 1, 1, TConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTConditional_Else(), this.getTChildExpression(), null, "else", null, 1, 1, TConditional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tContextEClass, TContext.class, "TContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTContext_ContextEntry(), this.getTContextEntry(), null, "contextEntry", null, 0, -1, TContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tContextEntryEClass, TContextEntry.class, "TContextEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTContextEntry_Variable(), this.getTInformationItem(), null, "variable", null, 0, 1, TContextEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTContextEntry_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 1, 1, TContextEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTContextEntry_Expression(), this.getTExpression(), null, "expression", null, 1, 1, TContextEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionEClass, TDecision.class, "TDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDecision_Question(), theXMLTypePackage.getString(), "question", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecision_AllowedAnswers(), theXMLTypePackage.getString(), "allowedAnswers", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_Variable(), this.getTInformationItem(), null, "variable", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_InformationRequirement(), this.getTInformationRequirement(), null, "informationRequirement", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_KnowledgeRequirement(), this.getTKnowledgeRequirement(), null, "knowledgeRequirement", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_AuthorityRequirement(), this.getTAuthorityRequirement(), null, "authorityRequirement", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_SupportedObjective(), this.getTDMNElementReference(), null, "supportedObjective", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_ImpactedPerformanceIndicator(), this.getTDMNElementReference(), null, "impactedPerformanceIndicator", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_DecisionMaker(), this.getTDMNElementReference(), null, "decisionMaker", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_DecisionOwner(), this.getTDMNElementReference(), null, "decisionOwner", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_UsingProcess(), this.getTDMNElementReference(), null, "usingProcess", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_UsingTask(), this.getTDMNElementReference(), null, "usingTask", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecision_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_Expression(), this.getTExpression(), null, "expression", null, 0, 1, TDecision.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionRuleEClass, TDecisionRule.class, "TDecisionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDecisionRule_InputEntry(), this.getTUnaryTests(), null, "inputEntry", null, 0, -1, TDecisionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionRule_OutputEntry(), this.getTLiteralExpression(), null, "outputEntry", null, 1, -1, TDecisionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionRule_AnnotationEntry(), this.getTRuleAnnotation(), null, "annotationEntry", null, 0, -1, TDecisionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionServiceEClass, TDecisionService.class, "TDecisionService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDecisionService_OutputDecision(), this.getTDMNElementReference(), null, "outputDecision", null, 0, -1, TDecisionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionService_EncapsulatedDecision(), this.getTDMNElementReference(), null, "encapsulatedDecision", null, 0, -1, TDecisionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionService_InputDecision(), this.getTDMNElementReference(), null, "inputDecision", null, 0, -1, TDecisionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionService_InputData(), this.getTDMNElementReference(), null, "inputData", null, 0, -1, TDecisionService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionTableEClass, TDecisionTable.class, "TDecisionTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDecisionTable_Input(), this.getTInputClause(), null, "input", null, 0, -1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionTable_Output(), this.getTOutputClause(), null, "output", null, 1, -1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionTable_Annotation(), this.getTRuleAnnotationClause(), null, "annotation", null, 0, -1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionTable_Rule(), this.getTDecisionRule(), null, "rule", null, 0, -1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecisionTable_Aggregation(), this.getTBuiltinAggregator(), "aggregation", null, 0, 1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecisionTable_HitPolicy(), this.getTHitPolicy(), "hitPolicy", "UNIQUE", 0, 1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecisionTable_OutputLabel(), theXMLTypePackage.getString(), "outputLabel", null, 0, 1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecisionTable_PreferredOrientation(), this.getTDecisionTableOrientation(), "preferredOrientation", "Rule-as-Row", 0, 1, TDecisionTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDefinitionsEClass, TDefinitions.class, "TDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDefinitions_Import(), this.getTImport(), null, "import", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ItemDefinition(), this.getTItemDefinition(), null, "itemDefinition", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_DrgElementGroup(), ecorePackage.getEFeatureMapEntry(), "drgElementGroup", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_DrgElement(), this.getTDRGElement(), null, "drgElement", null, 0, -1, TDefinitions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ArtifactGroup(), ecorePackage.getEFeatureMapEntry(), "artifactGroup", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Artifact(), this.getTArtifact(), null, "artifact", null, 0, -1, TDefinitions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ElementCollection(), this.getTElementCollection(), null, "elementCollection", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_BusinessContextElementGroup(), ecorePackage.getEFeatureMapEntry(), "businessContextElementGroup", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_BusinessContextElement(), this.getTBusinessContextElement(), null, "businessContextElement", null, 0, -1, TDefinitions.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_DMNDI(), theDMNDIPackage.getDMNDI(), null, "dMNDI", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Exporter(), theXMLTypePackage.getString(), "exporter", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ExporterVersion(), theXMLTypePackage.getString(), "exporterVersion", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", "https://www.omg.org/spec/DMN/20240513/FEEL/", 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_TypeLanguage(), theXMLTypePackage.getAnyURI(), "typeLanguage", "https://www.omg.org/spec/DMN/20240513/FEEL/", 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdmnElementEClass, TDMNElement.class, "TDMNElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDMNElement_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, TDMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDMNElement_ExtensionElements(), this.getExtensionElementsType(), null, "extensionElements", null, 0, 1, TDMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDMNElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TDMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDMNElement_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, TDMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDMNElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TDMNElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdmnElementReferenceEClass, TDMNElementReference.class, "TDMNElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDMNElementReference_Href(), theXMLTypePackage.getAnyURI(), "href", null, 1, 1, TDMNElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tdrgElementEClass, TDRGElement.class, "TDRGElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tElementCollectionEClass, TElementCollection.class, "TElementCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTElementCollection_DrgElement(), this.getTDMNElementReference(), null, "drgElement", null, 0, -1, TElementCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExpressionEClass, TExpression.class, "TExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTExpression_TypeRef(), theXMLTypePackage.getString(), "typeRef", null, 0, 1, TExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFilterEClass, TFilter.class, "TFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFilter_In(), this.getTChildExpression(), null, "in", null, 1, 1, TFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFilter_Match(), this.getTChildExpression(), null, "match", null, 1, 1, TFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tForEClass, TFor.class, "TFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFor_Return(), this.getTChildExpression(), null, "return", null, 1, 1, TFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFunctionDefinitionEClass, TFunctionDefinition.class, "TFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFunctionDefinition_FormalParameter(), this.getTInformationItem(), null, "formalParameter", null, 0, -1, TFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTFunctionDefinition_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, 1, TFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTFunctionDefinition_Expression(), this.getTExpression(), null, "expression", null, 0, 1, TFunctionDefinition.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTFunctionDefinition_Kind(), this.getTFunctionKind(), "kind", "FEEL", 0, 1, TFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tFunctionItemEClass, TFunctionItem.class, "TFunctionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTFunctionItem_Parameters(), this.getTInformationItem(), null, "parameters", null, 0, -1, TFunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTFunctionItem_OutputTypeRef(), theXMLTypePackage.getString(), "outputTypeRef", null, 0, 1, TFunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tGroupEClass, TGroup.class, "TGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTGroup_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImportEClass, TImport.class, "TImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTImport_ImportType(), theXMLTypePackage.getAnyURI(), "importType", null, 1, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_LocationURI(), theXMLTypePackage.getAnyURI(), "locationURI", null, 0, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 1, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImportedValuesEClass, TImportedValues.class, "TImportedValues", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTImportedValues_ImportedElement(), theXMLTypePackage.getString(), "importedElement", null, 1, 1, TImportedValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImportedValues_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", null, 0, 1, TImportedValues.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInformationItemEClass, TInformationItem.class, "TInformationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTInformationItem_TypeRef(), theXMLTypePackage.getString(), "typeRef", null, 0, 1, TInformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInformationRequirementEClass, TInformationRequirement.class, "TInformationRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInformationRequirement_RequiredDecision(), this.getTDMNElementReference(), null, "requiredDecision", null, 0, 1, TInformationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTInformationRequirement_RequiredInput(), this.getTDMNElementReference(), null, "requiredInput", null, 0, 1, TInformationRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInputClauseEClass, TInputClause.class, "TInputClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInputClause_InputExpression(), this.getTLiteralExpression(), null, "inputExpression", null, 1, 1, TInputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTInputClause_InputValues(), this.getTUnaryTests(), null, "inputValues", null, 0, 1, TInputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInputDataEClass, TInputData.class, "TInputData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInputData_Variable(), this.getTInformationItem(), null, "variable", null, 0, 1, TInputData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInvocableEClass, TInvocable.class, "TInvocable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTInvocable_Variable(), this.getTInformationItem(), null, "variable", null, 0, 1, TInvocable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tInvocationEClass, TInvocation.class, "TInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTInvocation_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, 1, TInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTInvocation_Expression(), this.getTExpression(), null, "expression", null, 0, 1, TInvocation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTInvocation_Binding(), this.getTBinding(), null, "binding", null, 0, -1, TInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tItemDefinitionEClass, TItemDefinition.class, "TItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTItemDefinition_TypeRef(), theXMLTypePackage.getString(), "typeRef", null, 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTItemDefinition_AllowedValues(), this.getTUnaryTests(), null, "allowedValues", null, 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTItemDefinition_TypeConstraint(), this.getTUnaryTests(), null, "typeConstraint", null, 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTItemDefinition_ItemComponent(), this.getTItemDefinition(), null, "itemComponent", null, 0, -1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTItemDefinition_FunctionItem(), this.getTFunctionItem(), null, "functionItem", null, 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTItemDefinition_IsCollection(), theXMLTypePackage.getBoolean(), "isCollection", "false", 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTItemDefinition_TypeLanguage(), theXMLTypePackage.getAnyURI(), "typeLanguage", null, 0, 1, TItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tIteratorEClass, TIterator.class, "TIterator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTIterator_In(), this.getTTypedChildExpression(), null, "in", null, 1, 1, TIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTIterator_IteratorVariable(), theXMLTypePackage.getString(), "iteratorVariable", null, 0, 1, TIterator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tKnowledgeRequirementEClass, TKnowledgeRequirement.class, "TKnowledgeRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTKnowledgeRequirement_RequiredKnowledge(), this.getTDMNElementReference(), null, "requiredKnowledge", null, 1, 1, TKnowledgeRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tKnowledgeSourceEClass, TKnowledgeSource.class, "TKnowledgeSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTKnowledgeSource_AuthorityRequirement(), this.getTAuthorityRequirement(), null, "authorityRequirement", null, 0, -1, TKnowledgeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTKnowledgeSource_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, TKnowledgeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTKnowledgeSource_Owner(), this.getTDMNElementReference(), null, "owner", null, 0, 1, TKnowledgeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTKnowledgeSource_LocationURI(), theXMLTypePackage.getAnyURI(), "locationURI", null, 0, 1, TKnowledgeSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tListEClass, TList.class, "TList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTList_ExpressionGroup(), ecorePackage.getEFeatureMapEntry(), "expressionGroup", null, 0, -1, TList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTList_Expression(), this.getTExpression(), null, "expression", null, 0, -1, TList.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tLiteralExpressionEClass, TLiteralExpression.class, "TLiteralExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLiteralExpression_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLiteralExpression_ImportedValues(), this.getTImportedValues(), null, "importedValues", null, 0, 1, TLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLiteralExpression_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", null, 0, 1, TLiteralExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tNamedElementEClass, TNamedElement.class, "TNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTNamedElement_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, TNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tOrganizationUnitEClass, TOrganizationUnit.class, "TOrganizationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOrganizationUnit_DecisionMade(), this.getTDMNElementReference(), null, "decisionMade", null, 0, -1, TOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOrganizationUnit_DecisionOwned(), this.getTDMNElementReference(), null, "decisionOwned", null, 0, -1, TOrganizationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tOutputClauseEClass, TOutputClause.class, "TOutputClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOutputClause_OutputValues(), this.getTUnaryTests(), null, "outputValues", null, 0, 1, TOutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTOutputClause_DefaultOutputEntry(), this.getTLiteralExpression(), null, "defaultOutputEntry", null, 0, 1, TOutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTOutputClause_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TOutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTOutputClause_TypeRef(), theXMLTypePackage.getString(), "typeRef", null, 0, 1, TOutputClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPerformanceIndicatorEClass, TPerformanceIndicator.class, "TPerformanceIndicator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPerformanceIndicator_ImpactingDecision(), this.getTDMNElementReference(), null, "impactingDecision", null, 0, -1, TPerformanceIndicator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tQuantifiedEClass, TQuantified.class, "TQuantified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTQuantified_Satisfies(), this.getTChildExpression(), null, "satisfies", null, 1, 1, TQuantified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRelationEClass, TRelation.class, "TRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRelation_Column(), this.getTInformationItem(), null, "column", null, 0, -1, TRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTRelation_Row(), this.getTList(), null, "row", null, 0, -1, TRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRuleAnnotationEClass, TRuleAnnotation.class, "TRuleAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRuleAnnotation_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TRuleAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRuleAnnotationClauseEClass, TRuleAnnotationClause.class, "TRuleAnnotationClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRuleAnnotationClause_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRuleAnnotationClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTextAnnotationEClass, TTextAnnotation.class, "TTextAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTextAnnotation_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTextAnnotation_TextFormat(), theXMLTypePackage.getString(), "textFormat", "text/plain", 0, 1, TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTypedChildExpressionEClass, TTypedChildExpression.class, "TTypedChildExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTypedChildExpression_TypeRef(), theXMLTypePackage.getString(), "typeRef", null, 0, 1, TTypedChildExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tUnaryTestsEClass, TUnaryTests.class, "TUnaryTests", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTUnaryTests_Text(), theXMLTypePackage.getString(), "text", null, 1, 1, TUnaryTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTUnaryTests_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", null, 0, 1, TUnaryTests.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tAssociationDirectionEEnum, TAssociationDirection.class, "TAssociationDirection");
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.NONE);
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.ONE);
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.BOTH);

		initEEnum(tBuiltinAggregatorEEnum, TBuiltinAggregator.class, "TBuiltinAggregator");
		addEEnumLiteral(tBuiltinAggregatorEEnum, TBuiltinAggregator.SUM);
		addEEnumLiteral(tBuiltinAggregatorEEnum, TBuiltinAggregator.COUNT);
		addEEnumLiteral(tBuiltinAggregatorEEnum, TBuiltinAggregator.MIN);
		addEEnumLiteral(tBuiltinAggregatorEEnum, TBuiltinAggregator.MAX);

		initEEnum(tDecisionTableOrientationEEnum, TDecisionTableOrientation.class, "TDecisionTableOrientation");
		addEEnumLiteral(tDecisionTableOrientationEEnum, TDecisionTableOrientation.RULE_AS_ROW);
		addEEnumLiteral(tDecisionTableOrientationEEnum, TDecisionTableOrientation.RULE_AS_COLUMN);
		addEEnumLiteral(tDecisionTableOrientationEEnum, TDecisionTableOrientation.CROSS_TABLE);

		initEEnum(tFunctionKindEEnum, TFunctionKind.class, "TFunctionKind");
		addEEnumLiteral(tFunctionKindEEnum, TFunctionKind.FEEL);
		addEEnumLiteral(tFunctionKindEEnum, TFunctionKind.JAVA);
		addEEnumLiteral(tFunctionKindEEnum, TFunctionKind.ONNX);
		addEEnumLiteral(tFunctionKindEEnum, TFunctionKind.PMML);

		initEEnum(tHitPolicyEEnum, THitPolicy.class, "THitPolicy");
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.UNIQUE);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.FIRST);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.PRIORITY);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.ANY);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.COLLECT);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.RULEORDER);
		addEEnumLiteral(tHitPolicyEEnum, THitPolicy.OUTPUTORDER);

		// Initialize data types
		initEDataType(tAssociationDirectionObjectEDataType, TAssociationDirection.class, "TAssociationDirectionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tBuiltinAggregatorObjectEDataType, TBuiltinAggregator.class, "TBuiltinAggregatorObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tDecisionTableOrientationObjectEDataType, TDecisionTableOrientation.class, "TDecisionTableOrientationObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tFunctionKindObjectEDataType, TFunctionKind.class, "TFunctionKindObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tHitPolicyObjectEDataType, THitPolicy.class, "THitPolicyObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (dmnRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDMNRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDMNRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDMNRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDMNRoot_Artifact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artifact",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_DMNElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNRoot_Association(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "association",
			   "namespace", "##targetNamespace",
			   "affiliation", "artifact"
		   });
		addAnnotation
		  (getDMNRoot_AuthorityRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorityRequirement",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_BusinessContextElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "businessContextElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNRoot_BusinessKnowledgeModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "businessKnowledgeModel",
			   "namespace", "##targetNamespace",
			   "affiliation", "invocable"
		   });
		addAnnotation
		  (getDMNRoot_Invocable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "invocable",
			   "namespace", "##targetNamespace",
			   "affiliation", "drgElement"
		   });
		addAnnotation
		  (getDMNRoot_DrgElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "drgElement",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_NamedElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "namedElement",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_Conditional(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "conditional",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDMNRoot_Context(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "context",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_ContextEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contextEntry",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_Decision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decision",
			   "namespace", "##targetNamespace",
			   "affiliation", "drgElement"
		   });
		addAnnotation
		  (getDMNRoot_DecisionService(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionService",
			   "namespace", "##targetNamespace",
			   "affiliation", "invocable"
		   });
		addAnnotation
		  (getDMNRoot_DecisionTable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionTable",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_Definitions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "definitions",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_ElementCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elementCollection",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_Every(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "every",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_Filter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "filter",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_For(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "for",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_FunctionDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionDefinition",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_FunctionItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionItem",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_Group(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "group",
			   "namespace", "##targetNamespace",
			   "affiliation", "artifact"
		   });
		addAnnotation
		  (getDMNRoot_Import(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "import",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_InformationItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "informationItem",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_InformationRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "informationRequirement",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_InputData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputData",
			   "namespace", "##targetNamespace",
			   "affiliation", "drgElement"
		   });
		addAnnotation
		  (getDMNRoot_Invocation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "invocation",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_ItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemDefinition",
			   "namespace", "##targetNamespace",
			   "affiliation", "namedElement"
		   });
		addAnnotation
		  (getDMNRoot_KnowledgeRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "knowledgeRequirement",
			   "namespace", "##targetNamespace",
			   "affiliation", "DMNElement"
		   });
		addAnnotation
		  (getDMNRoot_KnowledgeSource(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "knowledgeSource",
			   "namespace", "##targetNamespace",
			   "affiliation", "drgElement"
		   });
		addAnnotation
		  (getDMNRoot_List(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "list",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_LiteralExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "literalExpression",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_OrganizationUnit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "organizationUnit",
			   "namespace", "##targetNamespace",
			   "affiliation", "businessContextElement"
		   });
		addAnnotation
		  (getDMNRoot_PerformanceIndicator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "performanceIndicator",
			   "namespace", "##targetNamespace",
			   "affiliation", "businessContextElement"
		   });
		addAnnotation
		  (getDMNRoot_Relation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relation",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_Some(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "some",
			   "namespace", "##targetNamespace",
			   "affiliation", "expression"
		   });
		addAnnotation
		  (getDMNRoot_TextAnnotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "textAnnotation",
			   "namespace", "##targetNamespace",
			   "affiliation", "artifact"
		   });
		addAnnotation
		  (extensionElementsTypeEClass,
		   source,
		   new String[] {
			   "name", "extensionElements_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExtensionElementsType_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (tArtifactEClass,
		   source,
		   new String[] {
			   "name", "tArtifact",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tAssociationEClass,
		   source,
		   new String[] {
			   "name", "tAssociation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTAssociation_SourceRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sourceRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTAssociation_TargetRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "targetRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTAssociation_AssociationDirection(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "associationDirection"
		   });
		addAnnotation
		  (tAssociationDirectionEEnum,
		   source,
		   new String[] {
			   "name", "tAssociationDirection"
		   });
		addAnnotation
		  (tAssociationDirectionObjectEDataType,
		   source,
		   new String[] {
			   "name", "tAssociationDirection:Object",
			   "baseType", "tAssociationDirection"
		   });
		addAnnotation
		  (tAuthorityRequirementEClass,
		   source,
		   new String[] {
			   "name", "tAuthorityRequirement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTAuthorityRequirement_RequiredDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTAuthorityRequirement_RequiredInput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredInput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTAuthorityRequirement_RequiredAuthority(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredAuthority",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tBindingEClass,
		   source,
		   new String[] {
			   "name", "tBinding",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTBinding_Parameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTBinding_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTBinding_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (tBuiltinAggregatorEEnum,
		   source,
		   new String[] {
			   "name", "tBuiltinAggregator"
		   });
		addAnnotation
		  (tBuiltinAggregatorObjectEDataType,
		   source,
		   new String[] {
			   "name", "tBuiltinAggregator:Object",
			   "baseType", "tBuiltinAggregator"
		   });
		addAnnotation
		  (tBusinessContextElementEClass,
		   source,
		   new String[] {
			   "name", "tBusinessContextElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTBusinessContextElement_URI(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "URI"
		   });
		addAnnotation
		  (tBusinessKnowledgeModelEClass,
		   source,
		   new String[] {
			   "name", "tBusinessKnowledgeModel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTBusinessKnowledgeModel_EncapsulatedLogic(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "encapsulatedLogic",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTBusinessKnowledgeModel_KnowledgeRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "knowledgeRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTBusinessKnowledgeModel_AuthorityRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorityRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tChildExpressionEClass,
		   source,
		   new String[] {
			   "name", "tChildExpression",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTChildExpression_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTChildExpression_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getTChildExpression_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (tConditionalEClass,
		   source,
		   new String[] {
			   "name", "tConditional",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTConditional_If(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "if",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTConditional_Then(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "then",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTConditional_Else(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "else",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tContextEClass,
		   source,
		   new String[] {
			   "name", "tContext",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTContext_ContextEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "contextEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tContextEntryEClass,
		   source,
		   new String[] {
			   "name", "tContextEntry",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTContextEntry_Variable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "variable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTContextEntry_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTContextEntry_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (tDecisionEClass,
		   source,
		   new String[] {
			   "name", "tDecision",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecision_Question(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "question",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_AllowedAnswers(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allowedAnswers",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_Variable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "variable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_InformationRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "informationRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_KnowledgeRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "knowledgeRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_AuthorityRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorityRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_SupportedObjective(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "supportedObjective",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_ImpactedPerformanceIndicator(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "impactedPerformanceIndicator",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_DecisionMaker(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionMaker",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_DecisionOwner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionOwner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_UsingProcess(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "usingProcess",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_UsingTask(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "usingTask",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (tDecisionRuleEClass,
		   source,
		   new String[] {
			   "name", "tDecisionRule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecisionRule_InputEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionRule_OutputEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionRule_AnnotationEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "annotationEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tDecisionServiceEClass,
		   source,
		   new String[] {
			   "name", "tDecisionService",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecisionService_OutputDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionService_EncapsulatedDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "encapsulatedDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionService_InputDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionService_InputData(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputData",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tDecisionTableEClass,
		   source,
		   new String[] {
			   "name", "tDecisionTable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecisionTable_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTable_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTable_Annotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "annotation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTable_Rule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "rule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTable_Aggregation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "aggregation"
		   });
		addAnnotation
		  (getTDecisionTable_HitPolicy(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "hitPolicy"
		   });
		addAnnotation
		  (getTDecisionTable_OutputLabel(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputLabel"
		   });
		addAnnotation
		  (getTDecisionTable_PreferredOrientation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "preferredOrientation"
		   });
		addAnnotation
		  (tDecisionTableOrientationEEnum,
		   source,
		   new String[] {
			   "name", "tDecisionTableOrientation"
		   });
		addAnnotation
		  (tDecisionTableOrientationObjectEDataType,
		   source,
		   new String[] {
			   "name", "tDecisionTableOrientation:Object",
			   "baseType", "tDecisionTableOrientation"
		   });
		addAnnotation
		  (tDefinitionsEClass,
		   source,
		   new String[] {
			   "name", "tDefinitions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDefinitions_Import(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "import",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_ItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_DrgElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "drgElement:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_DrgElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "drgElement",
			   "namespace", "##targetNamespace",
			   "group", "drgElement:group"
		   });
		addAnnotation
		  (getTDefinitions_ArtifactGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "artifact:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Artifact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artifact",
			   "namespace", "##targetNamespace",
			   "group", "artifact:group"
		   });
		addAnnotation
		  (getTDefinitions_ElementCollection(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "elementCollection",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_BusinessContextElementGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "businessContextElement:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_BusinessContextElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "businessContextElement",
			   "namespace", "##targetNamespace",
			   "group", "businessContextElement:group"
		   });
		addAnnotation
		  (getTDefinitions_DMNDI(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DMNDI",
			   "namespace", "https://www.omg.org/spec/DMN/20230324/DMNDI/"
		   });
		addAnnotation
		  (getTDefinitions_Exporter(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exporter"
		   });
		addAnnotation
		  (getTDefinitions_ExporterVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exporterVersion"
		   });
		addAnnotation
		  (getTDefinitions_ExpressionLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguage"
		   });
		addAnnotation
		  (getTDefinitions_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "namespace"
		   });
		addAnnotation
		  (getTDefinitions_TypeLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeLanguage"
		   });
		addAnnotation
		  (tdmnElementEClass,
		   source,
		   new String[] {
			   "name", "tDMNElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDMNElement_Description(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "description",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDMNElement_ExtensionElements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensionElements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDMNElement_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTDMNElement_Label(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "label"
		   });
		addAnnotation
		  (getTDMNElement_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (tdmnElementReferenceEClass,
		   source,
		   new String[] {
			   "name", "tDMNElementReference",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTDMNElementReference_Href(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "href"
		   });
		addAnnotation
		  (tdrgElementEClass,
		   source,
		   new String[] {
			   "name", "tDRGElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tElementCollectionEClass,
		   source,
		   new String[] {
			   "name", "tElementCollection",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTElementCollection_DrgElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "drgElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tExpressionEClass,
		   source,
		   new String[] {
			   "name", "tExpression",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTExpression_TypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeRef"
		   });
		addAnnotation
		  (tFilterEClass,
		   source,
		   new String[] {
			   "name", "tFilter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTFilter_In(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "in",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTFilter_Match(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "match",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tForEClass,
		   source,
		   new String[] {
			   "name", "tFor",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTFor_Return(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "return",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tFunctionDefinitionEClass,
		   source,
		   new String[] {
			   "name", "tFunctionDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTFunctionDefinition_FormalParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "formalParameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTFunctionDefinition_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTFunctionDefinition_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getTFunctionDefinition_Kind(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "kind"
		   });
		addAnnotation
		  (tFunctionItemEClass,
		   source,
		   new String[] {
			   "name", "tFunctionItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTFunctionItem_Parameters(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameters",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTFunctionItem_OutputTypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "outputTypeRef"
		   });
		addAnnotation
		  (tFunctionKindEEnum,
		   source,
		   new String[] {
			   "name", "tFunctionKind"
		   });
		addAnnotation
		  (tFunctionKindObjectEDataType,
		   source,
		   new String[] {
			   "name", "tFunctionKind:Object",
			   "baseType", "tFunctionKind"
		   });
		addAnnotation
		  (tGroupEClass,
		   source,
		   new String[] {
			   "name", "tGroup",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTGroup_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tHitPolicyEEnum,
		   source,
		   new String[] {
			   "name", "tHitPolicy"
		   });
		addAnnotation
		  (tHitPolicyObjectEDataType,
		   source,
		   new String[] {
			   "name", "tHitPolicy:Object",
			   "baseType", "tHitPolicy"
		   });
		addAnnotation
		  (tImportEClass,
		   source,
		   new String[] {
			   "name", "tImport",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTImport_ImportType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "importType"
		   });
		addAnnotation
		  (getTImport_LocationURI(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "locationURI"
		   });
		addAnnotation
		  (getTImport_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "namespace"
		   });
		addAnnotation
		  (tImportedValuesEClass,
		   source,
		   new String[] {
			   "name", "tImportedValues",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTImportedValues_ImportedElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "importedElement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTImportedValues_ExpressionLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguage"
		   });
		addAnnotation
		  (tInformationItemEClass,
		   source,
		   new String[] {
			   "name", "tInformationItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInformationItem_TypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeRef"
		   });
		addAnnotation
		  (tInformationRequirementEClass,
		   source,
		   new String[] {
			   "name", "tInformationRequirement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInformationRequirement_RequiredDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTInformationRequirement_RequiredInput(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredInput",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tInputClauseEClass,
		   source,
		   new String[] {
			   "name", "tInputClause",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInputClause_InputExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTInputClause_InputValues(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "inputValues",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tInputDataEClass,
		   source,
		   new String[] {
			   "name", "tInputData",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInputData_Variable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "variable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tInvocableEClass,
		   source,
		   new String[] {
			   "name", "tInvocable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInvocable_Variable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "variable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tInvocationEClass,
		   source,
		   new String[] {
			   "name", "tInvocation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTInvocation_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTInvocation_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (getTInvocation_Binding(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "binding",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tItemDefinitionEClass,
		   source,
		   new String[] {
			   "name", "tItemDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTItemDefinition_TypeRef(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "typeRef",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTItemDefinition_AllowedValues(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "allowedValues",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTItemDefinition_TypeConstraint(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "typeConstraint",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTItemDefinition_ItemComponent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemComponent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTItemDefinition_FunctionItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "functionItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTItemDefinition_IsCollection(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isCollection"
		   });
		addAnnotation
		  (getTItemDefinition_TypeLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeLanguage"
		   });
		addAnnotation
		  (tIteratorEClass,
		   source,
		   new String[] {
			   "name", "tIterator",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTIterator_In(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "in",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTIterator_IteratorVariable(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "iteratorVariable"
		   });
		addAnnotation
		  (tKnowledgeRequirementEClass,
		   source,
		   new String[] {
			   "name", "tKnowledgeRequirement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTKnowledgeRequirement_RequiredKnowledge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredKnowledge",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tKnowledgeSourceEClass,
		   source,
		   new String[] {
			   "name", "tKnowledgeSource",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTKnowledgeSource_AuthorityRequirement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "authorityRequirement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTKnowledgeSource_Type(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "type",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTKnowledgeSource_Owner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "owner",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTKnowledgeSource_LocationURI(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "locationURI"
		   });
		addAnnotation
		  (tListEClass,
		   source,
		   new String[] {
			   "name", "tList",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTList_ExpressionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "expression:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTList_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace",
			   "group", "expression:group"
		   });
		addAnnotation
		  (tLiteralExpressionEClass,
		   source,
		   new String[] {
			   "name", "tLiteralExpression",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTLiteralExpression_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTLiteralExpression_ImportedValues(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "importedValues",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTLiteralExpression_ExpressionLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguage"
		   });
		addAnnotation
		  (tNamedElementEClass,
		   source,
		   new String[] {
			   "name", "tNamedElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTNamedElement_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tOrganizationUnitEClass,
		   source,
		   new String[] {
			   "name", "tOrganizationUnit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOrganizationUnit_DecisionMade(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionMade",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTOrganizationUnit_DecisionOwned(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionOwned",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tOutputClauseEClass,
		   source,
		   new String[] {
			   "name", "tOutputClause",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOutputClause_OutputValues(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "outputValues",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTOutputClause_DefaultOutputEntry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defaultOutputEntry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTOutputClause_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTOutputClause_TypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeRef"
		   });
		addAnnotation
		  (tPerformanceIndicatorEClass,
		   source,
		   new String[] {
			   "name", "tPerformanceIndicator",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPerformanceIndicator_ImpactingDecision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "impactingDecision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tQuantifiedEClass,
		   source,
		   new String[] {
			   "name", "tQuantified",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTQuantified_Satisfies(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "satisfies",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tRelationEClass,
		   source,
		   new String[] {
			   "name", "tRelation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRelation_Column(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "column",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTRelation_Row(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "row",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tRuleAnnotationEClass,
		   source,
		   new String[] {
			   "name", "tRuleAnnotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRuleAnnotation_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tRuleAnnotationClauseEClass,
		   source,
		   new String[] {
			   "name", "tRuleAnnotationClause",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTRuleAnnotationClause_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tTextAnnotationEClass,
		   source,
		   new String[] {
			   "name", "tTextAnnotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTextAnnotation_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTextAnnotation_TextFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "textFormat"
		   });
		addAnnotation
		  (tTypedChildExpressionEClass,
		   source,
		   new String[] {
			   "name", "tTypedChildExpression",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTypedChildExpression_TypeRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "typeRef"
		   });
		addAnnotation
		  (tUnaryTestsEClass,
		   source,
		   new String[] {
			   "name", "tUnaryTests",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTUnaryTests_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTUnaryTests_ExpressionLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguage"
		   });
	}

} //DMNPackageImpl
