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
package org.omg.spec.dmn.dmn.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.DMNRoot;
import org.omg.spec.dmn.dmn.TArtifact;
import org.omg.spec.dmn.dmn.TAssociation;
import org.omg.spec.dmn.dmn.TAuthorityRequirement;
import org.omg.spec.dmn.dmn.TBusinessContextElement;
import org.omg.spec.dmn.dmn.TBusinessKnowledgeModel;
import org.omg.spec.dmn.dmn.TConditional;
import org.omg.spec.dmn.dmn.TContext;
import org.omg.spec.dmn.dmn.TContextEntry;
import org.omg.spec.dmn.dmn.TDMNElement;
import org.omg.spec.dmn.dmn.TDRGElement;
import org.omg.spec.dmn.dmn.TDecision;
import org.omg.spec.dmn.dmn.TDecisionService;
import org.omg.spec.dmn.dmn.TDecisionTable;
import org.omg.spec.dmn.dmn.TDefinitions;
import org.omg.spec.dmn.dmn.TElementCollection;
import org.omg.spec.dmn.dmn.TExpression;
import org.omg.spec.dmn.dmn.TFilter;
import org.omg.spec.dmn.dmn.TFor;
import org.omg.spec.dmn.dmn.TFunctionDefinition;
import org.omg.spec.dmn.dmn.TFunctionItem;
import org.omg.spec.dmn.dmn.TGroup;
import org.omg.spec.dmn.dmn.TImport;
import org.omg.spec.dmn.dmn.TInformationItem;
import org.omg.spec.dmn.dmn.TInformationRequirement;
import org.omg.spec.dmn.dmn.TInputData;
import org.omg.spec.dmn.dmn.TInvocable;
import org.omg.spec.dmn.dmn.TInvocation;
import org.omg.spec.dmn.dmn.TItemDefinition;
import org.omg.spec.dmn.dmn.TKnowledgeRequirement;
import org.omg.spec.dmn.dmn.TKnowledgeSource;
import org.omg.spec.dmn.dmn.TList;
import org.omg.spec.dmn.dmn.TLiteralExpression;
import org.omg.spec.dmn.dmn.TNamedElement;
import org.omg.spec.dmn.dmn.TOrganizationUnit;
import org.omg.spec.dmn.dmn.TPerformanceIndicator;
import org.omg.spec.dmn.dmn.TQuantified;
import org.omg.spec.dmn.dmn.TRelation;
import org.omg.spec.dmn.dmn.TTextAnnotation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDMNElement <em>DMN Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getAuthorityRequirement <em>Authority Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getBusinessContextElement <em>Business Context Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getBusinessKnowledgeModel <em>Business Knowledge Model</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getInvocable <em>Invocable</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDrgElement <em>Drg Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getNamedElement <em>Named Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getConditional <em>Conditional</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getContextEntry <em>Context Entry</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDecisionService <em>Decision Service</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDecisionTable <em>Decision Table</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getEvery <em>Every</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getFor <em>For</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getFunctionItem <em>Function Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getInformationItem <em>Information Item</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getInformationRequirement <em>Information Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getInputData <em>Input Data</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getInvocation <em>Invocation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getKnowledgeRequirement <em>Knowledge Requirement</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getKnowledgeSource <em>Knowledge Source</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getLiteralExpression <em>Literal Expression</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getOrganizationUnit <em>Organization Unit</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getPerformanceIndicator <em>Performance Indicator</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getSome <em>Some</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl#getTextAnnotation <em>Text Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DMNRootImpl extends MinimalEObjectImpl.Container implements DMNRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMNRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DMNPackage.Literals.DMN_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DMNPackage.DMN_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TArtifact getArtifact() {
		return (TArtifact)getMixed().get(DMNPackage.Literals.DMN_ROOT__ARTIFACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(TArtifact newArtifact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__ARTIFACT, newArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDMNElement getDMNElement() {
		return (TDMNElement)getMixed().get(DMNPackage.Literals.DMN_ROOT__DMN_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNElement(TDMNElement newDMNElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DMN_ELEMENT, newDMNElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation getAssociation() {
		return (TAssociation)getMixed().get(DMNPackage.Literals.DMN_ROOT__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(TAssociation newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__ASSOCIATION, newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(TAssociation newAssociation) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAuthorityRequirement getAuthorityRequirement() {
		return (TAuthorityRequirement)getMixed().get(DMNPackage.Literals.DMN_ROOT__AUTHORITY_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorityRequirement(TAuthorityRequirement newAuthorityRequirement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__AUTHORITY_REQUIREMENT, newAuthorityRequirement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorityRequirement(TAuthorityRequirement newAuthorityRequirement) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__AUTHORITY_REQUIREMENT, newAuthorityRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessContextElement getBusinessContextElement() {
		return (TBusinessContextElement)getMixed().get(DMNPackage.Literals.DMN_ROOT__BUSINESS_CONTEXT_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessContextElement(TBusinessContextElement newBusinessContextElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__BUSINESS_CONTEXT_ELEMENT, newBusinessContextElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TBusinessKnowledgeModel getBusinessKnowledgeModel() {
		return (TBusinessKnowledgeModel)getMixed().get(DMNPackage.Literals.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusinessKnowledgeModel(TBusinessKnowledgeModel newBusinessKnowledgeModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL, newBusinessKnowledgeModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBusinessKnowledgeModel(TBusinessKnowledgeModel newBusinessKnowledgeModel) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL, newBusinessKnowledgeModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInvocable getInvocable() {
		return (TInvocable)getMixed().get(DMNPackage.Literals.DMN_ROOT__INVOCABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvocable(TInvocable newInvocable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__INVOCABLE, newInvocable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDRGElement getDrgElement() {
		return (TDRGElement)getMixed().get(DMNPackage.Literals.DMN_ROOT__DRG_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDrgElement(TDRGElement newDrgElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DRG_ELEMENT, newDrgElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TNamedElement getNamedElement() {
		return (TNamedElement)getMixed().get(DMNPackage.Literals.DMN_ROOT__NAMED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamedElement(TNamedElement newNamedElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__NAMED_ELEMENT, newNamedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TConditional getConditional() {
		return (TConditional)getMixed().get(DMNPackage.Literals.DMN_ROOT__CONDITIONAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditional(TConditional newConditional, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__CONDITIONAL, newConditional, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditional(TConditional newConditional) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__CONDITIONAL, newConditional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getExpression() {
		return (TExpression)getMixed().get(DMNPackage.Literals.DMN_ROOT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TContext getContext() {
		return (TContext)getMixed().get(DMNPackage.Literals.DMN_ROOT__CONTEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContext(TContext newContext, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__CONTEXT, newContext, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(TContext newContext) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__CONTEXT, newContext);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TContextEntry getContextEntry() {
		return (TContextEntry)getMixed().get(DMNPackage.Literals.DMN_ROOT__CONTEXT_ENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextEntry(TContextEntry newContextEntry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__CONTEXT_ENTRY, newContextEntry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextEntry(TContextEntry newContextEntry) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__CONTEXT_ENTRY, newContextEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecision getDecision() {
		return (TDecision)getMixed().get(DMNPackage.Literals.DMN_ROOT__DECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(TDecision newDecision, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DECISION, newDecision, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecision(TDecision newDecision) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__DECISION, newDecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionService getDecisionService() {
		return (TDecisionService)getMixed().get(DMNPackage.Literals.DMN_ROOT__DECISION_SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionService(TDecisionService newDecisionService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DECISION_SERVICE, newDecisionService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionService(TDecisionService newDecisionService) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__DECISION_SERVICE, newDecisionService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionTable getDecisionTable() {
		return (TDecisionTable)getMixed().get(DMNPackage.Literals.DMN_ROOT__DECISION_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionTable(TDecisionTable newDecisionTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DECISION_TABLE, newDecisionTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionTable(TDecisionTable newDecisionTable) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__DECISION_TABLE, newDecisionTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions getDefinitions() {
		return (TDefinitions)getMixed().get(DMNPackage.Literals.DMN_ROOT__DEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__DEFINITIONS, newDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitions(TDefinitions newDefinitions) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__DEFINITIONS, newDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TElementCollection getElementCollection() {
		return (TElementCollection)getMixed().get(DMNPackage.Literals.DMN_ROOT__ELEMENT_COLLECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementCollection(TElementCollection newElementCollection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__ELEMENT_COLLECTION, newElementCollection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementCollection(TElementCollection newElementCollection) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__ELEMENT_COLLECTION, newElementCollection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TQuantified getEvery() {
		return (TQuantified)getMixed().get(DMNPackage.Literals.DMN_ROOT__EVERY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvery(TQuantified newEvery, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__EVERY, newEvery, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvery(TQuantified newEvery) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__EVERY, newEvery);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFilter getFilter() {
		return (TFilter)getMixed().get(DMNPackage.Literals.DMN_ROOT__FILTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(TFilter newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__FILTER, newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilter(TFilter newFilter) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__FILTER, newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFor getFor() {
		return (TFor)getMixed().get(DMNPackage.Literals.DMN_ROOT__FOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFor(TFor newFor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__FOR, newFor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFor(TFor newFor) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__FOR, newFor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionDefinition getFunctionDefinition() {
		return (TFunctionDefinition)getMixed().get(DMNPackage.Literals.DMN_ROOT__FUNCTION_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionDefinition(TFunctionDefinition newFunctionDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__FUNCTION_DEFINITION, newFunctionDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionDefinition(TFunctionDefinition newFunctionDefinition) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__FUNCTION_DEFINITION, newFunctionDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TFunctionItem getFunctionItem() {
		return (TFunctionItem)getMixed().get(DMNPackage.Literals.DMN_ROOT__FUNCTION_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionItem(TFunctionItem newFunctionItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__FUNCTION_ITEM, newFunctionItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionItem(TFunctionItem newFunctionItem) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__FUNCTION_ITEM, newFunctionItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TGroup getGroup() {
		return (TGroup)getMixed().get(DMNPackage.Literals.DMN_ROOT__GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(TGroup newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__GROUP, newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(TGroup newGroup) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport getImport() {
		return (TImport)getMixed().get(DMNPackage.Literals.DMN_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(TImport newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImport(TImport newImport) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInformationItem getInformationItem() {
		return (TInformationItem)getMixed().get(DMNPackage.Literals.DMN_ROOT__INFORMATION_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationItem(TInformationItem newInformationItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__INFORMATION_ITEM, newInformationItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformationItem(TInformationItem newInformationItem) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__INFORMATION_ITEM, newInformationItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInformationRequirement getInformationRequirement() {
		return (TInformationRequirement)getMixed().get(DMNPackage.Literals.DMN_ROOT__INFORMATION_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformationRequirement(TInformationRequirement newInformationRequirement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__INFORMATION_REQUIREMENT, newInformationRequirement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInformationRequirement(TInformationRequirement newInformationRequirement) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__INFORMATION_REQUIREMENT, newInformationRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputData getInputData() {
		return (TInputData)getMixed().get(DMNPackage.Literals.DMN_ROOT__INPUT_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputData(TInputData newInputData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__INPUT_DATA, newInputData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputData(TInputData newInputData) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__INPUT_DATA, newInputData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInvocation getInvocation() {
		return (TInvocation)getMixed().get(DMNPackage.Literals.DMN_ROOT__INVOCATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvocation(TInvocation newInvocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__INVOCATION, newInvocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvocation(TInvocation newInvocation) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__INVOCATION, newInvocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TItemDefinition getItemDefinition() {
		return (TItemDefinition)getMixed().get(DMNPackage.Literals.DMN_ROOT__ITEM_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemDefinition(TItemDefinition newItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__ITEM_DEFINITION, newItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemDefinition(TItemDefinition newItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__ITEM_DEFINITION, newItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TKnowledgeRequirement getKnowledgeRequirement() {
		return (TKnowledgeRequirement)getMixed().get(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_REQUIREMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledgeRequirement(TKnowledgeRequirement newKnowledgeRequirement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_REQUIREMENT, newKnowledgeRequirement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKnowledgeRequirement(TKnowledgeRequirement newKnowledgeRequirement) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_REQUIREMENT, newKnowledgeRequirement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TKnowledgeSource getKnowledgeSource() {
		return (TKnowledgeSource)getMixed().get(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKnowledgeSource(TKnowledgeSource newKnowledgeSource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_SOURCE, newKnowledgeSource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKnowledgeSource(TKnowledgeSource newKnowledgeSource) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__KNOWLEDGE_SOURCE, newKnowledgeSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TList getList() {
		return (TList)getMixed().get(DMNPackage.Literals.DMN_ROOT__LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(TList newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__LIST, newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setList(TList newList) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__LIST, newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLiteralExpression getLiteralExpression() {
		return (TLiteralExpression)getMixed().get(DMNPackage.Literals.DMN_ROOT__LITERAL_EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteralExpression(TLiteralExpression newLiteralExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__LITERAL_EXPRESSION, newLiteralExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLiteralExpression(TLiteralExpression newLiteralExpression) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__LITERAL_EXPRESSION, newLiteralExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOrganizationUnit getOrganizationUnit() {
		return (TOrganizationUnit)getMixed().get(DMNPackage.Literals.DMN_ROOT__ORGANIZATION_UNIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganizationUnit(TOrganizationUnit newOrganizationUnit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__ORGANIZATION_UNIT, newOrganizationUnit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganizationUnit(TOrganizationUnit newOrganizationUnit) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__ORGANIZATION_UNIT, newOrganizationUnit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPerformanceIndicator getPerformanceIndicator() {
		return (TPerformanceIndicator)getMixed().get(DMNPackage.Literals.DMN_ROOT__PERFORMANCE_INDICATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformanceIndicator(TPerformanceIndicator newPerformanceIndicator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__PERFORMANCE_INDICATOR, newPerformanceIndicator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformanceIndicator(TPerformanceIndicator newPerformanceIndicator) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__PERFORMANCE_INDICATOR, newPerformanceIndicator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelation getRelation() {
		return (TRelation)getMixed().get(DMNPackage.Literals.DMN_ROOT__RELATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelation(TRelation newRelation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__RELATION, newRelation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelation(TRelation newRelation) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__RELATION, newRelation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TQuantified getSome() {
		return (TQuantified)getMixed().get(DMNPackage.Literals.DMN_ROOT__SOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSome(TQuantified newSome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__SOME, newSome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSome(TQuantified newSome) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__SOME, newSome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation getTextAnnotation() {
		return (TTextAnnotation)getMixed().get(DMNPackage.Literals.DMN_ROOT__TEXT_ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextAnnotation(TTextAnnotation newTextAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DMNPackage.Literals.DMN_ROOT__TEXT_ANNOTATION, newTextAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextAnnotation(TTextAnnotation newTextAnnotation) {
		((FeatureMap.Internal)getMixed()).set(DMNPackage.Literals.DMN_ROOT__TEXT_ANNOTATION, newTextAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.DMN_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DMNPackage.DMN_ROOT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case DMNPackage.DMN_ROOT__DMN_ELEMENT:
				return basicSetDMNElement(null, msgs);
			case DMNPackage.DMN_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case DMNPackage.DMN_ROOT__AUTHORITY_REQUIREMENT:
				return basicSetAuthorityRequirement(null, msgs);
			case DMNPackage.DMN_ROOT__BUSINESS_CONTEXT_ELEMENT:
				return basicSetBusinessContextElement(null, msgs);
			case DMNPackage.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL:
				return basicSetBusinessKnowledgeModel(null, msgs);
			case DMNPackage.DMN_ROOT__INVOCABLE:
				return basicSetInvocable(null, msgs);
			case DMNPackage.DMN_ROOT__DRG_ELEMENT:
				return basicSetDrgElement(null, msgs);
			case DMNPackage.DMN_ROOT__NAMED_ELEMENT:
				return basicSetNamedElement(null, msgs);
			case DMNPackage.DMN_ROOT__CONDITIONAL:
				return basicSetConditional(null, msgs);
			case DMNPackage.DMN_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case DMNPackage.DMN_ROOT__CONTEXT:
				return basicSetContext(null, msgs);
			case DMNPackage.DMN_ROOT__CONTEXT_ENTRY:
				return basicSetContextEntry(null, msgs);
			case DMNPackage.DMN_ROOT__DECISION:
				return basicSetDecision(null, msgs);
			case DMNPackage.DMN_ROOT__DECISION_SERVICE:
				return basicSetDecisionService(null, msgs);
			case DMNPackage.DMN_ROOT__DECISION_TABLE:
				return basicSetDecisionTable(null, msgs);
			case DMNPackage.DMN_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case DMNPackage.DMN_ROOT__ELEMENT_COLLECTION:
				return basicSetElementCollection(null, msgs);
			case DMNPackage.DMN_ROOT__EVERY:
				return basicSetEvery(null, msgs);
			case DMNPackage.DMN_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case DMNPackage.DMN_ROOT__FOR:
				return basicSetFor(null, msgs);
			case DMNPackage.DMN_ROOT__FUNCTION_DEFINITION:
				return basicSetFunctionDefinition(null, msgs);
			case DMNPackage.DMN_ROOT__FUNCTION_ITEM:
				return basicSetFunctionItem(null, msgs);
			case DMNPackage.DMN_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case DMNPackage.DMN_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case DMNPackage.DMN_ROOT__INFORMATION_ITEM:
				return basicSetInformationItem(null, msgs);
			case DMNPackage.DMN_ROOT__INFORMATION_REQUIREMENT:
				return basicSetInformationRequirement(null, msgs);
			case DMNPackage.DMN_ROOT__INPUT_DATA:
				return basicSetInputData(null, msgs);
			case DMNPackage.DMN_ROOT__INVOCATION:
				return basicSetInvocation(null, msgs);
			case DMNPackage.DMN_ROOT__ITEM_DEFINITION:
				return basicSetItemDefinition(null, msgs);
			case DMNPackage.DMN_ROOT__KNOWLEDGE_REQUIREMENT:
				return basicSetKnowledgeRequirement(null, msgs);
			case DMNPackage.DMN_ROOT__KNOWLEDGE_SOURCE:
				return basicSetKnowledgeSource(null, msgs);
			case DMNPackage.DMN_ROOT__LIST:
				return basicSetList(null, msgs);
			case DMNPackage.DMN_ROOT__LITERAL_EXPRESSION:
				return basicSetLiteralExpression(null, msgs);
			case DMNPackage.DMN_ROOT__ORGANIZATION_UNIT:
				return basicSetOrganizationUnit(null, msgs);
			case DMNPackage.DMN_ROOT__PERFORMANCE_INDICATOR:
				return basicSetPerformanceIndicator(null, msgs);
			case DMNPackage.DMN_ROOT__RELATION:
				return basicSetRelation(null, msgs);
			case DMNPackage.DMN_ROOT__SOME:
				return basicSetSome(null, msgs);
			case DMNPackage.DMN_ROOT__TEXT_ANNOTATION:
				return basicSetTextAnnotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DMNPackage.DMN_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DMNPackage.DMN_ROOT__ARTIFACT:
				return getArtifact();
			case DMNPackage.DMN_ROOT__DMN_ELEMENT:
				return getDMNElement();
			case DMNPackage.DMN_ROOT__ASSOCIATION:
				return getAssociation();
			case DMNPackage.DMN_ROOT__AUTHORITY_REQUIREMENT:
				return getAuthorityRequirement();
			case DMNPackage.DMN_ROOT__BUSINESS_CONTEXT_ELEMENT:
				return getBusinessContextElement();
			case DMNPackage.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL:
				return getBusinessKnowledgeModel();
			case DMNPackage.DMN_ROOT__INVOCABLE:
				return getInvocable();
			case DMNPackage.DMN_ROOT__DRG_ELEMENT:
				return getDrgElement();
			case DMNPackage.DMN_ROOT__NAMED_ELEMENT:
				return getNamedElement();
			case DMNPackage.DMN_ROOT__CONDITIONAL:
				return getConditional();
			case DMNPackage.DMN_ROOT__EXPRESSION:
				return getExpression();
			case DMNPackage.DMN_ROOT__CONTEXT:
				return getContext();
			case DMNPackage.DMN_ROOT__CONTEXT_ENTRY:
				return getContextEntry();
			case DMNPackage.DMN_ROOT__DECISION:
				return getDecision();
			case DMNPackage.DMN_ROOT__DECISION_SERVICE:
				return getDecisionService();
			case DMNPackage.DMN_ROOT__DECISION_TABLE:
				return getDecisionTable();
			case DMNPackage.DMN_ROOT__DEFINITIONS:
				return getDefinitions();
			case DMNPackage.DMN_ROOT__ELEMENT_COLLECTION:
				return getElementCollection();
			case DMNPackage.DMN_ROOT__EVERY:
				return getEvery();
			case DMNPackage.DMN_ROOT__FILTER:
				return getFilter();
			case DMNPackage.DMN_ROOT__FOR:
				return getFor();
			case DMNPackage.DMN_ROOT__FUNCTION_DEFINITION:
				return getFunctionDefinition();
			case DMNPackage.DMN_ROOT__FUNCTION_ITEM:
				return getFunctionItem();
			case DMNPackage.DMN_ROOT__GROUP:
				return getGroup();
			case DMNPackage.DMN_ROOT__IMPORT:
				return getImport();
			case DMNPackage.DMN_ROOT__INFORMATION_ITEM:
				return getInformationItem();
			case DMNPackage.DMN_ROOT__INFORMATION_REQUIREMENT:
				return getInformationRequirement();
			case DMNPackage.DMN_ROOT__INPUT_DATA:
				return getInputData();
			case DMNPackage.DMN_ROOT__INVOCATION:
				return getInvocation();
			case DMNPackage.DMN_ROOT__ITEM_DEFINITION:
				return getItemDefinition();
			case DMNPackage.DMN_ROOT__KNOWLEDGE_REQUIREMENT:
				return getKnowledgeRequirement();
			case DMNPackage.DMN_ROOT__KNOWLEDGE_SOURCE:
				return getKnowledgeSource();
			case DMNPackage.DMN_ROOT__LIST:
				return getList();
			case DMNPackage.DMN_ROOT__LITERAL_EXPRESSION:
				return getLiteralExpression();
			case DMNPackage.DMN_ROOT__ORGANIZATION_UNIT:
				return getOrganizationUnit();
			case DMNPackage.DMN_ROOT__PERFORMANCE_INDICATOR:
				return getPerformanceIndicator();
			case DMNPackage.DMN_ROOT__RELATION:
				return getRelation();
			case DMNPackage.DMN_ROOT__SOME:
				return getSome();
			case DMNPackage.DMN_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DMNPackage.DMN_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DMNPackage.DMN_ROOT__ASSOCIATION:
				setAssociation((TAssociation)newValue);
				return;
			case DMNPackage.DMN_ROOT__AUTHORITY_REQUIREMENT:
				setAuthorityRequirement((TAuthorityRequirement)newValue);
				return;
			case DMNPackage.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL:
				setBusinessKnowledgeModel((TBusinessKnowledgeModel)newValue);
				return;
			case DMNPackage.DMN_ROOT__CONDITIONAL:
				setConditional((TConditional)newValue);
				return;
			case DMNPackage.DMN_ROOT__CONTEXT:
				setContext((TContext)newValue);
				return;
			case DMNPackage.DMN_ROOT__CONTEXT_ENTRY:
				setContextEntry((TContextEntry)newValue);
				return;
			case DMNPackage.DMN_ROOT__DECISION:
				setDecision((TDecision)newValue);
				return;
			case DMNPackage.DMN_ROOT__DECISION_SERVICE:
				setDecisionService((TDecisionService)newValue);
				return;
			case DMNPackage.DMN_ROOT__DECISION_TABLE:
				setDecisionTable((TDecisionTable)newValue);
				return;
			case DMNPackage.DMN_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)newValue);
				return;
			case DMNPackage.DMN_ROOT__ELEMENT_COLLECTION:
				setElementCollection((TElementCollection)newValue);
				return;
			case DMNPackage.DMN_ROOT__EVERY:
				setEvery((TQuantified)newValue);
				return;
			case DMNPackage.DMN_ROOT__FILTER:
				setFilter((TFilter)newValue);
				return;
			case DMNPackage.DMN_ROOT__FOR:
				setFor((TFor)newValue);
				return;
			case DMNPackage.DMN_ROOT__FUNCTION_DEFINITION:
				setFunctionDefinition((TFunctionDefinition)newValue);
				return;
			case DMNPackage.DMN_ROOT__FUNCTION_ITEM:
				setFunctionItem((TFunctionItem)newValue);
				return;
			case DMNPackage.DMN_ROOT__GROUP:
				setGroup((TGroup)newValue);
				return;
			case DMNPackage.DMN_ROOT__IMPORT:
				setImport((TImport)newValue);
				return;
			case DMNPackage.DMN_ROOT__INFORMATION_ITEM:
				setInformationItem((TInformationItem)newValue);
				return;
			case DMNPackage.DMN_ROOT__INFORMATION_REQUIREMENT:
				setInformationRequirement((TInformationRequirement)newValue);
				return;
			case DMNPackage.DMN_ROOT__INPUT_DATA:
				setInputData((TInputData)newValue);
				return;
			case DMNPackage.DMN_ROOT__INVOCATION:
				setInvocation((TInvocation)newValue);
				return;
			case DMNPackage.DMN_ROOT__ITEM_DEFINITION:
				setItemDefinition((TItemDefinition)newValue);
				return;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_REQUIREMENT:
				setKnowledgeRequirement((TKnowledgeRequirement)newValue);
				return;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_SOURCE:
				setKnowledgeSource((TKnowledgeSource)newValue);
				return;
			case DMNPackage.DMN_ROOT__LIST:
				setList((TList)newValue);
				return;
			case DMNPackage.DMN_ROOT__LITERAL_EXPRESSION:
				setLiteralExpression((TLiteralExpression)newValue);
				return;
			case DMNPackage.DMN_ROOT__ORGANIZATION_UNIT:
				setOrganizationUnit((TOrganizationUnit)newValue);
				return;
			case DMNPackage.DMN_ROOT__PERFORMANCE_INDICATOR:
				setPerformanceIndicator((TPerformanceIndicator)newValue);
				return;
			case DMNPackage.DMN_ROOT__RELATION:
				setRelation((TRelation)newValue);
				return;
			case DMNPackage.DMN_ROOT__SOME:
				setSome((TQuantified)newValue);
				return;
			case DMNPackage.DMN_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DMNPackage.DMN_ROOT__MIXED:
				getMixed().clear();
				return;
			case DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DMNPackage.DMN_ROOT__ASSOCIATION:
				setAssociation((TAssociation)null);
				return;
			case DMNPackage.DMN_ROOT__AUTHORITY_REQUIREMENT:
				setAuthorityRequirement((TAuthorityRequirement)null);
				return;
			case DMNPackage.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL:
				setBusinessKnowledgeModel((TBusinessKnowledgeModel)null);
				return;
			case DMNPackage.DMN_ROOT__CONDITIONAL:
				setConditional((TConditional)null);
				return;
			case DMNPackage.DMN_ROOT__CONTEXT:
				setContext((TContext)null);
				return;
			case DMNPackage.DMN_ROOT__CONTEXT_ENTRY:
				setContextEntry((TContextEntry)null);
				return;
			case DMNPackage.DMN_ROOT__DECISION:
				setDecision((TDecision)null);
				return;
			case DMNPackage.DMN_ROOT__DECISION_SERVICE:
				setDecisionService((TDecisionService)null);
				return;
			case DMNPackage.DMN_ROOT__DECISION_TABLE:
				setDecisionTable((TDecisionTable)null);
				return;
			case DMNPackage.DMN_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)null);
				return;
			case DMNPackage.DMN_ROOT__ELEMENT_COLLECTION:
				setElementCollection((TElementCollection)null);
				return;
			case DMNPackage.DMN_ROOT__EVERY:
				setEvery((TQuantified)null);
				return;
			case DMNPackage.DMN_ROOT__FILTER:
				setFilter((TFilter)null);
				return;
			case DMNPackage.DMN_ROOT__FOR:
				setFor((TFor)null);
				return;
			case DMNPackage.DMN_ROOT__FUNCTION_DEFINITION:
				setFunctionDefinition((TFunctionDefinition)null);
				return;
			case DMNPackage.DMN_ROOT__FUNCTION_ITEM:
				setFunctionItem((TFunctionItem)null);
				return;
			case DMNPackage.DMN_ROOT__GROUP:
				setGroup((TGroup)null);
				return;
			case DMNPackage.DMN_ROOT__IMPORT:
				setImport((TImport)null);
				return;
			case DMNPackage.DMN_ROOT__INFORMATION_ITEM:
				setInformationItem((TInformationItem)null);
				return;
			case DMNPackage.DMN_ROOT__INFORMATION_REQUIREMENT:
				setInformationRequirement((TInformationRequirement)null);
				return;
			case DMNPackage.DMN_ROOT__INPUT_DATA:
				setInputData((TInputData)null);
				return;
			case DMNPackage.DMN_ROOT__INVOCATION:
				setInvocation((TInvocation)null);
				return;
			case DMNPackage.DMN_ROOT__ITEM_DEFINITION:
				setItemDefinition((TItemDefinition)null);
				return;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_REQUIREMENT:
				setKnowledgeRequirement((TKnowledgeRequirement)null);
				return;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_SOURCE:
				setKnowledgeSource((TKnowledgeSource)null);
				return;
			case DMNPackage.DMN_ROOT__LIST:
				setList((TList)null);
				return;
			case DMNPackage.DMN_ROOT__LITERAL_EXPRESSION:
				setLiteralExpression((TLiteralExpression)null);
				return;
			case DMNPackage.DMN_ROOT__ORGANIZATION_UNIT:
				setOrganizationUnit((TOrganizationUnit)null);
				return;
			case DMNPackage.DMN_ROOT__PERFORMANCE_INDICATOR:
				setPerformanceIndicator((TPerformanceIndicator)null);
				return;
			case DMNPackage.DMN_ROOT__RELATION:
				setRelation((TRelation)null);
				return;
			case DMNPackage.DMN_ROOT__SOME:
				setSome((TQuantified)null);
				return;
			case DMNPackage.DMN_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DMNPackage.DMN_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DMNPackage.DMN_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DMNPackage.DMN_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DMNPackage.DMN_ROOT__ARTIFACT:
				return getArtifact() != null;
			case DMNPackage.DMN_ROOT__DMN_ELEMENT:
				return getDMNElement() != null;
			case DMNPackage.DMN_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case DMNPackage.DMN_ROOT__AUTHORITY_REQUIREMENT:
				return getAuthorityRequirement() != null;
			case DMNPackage.DMN_ROOT__BUSINESS_CONTEXT_ELEMENT:
				return getBusinessContextElement() != null;
			case DMNPackage.DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL:
				return getBusinessKnowledgeModel() != null;
			case DMNPackage.DMN_ROOT__INVOCABLE:
				return getInvocable() != null;
			case DMNPackage.DMN_ROOT__DRG_ELEMENT:
				return getDrgElement() != null;
			case DMNPackage.DMN_ROOT__NAMED_ELEMENT:
				return getNamedElement() != null;
			case DMNPackage.DMN_ROOT__CONDITIONAL:
				return getConditional() != null;
			case DMNPackage.DMN_ROOT__EXPRESSION:
				return getExpression() != null;
			case DMNPackage.DMN_ROOT__CONTEXT:
				return getContext() != null;
			case DMNPackage.DMN_ROOT__CONTEXT_ENTRY:
				return getContextEntry() != null;
			case DMNPackage.DMN_ROOT__DECISION:
				return getDecision() != null;
			case DMNPackage.DMN_ROOT__DECISION_SERVICE:
				return getDecisionService() != null;
			case DMNPackage.DMN_ROOT__DECISION_TABLE:
				return getDecisionTable() != null;
			case DMNPackage.DMN_ROOT__DEFINITIONS:
				return getDefinitions() != null;
			case DMNPackage.DMN_ROOT__ELEMENT_COLLECTION:
				return getElementCollection() != null;
			case DMNPackage.DMN_ROOT__EVERY:
				return getEvery() != null;
			case DMNPackage.DMN_ROOT__FILTER:
				return getFilter() != null;
			case DMNPackage.DMN_ROOT__FOR:
				return getFor() != null;
			case DMNPackage.DMN_ROOT__FUNCTION_DEFINITION:
				return getFunctionDefinition() != null;
			case DMNPackage.DMN_ROOT__FUNCTION_ITEM:
				return getFunctionItem() != null;
			case DMNPackage.DMN_ROOT__GROUP:
				return getGroup() != null;
			case DMNPackage.DMN_ROOT__IMPORT:
				return getImport() != null;
			case DMNPackage.DMN_ROOT__INFORMATION_ITEM:
				return getInformationItem() != null;
			case DMNPackage.DMN_ROOT__INFORMATION_REQUIREMENT:
				return getInformationRequirement() != null;
			case DMNPackage.DMN_ROOT__INPUT_DATA:
				return getInputData() != null;
			case DMNPackage.DMN_ROOT__INVOCATION:
				return getInvocation() != null;
			case DMNPackage.DMN_ROOT__ITEM_DEFINITION:
				return getItemDefinition() != null;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_REQUIREMENT:
				return getKnowledgeRequirement() != null;
			case DMNPackage.DMN_ROOT__KNOWLEDGE_SOURCE:
				return getKnowledgeSource() != null;
			case DMNPackage.DMN_ROOT__LIST:
				return getList() != null;
			case DMNPackage.DMN_ROOT__LITERAL_EXPRESSION:
				return getLiteralExpression() != null;
			case DMNPackage.DMN_ROOT__ORGANIZATION_UNIT:
				return getOrganizationUnit() != null;
			case DMNPackage.DMN_ROOT__PERFORMANCE_INDICATOR:
				return getPerformanceIndicator() != null;
			case DMNPackage.DMN_ROOT__RELATION:
				return getRelation() != null;
			case DMNPackage.DMN_ROOT__SOME:
				return getSome() != null;
			case DMNPackage.DMN_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DMNRootImpl
