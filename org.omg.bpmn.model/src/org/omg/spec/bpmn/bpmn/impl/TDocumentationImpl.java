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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TDocumentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDocumentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl#getTextFormat <em>Text Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDocumentationImpl extends MinimalEObjectImpl.Container implements TDocumentation {
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
	 * The default value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_FORMAT_EDEFAULT = "text/plain";

	/**
	 * The cached value of the '{@link #getTextFormat() <em>Text Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextFormat()
	 * @generated
	 * @ordered
	 */
	protected String textFormat = TEXT_FORMAT_EDEFAULT;

	/**
	 * This is true if the Text Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean textFormatESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTDocumentation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BPMNPackage.TDOCUMENTATION__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAny() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(BPMNPackage.eINSTANCE.getTDocumentation_Any());
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDOCUMENTATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextFormat() {
		return textFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextFormat(String newTextFormat) {
		String oldTextFormat = textFormat;
		textFormat = newTextFormat;
		boolean oldTextFormatESet = textFormatESet;
		textFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TDOCUMENTATION__TEXT_FORMAT, oldTextFormat, textFormat, !oldTextFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetTextFormat() {
		String oldTextFormat = textFormat;
		boolean oldTextFormatESet = textFormatESet;
		textFormat = TEXT_FORMAT_EDEFAULT;
		textFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TDOCUMENTATION__TEXT_FORMAT, oldTextFormat, TEXT_FORMAT_EDEFAULT, oldTextFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetTextFormat() {
		return textFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TDOCUMENTATION__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TDOCUMENTATION__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TDOCUMENTATION__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BPMNPackage.TDOCUMENTATION__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case BPMNPackage.TDOCUMENTATION__ID:
				return getId();
			case BPMNPackage.TDOCUMENTATION__TEXT_FORMAT:
				return getTextFormat();
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
			case BPMNPackage.TDOCUMENTATION__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BPMNPackage.TDOCUMENTATION__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case BPMNPackage.TDOCUMENTATION__ID:
				setId((String)newValue);
				return;
			case BPMNPackage.TDOCUMENTATION__TEXT_FORMAT:
				setTextFormat((String)newValue);
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
			case BPMNPackage.TDOCUMENTATION__MIXED:
				getMixed().clear();
				return;
			case BPMNPackage.TDOCUMENTATION__ANY:
				getAny().clear();
				return;
			case BPMNPackage.TDOCUMENTATION__ID:
				setId(ID_EDEFAULT);
				return;
			case BPMNPackage.TDOCUMENTATION__TEXT_FORMAT:
				unsetTextFormat();
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
			case BPMNPackage.TDOCUMENTATION__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BPMNPackage.TDOCUMENTATION__ANY:
				return !getAny().isEmpty();
			case BPMNPackage.TDOCUMENTATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BPMNPackage.TDOCUMENTATION__TEXT_FORMAT:
				return isSetTextFormat();
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
		result.append(", id: ");
		result.append(id);
		result.append(", textFormat: ");
		if (textFormatESet) result.append(textFormat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TDocumentationImpl
