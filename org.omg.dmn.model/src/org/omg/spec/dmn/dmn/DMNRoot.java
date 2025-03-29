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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDMNElement <em>DMN Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getBusinessContextElement <em>Business Context Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getBusinessKnowledgeModel <em>Business Knowledge Model</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getInvocable <em>Invocable</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDrgElement <em>Drg Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getContext <em>Context</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getContextEntry <em>Context Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionService <em>Decision Service</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionTable <em>Decision Table</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getEvery <em>Every</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getFor <em>For</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionItem <em>Function Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationItem <em>Information Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationRequirement <em>Information Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getInputData <em>Input Data</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeSource <em>Knowledge Source</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getList <em>List</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getLiteralExpression <em>Literal Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getPerformanceIndicator <em>Performance Indicator</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getSome <em>Some</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.DMNRoot#getTextAnnotation <em>Text Annotation</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DMNRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Artifact()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='artifact' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TArtifact getArtifact();

	/**
	 * Returns the value of the '<em><b>DMN Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DMN Element</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_DMNElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DMNElement' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElement getDMNElement();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association</em>' containment reference.
	 * @see #setAssociation(TAssociation)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Association()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='association' namespace='##targetNamespace' affiliation='artifact'"
	 * @generated
	 */
	TAssociation getAssociation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getAssociation <em>Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' containment reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(TAssociation value);

	/**
	 * Returns the value of the '<em><b>Authority Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authority Requirement</em>' containment reference.
	 * @see #setAuthorityRequirement(TAuthorityRequirement)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_AuthorityRequirement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='authorityRequirement' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TAuthorityRequirement getAuthorityRequirement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getAuthorityRequirement <em>Authority Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority Requirement</em>' containment reference.
	 * @see #getAuthorityRequirement()
	 * @generated
	 */
	void setAuthorityRequirement(TAuthorityRequirement value);

	/**
	 * Returns the value of the '<em><b>Business Context Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Context Element</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_BusinessContextElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='businessContextElement' namespace='##targetNamespace'"
	 * @generated
	 */
	TBusinessContextElement getBusinessContextElement();

	/**
	 * Returns the value of the '<em><b>Business Knowledge Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Knowledge Model</em>' containment reference.
	 * @see #setBusinessKnowledgeModel(TBusinessKnowledgeModel)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_BusinessKnowledgeModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='businessKnowledgeModel' namespace='##targetNamespace' affiliation='invocable'"
	 * @generated
	 */
	TBusinessKnowledgeModel getBusinessKnowledgeModel();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getBusinessKnowledgeModel <em>Business Knowledge Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Knowledge Model</em>' containment reference.
	 * @see #getBusinessKnowledgeModel()
	 * @generated
	 */
	void setBusinessKnowledgeModel(TBusinessKnowledgeModel value);

	/**
	 * Returns the value of the '<em><b>Invocable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocable</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Invocable()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='invocable' namespace='##targetNamespace' affiliation='drgElement'"
	 * @generated
	 */
	TInvocable getInvocable();

	/**
	 * Returns the value of the '<em><b>Drg Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drg Element</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_DrgElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='drgElement' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TDRGElement getDrgElement();

	/**
	 * Returns the value of the '<em><b>Named Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Element</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_NamedElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='namedElement' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TNamedElement getNamedElement();

	/**
	 * Returns the value of the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditional</em>' containment reference.
	 * @see #setConditional(TConditional)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Conditional()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='conditional' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TConditional getConditional();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getConditional <em>Conditional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditional</em>' containment reference.
	 * @see #getConditional()
	 * @generated
	 */
	void setConditional(TConditional value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Expression()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	TExpression getExpression();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(TContext)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Context()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TContext getContext();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(TContext value);

	/**
	 * Returns the value of the '<em><b>Context Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Entry</em>' containment reference.
	 * @see #setContextEntry(TContextEntry)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_ContextEntry()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='contextEntry' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TContextEntry getContextEntry();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getContextEntry <em>Context Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Entry</em>' containment reference.
	 * @see #getContextEntry()
	 * @generated
	 */
	void setContextEntry(TContextEntry value);

	/**
	 * Returns the value of the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision</em>' containment reference.
	 * @see #setDecision(TDecision)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Decision()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decision' namespace='##targetNamespace' affiliation='drgElement'"
	 * @generated
	 */
	TDecision getDecision();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecision <em>Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision</em>' containment reference.
	 * @see #getDecision()
	 * @generated
	 */
	void setDecision(TDecision value);

	/**
	 * Returns the value of the '<em><b>Decision Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Service</em>' containment reference.
	 * @see #setDecisionService(TDecisionService)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_DecisionService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decisionService' namespace='##targetNamespace' affiliation='invocable'"
	 * @generated
	 */
	TDecisionService getDecisionService();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionService <em>Decision Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Service</em>' containment reference.
	 * @see #getDecisionService()
	 * @generated
	 */
	void setDecisionService(TDecisionService value);

	/**
	 * Returns the value of the '<em><b>Decision Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decision Table</em>' containment reference.
	 * @see #setDecisionTable(TDecisionTable)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_DecisionTable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decisionTable' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TDecisionTable getDecisionTable();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionTable <em>Decision Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decision Table</em>' containment reference.
	 * @see #getDecisionTable()
	 * @generated
	 */
	void setDecisionTable(TDecisionTable value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(TDefinitions)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Definitions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='definitions' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TDefinitions getDefinitions();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(TDefinitions value);

	/**
	 * Returns the value of the '<em><b>Element Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Collection</em>' containment reference.
	 * @see #setElementCollection(TElementCollection)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_ElementCollection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='elementCollection' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TElementCollection getElementCollection();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getElementCollection <em>Element Collection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Collection</em>' containment reference.
	 * @see #getElementCollection()
	 * @generated
	 */
	void setElementCollection(TElementCollection value);

	/**
	 * Returns the value of the '<em><b>Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Every</em>' containment reference.
	 * @see #setEvery(TQuantified)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Every()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='every' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TQuantified getEvery();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getEvery <em>Every</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Every</em>' containment reference.
	 * @see #getEvery()
	 * @generated
	 */
	void setEvery(TQuantified value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(TFilter)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TFilter getFilter();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(TFilter value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' containment reference.
	 * @see #setFor(TFor)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_For()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='for' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TFor getFor();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getFor <em>For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>For</em>' containment reference.
	 * @see #getFor()
	 * @generated
	 */
	void setFor(TFor value);

	/**
	 * Returns the value of the '<em><b>Function Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Definition</em>' containment reference.
	 * @see #setFunctionDefinition(TFunctionDefinition)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_FunctionDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='functionDefinition' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TFunctionDefinition getFunctionDefinition();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionDefinition <em>Function Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Definition</em>' containment reference.
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	void setFunctionDefinition(TFunctionDefinition value);

	/**
	 * Returns the value of the '<em><b>Function Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Item</em>' containment reference.
	 * @see #setFunctionItem(TFunctionItem)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_FunctionItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='functionItem' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TFunctionItem getFunctionItem();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionItem <em>Function Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Item</em>' containment reference.
	 * @see #getFunctionItem()
	 * @generated
	 */
	void setFunctionItem(TFunctionItem value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(TGroup)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' affiliation='artifact'"
	 * @generated
	 */
	TGroup getGroup();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(TGroup value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' containment reference.
	 * @see #setImport(TImport)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Import()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='import' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TImport getImport();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getImport <em>Import</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' containment reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(TImport value);

	/**
	 * Returns the value of the '<em><b>Information Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Item</em>' containment reference.
	 * @see #setInformationItem(TInformationItem)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_InformationItem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informationItem' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TInformationItem getInformationItem();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationItem <em>Information Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Item</em>' containment reference.
	 * @see #getInformationItem()
	 * @generated
	 */
	void setInformationItem(TInformationItem value);

	/**
	 * Returns the value of the '<em><b>Information Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Information Requirement</em>' containment reference.
	 * @see #setInformationRequirement(TInformationRequirement)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_InformationRequirement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='informationRequirement' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TInformationRequirement getInformationRequirement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationRequirement <em>Information Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Information Requirement</em>' containment reference.
	 * @see #getInformationRequirement()
	 * @generated
	 */
	void setInformationRequirement(TInformationRequirement value);

	/**
	 * Returns the value of the '<em><b>Input Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Data</em>' containment reference.
	 * @see #setInputData(TInputData)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_InputData()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inputData' namespace='##targetNamespace' affiliation='drgElement'"
	 * @generated
	 */
	TInputData getInputData();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getInputData <em>Input Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Data</em>' containment reference.
	 * @see #getInputData()
	 * @generated
	 */
	void setInputData(TInputData value);

	/**
	 * Returns the value of the '<em><b>Invocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation</em>' containment reference.
	 * @see #setInvocation(TInvocation)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Invocation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='invocation' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TInvocation getInvocation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getInvocation <em>Invocation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation</em>' containment reference.
	 * @see #getInvocation()
	 * @generated
	 */
	void setInvocation(TInvocation value);

	/**
	 * Returns the value of the '<em><b>Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Definition</em>' containment reference.
	 * @see #setItemDefinition(TItemDefinition)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_ItemDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='itemDefinition' namespace='##targetNamespace' affiliation='namedElement'"
	 * @generated
	 */
	TItemDefinition getItemDefinition();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getItemDefinition <em>Item Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Definition</em>' containment reference.
	 * @see #getItemDefinition()
	 * @generated
	 */
	void setItemDefinition(TItemDefinition value);

	/**
	 * Returns the value of the '<em><b>Knowledge Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Requirement</em>' containment reference.
	 * @see #setKnowledgeRequirement(TKnowledgeRequirement)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_KnowledgeRequirement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='knowledgeRequirement' namespace='##targetNamespace' affiliation='DMNElement'"
	 * @generated
	 */
	TKnowledgeRequirement getKnowledgeRequirement();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeRequirement <em>Knowledge Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Requirement</em>' containment reference.
	 * @see #getKnowledgeRequirement()
	 * @generated
	 */
	void setKnowledgeRequirement(TKnowledgeRequirement value);

	/**
	 * Returns the value of the '<em><b>Knowledge Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knowledge Source</em>' containment reference.
	 * @see #setKnowledgeSource(TKnowledgeSource)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_KnowledgeSource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='knowledgeSource' namespace='##targetNamespace' affiliation='drgElement'"
	 * @generated
	 */
	TKnowledgeSource getKnowledgeSource();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeSource <em>Knowledge Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knowledge Source</em>' containment reference.
	 * @see #getKnowledgeSource()
	 * @generated
	 */
	void setKnowledgeSource(TKnowledgeSource value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(TList)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TList getList();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(TList value);

	/**
	 * Returns the value of the '<em><b>Literal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Expression</em>' containment reference.
	 * @see #setLiteralExpression(TLiteralExpression)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_LiteralExpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='literalExpression' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TLiteralExpression getLiteralExpression();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getLiteralExpression <em>Literal Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Expression</em>' containment reference.
	 * @see #getLiteralExpression()
	 * @generated
	 */
	void setLiteralExpression(TLiteralExpression value);

	/**
	 * Returns the value of the '<em><b>Organization Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organization Unit</em>' containment reference.
	 * @see #setOrganizationUnit(TOrganizationUnit)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_OrganizationUnit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='organizationUnit' namespace='##targetNamespace' affiliation='businessContextElement'"
	 * @generated
	 */
	TOrganizationUnit getOrganizationUnit();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getOrganizationUnit <em>Organization Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Unit</em>' containment reference.
	 * @see #getOrganizationUnit()
	 * @generated
	 */
	void setOrganizationUnit(TOrganizationUnit value);

	/**
	 * Returns the value of the '<em><b>Performance Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Indicator</em>' containment reference.
	 * @see #setPerformanceIndicator(TPerformanceIndicator)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_PerformanceIndicator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='performanceIndicator' namespace='##targetNamespace' affiliation='businessContextElement'"
	 * @generated
	 */
	TPerformanceIndicator getPerformanceIndicator();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getPerformanceIndicator <em>Performance Indicator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance Indicator</em>' containment reference.
	 * @see #getPerformanceIndicator()
	 * @generated
	 */
	void setPerformanceIndicator(TPerformanceIndicator value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference.
	 * @see #setRelation(TRelation)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Relation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='relation' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TRelation getRelation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getRelation <em>Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' containment reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(TRelation value);

	/**
	 * Returns the value of the '<em><b>Some</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some</em>' containment reference.
	 * @see #setSome(TQuantified)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_Some()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='some' namespace='##targetNamespace' affiliation='expression'"
	 * @generated
	 */
	TQuantified getSome();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getSome <em>Some</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some</em>' containment reference.
	 * @see #getSome()
	 * @generated
	 */
	void setSome(TQuantified value);

	/**
	 * Returns the value of the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Annotation</em>' containment reference.
	 * @see #setTextAnnotation(TTextAnnotation)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getDMNRoot_TextAnnotation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='textAnnotation' namespace='##targetNamespace' affiliation='artifact'"
	 * @generated
	 */
	TTextAnnotation getTextAnnotation();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.DMNRoot#getTextAnnotation <em>Text Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Annotation</em>' containment reference.
	 * @see #getTextAnnotation()
	 * @generated
	 */
	void setTextAnnotation(TTextAnnotation value);

} // DMNRoot
