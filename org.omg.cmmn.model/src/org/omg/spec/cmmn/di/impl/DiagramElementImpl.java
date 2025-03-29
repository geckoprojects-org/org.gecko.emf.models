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
package org.omg.spec.cmmn.di.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.di.DIPackage;
import org.omg.spec.cmmn.di.DiagramElement;
import org.omg.spec.cmmn.di.ExtensionType1;
import org.omg.spec.cmmn.di.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getStyleGroup <em>Style Group</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getSharedStyle <em>Shared Style</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.di.impl.DiagramElementImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DiagramElementImpl extends MinimalEObjectImpl.Container implements DiagramElement {
	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected ExtensionType1 extension;

	/**
	 * The cached value of the '{@link #getStyleGroup() <em>Style Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap styleGroup;

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
	 * The default value of the '{@link #getSharedStyle() <em>Shared Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARED_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedStyle() <em>Shared Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedStyle()
	 * @generated
	 * @ordered
	 */
	protected String sharedStyle = SHARED_STYLE_EDEFAULT;

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
	protected DiagramElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DIPackage.Literals.DIAGRAM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionType1 getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtension(ExtensionType1 newExtension, NotificationChain msgs) {
		ExtensionType1 oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__EXTENSION, oldExtension, newExtension);
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
	public void setExtension(ExtensionType1 newExtension) {
		if (newExtension != extension) {
			NotificationChain msgs = null;
			if (extension != null)
				msgs = ((InternalEObject)extension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DIPackage.DIAGRAM_ELEMENT__EXTENSION, null, msgs);
			if (newExtension != null)
				msgs = ((InternalEObject)newExtension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DIPackage.DIAGRAM_ELEMENT__EXTENSION, null, msgs);
			msgs = basicSetExtension(newExtension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__EXTENSION, newExtension, newExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getStyleGroup() {
		if (styleGroup == null) {
			styleGroup = new BasicFeatureMap(this, DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP);
		}
		return styleGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Style getStyle() {
		return (Style)getStyleGroup().get(DIPackage.Literals.DIAGRAM_ELEMENT__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(Style newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getStyleGroup()).basicAdd(DIPackage.Literals.DIAGRAM_ELEMENT__STYLE, newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(Style newStyle) {
		((FeatureMap.Internal)getStyleGroup()).set(DIPackage.Literals.DIAGRAM_ELEMENT__STYLE, newStyle);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSharedStyle() {
		return sharedStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedStyle(String newSharedStyle) {
		String oldSharedStyle = sharedStyle;
		sharedStyle = newSharedStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE, oldSharedStyle, sharedStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE);
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
			case DIPackage.DIAGRAM_ELEMENT__EXTENSION:
				return basicSetExtension(null, msgs);
			case DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP:
				return ((InternalEList<?>)getStyleGroup()).basicRemove(otherEnd, msgs);
			case DIPackage.DIAGRAM_ELEMENT__STYLE:
				return basicSetStyle(null, msgs);
			case DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE:
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
			case DIPackage.DIAGRAM_ELEMENT__EXTENSION:
				return getExtension();
			case DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP:
				if (coreType) return getStyleGroup();
				return ((FeatureMap.Internal)getStyleGroup()).getWrapper();
			case DIPackage.DIAGRAM_ELEMENT__STYLE:
				return getStyle();
			case DIPackage.DIAGRAM_ELEMENT__ID:
				return getId();
			case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
				return getSharedStyle();
			case DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DIPackage.DIAGRAM_ELEMENT__EXTENSION:
				setExtension((ExtensionType1)newValue);
				return;
			case DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP:
				((FeatureMap.Internal)getStyleGroup()).set(newValue);
				return;
			case DIPackage.DIAGRAM_ELEMENT__STYLE:
				setStyle((Style)newValue);
				return;
			case DIPackage.DIAGRAM_ELEMENT__ID:
				setId((String)newValue);
				return;
			case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
				setSharedStyle((String)newValue);
				return;
			case DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE:
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
			case DIPackage.DIAGRAM_ELEMENT__EXTENSION:
				setExtension((ExtensionType1)null);
				return;
			case DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP:
				getStyleGroup().clear();
				return;
			case DIPackage.DIAGRAM_ELEMENT__STYLE:
				setStyle((Style)null);
				return;
			case DIPackage.DIAGRAM_ELEMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
				setSharedStyle(SHARED_STYLE_EDEFAULT);
				return;
			case DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE:
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
			case DIPackage.DIAGRAM_ELEMENT__EXTENSION:
				return extension != null;
			case DIPackage.DIAGRAM_ELEMENT__STYLE_GROUP:
				return styleGroup != null && !styleGroup.isEmpty();
			case DIPackage.DIAGRAM_ELEMENT__STYLE:
				return getStyle() != null;
			case DIPackage.DIAGRAM_ELEMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DIPackage.DIAGRAM_ELEMENT__SHARED_STYLE:
				return SHARED_STYLE_EDEFAULT == null ? sharedStyle != null : !SHARED_STYLE_EDEFAULT.equals(sharedStyle);
			case DIPackage.DIAGRAM_ELEMENT__ANY_ATTRIBUTE:
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
		result.append(" (styleGroup: ");
		result.append(styleGroup);
		result.append(", id: ");
		result.append(id);
		result.append(", sharedStyle: ");
		result.append(sharedStyle);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //DiagramElementImpl
