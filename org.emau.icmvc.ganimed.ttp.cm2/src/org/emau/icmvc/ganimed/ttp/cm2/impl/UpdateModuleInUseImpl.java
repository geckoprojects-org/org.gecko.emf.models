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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emau.icmvc.ganimed.ttp.cm2.AssignedPolicyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateModuleInUse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Module In Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getModuleKey <em>Module Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getShortText <em>Short Text</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateModuleInUseImpl#getAssignedPolicies <em>Assigned Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateModuleInUseImpl extends MinimalEObjectImpl.Container implements UpdateModuleInUse {
	/**
	 * The cached value of the '{@link #getModuleKey() <em>Module Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleKey()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO moduleKey;

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
	 * The default value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortText() <em>Short Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortText()
	 * @generated
	 * @ordered
	 */
	protected String shortText = SHORT_TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getAssignedPolicies() <em>Assigned Policies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedPolicies()
	 * @generated
	 * @ordered
	 */
	protected EList<AssignedPolicyDTO> assignedPolicies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateModuleInUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getUpdateModuleInUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO getModuleKey() {
		return moduleKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleKey(ModuleKeyDTO newModuleKey, NotificationChain msgs) {
		ModuleKeyDTO oldModuleKey = moduleKey;
		moduleKey = newModuleKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY, oldModuleKey, newModuleKey);
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
	public void setModuleKey(ModuleKeyDTO newModuleKey) {
		if (newModuleKey != moduleKey) {
			NotificationChain msgs = null;
			if (moduleKey != null)
				msgs = ((InternalEObject)moduleKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY, null, msgs);
			if (newModuleKey != null)
				msgs = ((InternalEObject)newModuleKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY, null, msgs);
			msgs = basicSetModuleKey(newModuleKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY, newModuleKey, newModuleKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortText() {
		return shortText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortText(String newShortText) {
		String oldShortText = shortText;
		shortText = newShortText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__SHORT_TEXT, oldShortText, shortText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__EXTERN_PROPERTIES, oldExternProperties, externProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_MODULE_IN_USE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssignedPolicyDTO> getAssignedPolicies() {
		if (assignedPolicies == null) {
			assignedPolicies = new EObjectContainmentEList<AssignedPolicyDTO>(AssignedPolicyDTO.class, this, Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES);
		}
		return assignedPolicies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY:
				return basicSetModuleKey(null, msgs);
			case Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES:
				return ((InternalEList<?>)getAssignedPolicies()).basicRemove(otherEnd, msgs);
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
			case Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY:
				return getModuleKey();
			case Cm2Package.UPDATE_MODULE_IN_USE__LABEL:
				return getLabel();
			case Cm2Package.UPDATE_MODULE_IN_USE__SHORT_TEXT:
				return getShortText();
			case Cm2Package.UPDATE_MODULE_IN_USE__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.UPDATE_MODULE_IN_USE__COMMENT:
				return getComment();
			case Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES:
				return getAssignedPolicies();
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
			case Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)newValue);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__SHORT_TEXT:
				setShortText((String)newValue);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES:
				getAssignedPolicies().clear();
				getAssignedPolicies().addAll((Collection<? extends AssignedPolicyDTO>)newValue);
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
			case Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)null);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__SHORT_TEXT:
				setShortText(SHORT_TEXT_EDEFAULT);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES:
				getAssignedPolicies().clear();
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
			case Cm2Package.UPDATE_MODULE_IN_USE__MODULE_KEY:
				return moduleKey != null;
			case Cm2Package.UPDATE_MODULE_IN_USE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.UPDATE_MODULE_IN_USE__SHORT_TEXT:
				return SHORT_TEXT_EDEFAULT == null ? shortText != null : !SHORT_TEXT_EDEFAULT.equals(shortText);
			case Cm2Package.UPDATE_MODULE_IN_USE__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.UPDATE_MODULE_IN_USE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.UPDATE_MODULE_IN_USE__ASSIGNED_POLICIES:
				return assignedPolicies != null && !assignedPolicies.isEmpty();
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
		result.append(", shortText: ");
		result.append(shortText);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //UpdateModuleInUseImpl
