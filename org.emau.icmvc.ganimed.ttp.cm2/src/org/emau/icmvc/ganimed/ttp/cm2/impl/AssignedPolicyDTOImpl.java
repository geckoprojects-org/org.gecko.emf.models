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

import org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.PolicyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assigned Policy DTO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AssignedPolicyDTOImpl#getPolicy <em>Policy</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignedPolicyDTOImpl extends FhirIdDTOImpl implements AssignedPolicyDTO {
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
	 * The cached value of the '{@link #getExpirationProperties() <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationProperties()
	 * @generated
	 * @ordered
	 */
	protected ExpirationPropertiesDTO expirationProperties;

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
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected PolicyDTO policy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignedPolicyDTOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getAssignedPolicyDTO();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO getExpirationProperties() {
		return expirationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationProperties(ExpirationPropertiesDTO newExpirationProperties, NotificationChain msgs) {
		ExpirationPropertiesDTO oldExpirationProperties = expirationProperties;
		expirationProperties = newExpirationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
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
	public void setExpirationProperties(ExpirationPropertiesDTO newExpirationProperties) {
		if (newExpirationProperties != expirationProperties) {
			NotificationChain msgs = null;
			if (expirationProperties != null)
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PolicyDTO getPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPolicy(PolicyDTO newPolicy, NotificationChain msgs) {
		PolicyDTO oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__POLICY, oldPolicy, newPolicy);
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
	public void setPolicy(PolicyDTO newPolicy) {
		if (newPolicy != policy) {
			NotificationChain msgs = null;
			if (policy != null)
				msgs = ((InternalEObject)policy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_POLICY_DTO__POLICY, null, msgs);
			if (newPolicy != null)
				msgs = ((InternalEObject)newPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ASSIGNED_POLICY_DTO__POLICY, null, msgs);
			msgs = basicSetPolicy(newPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ASSIGNED_POLICY_DTO__POLICY, newPolicy, newPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
			case Cm2Package.ASSIGNED_POLICY_DTO__POLICY:
				return basicSetPolicy(null, msgs);
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
			case Cm2Package.ASSIGNED_POLICY_DTO__COMMENT:
				return getComment();
			case Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.ASSIGNED_POLICY_DTO__POLICY:
				return getPolicy();
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
			case Cm2Package.ASSIGNED_POLICY_DTO__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__POLICY:
				setPolicy((PolicyDTO)newValue);
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
			case Cm2Package.ASSIGNED_POLICY_DTO__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.ASSIGNED_POLICY_DTO__POLICY:
				setPolicy((PolicyDTO)null);
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
			case Cm2Package.ASSIGNED_POLICY_DTO__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.ASSIGNED_POLICY_DTO__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.ASSIGNED_POLICY_DTO__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.ASSIGNED_POLICY_DTO__POLICY:
				return policy != null;
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
		result.append(" (comment: ");
		result.append(comment);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(')');
		return result.toString();
	}

} //AssignedPolicyDTOImpl
