/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.UpdatePolicyInUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Policy In Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdatePolicyInUseImpl#getPolicyKey <em>Policy Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdatePolicyInUseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdatePolicyInUseImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdatePolicyInUseImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdatePolicyInUseImpl extends MinimalEObjectImpl.Container implements UpdatePolicyInUse {
	/**
	 * The cached value of the '{@link #getPolicyKey() <em>Policy Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyKey()
	 * @generated
	 * @ordered
	 */
	protected PolicyKeyDTO policyKey;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected String externProperties = EXTERN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdatePolicyInUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getUpdatePolicyInUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyKeyDTO getPolicyKey() {
		return policyKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicyKey(PolicyKeyDTO newPolicyKey, NotificationChain msgs) {
		PolicyKeyDTO oldPolicyKey = policyKey;
		policyKey = newPolicyKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY, oldPolicyKey, newPolicyKey);
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
	public void setPolicyKey(PolicyKeyDTO newPolicyKey) {
		if (newPolicyKey != policyKey) {
			NotificationChain msgs = null;
			if (policyKey != null)
				msgs = ((InternalEObject)policyKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY, null, msgs);
			if (newPolicyKey != null)
				msgs = ((InternalEObject)newPolicyKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY, null, msgs);
			msgs = basicSetPolicyKey(newPolicyKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY, newPolicyKey, newPolicyKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_POLICY_IN_USE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternProperties() {
		return externProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternProperties(String newExternProperties) {
		String oldExternProperties = externProperties;
		externProperties = newExternProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_POLICY_IN_USE__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_POLICY_IN_USE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY:
				return basicSetPolicyKey(null, msgs);
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
			case Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY:
				return getPolicyKey();
			case Cm2Package.UPDATE_POLICY_IN_USE__LABEL:
				return getLabel();
			case Cm2Package.UPDATE_POLICY_IN_USE__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.UPDATE_POLICY_IN_USE__COMMENT:
				return getComment();
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
			case Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)newValue);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__COMMENT:
				setComment((String)newValue);
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
			case Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY:
				setPolicyKey((PolicyKeyDTO)null);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.UPDATE_POLICY_IN_USE__COMMENT:
				setComment(COMMENT_EDEFAULT);
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
			case Cm2Package.UPDATE_POLICY_IN_USE__POLICY_KEY:
				return policyKey != null;
			case Cm2Package.UPDATE_POLICY_IN_USE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.UPDATE_POLICY_IN_USE__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.UPDATE_POLICY_IN_USE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //UpdatePolicyInUseImpl
