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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.omg.spec.dmn.dmn.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DMNFactoryImpl extends EFactoryImpl implements DMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DMNFactory init() {
		try {
			DMNFactory theDMNFactory = (DMNFactory)EPackage.Registry.INSTANCE.getEFactory(DMNPackage.eNS_URI);
			if (theDMNFactory != null) {
				return theDMNFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMNFactoryImpl() {
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
			case DMNPackage.DMN_ROOT: return createDMNRoot();
			case DMNPackage.EXTENSION_ELEMENTS_TYPE: return createExtensionElementsType();
			case DMNPackage.TARTIFACT: return createTArtifact();
			case DMNPackage.TASSOCIATION: return createTAssociation();
			case DMNPackage.TAUTHORITY_REQUIREMENT: return createTAuthorityRequirement();
			case DMNPackage.TBINDING: return createTBinding();
			case DMNPackage.TBUSINESS_CONTEXT_ELEMENT: return createTBusinessContextElement();
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL: return createTBusinessKnowledgeModel();
			case DMNPackage.TCHILD_EXPRESSION: return createTChildExpression();
			case DMNPackage.TCONDITIONAL: return createTConditional();
			case DMNPackage.TCONTEXT: return createTContext();
			case DMNPackage.TCONTEXT_ENTRY: return createTContextEntry();
			case DMNPackage.TDECISION: return createTDecision();
			case DMNPackage.TDECISION_RULE: return createTDecisionRule();
			case DMNPackage.TDECISION_SERVICE: return createTDecisionService();
			case DMNPackage.TDECISION_TABLE: return createTDecisionTable();
			case DMNPackage.TDEFINITIONS: return createTDefinitions();
			case DMNPackage.TDMN_ELEMENT: return createTDMNElement();
			case DMNPackage.TDMN_ELEMENT_REFERENCE: return createTDMNElementReference();
			case DMNPackage.TDRG_ELEMENT: return createTDRGElement();
			case DMNPackage.TELEMENT_COLLECTION: return createTElementCollection();
			case DMNPackage.TEXPRESSION: return createTExpression();
			case DMNPackage.TFILTER: return createTFilter();
			case DMNPackage.TFOR: return createTFor();
			case DMNPackage.TFUNCTION_DEFINITION: return createTFunctionDefinition();
			case DMNPackage.TFUNCTION_ITEM: return createTFunctionItem();
			case DMNPackage.TGROUP: return createTGroup();
			case DMNPackage.TIMPORT: return createTImport();
			case DMNPackage.TIMPORTED_VALUES: return createTImportedValues();
			case DMNPackage.TINFORMATION_ITEM: return createTInformationItem();
			case DMNPackage.TINFORMATION_REQUIREMENT: return createTInformationRequirement();
			case DMNPackage.TINPUT_CLAUSE: return createTInputClause();
			case DMNPackage.TINPUT_DATA: return createTInputData();
			case DMNPackage.TINVOCABLE: return createTInvocable();
			case DMNPackage.TINVOCATION: return createTInvocation();
			case DMNPackage.TITEM_DEFINITION: return createTItemDefinition();
			case DMNPackage.TITERATOR: return createTIterator();
			case DMNPackage.TKNOWLEDGE_REQUIREMENT: return createTKnowledgeRequirement();
			case DMNPackage.TKNOWLEDGE_SOURCE: return createTKnowledgeSource();
			case DMNPackage.TLIST: return createTList();
			case DMNPackage.TLITERAL_EXPRESSION: return createTLiteralExpression();
			case DMNPackage.TNAMED_ELEMENT: return createTNamedElement();
			case DMNPackage.TORGANIZATION_UNIT: return createTOrganizationUnit();
			case DMNPackage.TOUTPUT_CLAUSE: return createTOutputClause();
			case DMNPackage.TPERFORMANCE_INDICATOR: return createTPerformanceIndicator();
			case DMNPackage.TQUANTIFIED: return createTQuantified();
			case DMNPackage.TRELATION: return createTRelation();
			case DMNPackage.TRULE_ANNOTATION: return createTRuleAnnotation();
			case DMNPackage.TRULE_ANNOTATION_CLAUSE: return createTRuleAnnotationClause();
			case DMNPackage.TTEXT_ANNOTATION: return createTTextAnnotation();
			case DMNPackage.TTYPED_CHILD_EXPRESSION: return createTTypedChildExpression();
			case DMNPackage.TUNARY_TESTS: return createTUnaryTests();
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
			case DMNPackage.TASSOCIATION_DIRECTION:
				return createTAssociationDirectionFromString(eDataType, initialValue);
			case DMNPackage.TBUILTIN_AGGREGATOR:
				return createTBuiltinAggregatorFromString(eDataType, initialValue);
			case DMNPackage.TDECISION_TABLE_ORIENTATION:
				return createTDecisionTableOrientationFromString(eDataType, initialValue);
			case DMNPackage.TFUNCTION_KIND:
				return createTFunctionKindFromString(eDataType, initialValue);
			case DMNPackage.THIT_POLICY:
				return createTHitPolicyFromString(eDataType, initialValue);
			case DMNPackage.TASSOCIATION_DIRECTION_OBJECT:
				return createTAssociationDirectionObjectFromString(eDataType, initialValue);
			case DMNPackage.TBUILTIN_AGGREGATOR_OBJECT:
				return createTBuiltinAggregatorObjectFromString(eDataType, initialValue);
			case DMNPackage.TDECISION_TABLE_ORIENTATION_OBJECT:
				return createTDecisionTableOrientationObjectFromString(eDataType, initialValue);
			case DMNPackage.TFUNCTION_KIND_OBJECT:
				return createTFunctionKindObjectFromString(eDataType, initialValue);
			case DMNPackage.THIT_POLICY_OBJECT:
				return createTHitPolicyObjectFromString(eDataType, initialValue);
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
			case DMNPackage.TASSOCIATION_DIRECTION:
				return convertTAssociationDirectionToString(eDataType, instanceValue);
			case DMNPackage.TBUILTIN_AGGREGATOR:
				return convertTBuiltinAggregatorToString(eDataType, instanceValue);
			case DMNPackage.TDECISION_TABLE_ORIENTATION:
				return convertTDecisionTableOrientationToString(eDataType, instanceValue);
			case DMNPackage.TFUNCTION_KIND:
				return convertTFunctionKindToString(eDataType, instanceValue);
			case DMNPackage.THIT_POLICY:
				return convertTHitPolicyToString(eDataType, instanceValue);
			case DMNPackage.TASSOCIATION_DIRECTION_OBJECT:
				return convertTAssociationDirectionObjectToString(eDataType, instanceValue);
			case DMNPackage.TBUILTIN_AGGREGATOR_OBJECT:
				return convertTBuiltinAggregatorObjectToString(eDataType, instanceValue);
			case DMNPackage.TDECISION_TABLE_ORIENTATION_OBJECT:
				return convertTDecisionTableOrientationObjectToString(eDataType, instanceValue);
			case DMNPackage.TFUNCTION_KIND_OBJECT:
				return convertTFunctionKindObjectToString(eDataType, instanceValue);
			case DMNPackage.THIT_POLICY_OBJECT:
				return convertTHitPolicyObjectToString(eDataType, instanceValue);
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
	public DMNRoot createDMNRoot() {
		DMNRootImpl dmnRoot = new DMNRootImpl();
		return dmnRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionElementsType createExtensionElementsType() {
		ExtensionElementsTypeImpl extensionElementsType = new ExtensionElementsTypeImpl();
		return extensionElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TArtifact createTArtifact() {
		TArtifactImpl tArtifact = new TArtifactImpl();
		return tArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation createTAssociation() {
		TAssociationImpl tAssociation = new TAssociationImpl();
		return tAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAuthorityRequirement createTAuthorityRequirement() {
		TAuthorityRequirementImpl tAuthorityRequirement = new TAuthorityRequirementImpl();
		return tAuthorityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBinding createTBinding() {
		TBindingImpl tBinding = new TBindingImpl();
		return tBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessContextElement createTBusinessContextElement() {
		TBusinessContextElementImpl tBusinessContextElement = new TBusinessContextElementImpl();
		return tBusinessContextElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessKnowledgeModel createTBusinessKnowledgeModel() {
		TBusinessKnowledgeModelImpl tBusinessKnowledgeModel = new TBusinessKnowledgeModelImpl();
		return tBusinessKnowledgeModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChildExpression createTChildExpression() {
		TChildExpressionImpl tChildExpression = new TChildExpressionImpl();
		return tChildExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConditional createTConditional() {
		TConditionalImpl tConditional = new TConditionalImpl();
		return tConditional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TContext createTContext() {
		TContextImpl tContext = new TContextImpl();
		return tContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TContextEntry createTContextEntry() {
		TContextEntryImpl tContextEntry = new TContextEntryImpl();
		return tContextEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecision createTDecision() {
		TDecisionImpl tDecision = new TDecisionImpl();
		return tDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionRule createTDecisionRule() {
		TDecisionRuleImpl tDecisionRule = new TDecisionRuleImpl();
		return tDecisionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionService createTDecisionService() {
		TDecisionServiceImpl tDecisionService = new TDecisionServiceImpl();
		return tDecisionService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionTable createTDecisionTable() {
		TDecisionTableImpl tDecisionTable = new TDecisionTableImpl();
		return tDecisionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElement createTDMNElement() {
		TDMNElementImpl tdmnElement = new TDMNElementImpl();
		return tdmnElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElementReference createTDMNElementReference() {
		TDMNElementReferenceImpl tdmnElementReference = new TDMNElementReferenceImpl();
		return tdmnElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDRGElement createTDRGElement() {
		TDRGElementImpl tdrgElement = new TDRGElementImpl();
		return tdrgElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TElementCollection createTElementCollection() {
		TElementCollectionImpl tElementCollection = new TElementCollectionImpl();
		return tElementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression createTExpression() {
		TExpressionImpl tExpression = new TExpressionImpl();
		return tExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFilter createTFilter() {
		TFilterImpl tFilter = new TFilterImpl();
		return tFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFor createTFor() {
		TForImpl tFor = new TForImpl();
		return tFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionDefinition createTFunctionDefinition() {
		TFunctionDefinitionImpl tFunctionDefinition = new TFunctionDefinitionImpl();
		return tFunctionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionItem createTFunctionItem() {
		TFunctionItemImpl tFunctionItem = new TFunctionItemImpl();
		return tFunctionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGroup createTGroup() {
		TGroupImpl tGroup = new TGroupImpl();
		return tGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImportedValues createTImportedValues() {
		TImportedValuesImpl tImportedValues = new TImportedValuesImpl();
		return tImportedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInformationItem createTInformationItem() {
		TInformationItemImpl tInformationItem = new TInformationItemImpl();
		return tInformationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInformationRequirement createTInformationRequirement() {
		TInformationRequirementImpl tInformationRequirement = new TInformationRequirementImpl();
		return tInformationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputClause createTInputClause() {
		TInputClauseImpl tInputClause = new TInputClauseImpl();
		return tInputClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputData createTInputData() {
		TInputDataImpl tInputData = new TInputDataImpl();
		return tInputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInvocable createTInvocable() {
		TInvocableImpl tInvocable = new TInvocableImpl();
		return tInvocable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInvocation createTInvocation() {
		TInvocationImpl tInvocation = new TInvocationImpl();
		return tInvocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TItemDefinition createTItemDefinition() {
		TItemDefinitionImpl tItemDefinition = new TItemDefinitionImpl();
		return tItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIterator createTIterator() {
		TIteratorImpl tIterator = new TIteratorImpl();
		return tIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TKnowledgeRequirement createTKnowledgeRequirement() {
		TKnowledgeRequirementImpl tKnowledgeRequirement = new TKnowledgeRequirementImpl();
		return tKnowledgeRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TKnowledgeSource createTKnowledgeSource() {
		TKnowledgeSourceImpl tKnowledgeSource = new TKnowledgeSourceImpl();
		return tKnowledgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TList createTList() {
		TListImpl tList = new TListImpl();
		return tList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLiteralExpression createTLiteralExpression() {
		TLiteralExpressionImpl tLiteralExpression = new TLiteralExpressionImpl();
		return tLiteralExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNamedElement createTNamedElement() {
		TNamedElementImpl tNamedElement = new TNamedElementImpl();
		return tNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOrganizationUnit createTOrganizationUnit() {
		TOrganizationUnitImpl tOrganizationUnit = new TOrganizationUnitImpl();
		return tOrganizationUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOutputClause createTOutputClause() {
		TOutputClauseImpl tOutputClause = new TOutputClauseImpl();
		return tOutputClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPerformanceIndicator createTPerformanceIndicator() {
		TPerformanceIndicatorImpl tPerformanceIndicator = new TPerformanceIndicatorImpl();
		return tPerformanceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TQuantified createTQuantified() {
		TQuantifiedImpl tQuantified = new TQuantifiedImpl();
		return tQuantified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelation createTRelation() {
		TRelationImpl tRelation = new TRelationImpl();
		return tRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRuleAnnotation createTRuleAnnotation() {
		TRuleAnnotationImpl tRuleAnnotation = new TRuleAnnotationImpl();
		return tRuleAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRuleAnnotationClause createTRuleAnnotationClause() {
		TRuleAnnotationClauseImpl tRuleAnnotationClause = new TRuleAnnotationClauseImpl();
		return tRuleAnnotationClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation createTTextAnnotation() {
		TTextAnnotationImpl tTextAnnotation = new TTextAnnotationImpl();
		return tTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTypedChildExpression createTTypedChildExpression() {
		TTypedChildExpressionImpl tTypedChildExpression = new TTypedChildExpressionImpl();
		return tTypedChildExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUnaryTests createTUnaryTests() {
		TUnaryTestsImpl tUnaryTests = new TUnaryTestsImpl();
		return tUnaryTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		TAssociationDirection result = TAssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBuiltinAggregator createTBuiltinAggregatorFromString(EDataType eDataType, String initialValue) {
		TBuiltinAggregator result = TBuiltinAggregator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBuiltinAggregatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDecisionTableOrientation createTDecisionTableOrientationFromString(EDataType eDataType, String initialValue) {
		TDecisionTableOrientation result = TDecisionTableOrientation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDecisionTableOrientationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFunctionKind createTFunctionKindFromString(EDataType eDataType, String initialValue) {
		TFunctionKind result = TFunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THitPolicy createTHitPolicyFromString(EDataType eDataType, String initialValue) {
		THitPolicy result = THitPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTHitPolicyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTAssociationDirectionFromString(DMNPackage.Literals.TASSOCIATION_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAssociationDirectionToString(DMNPackage.Literals.TASSOCIATION_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBuiltinAggregator createTBuiltinAggregatorObjectFromString(EDataType eDataType, String initialValue) {
		return createTBuiltinAggregatorFromString(DMNPackage.Literals.TBUILTIN_AGGREGATOR, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBuiltinAggregatorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTBuiltinAggregatorToString(DMNPackage.Literals.TBUILTIN_AGGREGATOR, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDecisionTableOrientation createTDecisionTableOrientationObjectFromString(EDataType eDataType, String initialValue) {
		return createTDecisionTableOrientationFromString(DMNPackage.Literals.TDECISION_TABLE_ORIENTATION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTDecisionTableOrientationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTDecisionTableOrientationToString(DMNPackage.Literals.TDECISION_TABLE_ORIENTATION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFunctionKind createTFunctionKindObjectFromString(EDataType eDataType, String initialValue) {
		return createTFunctionKindFromString(DMNPackage.Literals.TFUNCTION_KIND, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFunctionKindObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFunctionKindToString(DMNPackage.Literals.TFUNCTION_KIND, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THitPolicy createTHitPolicyObjectFromString(EDataType eDataType, String initialValue) {
		return createTHitPolicyFromString(DMNPackage.Literals.THIT_POLICY, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTHitPolicyObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTHitPolicyToString(DMNPackage.Literals.THIT_POLICY, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNPackage getDMNPackage() {
		return (DMNPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DMNPackage getPackage() {
		return DMNPackage.eINSTANCE;
	}

} //DMNFactoryImpl
