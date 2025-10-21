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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wohnsitz Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl#getAnschriftInlandStrassenanschrift <em>Anschrift Inland Strassenanschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl#getErreichbarkeit <em>Erreichbarkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WohnsitzTypeImpl extends MinimalEObjectImpl.Container implements WohnsitzType {
	/**
	 * The cached value of the '{@link #getAnschriftInlandStrassenanschrift() <em>Anschrift Inland Strassenanschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftInlandStrassenanschrift()
	 * @generated
	 * @ordered
	 */
	protected MeldeanschriftType anschriftInlandStrassenanschrift;

	/**
	 * The default value of the '{@link #isAbweichendeAdresseNPA() <em>Abweichende Adresse NPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbweichendeAdresseNPA()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABWEICHENDE_ADRESSE_NPA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbweichendeAdresseNPA() <em>Abweichende Adresse NPA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbweichendeAdresseNPA()
	 * @generated
	 * @ordered
	 */
	protected boolean abweichendeAdresseNPA = ABWEICHENDE_ADRESSE_NPA_EDEFAULT;

	/**
	 * This is true if the Abweichende Adresse NPA attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abweichendeAdresseNPAESet;

	/**
	 * The cached value of the '{@link #getErreichbarkeit() <em>Erreichbarkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErreichbarkeit()
	 * @generated
	 * @ordered
	 */
	protected ErreichbarkeitType erreichbarkeit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WohnsitzTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.WOHNSITZ_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeldeanschriftType getAnschriftInlandStrassenanschrift() {
		return anschriftInlandStrassenanschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftInlandStrassenanschrift(MeldeanschriftType newAnschriftInlandStrassenanschrift, NotificationChain msgs) {
		MeldeanschriftType oldAnschriftInlandStrassenanschrift = anschriftInlandStrassenanschrift;
		anschriftInlandStrassenanschrift = newAnschriftInlandStrassenanschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT, oldAnschriftInlandStrassenanschrift, newAnschriftInlandStrassenanschrift);
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
	public void setAnschriftInlandStrassenanschrift(MeldeanschriftType newAnschriftInlandStrassenanschrift) {
		if (newAnschriftInlandStrassenanschrift != anschriftInlandStrassenanschrift) {
			NotificationChain msgs = null;
			if (anschriftInlandStrassenanschrift != null)
				msgs = ((InternalEObject)anschriftInlandStrassenanschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT, null, msgs);
			if (newAnschriftInlandStrassenanschrift != null)
				msgs = ((InternalEObject)newAnschriftInlandStrassenanschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT, null, msgs);
			msgs = basicSetAnschriftInlandStrassenanschrift(newAnschriftInlandStrassenanschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT, newAnschriftInlandStrassenanschrift, newAnschriftInlandStrassenanschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbweichendeAdresseNPA() {
		return abweichendeAdresseNPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbweichendeAdresseNPA(boolean newAbweichendeAdresseNPA) {
		boolean oldAbweichendeAdresseNPA = abweichendeAdresseNPA;
		abweichendeAdresseNPA = newAbweichendeAdresseNPA;
		boolean oldAbweichendeAdresseNPAESet = abweichendeAdresseNPAESet;
		abweichendeAdresseNPAESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA, oldAbweichendeAdresseNPA, abweichendeAdresseNPA, !oldAbweichendeAdresseNPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAbweichendeAdresseNPA() {
		boolean oldAbweichendeAdresseNPA = abweichendeAdresseNPA;
		boolean oldAbweichendeAdresseNPAESet = abweichendeAdresseNPAESet;
		abweichendeAdresseNPA = ABWEICHENDE_ADRESSE_NPA_EDEFAULT;
		abweichendeAdresseNPAESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA, oldAbweichendeAdresseNPA, ABWEICHENDE_ADRESSE_NPA_EDEFAULT, oldAbweichendeAdresseNPAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAbweichendeAdresseNPA() {
		return abweichendeAdresseNPAESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ErreichbarkeitType getErreichbarkeit() {
		return erreichbarkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErreichbarkeit(ErreichbarkeitType newErreichbarkeit, NotificationChain msgs) {
		ErreichbarkeitType oldErreichbarkeit = erreichbarkeit;
		erreichbarkeit = newErreichbarkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT, oldErreichbarkeit, newErreichbarkeit);
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
	public void setErreichbarkeit(ErreichbarkeitType newErreichbarkeit) {
		if (newErreichbarkeit != erreichbarkeit) {
			NotificationChain msgs = null;
			if (erreichbarkeit != null)
				msgs = ((InternalEObject)erreichbarkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT, null, msgs);
			if (newErreichbarkeit != null)
				msgs = ((InternalEObject)newErreichbarkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT, null, msgs);
			msgs = basicSetErreichbarkeit(newErreichbarkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT, newErreichbarkeit, newErreichbarkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT:
				return basicSetAnschriftInlandStrassenanschrift(null, msgs);
			case KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT:
				return basicSetErreichbarkeit(null, msgs);
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
			case KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT:
				return getAnschriftInlandStrassenanschrift();
			case KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA:
				return isAbweichendeAdresseNPA();
			case KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT:
				return getErreichbarkeit();
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
			case KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT:
				setAnschriftInlandStrassenanschrift((MeldeanschriftType)newValue);
				return;
			case KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA:
				setAbweichendeAdresseNPA((Boolean)newValue);
				return;
			case KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT:
				setErreichbarkeit((ErreichbarkeitType)newValue);
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
			case KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT:
				setAnschriftInlandStrassenanschrift((MeldeanschriftType)null);
				return;
			case KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA:
				unsetAbweichendeAdresseNPA();
				return;
			case KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT:
				setErreichbarkeit((ErreichbarkeitType)null);
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
			case KinderwunschPackage.WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT:
				return anschriftInlandStrassenanschrift != null;
			case KinderwunschPackage.WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA:
				return isSetAbweichendeAdresseNPA();
			case KinderwunschPackage.WOHNSITZ_TYPE__ERREICHBARKEIT:
				return erreichbarkeit != null;
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
		result.append(" (abweichendeAdresseNPA: ");
		if (abweichendeAdresseNPAESet) result.append(abweichendeAdresseNPA); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WohnsitzTypeImpl
