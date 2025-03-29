/*
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
package org.omg.spec.dmn.dmn;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.dmn.dmn.DMNPackage
 * @generated
 */
@ProviderType
public interface DMNFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DMNFactory eINSTANCE = org.omg.spec.dmn.dmn.impl.DMNFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	DMNRoot createDMNRoot();

	/**
	 * Returns a new object of class '<em>Extension Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extension Elements Type</em>'.
	 * @generated
	 */
	ExtensionElementsType createExtensionElementsType();

	/**
	 * Returns a new object of class '<em>TArtifact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TArtifact</em>'.
	 * @generated
	 */
	TArtifact createTArtifact();

	/**
	 * Returns a new object of class '<em>TAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAssociation</em>'.
	 * @generated
	 */
	TAssociation createTAssociation();

	/**
	 * Returns a new object of class '<em>TAuthority Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAuthority Requirement</em>'.
	 * @generated
	 */
	TAuthorityRequirement createTAuthorityRequirement();

	/**
	 * Returns a new object of class '<em>TBinding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBinding</em>'.
	 * @generated
	 */
	TBinding createTBinding();

	/**
	 * Returns a new object of class '<em>TBusiness Context Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBusiness Context Element</em>'.
	 * @generated
	 */
	TBusinessContextElement createTBusinessContextElement();

	/**
	 * Returns a new object of class '<em>TBusiness Knowledge Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TBusiness Knowledge Model</em>'.
	 * @generated
	 */
	TBusinessKnowledgeModel createTBusinessKnowledgeModel();

	/**
	 * Returns a new object of class '<em>TChild Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TChild Expression</em>'.
	 * @generated
	 */
	TChildExpression createTChildExpression();

	/**
	 * Returns a new object of class '<em>TConditional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TConditional</em>'.
	 * @generated
	 */
	TConditional createTConditional();

	/**
	 * Returns a new object of class '<em>TContext</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TContext</em>'.
	 * @generated
	 */
	TContext createTContext();

	/**
	 * Returns a new object of class '<em>TContext Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TContext Entry</em>'.
	 * @generated
	 */
	TContextEntry createTContextEntry();

	/**
	 * Returns a new object of class '<em>TDecision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision</em>'.
	 * @generated
	 */
	TDecision createTDecision();

	/**
	 * Returns a new object of class '<em>TDecision Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision Rule</em>'.
	 * @generated
	 */
	TDecisionRule createTDecisionRule();

	/**
	 * Returns a new object of class '<em>TDecision Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision Service</em>'.
	 * @generated
	 */
	TDecisionService createTDecisionService();

	/**
	 * Returns a new object of class '<em>TDecision Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision Table</em>'.
	 * @generated
	 */
	TDecisionTable createTDecisionTable();

	/**
	 * Returns a new object of class '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDefinitions</em>'.
	 * @generated
	 */
	TDefinitions createTDefinitions();

	/**
	 * Returns a new object of class '<em>TDMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDMN Element</em>'.
	 * @generated
	 */
	TDMNElement createTDMNElement();

	/**
	 * Returns a new object of class '<em>TDMN Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDMN Element Reference</em>'.
	 * @generated
	 */
	TDMNElementReference createTDMNElementReference();

	/**
	 * Returns a new object of class '<em>TDRG Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDRG Element</em>'.
	 * @generated
	 */
	TDRGElement createTDRGElement();

	/**
	 * Returns a new object of class '<em>TElement Collection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TElement Collection</em>'.
	 * @generated
	 */
	TElementCollection createTElementCollection();

	/**
	 * Returns a new object of class '<em>TExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExpression</em>'.
	 * @generated
	 */
	TExpression createTExpression();

	/**
	 * Returns a new object of class '<em>TFilter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFilter</em>'.
	 * @generated
	 */
	TFilter createTFilter();

	/**
	 * Returns a new object of class '<em>TFor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFor</em>'.
	 * @generated
	 */
	TFor createTFor();

	/**
	 * Returns a new object of class '<em>TFunction Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFunction Definition</em>'.
	 * @generated
	 */
	TFunctionDefinition createTFunctionDefinition();

	/**
	 * Returns a new object of class '<em>TFunction Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFunction Item</em>'.
	 * @generated
	 */
	TFunctionItem createTFunctionItem();

	/**
	 * Returns a new object of class '<em>TGroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TGroup</em>'.
	 * @generated
	 */
	TGroup createTGroup();

	/**
	 * Returns a new object of class '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImport</em>'.
	 * @generated
	 */
	TImport createTImport();

	/**
	 * Returns a new object of class '<em>TImported Values</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImported Values</em>'.
	 * @generated
	 */
	TImportedValues createTImportedValues();

	/**
	 * Returns a new object of class '<em>TInformation Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInformation Item</em>'.
	 * @generated
	 */
	TInformationItem createTInformationItem();

	/**
	 * Returns a new object of class '<em>TInformation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInformation Requirement</em>'.
	 * @generated
	 */
	TInformationRequirement createTInformationRequirement();

	/**
	 * Returns a new object of class '<em>TInput Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInput Clause</em>'.
	 * @generated
	 */
	TInputClause createTInputClause();

	/**
	 * Returns a new object of class '<em>TInput Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInput Data</em>'.
	 * @generated
	 */
	TInputData createTInputData();

	/**
	 * Returns a new object of class '<em>TInvocable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInvocable</em>'.
	 * @generated
	 */
	TInvocable createTInvocable();

	/**
	 * Returns a new object of class '<em>TInvocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TInvocation</em>'.
	 * @generated
	 */
	TInvocation createTInvocation();

	/**
	 * Returns a new object of class '<em>TItem Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TItem Definition</em>'.
	 * @generated
	 */
	TItemDefinition createTItemDefinition();

	/**
	 * Returns a new object of class '<em>TIterator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TIterator</em>'.
	 * @generated
	 */
	TIterator createTIterator();

	/**
	 * Returns a new object of class '<em>TKnowledge Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TKnowledge Requirement</em>'.
	 * @generated
	 */
	TKnowledgeRequirement createTKnowledgeRequirement();

	/**
	 * Returns a new object of class '<em>TKnowledge Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TKnowledge Source</em>'.
	 * @generated
	 */
	TKnowledgeSource createTKnowledgeSource();

	/**
	 * Returns a new object of class '<em>TList</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TList</em>'.
	 * @generated
	 */
	TList createTList();

	/**
	 * Returns a new object of class '<em>TLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLiteral Expression</em>'.
	 * @generated
	 */
	TLiteralExpression createTLiteralExpression();

	/**
	 * Returns a new object of class '<em>TNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TNamed Element</em>'.
	 * @generated
	 */
	TNamedElement createTNamedElement();

	/**
	 * Returns a new object of class '<em>TOrganization Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOrganization Unit</em>'.
	 * @generated
	 */
	TOrganizationUnit createTOrganizationUnit();

	/**
	 * Returns a new object of class '<em>TOutput Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TOutput Clause</em>'.
	 * @generated
	 */
	TOutputClause createTOutputClause();

	/**
	 * Returns a new object of class '<em>TPerformance Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPerformance Indicator</em>'.
	 * @generated
	 */
	TPerformanceIndicator createTPerformanceIndicator();

	/**
	 * Returns a new object of class '<em>TQuantified</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TQuantified</em>'.
	 * @generated
	 */
	TQuantified createTQuantified();

	/**
	 * Returns a new object of class '<em>TRelation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRelation</em>'.
	 * @generated
	 */
	TRelation createTRelation();

	/**
	 * Returns a new object of class '<em>TRule Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRule Annotation</em>'.
	 * @generated
	 */
	TRuleAnnotation createTRuleAnnotation();

	/**
	 * Returns a new object of class '<em>TRule Annotation Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRule Annotation Clause</em>'.
	 * @generated
	 */
	TRuleAnnotationClause createTRuleAnnotationClause();

	/**
	 * Returns a new object of class '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TText Annotation</em>'.
	 * @generated
	 */
	TTextAnnotation createTTextAnnotation();

	/**
	 * Returns a new object of class '<em>TTyped Child Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTyped Child Expression</em>'.
	 * @generated
	 */
	TTypedChildExpression createTTypedChildExpression();

	/**
	 * Returns a new object of class '<em>TUnary Tests</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUnary Tests</em>'.
	 * @generated
	 */
	TUnaryTests createTUnaryTests();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DMNPackage getDMNPackage();

} //DMNFactory
