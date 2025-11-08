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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.DescriptionsType;
import org.cyclonedx.schema.bom.ExternalReferences;
import org.cyclonedx.schema.bom.PropertiesType;
import org.cyclonedx.schema.bom.RequirementType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getDescriptions <em>Descriptions</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getOpenCre <em>Open Cre</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getExternalReferences <em>External References</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getBomRef <em>Bom Ref</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.RequirementTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementTypeImpl extends MinimalEObjectImpl.Container implements RequirementType {
	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptions() <em>Descriptions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptions()
	 * @generated
	 * @ordered
	 */
	protected DescriptionsType descriptions;

	/**
	 * The cached value of the '{@link #getOpenCre() <em>Open Cre</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenCre()
	 * @generated
	 * @ordered
	 */
	protected EList<String> openCre;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getExternalReferences() <em>External References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReferences()
	 * @generated
	 * @ordered
	 */
	protected ExternalReferences externalReferences;

	/**
	 * The default value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BOM_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBomRef() <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBomRef()
	 * @generated
	 * @ordered
	 */
	protected String bomRef = BOM_REF_EDEFAULT;

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
	protected RequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getRequirementType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionsType getDescriptions() {
		return descriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptions(DescriptionsType newDescriptions, NotificationChain msgs) {
		DescriptionsType oldDescriptions = descriptions;
		descriptions = newDescriptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS, oldDescriptions, newDescriptions);
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
	public void setDescriptions(DescriptionsType newDescriptions) {
		if (newDescriptions != descriptions) {
			NotificationChain msgs = null;
			if (descriptions != null)
				msgs = ((InternalEObject)descriptions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS, null, msgs);
			if (newDescriptions != null)
				msgs = ((InternalEObject)newDescriptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS, null, msgs);
			msgs = basicSetDescriptions(newDescriptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS, newDescriptions, newDescriptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOpenCre() {
		if (openCre == null) {
			openCre = new EDataTypeEList<String>(String.class, this, BOMPackage.REQUIREMENT_TYPE__OPEN_CRE);
		}
		return openCre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences getExternalReferences() {
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalReferences(ExternalReferences newExternalReferences, NotificationChain msgs) {
		ExternalReferences oldExternalReferences = externalReferences;
		externalReferences = newExternalReferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES, oldExternalReferences, newExternalReferences);
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
	public void setExternalReferences(ExternalReferences newExternalReferences) {
		if (newExternalReferences != externalReferences) {
			NotificationChain msgs = null;
			if (externalReferences != null)
				msgs = ((InternalEObject)externalReferences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES, null, msgs);
			if (newExternalReferences != null)
				msgs = ((InternalEObject)newExternalReferences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES, null, msgs);
			msgs = basicSetExternalReferences(newExternalReferences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES, newExternalReferences, newExternalReferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBomRef() {
		return bomRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBomRef(String newBomRef) {
		String oldBomRef = bomRef;
		bomRef = newBomRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.REQUIREMENT_TYPE__BOM_REF, oldBomRef, bomRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE);
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
			case BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS:
				return basicSetDescriptions(null, msgs);
			case BOMPackage.REQUIREMENT_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES:
				return basicSetExternalReferences(null, msgs);
			case BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.REQUIREMENT_TYPE__IDENTIFIER:
				return getIdentifier();
			case BOMPackage.REQUIREMENT_TYPE__TITLE:
				return getTitle();
			case BOMPackage.REQUIREMENT_TYPE__TEXT:
				return getText();
			case BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS:
				return getDescriptions();
			case BOMPackage.REQUIREMENT_TYPE__OPEN_CRE:
				return getOpenCre();
			case BOMPackage.REQUIREMENT_TYPE__PARENT:
				return getParent();
			case BOMPackage.REQUIREMENT_TYPE__PROPERTIES:
				return getProperties();
			case BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES:
				return getExternalReferences();
			case BOMPackage.REQUIREMENT_TYPE__BOM_REF:
				return getBomRef();
			case BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.REQUIREMENT_TYPE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__TEXT:
				setText((String)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS:
				setDescriptions((DescriptionsType)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__OPEN_CRE:
				getOpenCre().clear();
				getOpenCre().addAll((Collection<? extends String>)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__PARENT:
				setParent((String)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__BOM_REF:
				setBomRef((String)newValue);
				return;
			case BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.REQUIREMENT_TYPE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case BOMPackage.REQUIREMENT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case BOMPackage.REQUIREMENT_TYPE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS:
				setDescriptions((DescriptionsType)null);
				return;
			case BOMPackage.REQUIREMENT_TYPE__OPEN_CRE:
				getOpenCre().clear();
				return;
			case BOMPackage.REQUIREMENT_TYPE__PARENT:
				setParent(PARENT_EDEFAULT);
				return;
			case BOMPackage.REQUIREMENT_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES:
				setExternalReferences((ExternalReferences)null);
				return;
			case BOMPackage.REQUIREMENT_TYPE__BOM_REF:
				setBomRef(BOM_REF_EDEFAULT);
				return;
			case BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE:
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
			case BOMPackage.REQUIREMENT_TYPE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case BOMPackage.REQUIREMENT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case BOMPackage.REQUIREMENT_TYPE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case BOMPackage.REQUIREMENT_TYPE__DESCRIPTIONS:
				return descriptions != null;
			case BOMPackage.REQUIREMENT_TYPE__OPEN_CRE:
				return openCre != null && !openCre.isEmpty();
			case BOMPackage.REQUIREMENT_TYPE__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
			case BOMPackage.REQUIREMENT_TYPE__PROPERTIES:
				return properties != null;
			case BOMPackage.REQUIREMENT_TYPE__EXTERNAL_REFERENCES:
				return externalReferences != null;
			case BOMPackage.REQUIREMENT_TYPE__BOM_REF:
				return BOM_REF_EDEFAULT == null ? bomRef != null : !BOM_REF_EDEFAULT.equals(bomRef);
			case BOMPackage.REQUIREMENT_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", title: ");
		result.append(title);
		result.append(", text: ");
		result.append(text);
		result.append(", openCre: ");
		result.append(openCre);
		result.append(", parent: ");
		result.append(parent);
		result.append(", bomRef: ");
		result.append(bomRef);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //RequirementTypeImpl
