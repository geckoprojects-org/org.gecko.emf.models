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
package org.omg.spec.dmn.dmn.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.omg.spec.dmn.dmn.*;

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
 * @see org.omg.spec.dmn.dmn.DMNPackage
 * @generated
 */
public class DMNSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DMNPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMNSwitch() {
		if (modelPackage == null) {
			modelPackage = DMNPackage.eINSTANCE;
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
			case DMNPackage.DMN_ROOT: {
				DMNRoot dmnRoot = (DMNRoot)theEObject;
				T result = caseDMNRoot(dmnRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.EXTENSION_ELEMENTS_TYPE: {
				ExtensionElementsType extensionElementsType = (ExtensionElementsType)theEObject;
				T result = caseExtensionElementsType(extensionElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TARTIFACT: {
				TArtifact tArtifact = (TArtifact)theEObject;
				T result = caseTArtifact(tArtifact);
				if (result == null) result = caseTDMNElement(tArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TASSOCIATION: {
				TAssociation tAssociation = (TAssociation)theEObject;
				T result = caseTAssociation(tAssociation);
				if (result == null) result = caseTArtifact(tAssociation);
				if (result == null) result = caseTDMNElement(tAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TAUTHORITY_REQUIREMENT: {
				TAuthorityRequirement tAuthorityRequirement = (TAuthorityRequirement)theEObject;
				T result = caseTAuthorityRequirement(tAuthorityRequirement);
				if (result == null) result = caseTDMNElement(tAuthorityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TBINDING: {
				TBinding tBinding = (TBinding)theEObject;
				T result = caseTBinding(tBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TBUSINESS_CONTEXT_ELEMENT: {
				TBusinessContextElement tBusinessContextElement = (TBusinessContextElement)theEObject;
				T result = caseTBusinessContextElement(tBusinessContextElement);
				if (result == null) result = caseTNamedElement(tBusinessContextElement);
				if (result == null) result = caseTDMNElement(tBusinessContextElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TBUSINESS_KNOWLEDGE_MODEL: {
				TBusinessKnowledgeModel tBusinessKnowledgeModel = (TBusinessKnowledgeModel)theEObject;
				T result = caseTBusinessKnowledgeModel(tBusinessKnowledgeModel);
				if (result == null) result = caseTInvocable(tBusinessKnowledgeModel);
				if (result == null) result = caseTDRGElement(tBusinessKnowledgeModel);
				if (result == null) result = caseTNamedElement(tBusinessKnowledgeModel);
				if (result == null) result = caseTDMNElement(tBusinessKnowledgeModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TCHILD_EXPRESSION: {
				TChildExpression tChildExpression = (TChildExpression)theEObject;
				T result = caseTChildExpression(tChildExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TCONDITIONAL: {
				TConditional tConditional = (TConditional)theEObject;
				T result = caseTConditional(tConditional);
				if (result == null) result = caseTExpression(tConditional);
				if (result == null) result = caseTDMNElement(tConditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TCONTEXT: {
				TContext tContext = (TContext)theEObject;
				T result = caseTContext(tContext);
				if (result == null) result = caseTExpression(tContext);
				if (result == null) result = caseTDMNElement(tContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TCONTEXT_ENTRY: {
				TContextEntry tContextEntry = (TContextEntry)theEObject;
				T result = caseTContextEntry(tContextEntry);
				if (result == null) result = caseTDMNElement(tContextEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDECISION: {
				TDecision tDecision = (TDecision)theEObject;
				T result = caseTDecision(tDecision);
				if (result == null) result = caseTDRGElement(tDecision);
				if (result == null) result = caseTNamedElement(tDecision);
				if (result == null) result = caseTDMNElement(tDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDECISION_RULE: {
				TDecisionRule tDecisionRule = (TDecisionRule)theEObject;
				T result = caseTDecisionRule(tDecisionRule);
				if (result == null) result = caseTDMNElement(tDecisionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDECISION_SERVICE: {
				TDecisionService tDecisionService = (TDecisionService)theEObject;
				T result = caseTDecisionService(tDecisionService);
				if (result == null) result = caseTInvocable(tDecisionService);
				if (result == null) result = caseTDRGElement(tDecisionService);
				if (result == null) result = caseTNamedElement(tDecisionService);
				if (result == null) result = caseTDMNElement(tDecisionService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDECISION_TABLE: {
				TDecisionTable tDecisionTable = (TDecisionTable)theEObject;
				T result = caseTDecisionTable(tDecisionTable);
				if (result == null) result = caseTExpression(tDecisionTable);
				if (result == null) result = caseTDMNElement(tDecisionTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDEFINITIONS: {
				TDefinitions tDefinitions = (TDefinitions)theEObject;
				T result = caseTDefinitions(tDefinitions);
				if (result == null) result = caseTNamedElement(tDefinitions);
				if (result == null) result = caseTDMNElement(tDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDMN_ELEMENT: {
				TDMNElement tdmnElement = (TDMNElement)theEObject;
				T result = caseTDMNElement(tdmnElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDMN_ELEMENT_REFERENCE: {
				TDMNElementReference tdmnElementReference = (TDMNElementReference)theEObject;
				T result = caseTDMNElementReference(tdmnElementReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TDRG_ELEMENT: {
				TDRGElement tdrgElement = (TDRGElement)theEObject;
				T result = caseTDRGElement(tdrgElement);
				if (result == null) result = caseTNamedElement(tdrgElement);
				if (result == null) result = caseTDMNElement(tdrgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TELEMENT_COLLECTION: {
				TElementCollection tElementCollection = (TElementCollection)theEObject;
				T result = caseTElementCollection(tElementCollection);
				if (result == null) result = caseTNamedElement(tElementCollection);
				if (result == null) result = caseTDMNElement(tElementCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TEXPRESSION: {
				TExpression tExpression = (TExpression)theEObject;
				T result = caseTExpression(tExpression);
				if (result == null) result = caseTDMNElement(tExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TFILTER: {
				TFilter tFilter = (TFilter)theEObject;
				T result = caseTFilter(tFilter);
				if (result == null) result = caseTExpression(tFilter);
				if (result == null) result = caseTDMNElement(tFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TFOR: {
				TFor tFor = (TFor)theEObject;
				T result = caseTFor(tFor);
				if (result == null) result = caseTIterator(tFor);
				if (result == null) result = caseTExpression(tFor);
				if (result == null) result = caseTDMNElement(tFor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TFUNCTION_DEFINITION: {
				TFunctionDefinition tFunctionDefinition = (TFunctionDefinition)theEObject;
				T result = caseTFunctionDefinition(tFunctionDefinition);
				if (result == null) result = caseTExpression(tFunctionDefinition);
				if (result == null) result = caseTDMNElement(tFunctionDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TFUNCTION_ITEM: {
				TFunctionItem tFunctionItem = (TFunctionItem)theEObject;
				T result = caseTFunctionItem(tFunctionItem);
				if (result == null) result = caseTDMNElement(tFunctionItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TGROUP: {
				TGroup tGroup = (TGroup)theEObject;
				T result = caseTGroup(tGroup);
				if (result == null) result = caseTArtifact(tGroup);
				if (result == null) result = caseTDMNElement(tGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TIMPORT: {
				TImport tImport = (TImport)theEObject;
				T result = caseTImport(tImport);
				if (result == null) result = caseTNamedElement(tImport);
				if (result == null) result = caseTDMNElement(tImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TIMPORTED_VALUES: {
				TImportedValues tImportedValues = (TImportedValues)theEObject;
				T result = caseTImportedValues(tImportedValues);
				if (result == null) result = caseTImport(tImportedValues);
				if (result == null) result = caseTNamedElement(tImportedValues);
				if (result == null) result = caseTDMNElement(tImportedValues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINFORMATION_ITEM: {
				TInformationItem tInformationItem = (TInformationItem)theEObject;
				T result = caseTInformationItem(tInformationItem);
				if (result == null) result = caseTNamedElement(tInformationItem);
				if (result == null) result = caseTDMNElement(tInformationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINFORMATION_REQUIREMENT: {
				TInformationRequirement tInformationRequirement = (TInformationRequirement)theEObject;
				T result = caseTInformationRequirement(tInformationRequirement);
				if (result == null) result = caseTDMNElement(tInformationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINPUT_CLAUSE: {
				TInputClause tInputClause = (TInputClause)theEObject;
				T result = caseTInputClause(tInputClause);
				if (result == null) result = caseTDMNElement(tInputClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINPUT_DATA: {
				TInputData tInputData = (TInputData)theEObject;
				T result = caseTInputData(tInputData);
				if (result == null) result = caseTDRGElement(tInputData);
				if (result == null) result = caseTNamedElement(tInputData);
				if (result == null) result = caseTDMNElement(tInputData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINVOCABLE: {
				TInvocable tInvocable = (TInvocable)theEObject;
				T result = caseTInvocable(tInvocable);
				if (result == null) result = caseTDRGElement(tInvocable);
				if (result == null) result = caseTNamedElement(tInvocable);
				if (result == null) result = caseTDMNElement(tInvocable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TINVOCATION: {
				TInvocation tInvocation = (TInvocation)theEObject;
				T result = caseTInvocation(tInvocation);
				if (result == null) result = caseTExpression(tInvocation);
				if (result == null) result = caseTDMNElement(tInvocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TITEM_DEFINITION: {
				TItemDefinition tItemDefinition = (TItemDefinition)theEObject;
				T result = caseTItemDefinition(tItemDefinition);
				if (result == null) result = caseTNamedElement(tItemDefinition);
				if (result == null) result = caseTDMNElement(tItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TITERATOR: {
				TIterator tIterator = (TIterator)theEObject;
				T result = caseTIterator(tIterator);
				if (result == null) result = caseTExpression(tIterator);
				if (result == null) result = caseTDMNElement(tIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TKNOWLEDGE_REQUIREMENT: {
				TKnowledgeRequirement tKnowledgeRequirement = (TKnowledgeRequirement)theEObject;
				T result = caseTKnowledgeRequirement(tKnowledgeRequirement);
				if (result == null) result = caseTDMNElement(tKnowledgeRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TKNOWLEDGE_SOURCE: {
				TKnowledgeSource tKnowledgeSource = (TKnowledgeSource)theEObject;
				T result = caseTKnowledgeSource(tKnowledgeSource);
				if (result == null) result = caseTDRGElement(tKnowledgeSource);
				if (result == null) result = caseTNamedElement(tKnowledgeSource);
				if (result == null) result = caseTDMNElement(tKnowledgeSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TLIST: {
				TList tList = (TList)theEObject;
				T result = caseTList(tList);
				if (result == null) result = caseTExpression(tList);
				if (result == null) result = caseTDMNElement(tList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TLITERAL_EXPRESSION: {
				TLiteralExpression tLiteralExpression = (TLiteralExpression)theEObject;
				T result = caseTLiteralExpression(tLiteralExpression);
				if (result == null) result = caseTExpression(tLiteralExpression);
				if (result == null) result = caseTDMNElement(tLiteralExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TNAMED_ELEMENT: {
				TNamedElement tNamedElement = (TNamedElement)theEObject;
				T result = caseTNamedElement(tNamedElement);
				if (result == null) result = caseTDMNElement(tNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TORGANIZATION_UNIT: {
				TOrganizationUnit tOrganizationUnit = (TOrganizationUnit)theEObject;
				T result = caseTOrganizationUnit(tOrganizationUnit);
				if (result == null) result = caseTBusinessContextElement(tOrganizationUnit);
				if (result == null) result = caseTNamedElement(tOrganizationUnit);
				if (result == null) result = caseTDMNElement(tOrganizationUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TOUTPUT_CLAUSE: {
				TOutputClause tOutputClause = (TOutputClause)theEObject;
				T result = caseTOutputClause(tOutputClause);
				if (result == null) result = caseTDMNElement(tOutputClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TPERFORMANCE_INDICATOR: {
				TPerformanceIndicator tPerformanceIndicator = (TPerformanceIndicator)theEObject;
				T result = caseTPerformanceIndicator(tPerformanceIndicator);
				if (result == null) result = caseTBusinessContextElement(tPerformanceIndicator);
				if (result == null) result = caseTNamedElement(tPerformanceIndicator);
				if (result == null) result = caseTDMNElement(tPerformanceIndicator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TQUANTIFIED: {
				TQuantified tQuantified = (TQuantified)theEObject;
				T result = caseTQuantified(tQuantified);
				if (result == null) result = caseTIterator(tQuantified);
				if (result == null) result = caseTExpression(tQuantified);
				if (result == null) result = caseTDMNElement(tQuantified);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TRELATION: {
				TRelation tRelation = (TRelation)theEObject;
				T result = caseTRelation(tRelation);
				if (result == null) result = caseTExpression(tRelation);
				if (result == null) result = caseTDMNElement(tRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TRULE_ANNOTATION: {
				TRuleAnnotation tRuleAnnotation = (TRuleAnnotation)theEObject;
				T result = caseTRuleAnnotation(tRuleAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TRULE_ANNOTATION_CLAUSE: {
				TRuleAnnotationClause tRuleAnnotationClause = (TRuleAnnotationClause)theEObject;
				T result = caseTRuleAnnotationClause(tRuleAnnotationClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TTEXT_ANNOTATION: {
				TTextAnnotation tTextAnnotation = (TTextAnnotation)theEObject;
				T result = caseTTextAnnotation(tTextAnnotation);
				if (result == null) result = caseTArtifact(tTextAnnotation);
				if (result == null) result = caseTDMNElement(tTextAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TTYPED_CHILD_EXPRESSION: {
				TTypedChildExpression tTypedChildExpression = (TTypedChildExpression)theEObject;
				T result = caseTTypedChildExpression(tTypedChildExpression);
				if (result == null) result = caseTChildExpression(tTypedChildExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DMNPackage.TUNARY_TESTS: {
				TUnaryTests tUnaryTests = (TUnaryTests)theEObject;
				T result = caseTUnaryTests(tUnaryTests);
				if (result == null) result = caseTExpression(tUnaryTests);
				if (result == null) result = caseTDMNElement(tUnaryTests);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDMNRoot(DMNRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionElementsType(ExtensionElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TArtifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TArtifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTArtifact(TArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAssociation(TAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAuthority Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAuthority Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAuthorityRequirement(TAuthorityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBinding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBinding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBinding(TBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBusiness Context Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBusiness Context Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBusinessContextElement(TBusinessContextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TBusiness Knowledge Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TBusiness Knowledge Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTBusinessKnowledgeModel(TBusinessKnowledgeModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TChild Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TChild Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTChildExpression(TChildExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TConditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TConditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTConditional(TConditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TContext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TContext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTContext(TContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TContext Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TContext Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTContextEntry(TContextEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecision(TDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecisionRule(TDecisionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecisionService(TDecisionService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecisionTable(TDecisionTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDefinitions(TDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDMN Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDMN Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDMNElement(TDMNElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDMN Element Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDMN Element Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDMNElementReference(TDMNElementReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDRG Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDRG Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDRGElement(TDRGElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TElement Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TElement Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTElementCollection(TElementCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExpression(TExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFilter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFilter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFilter(TFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFor(TFor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFunction Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFunction Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFunctionDefinition(TFunctionDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TFunction Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TFunction Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTFunctionItem(TFunctionItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGroup(TGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImport(TImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImported Values</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImported Values</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImportedValues(TImportedValues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInformation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInformation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInformationItem(TInformationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInformation Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInformation Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInformationRequirement(TInformationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInput Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInput Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInputClause(TInputClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInput Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInput Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInputData(TInputData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInvocable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInvocable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInvocable(TInvocable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TInvocation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TInvocation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTInvocation(TInvocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TItem Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TItem Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTItemDefinition(TItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIterator(TIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TKnowledge Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TKnowledge Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTKnowledgeRequirement(TKnowledgeRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TKnowledge Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TKnowledge Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTKnowledgeSource(TKnowledgeSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TList</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TList</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTList(TList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TLiteral Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TLiteral Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLiteralExpression(TLiteralExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TNamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TNamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTNamedElement(TNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOrganization Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOrganization Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOrganizationUnit(TOrganizationUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOutput Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOutput Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOutputClause(TOutputClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPerformance Indicator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPerformance Indicator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPerformanceIndicator(TPerformanceIndicator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TQuantified</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TQuantified</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTQuantified(TQuantified object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRelation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRelation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRelation(TRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRule Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRule Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRuleAnnotation(TRuleAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRule Annotation Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRule Annotation Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRuleAnnotationClause(TRuleAnnotationClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTextAnnotation(TTextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTyped Child Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTyped Child Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTypedChildExpression(TTypedChildExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUnary Tests</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUnary Tests</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTUnaryTests(TUnaryTests object) {
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

} //DMNSwitch
