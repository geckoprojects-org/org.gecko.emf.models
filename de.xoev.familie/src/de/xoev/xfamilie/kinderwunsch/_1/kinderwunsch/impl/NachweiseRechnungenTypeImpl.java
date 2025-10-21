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

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachweise Rechnungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl#getRechnungsdatum <em>Rechnungsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl#getRechnungssteller <em>Rechnungssteller</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl#getBetrag <em>Betrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl#getSummeGesamtkosten <em>Summe Gesamtkosten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl#getNachweis <em>Nachweis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachweiseRechnungenTypeImpl extends MinimalEObjectImpl.Container implements NachweiseRechnungenType {
	/**
	 * The default value of the '{@link #getRechnungsdatum() <em>Rechnungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechnungsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar RECHNUNGSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRechnungsdatum() <em>Rechnungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechnungsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar rechnungsdatum = RECHNUNGSDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRechnungssteller() <em>Rechnungssteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechnungssteller()
	 * @generated
	 * @ordered
	 */
	protected static final String RECHNUNGSSTELLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRechnungssteller() <em>Rechnungssteller</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechnungssteller()
	 * @generated
	 * @ordered
	 */
	protected String rechnungssteller = RECHNUNGSSTELLER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BETRAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBetrag() <em>Betrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetrag()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal betrag = BETRAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSummeGesamtkosten() <em>Summe Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummeGesamtkosten()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SUMME_GESAMTKOSTEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummeGesamtkosten() <em>Summe Gesamtkosten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummeGesamtkosten()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal summeGesamtkosten = SUMME_GESAMTKOSTEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType nachweis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachweiseRechnungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.NACHWEISE_RECHNUNGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRechnungsdatum() {
		return rechnungsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRechnungsdatum(XMLGregorianCalendar newRechnungsdatum) {
		XMLGregorianCalendar oldRechnungsdatum = rechnungsdatum;
		rechnungsdatum = newRechnungsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM, oldRechnungsdatum, rechnungsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRechnungssteller() {
		return rechnungssteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRechnungssteller(String newRechnungssteller) {
		String oldRechnungssteller = rechnungssteller;
		rechnungssteller = newRechnungssteller;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER, oldRechnungssteller, rechnungssteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBetrag() {
		return betrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBetrag(BigDecimal newBetrag) {
		BigDecimal oldBetrag = betrag;
		betrag = newBetrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__BETRAG, oldBetrag, betrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getSummeGesamtkosten() {
		return summeGesamtkosten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummeGesamtkosten(BigDecimal newSummeGesamtkosten) {
		BigDecimal oldSummeGesamtkosten = summeGesamtkosten;
		summeGesamtkosten = newSummeGesamtkosten;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN, oldSummeGesamtkosten, summeGesamtkosten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getNachweis() {
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweis(NachweisdokumentType newNachweis, NotificationChain msgs) {
		NachweisdokumentType oldNachweis = nachweis;
		nachweis = newNachweis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS, oldNachweis, newNachweis);
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
	public void setNachweis(NachweisdokumentType newNachweis) {
		if (newNachweis != nachweis) {
			NotificationChain msgs = null;
			if (nachweis != null)
				msgs = ((InternalEObject)nachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS, null, msgs);
			if (newNachweis != null)
				msgs = ((InternalEObject)newNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS, null, msgs);
			msgs = basicSetNachweis(newNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS, newNachweis, newNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS:
				return basicSetNachweis(null, msgs);
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
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM:
				return getRechnungsdatum();
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER:
				return getRechnungssteller();
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__BETRAG:
				return getBetrag();
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN:
				return getSummeGesamtkosten();
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS:
				return getNachweis();
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
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM:
				setRechnungsdatum((XMLGregorianCalendar)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER:
				setRechnungssteller((String)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__BETRAG:
				setBetrag((BigDecimal)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN:
				setSummeGesamtkosten((BigDecimal)newValue);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)newValue);
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
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM:
				setRechnungsdatum(RECHNUNGSDATUM_EDEFAULT);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER:
				setRechnungssteller(RECHNUNGSSTELLER_EDEFAULT);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__BETRAG:
				setBetrag(BETRAG_EDEFAULT);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN:
				setSummeGesamtkosten(SUMME_GESAMTKOSTEN_EDEFAULT);
				return;
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)null);
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
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM:
				return RECHNUNGSDATUM_EDEFAULT == null ? rechnungsdatum != null : !RECHNUNGSDATUM_EDEFAULT.equals(rechnungsdatum);
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER:
				return RECHNUNGSSTELLER_EDEFAULT == null ? rechnungssteller != null : !RECHNUNGSSTELLER_EDEFAULT.equals(rechnungssteller);
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__BETRAG:
				return BETRAG_EDEFAULT == null ? betrag != null : !BETRAG_EDEFAULT.equals(betrag);
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN:
				return SUMME_GESAMTKOSTEN_EDEFAULT == null ? summeGesamtkosten != null : !SUMME_GESAMTKOSTEN_EDEFAULT.equals(summeGesamtkosten);
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS:
				return nachweis != null;
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
		result.append(" (rechnungsdatum: ");
		result.append(rechnungsdatum);
		result.append(", rechnungssteller: ");
		result.append(rechnungssteller);
		result.append(", betrag: ");
		result.append(betrag);
		result.append(", summeGesamtkosten: ");
		result.append(summeGesamtkosten);
		result.append(')');
		return result.toString();
	}

} //NachweiseRechnungenTypeImpl
