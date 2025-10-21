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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeiner Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl#isNichtVorhanden <em>Nicht Vorhanden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeinerNameTypeImpl extends MinimalEObjectImpl.Container implements AllgemeinerNameType {
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
	 * The default value of the '{@link #isNichtVorhanden() <em>Nicht Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNichtVorhanden()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NICHT_VORHANDEN_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isNichtVorhanden() <em>Nicht Vorhanden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNichtVorhanden()
	 * @generated
	 * @ordered
	 */
	protected boolean nichtVorhanden = NICHT_VORHANDEN_EDEFAULT;

	/**
	 * This is true if the Nicht Vorhanden attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nichtVorhandenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeinerNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ALLGEMEINER_NAME_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ALLGEMEINER_NAME_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNichtVorhanden() {
		return nichtVorhanden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNichtVorhanden(boolean newNichtVorhanden) {
		boolean oldNichtVorhanden = nichtVorhanden;
		nichtVorhanden = newNichtVorhanden;
		boolean oldNichtVorhandenESet = nichtVorhandenESet;
		nichtVorhandenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN, oldNichtVorhanden, nichtVorhanden, !oldNichtVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetNichtVorhanden() {
		boolean oldNichtVorhanden = nichtVorhanden;
		boolean oldNichtVorhandenESet = nichtVorhandenESet;
		nichtVorhanden = NICHT_VORHANDEN_EDEFAULT;
		nichtVorhandenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN, oldNichtVorhanden, NICHT_VORHANDEN_EDEFAULT, oldNichtVorhandenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetNichtVorhanden() {
		return nichtVorhandenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NAME:
				return getName();
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN:
				return isNichtVorhanden();
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
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NAME:
				setName((String)newValue);
				return;
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN:
				setNichtVorhanden((Boolean)newValue);
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
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN:
				unsetNichtVorhanden();
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
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaukastenPackage.ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN:
				return isSetNichtVorhanden();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", nichtVorhanden: ");
		if (nichtVorhandenESet) result.append(nichtVorhanden); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AllgemeinerNameTypeImpl
