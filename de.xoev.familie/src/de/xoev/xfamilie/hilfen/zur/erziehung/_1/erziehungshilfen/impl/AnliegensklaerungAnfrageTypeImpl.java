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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AnliegensklaerungAnfrageType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.CodeVerhaeltnisJugendlichHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anliegensklaerung Anfrage Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl#getAnliegenVerhaeltnisJugendlich <em>Anliegen Verhaeltnis Jugendlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl#isSorgeberechtigtAbfrage <em>Sorgeberechtigt Abfrage</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.AnliegensklaerungAnfrageTypeImpl#isGemeinsamSorgeberechtigt <em>Gemeinsam Sorgeberechtigt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnliegensklaerungAnfrageTypeImpl extends MinimalEObjectImpl.Container implements AnliegensklaerungAnfrageType {
	/**
	 * The cached value of the '{@link #getAnliegenVerhaeltnisJugendlich() <em>Anliegen Verhaeltnis Jugendlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegenVerhaeltnisJugendlich()
	 * @generated
	 * @ordered
	 */
	protected CodeVerhaeltnisJugendlichHZEType anliegenVerhaeltnisJugendlich;

	/**
	 * The default value of the '{@link #isSorgeberechtigtAbfrage() <em>Sorgeberechtigt Abfrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSorgeberechtigtAbfrage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SORGEBERECHTIGT_ABFRAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSorgeberechtigtAbfrage() <em>Sorgeberechtigt Abfrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSorgeberechtigtAbfrage()
	 * @generated
	 * @ordered
	 */
	protected boolean sorgeberechtigtAbfrage = SORGEBERECHTIGT_ABFRAGE_EDEFAULT;

	/**
	 * This is true if the Sorgeberechtigt Abfrage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sorgeberechtigtAbfrageESet;

	/**
	 * The default value of the '{@link #isGemeinsamSorgeberechtigt() <em>Gemeinsam Sorgeberechtigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGemeinsamSorgeberechtigt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GEMEINSAM_SORGEBERECHTIGT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGemeinsamSorgeberechtigt() <em>Gemeinsam Sorgeberechtigt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGemeinsamSorgeberechtigt()
	 * @generated
	 * @ordered
	 */
	protected boolean gemeinsamSorgeberechtigt = GEMEINSAM_SORGEBERECHTIGT_EDEFAULT;

	/**
	 * This is true if the Gemeinsam Sorgeberechtigt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gemeinsamSorgeberechtigtESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnliegensklaerungAnfrageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.ANLIEGENSKLAERUNG_ANFRAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerhaeltnisJugendlichHZEType getAnliegenVerhaeltnisJugendlich() {
		return anliegenVerhaeltnisJugendlich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegenVerhaeltnisJugendlich(CodeVerhaeltnisJugendlichHZEType newAnliegenVerhaeltnisJugendlich, NotificationChain msgs) {
		CodeVerhaeltnisJugendlichHZEType oldAnliegenVerhaeltnisJugendlich = anliegenVerhaeltnisJugendlich;
		anliegenVerhaeltnisJugendlich = newAnliegenVerhaeltnisJugendlich;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH, oldAnliegenVerhaeltnisJugendlich, newAnliegenVerhaeltnisJugendlich);
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
	public void setAnliegenVerhaeltnisJugendlich(CodeVerhaeltnisJugendlichHZEType newAnliegenVerhaeltnisJugendlich) {
		if (newAnliegenVerhaeltnisJugendlich != anliegenVerhaeltnisJugendlich) {
			NotificationChain msgs = null;
			if (anliegenVerhaeltnisJugendlich != null)
				msgs = ((InternalEObject)anliegenVerhaeltnisJugendlich).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH, null, msgs);
			if (newAnliegenVerhaeltnisJugendlich != null)
				msgs = ((InternalEObject)newAnliegenVerhaeltnisJugendlich).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH, null, msgs);
			msgs = basicSetAnliegenVerhaeltnisJugendlich(newAnliegenVerhaeltnisJugendlich, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH, newAnliegenVerhaeltnisJugendlich, newAnliegenVerhaeltnisJugendlich));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSorgeberechtigtAbfrage() {
		return sorgeberechtigtAbfrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeberechtigtAbfrage(boolean newSorgeberechtigtAbfrage) {
		boolean oldSorgeberechtigtAbfrage = sorgeberechtigtAbfrage;
		sorgeberechtigtAbfrage = newSorgeberechtigtAbfrage;
		boolean oldSorgeberechtigtAbfrageESet = sorgeberechtigtAbfrageESet;
		sorgeberechtigtAbfrageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE, oldSorgeberechtigtAbfrage, sorgeberechtigtAbfrage, !oldSorgeberechtigtAbfrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSorgeberechtigtAbfrage() {
		boolean oldSorgeberechtigtAbfrage = sorgeberechtigtAbfrage;
		boolean oldSorgeberechtigtAbfrageESet = sorgeberechtigtAbfrageESet;
		sorgeberechtigtAbfrage = SORGEBERECHTIGT_ABFRAGE_EDEFAULT;
		sorgeberechtigtAbfrageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE, oldSorgeberechtigtAbfrage, SORGEBERECHTIGT_ABFRAGE_EDEFAULT, oldSorgeberechtigtAbfrageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSorgeberechtigtAbfrage() {
		return sorgeberechtigtAbfrageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGemeinsamSorgeberechtigt() {
		return gemeinsamSorgeberechtigt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGemeinsamSorgeberechtigt(boolean newGemeinsamSorgeberechtigt) {
		boolean oldGemeinsamSorgeberechtigt = gemeinsamSorgeberechtigt;
		gemeinsamSorgeberechtigt = newGemeinsamSorgeberechtigt;
		boolean oldGemeinsamSorgeberechtigtESet = gemeinsamSorgeberechtigtESet;
		gemeinsamSorgeberechtigtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT, oldGemeinsamSorgeberechtigt, gemeinsamSorgeberechtigt, !oldGemeinsamSorgeberechtigtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGemeinsamSorgeberechtigt() {
		boolean oldGemeinsamSorgeberechtigt = gemeinsamSorgeberechtigt;
		boolean oldGemeinsamSorgeberechtigtESet = gemeinsamSorgeberechtigtESet;
		gemeinsamSorgeberechtigt = GEMEINSAM_SORGEBERECHTIGT_EDEFAULT;
		gemeinsamSorgeberechtigtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT, oldGemeinsamSorgeberechtigt, GEMEINSAM_SORGEBERECHTIGT_EDEFAULT, oldGemeinsamSorgeberechtigtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGemeinsamSorgeberechtigt() {
		return gemeinsamSorgeberechtigtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH:
				return basicSetAnliegenVerhaeltnisJugendlich(null, msgs);
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
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH:
				return getAnliegenVerhaeltnisJugendlich();
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE:
				return isSorgeberechtigtAbfrage();
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT:
				return isGemeinsamSorgeberechtigt();
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
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH:
				setAnliegenVerhaeltnisJugendlich((CodeVerhaeltnisJugendlichHZEType)newValue);
				return;
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE:
				setSorgeberechtigtAbfrage((Boolean)newValue);
				return;
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT:
				setGemeinsamSorgeberechtigt((Boolean)newValue);
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
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH:
				setAnliegenVerhaeltnisJugendlich((CodeVerhaeltnisJugendlichHZEType)null);
				return;
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE:
				unsetSorgeberechtigtAbfrage();
				return;
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT:
				unsetGemeinsamSorgeberechtigt();
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
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__ANLIEGEN_VERHAELTNIS_JUGENDLICH:
				return anliegenVerhaeltnisJugendlich != null;
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__SORGEBERECHTIGT_ABFRAGE:
				return isSetSorgeberechtigtAbfrage();
			case ErziehungshilfePackage.ANLIEGENSKLAERUNG_ANFRAGE_TYPE__GEMEINSAM_SORGEBERECHTIGT:
				return isSetGemeinsamSorgeberechtigt();
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
		result.append(" (sorgeberechtigtAbfrage: ");
		if (sorgeberechtigtAbfrageESet) result.append(sorgeberechtigtAbfrage); else result.append("<unset>");
		result.append(", gemeinsamSorgeberechtigt: ");
		if (gemeinsamSorgeberechtigtESet) result.append(gemeinsamSorgeberechtigt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AnliegensklaerungAnfrageTypeImpl
