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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finanzierungsplan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getGesamtkosten <em>Gesamtkosten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getVoraussichtlicheErstattungGesetzlicheKrankenkasse <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getVoraussichtlicheErstattungPrivateKrankenkasse <em>Voraussichtliche Erstattung Private Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getVoraussichtlicheErstattungBeihilfe <em>Voraussichtliche Erstattung Beihilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getVoraussichtlicheErstattungHeilfuersorge <em>Voraussichtliche Erstattung Heilfuersorge</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getVerbleibenderEigenanteilSelbstkostenanteil <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl#getZuwendungenGesamt <em>Zuwendungen Gesamt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinanzierungsplanTypeImpl extends MinimalEObjectImpl.Container implements FinanzierungsplanType {
	/**
	 * The default value of the '{@link #getGesamtkosten() <em>Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtkosten()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal GESAMTKOSTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGesamtkosten() <em>Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGesamtkosten()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal gesamtkosten = GESAMTKOSTEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoraussichtlicheErstattungGesetzlicheKrankenkasse() <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungGesetzlicheKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicheErstattungGesetzlicheKrankenkasse() <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungGesetzlicheKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal voraussichtlicheErstattungGesetzlicheKrankenkasse = VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoraussichtlicheErstattungPrivateKrankenkasse() <em>Voraussichtliche Erstattung Private Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungPrivateKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicheErstattungPrivateKrankenkasse() <em>Voraussichtliche Erstattung Private Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungPrivateKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal voraussichtlicheErstattungPrivateKrankenkasse = VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoraussichtlicheErstattungBeihilfe() <em>Voraussichtliche Erstattung Beihilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungBeihilfe()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicheErstattungBeihilfe() <em>Voraussichtliche Erstattung Beihilfe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungBeihilfe()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal voraussichtlicheErstattungBeihilfe = VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoraussichtlicheErstattungHeilfuersorge() <em>Voraussichtliche Erstattung Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungHeilfuersorge()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoraussichtlicheErstattungHeilfuersorge() <em>Voraussichtliche Erstattung Heilfuersorge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoraussichtlicheErstattungHeilfuersorge()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal voraussichtlicheErstattungHeilfuersorge = VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerbleibenderEigenanteilSelbstkostenanteil() <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbleibenderEigenanteilSelbstkostenanteil()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerbleibenderEigenanteilSelbstkostenanteil() <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerbleibenderEigenanteilSelbstkostenanteil()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal verbleibenderEigenanteilSelbstkostenanteil = VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getZuwendungenGesamt() <em>Zuwendungen Gesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZuwendungenGesamt()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal ZUWENDUNGEN_GESAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZuwendungenGesamt() <em>Zuwendungen Gesamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZuwendungenGesamt()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal zuwendungenGesamt = ZUWENDUNGEN_GESAMT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinanzierungsplanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.FINANZIERUNGSPLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getGesamtkosten() {
		return gesamtkosten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGesamtkosten(BigDecimal newGesamtkosten) {
		BigDecimal oldGesamtkosten = gesamtkosten;
		gesamtkosten = newGesamtkosten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN, oldGesamtkosten, gesamtkosten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVoraussichtlicheErstattungGesetzlicheKrankenkasse() {
		return voraussichtlicheErstattungGesetzlicheKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicheErstattungGesetzlicheKrankenkasse(BigDecimal newVoraussichtlicheErstattungGesetzlicheKrankenkasse) {
		BigDecimal oldVoraussichtlicheErstattungGesetzlicheKrankenkasse = voraussichtlicheErstattungGesetzlicheKrankenkasse;
		voraussichtlicheErstattungGesetzlicheKrankenkasse = newVoraussichtlicheErstattungGesetzlicheKrankenkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE, oldVoraussichtlicheErstattungGesetzlicheKrankenkasse, voraussichtlicheErstattungGesetzlicheKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVoraussichtlicheErstattungPrivateKrankenkasse() {
		return voraussichtlicheErstattungPrivateKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicheErstattungPrivateKrankenkasse(BigDecimal newVoraussichtlicheErstattungPrivateKrankenkasse) {
		BigDecimal oldVoraussichtlicheErstattungPrivateKrankenkasse = voraussichtlicheErstattungPrivateKrankenkasse;
		voraussichtlicheErstattungPrivateKrankenkasse = newVoraussichtlicheErstattungPrivateKrankenkasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE, oldVoraussichtlicheErstattungPrivateKrankenkasse, voraussichtlicheErstattungPrivateKrankenkasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVoraussichtlicheErstattungBeihilfe() {
		return voraussichtlicheErstattungBeihilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicheErstattungBeihilfe(BigDecimal newVoraussichtlicheErstattungBeihilfe) {
		BigDecimal oldVoraussichtlicheErstattungBeihilfe = voraussichtlicheErstattungBeihilfe;
		voraussichtlicheErstattungBeihilfe = newVoraussichtlicheErstattungBeihilfe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE, oldVoraussichtlicheErstattungBeihilfe, voraussichtlicheErstattungBeihilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVoraussichtlicheErstattungHeilfuersorge() {
		return voraussichtlicheErstattungHeilfuersorge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVoraussichtlicheErstattungHeilfuersorge(BigDecimal newVoraussichtlicheErstattungHeilfuersorge) {
		BigDecimal oldVoraussichtlicheErstattungHeilfuersorge = voraussichtlicheErstattungHeilfuersorge;
		voraussichtlicheErstattungHeilfuersorge = newVoraussichtlicheErstattungHeilfuersorge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE, oldVoraussichtlicheErstattungHeilfuersorge, voraussichtlicheErstattungHeilfuersorge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getVerbleibenderEigenanteilSelbstkostenanteil() {
		return verbleibenderEigenanteilSelbstkostenanteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerbleibenderEigenanteilSelbstkostenanteil(BigDecimal newVerbleibenderEigenanteilSelbstkostenanteil) {
		BigDecimal oldVerbleibenderEigenanteilSelbstkostenanteil = verbleibenderEigenanteilSelbstkostenanteil;
		verbleibenderEigenanteilSelbstkostenanteil = newVerbleibenderEigenanteilSelbstkostenanteil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL, oldVerbleibenderEigenanteilSelbstkostenanteil, verbleibenderEigenanteilSelbstkostenanteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getZuwendungenGesamt() {
		return zuwendungenGesamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZuwendungenGesamt(BigDecimal newZuwendungenGesamt) {
		BigDecimal oldZuwendungenGesamt = zuwendungenGesamt;
		zuwendungenGesamt = newZuwendungenGesamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT, oldZuwendungenGesamt, zuwendungenGesamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN:
				return getGesamtkosten();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE:
				return getVoraussichtlicheErstattungGesetzlicheKrankenkasse();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE:
				return getVoraussichtlicheErstattungPrivateKrankenkasse();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE:
				return getVoraussichtlicheErstattungBeihilfe();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE:
				return getVoraussichtlicheErstattungHeilfuersorge();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL:
				return getVerbleibenderEigenanteilSelbstkostenanteil();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT:
				return getZuwendungenGesamt();
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
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN:
				setGesamtkosten((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE:
				setVoraussichtlicheErstattungGesetzlicheKrankenkasse((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE:
				setVoraussichtlicheErstattungPrivateKrankenkasse((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE:
				setVoraussichtlicheErstattungBeihilfe((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE:
				setVoraussichtlicheErstattungHeilfuersorge((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL:
				setVerbleibenderEigenanteilSelbstkostenanteil((BigDecimal)newValue);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT:
				setZuwendungenGesamt((BigDecimal)newValue);
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
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN:
				setGesamtkosten(GESAMTKOSTEN_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE:
				setVoraussichtlicheErstattungGesetzlicheKrankenkasse(VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE:
				setVoraussichtlicheErstattungPrivateKrankenkasse(VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE:
				setVoraussichtlicheErstattungBeihilfe(VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE:
				setVoraussichtlicheErstattungHeilfuersorge(VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL:
				setVerbleibenderEigenanteilSelbstkostenanteil(VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL_EDEFAULT);
				return;
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT:
				setZuwendungenGesamt(ZUWENDUNGEN_GESAMT_EDEFAULT);
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
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN:
				return GESAMTKOSTEN_EDEFAULT == null ? gesamtkosten != null : !GESAMTKOSTEN_EDEFAULT.equals(gesamtkosten);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE:
				return VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE_EDEFAULT == null ? voraussichtlicheErstattungGesetzlicheKrankenkasse != null : !VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE_EDEFAULT.equals(voraussichtlicheErstattungGesetzlicheKrankenkasse);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE:
				return VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE_EDEFAULT == null ? voraussichtlicheErstattungPrivateKrankenkasse != null : !VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE_EDEFAULT.equals(voraussichtlicheErstattungPrivateKrankenkasse);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE:
				return VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE_EDEFAULT == null ? voraussichtlicheErstattungBeihilfe != null : !VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE_EDEFAULT.equals(voraussichtlicheErstattungBeihilfe);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE:
				return VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE_EDEFAULT == null ? voraussichtlicheErstattungHeilfuersorge != null : !VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE_EDEFAULT.equals(voraussichtlicheErstattungHeilfuersorge);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL:
				return VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL_EDEFAULT == null ? verbleibenderEigenanteilSelbstkostenanteil != null : !VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL_EDEFAULT.equals(verbleibenderEigenanteilSelbstkostenanteil);
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT:
				return ZUWENDUNGEN_GESAMT_EDEFAULT == null ? zuwendungenGesamt != null : !ZUWENDUNGEN_GESAMT_EDEFAULT.equals(zuwendungenGesamt);
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
		result.append(" (gesamtkosten: ");
		result.append(gesamtkosten);
		result.append(", voraussichtlicheErstattungGesetzlicheKrankenkasse: ");
		result.append(voraussichtlicheErstattungGesetzlicheKrankenkasse);
		result.append(", voraussichtlicheErstattungPrivateKrankenkasse: ");
		result.append(voraussichtlicheErstattungPrivateKrankenkasse);
		result.append(", voraussichtlicheErstattungBeihilfe: ");
		result.append(voraussichtlicheErstattungBeihilfe);
		result.append(", voraussichtlicheErstattungHeilfuersorge: ");
		result.append(voraussichtlicheErstattungHeilfuersorge);
		result.append(", verbleibenderEigenanteilSelbstkostenanteil: ");
		result.append(verbleibenderEigenanteilSelbstkostenanteil);
		result.append(", zuwendungenGesamt: ");
		result.append(zuwendungenGesamt);
		result.append(')');
		return result.toString();
	}

} //FinanzierungsplanTypeImpl
