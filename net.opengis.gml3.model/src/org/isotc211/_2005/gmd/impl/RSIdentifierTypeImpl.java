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
import org.isotc211._2005.gmd.RSIdentifierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RS Identifier Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.RSIdentifierTypeImpl#getCodeSpace <em>Code Space</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.RSIdentifierTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RSIdentifierTypeImpl extends MDIdentifierTypeImpl implements RSIdentifierType {
	/**
	 * The cached value of the '{@link #getCodeSpace() <em>Code Space</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeSpace()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType codeSpace;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected CharacterStringPropertyType version;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RSIdentifierTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getRSIdentifierType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getCodeSpace() {
		return codeSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeSpace(CharacterStringPropertyType newCodeSpace, NotificationChain msgs) {
		CharacterStringPropertyType oldCodeSpace = codeSpace;
		codeSpace = newCodeSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE, oldCodeSpace, newCodeSpace);
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
	public void setCodeSpace(CharacterStringPropertyType newCodeSpace) {
		if (newCodeSpace != codeSpace) {
			NotificationChain msgs = null;
			if (codeSpace != null)
				msgs = ((InternalEObject)codeSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE, null, msgs);
			if (newCodeSpace != null)
				msgs = ((InternalEObject)newCodeSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE, null, msgs);
			msgs = basicSetCodeSpace(newCodeSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE, newCodeSpace, newCodeSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharacterStringPropertyType getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(CharacterStringPropertyType newVersion, NotificationChain msgs) {
		CharacterStringPropertyType oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.RS_IDENTIFIER_TYPE__VERSION, oldVersion, newVersion);
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
	public void setVersion(CharacterStringPropertyType newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.RS_IDENTIFIER_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.RS_IDENTIFIER_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.RS_IDENTIFIER_TYPE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE:
				return basicSetCodeSpace(null, msgs);
			case GMDPackage.RS_IDENTIFIER_TYPE__VERSION:
				return basicSetVersion(null, msgs);
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
			case GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE:
				return getCodeSpace();
			case GMDPackage.RS_IDENTIFIER_TYPE__VERSION:
				return getVersion();
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
			case GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE:
				setCodeSpace((CharacterStringPropertyType)newValue);
				return;
			case GMDPackage.RS_IDENTIFIER_TYPE__VERSION:
				setVersion((CharacterStringPropertyType)newValue);
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
			case GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE:
				setCodeSpace((CharacterStringPropertyType)null);
				return;
			case GMDPackage.RS_IDENTIFIER_TYPE__VERSION:
				setVersion((CharacterStringPropertyType)null);
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
			case GMDPackage.RS_IDENTIFIER_TYPE__CODE_SPACE:
				return codeSpace != null;
			case GMDPackage.RS_IDENTIFIER_TYPE__VERSION:
				return version != null;
		}
		return super.eIsSet(featureID);
	}

} //RSIdentifierTypeImpl
