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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TDefinitions;
import org.omg.spec.bpmn.bpmn.TExtension;
import org.omg.spec.bpmn.bpmn.TImport;
import org.omg.spec.bpmn.bpmn.TRelationship;
import org.omg.spec.bpmn.bpmn.TRootElement;

import org.omg.spec.bpmn.di.BPMNDiagram;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getRootElementGroup <em>Root Element Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getBPMNDiagram <em>BPMN Diagram</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDefinitionsImpl extends MinimalEObjectImpl.Container implements TDefinitions {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<TImport> import_;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected EList<TExtension> extension;

	/**
	 * The cached value of the '{@link #getRootElementGroup() <em>Root Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap rootElementGroup;

	/**
	 * The cached value of the '{@link #getBPMNDiagram() <em>BPMN Diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPMNDiagram()
	 * @generated
	 * @ordered
	 */
	protected EList<BPMNDiagram> bPMNDiagram;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<TRelationship> relationship;

	/**
	 * The default value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporter() <em>Exporter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporter()
	 * @generated
	 * @ordered
	 */
	protected String exporter = EXPORTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORTER_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExporterVersion() <em>Exporter Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExporterVersion()
	 * @generated
	 * @ordered
	 */
	protected String exporterVersion = EXPORTER_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "http://www.w3.org/1999/XPath";

	/**
	 * The cached value of the '{@link #getExpressionLanguage() <em>Expression Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionLanguage()
	 * @generated
	 * @ordered
	 */
	protected String expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Expression Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expressionLanguageESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LANGUAGE_EDEFAULT = "http://www.w3.org/2001/XMLSchema";

	/**
	 * The cached value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected String typeLanguage = TYPE_LANGUAGE_EDEFAULT;

	/**
	 * This is true if the Type Language attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeLanguageESet;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTDefinitions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TImport> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<TImport>(TImport.class, this, BPMNPackage.TDEFINITIONS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TExtension> getExtension() {
		if (extension == null) {
			extension = new EObjectContainmentEList<TExtension>(TExtension.class, this, BPMNPackage.TDEFINITIONS__EXTENSION);
		}
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getRootElementGroup() {
		if (rootElementGroup == null) {
			rootElementGroup = new BasicFeatureMap(this, BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP);
		}
		return rootElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRootElement> getRootElement() {
		return getRootElementGroup().list(BPMNPackage.eINSTANCE.getTDefinitions_RootElement());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BPMNDiagram> getBPMNDiagram() {
		if (bPMNDiagram == null) {
			bPMNDiagram = new EObjectContainmentEList<BPMNDiagram>(BPMNDiagram.class, this, BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM);
		}
		return bPMNDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TRelationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectContainmentEList<TRelationship>(TRelationship.class, this, BPMNPackage.TDEFINITIONS__RELATIONSHIP);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporter() {
		return exporter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporter(String newExporter) {
		String oldExporter = exporter;
		exporter = newExporter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__EXPORTER, oldExporter, exporter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExporterVersion() {
		return exporterVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExporterVersion(String newExporterVersion) {
		String oldExporterVersion = exporterVersion;
		exporterVersion = newExporterVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__EXPORTER_VERSION, oldExporterVersion, exporterVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionLanguage() {
		return expressionLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionLanguage(String newExpressionLanguage) {
		String oldExpressionLanguage = expressionLanguage;
		expressionLanguage = newExpressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExpressionLanguage() {
		String oldExpressionLanguage = expressionLanguage;
		boolean oldExpressionLanguageESet = expressionLanguageESet;
		expressionLanguage = EXPRESSION_LANGUAGE_EDEFAULT;
		expressionLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExpressionLanguage() {
		return expressionLanguageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeLanguage() {
		return typeLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeLanguage(String newTypeLanguage) {
		String oldTypeLanguage = typeLanguage;
		typeLanguage = newTypeLanguage;
		boolean oldTypeLanguageESet = typeLanguageESet;
		typeLanguageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, typeLanguage, !oldTypeLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTypeLanguage() {
		String oldTypeLanguage = typeLanguage;
		boolean oldTypeLanguageESet = typeLanguageESet;
		typeLanguage = TYPE_LANGUAGE_EDEFAULT;
		typeLanguageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, TYPE_LANGUAGE_EDEFAULT, oldTypeLanguageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTypeLanguage() {
		return typeLanguageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TDEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__EXTENSION:
				return ((InternalEList<?>)getExtension()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP:
				return ((InternalEList<?>)getRootElementGroup()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT:
				return ((InternalEList<?>)getRootElement()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM:
				return ((InternalEList<?>)getBPMNDiagram()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case BPMNPackage.TDEFINITIONS__EXTENSION:
				return getExtension();
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP:
				if (coreType) return getRootElementGroup();
				return ((FeatureMap.Internal)getRootElementGroup()).getWrapper();
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT:
				return getRootElement();
			case BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM:
				return getBPMNDiagram();
			case BPMNPackage.TDEFINITIONS__RELATIONSHIP:
				return getRelationship();
			case BPMNPackage.TDEFINITIONS__EXPORTER:
				return getExporter();
			case BPMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				return getExporterVersion();
			case BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case BPMNPackage.TDEFINITIONS__ID:
				return getId();
			case BPMNPackage.TDEFINITIONS__NAME:
				return getName();
			case BPMNPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
			case BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				return getTypeLanguage();
			case BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BPMNPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends TImport>)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__EXTENSION:
				getExtension().clear();
				getExtension().addAll((Collection<? extends TExtension>)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP:
				((FeatureMap.Internal)getRootElementGroup()).set(newValue);
				return;
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT:
				getRootElement().clear();
				getRootElement().addAll((Collection<? extends TRootElement>)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM:
				getBPMNDiagram().clear();
				getBPMNDiagram().addAll((Collection<? extends BPMNDiagram>)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends TRelationship>)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__EXPORTER:
				setExporter((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__ID:
				setId((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				setTypeLanguage((String)newValue);
				return;
			case BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
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
			case BPMNPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case BPMNPackage.TDEFINITIONS__EXTENSION:
				getExtension().clear();
				return;
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP:
				getRootElementGroup().clear();
				return;
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT:
				getRootElement().clear();
				return;
			case BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM:
				getBPMNDiagram().clear();
				return;
			case BPMNPackage.TDEFINITIONS__RELATIONSHIP:
				getRelationship().clear();
				return;
			case BPMNPackage.TDEFINITIONS__EXPORTER:
				setExporter(EXPORTER_EDEFAULT);
				return;
			case BPMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion(EXPORTER_VERSION_EDEFAULT);
				return;
			case BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				unsetExpressionLanguage();
				return;
			case BPMNPackage.TDEFINITIONS__ID:
				setId(ID_EDEFAULT);
				return;
			case BPMNPackage.TDEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMNPackage.TDEFINITIONS__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
				return;
			case BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				unsetTypeLanguage();
				return;
			case BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
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
			case BPMNPackage.TDEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case BPMNPackage.TDEFINITIONS__EXTENSION:
				return extension != null && !extension.isEmpty();
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT_GROUP:
				return rootElementGroup != null && !rootElementGroup.isEmpty();
			case BPMNPackage.TDEFINITIONS__ROOT_ELEMENT:
				return !getRootElement().isEmpty();
			case BPMNPackage.TDEFINITIONS__BPMN_DIAGRAM:
				return bPMNDiagram != null && !bPMNDiagram.isEmpty();
			case BPMNPackage.TDEFINITIONS__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case BPMNPackage.TDEFINITIONS__EXPORTER:
				return EXPORTER_EDEFAULT == null ? exporter != null : !EXPORTER_EDEFAULT.equals(exporter);
			case BPMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				return EXPORTER_VERSION_EDEFAULT == null ? exporterVersion != null : !EXPORTER_VERSION_EDEFAULT.equals(exporterVersion);
			case BPMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return isSetExpressionLanguage();
			case BPMNPackage.TDEFINITIONS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BPMNPackage.TDEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMNPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
			case BPMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				return isSetTypeLanguage();
			case BPMNPackage.TDEFINITIONS__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
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
		result.append(" (rootElementGroup: ");
		result.append(rootElementGroup);
		result.append(", exporter: ");
		result.append(exporter);
		result.append(", exporterVersion: ");
		result.append(exporterVersion);
		result.append(", expressionLanguage: ");
		if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(", typeLanguage: ");
		if (typeLanguageESet) result.append(typeLanguage); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
