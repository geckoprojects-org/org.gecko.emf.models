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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.dmn.dmn.DMNPackage;
import org.omg.spec.dmn.dmn.TArtifact;
import org.omg.spec.dmn.dmn.TBusinessContextElement;
import org.omg.spec.dmn.dmn.TDRGElement;
import org.omg.spec.dmn.dmn.TDefinitions;
import org.omg.spec.dmn.dmn.TElementCollection;
import org.omg.spec.dmn.dmn.TImport;
import org.omg.spec.dmn.dmn.TItemDefinition;

import org.omg.spec.dmn.dmndi.DMNDI;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getDrgElementGroup <em>Drg Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getDrgElement <em>Drg Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getArtifactGroup <em>Artifact Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getElementCollection <em>Element Collection</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getBusinessContextElementGroup <em>Business Context Element Group</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getBusinessContextElement <em>Business Context Element</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getDMNDI <em>DMNDI</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getExporter <em>Exporter</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getExporterVersion <em>Exporter Version</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getExpressionLanguage <em>Expression Language</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl#getTypeLanguage <em>Type Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDefinitionsImpl extends TNamedElementImpl implements TDefinitions {
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
	 * The cached value of the '{@link #getItemDefinition() <em>Item Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TItemDefinition> itemDefinition;

	/**
	 * The cached value of the '{@link #getDrgElementGroup() <em>Drg Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrgElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap drgElementGroup;

	/**
	 * The cached value of the '{@link #getArtifactGroup() <em>Artifact Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap artifactGroup;

	/**
	 * The cached value of the '{@link #getElementCollection() <em>Element Collection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementCollection()
	 * @generated
	 * @ordered
	 */
	protected EList<TElementCollection> elementCollection;

	/**
	 * The cached value of the '{@link #getBusinessContextElementGroup() <em>Business Context Element Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessContextElementGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap businessContextElementGroup;

	/**
	 * The cached value of the '{@link #getDMNDI() <em>DMNDI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDMNDI()
	 * @generated
	 * @ordered
	 */
	protected DMNDI dMNDI;

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
	protected static final String EXPRESSION_LANGUAGE_EDEFAULT = "https://www.omg.org/spec/DMN/20240513/FEEL/";

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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeLanguage() <em>Type Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_LANGUAGE_EDEFAULT = "https://www.omg.org/spec/DMN/20240513/FEEL/";

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
		return DMNPackage.Literals.TDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TImport> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<TImport>(TImport.class, this, DMNPackage.TDEFINITIONS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TItemDefinition> getItemDefinition() {
		if (itemDefinition == null) {
			itemDefinition = new EObjectContainmentEList<TItemDefinition>(TItemDefinition.class, this, DMNPackage.TDEFINITIONS__ITEM_DEFINITION);
		}
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getDrgElementGroup() {
		if (drgElementGroup == null) {
			drgElementGroup = new BasicFeatureMap(this, DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP);
		}
		return drgElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TDRGElement> getDrgElement() {
		return getDrgElementGroup().list(DMNPackage.Literals.TDEFINITIONS__DRG_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getArtifactGroup() {
		if (artifactGroup == null) {
			artifactGroup = new BasicFeatureMap(this, DMNPackage.TDEFINITIONS__ARTIFACT_GROUP);
		}
		return artifactGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TArtifact> getArtifact() {
		return getArtifactGroup().list(DMNPackage.Literals.TDEFINITIONS__ARTIFACT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TElementCollection> getElementCollection() {
		if (elementCollection == null) {
			elementCollection = new EObjectContainmentEList<TElementCollection>(TElementCollection.class, this, DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION);
		}
		return elementCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getBusinessContextElementGroup() {
		if (businessContextElementGroup == null) {
			businessContextElementGroup = new BasicFeatureMap(this, DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP);
		}
		return businessContextElementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TBusinessContextElement> getBusinessContextElement() {
		return getBusinessContextElementGroup().list(DMNPackage.Literals.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DMNDI getDMNDI() {
		return dMNDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDMNDI(DMNDI newDMNDI, NotificationChain msgs) {
		DMNDI oldDMNDI = dMNDI;
		dMNDI = newDMNDI;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__DMNDI, oldDMNDI, newDMNDI);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDMNDI(DMNDI newDMNDI) {
		if (newDMNDI != dMNDI) {
			NotificationChain msgs = null;
			if (dMNDI != null)
				msgs = ((InternalEObject)dMNDI).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TDEFINITIONS__DMNDI, null, msgs);
			if (newDMNDI != null)
				msgs = ((InternalEObject)newDMNDI).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DMNPackage.TDEFINITIONS__DMNDI, null, msgs);
			msgs = basicSetDMNDI(newDMNDI, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__DMNDI, newDMNDI, newDMNDI));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__EXPORTER, oldExporter, exporter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__EXPORTER_VERSION, oldExporterVersion, exporterVersion));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, expressionLanguage, !oldExpressionLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE, oldExpressionLanguage, EXPRESSION_LANGUAGE_EDEFAULT, oldExpressionLanguageESet));
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
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__NAMESPACE, oldNamespace, namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DMNPackage.TDEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, typeLanguage, !oldTypeLanguageESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DMNPackage.TDEFINITIONS__TYPE_LANGUAGE, oldTypeLanguage, TYPE_LANGUAGE_EDEFAULT, oldTypeLanguageESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DMNPackage.TDEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__ITEM_DEFINITION:
				return ((InternalEList<?>)getItemDefinition()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP:
				return ((InternalEList<?>)getDrgElementGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT:
				return ((InternalEList<?>)getDrgElement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__ARTIFACT_GROUP:
				return ((InternalEList<?>)getArtifactGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__ARTIFACT:
				return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION:
				return ((InternalEList<?>)getElementCollection()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP:
				return ((InternalEList<?>)getBusinessContextElementGroup()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT:
				return ((InternalEList<?>)getBusinessContextElement()).basicRemove(otherEnd, msgs);
			case DMNPackage.TDEFINITIONS__DMNDI:
				return basicSetDMNDI(null, msgs);
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
			case DMNPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case DMNPackage.TDEFINITIONS__ITEM_DEFINITION:
				return getItemDefinition();
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP:
				if (coreType) return getDrgElementGroup();
				return ((FeatureMap.Internal)getDrgElementGroup()).getWrapper();
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT:
				return getDrgElement();
			case DMNPackage.TDEFINITIONS__ARTIFACT_GROUP:
				if (coreType) return getArtifactGroup();
				return ((FeatureMap.Internal)getArtifactGroup()).getWrapper();
			case DMNPackage.TDEFINITIONS__ARTIFACT:
				return getArtifact();
			case DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION:
				return getElementCollection();
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP:
				if (coreType) return getBusinessContextElementGroup();
				return ((FeatureMap.Internal)getBusinessContextElementGroup()).getWrapper();
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT:
				return getBusinessContextElement();
			case DMNPackage.TDEFINITIONS__DMNDI:
				return getDMNDI();
			case DMNPackage.TDEFINITIONS__EXPORTER:
				return getExporter();
			case DMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				return getExporterVersion();
			case DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return getExpressionLanguage();
			case DMNPackage.TDEFINITIONS__NAMESPACE:
				return getNamespace();
			case DMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				return getTypeLanguage();
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
			case DMNPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends TImport>)newValue);
				return;
			case DMNPackage.TDEFINITIONS__ITEM_DEFINITION:
				getItemDefinition().clear();
				getItemDefinition().addAll((Collection<? extends TItemDefinition>)newValue);
				return;
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP:
				((FeatureMap.Internal)getDrgElementGroup()).set(newValue);
				return;
			case DMNPackage.TDEFINITIONS__ARTIFACT_GROUP:
				((FeatureMap.Internal)getArtifactGroup()).set(newValue);
				return;
			case DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION:
				getElementCollection().clear();
				getElementCollection().addAll((Collection<? extends TElementCollection>)newValue);
				return;
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP:
				((FeatureMap.Internal)getBusinessContextElementGroup()).set(newValue);
				return;
			case DMNPackage.TDEFINITIONS__DMNDI:
				setDMNDI((DMNDI)newValue);
				return;
			case DMNPackage.TDEFINITIONS__EXPORTER:
				setExporter((String)newValue);
				return;
			case DMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion((String)newValue);
				return;
			case DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				setExpressionLanguage((String)newValue);
				return;
			case DMNPackage.TDEFINITIONS__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case DMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				setTypeLanguage((String)newValue);
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
			case DMNPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case DMNPackage.TDEFINITIONS__ITEM_DEFINITION:
				getItemDefinition().clear();
				return;
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP:
				getDrgElementGroup().clear();
				return;
			case DMNPackage.TDEFINITIONS__ARTIFACT_GROUP:
				getArtifactGroup().clear();
				return;
			case DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION:
				getElementCollection().clear();
				return;
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP:
				getBusinessContextElementGroup().clear();
				return;
			case DMNPackage.TDEFINITIONS__DMNDI:
				setDMNDI((DMNDI)null);
				return;
			case DMNPackage.TDEFINITIONS__EXPORTER:
				setExporter(EXPORTER_EDEFAULT);
				return;
			case DMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				setExporterVersion(EXPORTER_VERSION_EDEFAULT);
				return;
			case DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				unsetExpressionLanguage();
				return;
			case DMNPackage.TDEFINITIONS__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case DMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				unsetTypeLanguage();
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
			case DMNPackage.TDEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case DMNPackage.TDEFINITIONS__ITEM_DEFINITION:
				return itemDefinition != null && !itemDefinition.isEmpty();
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT_GROUP:
				return drgElementGroup != null && !drgElementGroup.isEmpty();
			case DMNPackage.TDEFINITIONS__DRG_ELEMENT:
				return !getDrgElement().isEmpty();
			case DMNPackage.TDEFINITIONS__ARTIFACT_GROUP:
				return artifactGroup != null && !artifactGroup.isEmpty();
			case DMNPackage.TDEFINITIONS__ARTIFACT:
				return !getArtifact().isEmpty();
			case DMNPackage.TDEFINITIONS__ELEMENT_COLLECTION:
				return elementCollection != null && !elementCollection.isEmpty();
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP:
				return businessContextElementGroup != null && !businessContextElementGroup.isEmpty();
			case DMNPackage.TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT:
				return !getBusinessContextElement().isEmpty();
			case DMNPackage.TDEFINITIONS__DMNDI:
				return dMNDI != null;
			case DMNPackage.TDEFINITIONS__EXPORTER:
				return EXPORTER_EDEFAULT == null ? exporter != null : !EXPORTER_EDEFAULT.equals(exporter);
			case DMNPackage.TDEFINITIONS__EXPORTER_VERSION:
				return EXPORTER_VERSION_EDEFAULT == null ? exporterVersion != null : !EXPORTER_VERSION_EDEFAULT.equals(exporterVersion);
			case DMNPackage.TDEFINITIONS__EXPRESSION_LANGUAGE:
				return isSetExpressionLanguage();
			case DMNPackage.TDEFINITIONS__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case DMNPackage.TDEFINITIONS__TYPE_LANGUAGE:
				return isSetTypeLanguage();
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
		result.append(" (drgElementGroup: ");
		result.append(drgElementGroup);
		result.append(", artifactGroup: ");
		result.append(artifactGroup);
		result.append(", businessContextElementGroup: ");
		result.append(businessContextElementGroup);
		result.append(", exporter: ");
		result.append(exporter);
		result.append(", exporterVersion: ");
		result.append(exporterVersion);
		result.append(", expressionLanguage: ");
		if (expressionLanguageESet) result.append(expressionLanguage); else result.append("<unset>");
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", typeLanguage: ");
		if (typeLanguageESet) result.append(typeLanguage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
