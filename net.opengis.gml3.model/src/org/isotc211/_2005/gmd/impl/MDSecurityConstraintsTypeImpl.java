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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.MDClassificationCodePropertyType;
import org.isotc211._2005.gmd.MDSecurityConstraintsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Security Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDSecurityConstraintsTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDSecurityConstraintsTypeImpl#getUserNote <em>User Note</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDSecurityConstraintsTypeImpl#getClassificationSystem <em>Classification System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.MDSecurityConstraintsTypeImpl#getHandlingDescription <em>Handling Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDSecurityConstraintsTypeImpl extends MDConstraintsTypeImpl implements MDSecurityConstraintsType {
	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected MDClassificationCodePropertyType classification;

	/**
	 * The cached value of the '{@link #getUserNote() <em>User Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserNote()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType userNote;

	/**
	 * The cached value of the '{@link #getClassificationSystem() <em>Classification System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassificationSystem()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType classificationSystem;

	/**
	 * The cached value of the '{@link #getHandlingDescription() <em>Handling Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlingDescription()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType handlingDescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDSecurityConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDSecurityConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDClassificationCodePropertyType getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassification(MDClassificationCodePropertyType newClassification, NotificationChain msgs) {
		MDClassificationCodePropertyType oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION, oldClassification, newClassification);
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
	public void setClassification(MDClassificationCodePropertyType newClassification) {
		if (newClassification != classification) {
			NotificationChain msgs = null;
			if (classification != null)
				msgs = ((InternalEObject)classification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION, null, msgs);
			if (newClassification != null)
				msgs = ((InternalEObject)newClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION, null, msgs);
			msgs = basicSetClassification(newClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION, newClassification, newClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getUserNote() {
		return userNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserNote(CharacterStringPropertyType newUserNote, NotificationChain msgs) {
		CharacterStringPropertyType oldUserNote = userNote;
		userNote = newUserNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE, oldUserNote, newUserNote);
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
	public void setUserNote(CharacterStringPropertyType newUserNote) {
		if (newUserNote != userNote) {
			NotificationChain msgs = null;
			if (userNote != null)
				msgs = ((InternalEObject)userNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE, null, msgs);
			if (newUserNote != null)
				msgs = ((InternalEObject)newUserNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE, null, msgs);
			msgs = basicSetUserNote(newUserNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE, newUserNote, newUserNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getClassificationSystem() {
		return classificationSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassificationSystem(CharacterStringPropertyType newClassificationSystem, NotificationChain msgs) {
		CharacterStringPropertyType oldClassificationSystem = classificationSystem;
		classificationSystem = newClassificationSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM, oldClassificationSystem, newClassificationSystem);
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
	public void setClassificationSystem(CharacterStringPropertyType newClassificationSystem) {
		if (newClassificationSystem != classificationSystem) {
			NotificationChain msgs = null;
			if (classificationSystem != null)
				msgs = ((InternalEObject)classificationSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM, null, msgs);
			if (newClassificationSystem != null)
				msgs = ((InternalEObject)newClassificationSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM, null, msgs);
			msgs = basicSetClassificationSystem(newClassificationSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM, newClassificationSystem, newClassificationSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getHandlingDescription() {
		return handlingDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlingDescription(CharacterStringPropertyType newHandlingDescription, NotificationChain msgs) {
		CharacterStringPropertyType oldHandlingDescription = handlingDescription;
		handlingDescription = newHandlingDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION, oldHandlingDescription, newHandlingDescription);
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
	public void setHandlingDescription(CharacterStringPropertyType newHandlingDescription) {
		if (newHandlingDescription != handlingDescription) {
			NotificationChain msgs = null;
			if (handlingDescription != null)
				msgs = ((InternalEObject)handlingDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION, null, msgs);
			if (newHandlingDescription != null)
				msgs = ((InternalEObject)newHandlingDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION, null, msgs);
			msgs = basicSetHandlingDescription(newHandlingDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION, newHandlingDescription, newHandlingDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION:
				return basicSetClassification(null, msgs);
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE:
				return basicSetUserNote(null, msgs);
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM:
				return basicSetClassificationSystem(null, msgs);
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION:
				return basicSetHandlingDescription(null, msgs);
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
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION:
				return getClassification();
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE:
				return getUserNote();
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM:
				return getClassificationSystem();
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION:
				return getHandlingDescription();
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
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION:
				setClassification((MDClassificationCodePropertyType)newValue);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE:
				setUserNote((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM:
				setClassificationSystem((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION:
				setHandlingDescription((CharacterStringPropertyType)newValue);
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
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION:
				setClassification((MDClassificationCodePropertyType)null);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE:
				setUserNote((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM:
				setClassificationSystem((CharacterStringPropertyType)null);
				return;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION:
				setHandlingDescription((CharacterStringPropertyType)null);
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
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION:
				return classification != null;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__USER_NOTE:
				return userNote != null;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__CLASSIFICATION_SYSTEM:
				return classificationSystem != null;
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE__HANDLING_DESCRIPTION:
				return handlingDescription != null;
		}
		return super.eIsSet(featureID);
	}

} //MDSecurityConstraintsTypeImpl
