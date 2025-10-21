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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AngabenSozialversicherungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Sozialversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl#isPflichtbeitraegeKrankenkasse <em>Pflichtbeitraege Krankenkasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl#isPflichtbeitraegeRentenversicherung <em>Pflichtbeitraege Rentenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl#isPflichtbeitraegeArbeitslosenversicherung <em>Pflichtbeitraege Arbeitslosenversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AngabenSozialversicherungTypeImpl#getNachweisPflichtbetrag <em>Nachweis Pflichtbetrag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenSozialversicherungTypeImpl extends MinimalEObjectImpl.Container implements AngabenSozialversicherungType {
	/**
	 * The default value of the '{@link #isPflichtbeitraegeKrankenkasse() <em>Pflichtbeitraege Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PFLICHTBEITRAEGE_KRANKENKASSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPflichtbeitraegeKrankenkasse() <em>Pflichtbeitraege Krankenkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeKrankenkasse()
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeKrankenkasse = PFLICHTBEITRAEGE_KRANKENKASSE_EDEFAULT;

	/**
	 * This is true if the Pflichtbeitraege Krankenkasse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeKrankenkasseESet;

	/**
	 * The default value of the '{@link #isPflichtbeitraegeRentenversicherung() <em>Pflichtbeitraege Rentenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeRentenversicherung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PFLICHTBEITRAEGE_RENTENVERSICHERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPflichtbeitraegeRentenversicherung() <em>Pflichtbeitraege Rentenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeRentenversicherung()
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeRentenversicherung = PFLICHTBEITRAEGE_RENTENVERSICHERUNG_EDEFAULT;

	/**
	 * This is true if the Pflichtbeitraege Rentenversicherung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeRentenversicherungESet;

	/**
	 * The default value of the '{@link #isPflichtbeitraegeArbeitslosenversicherung() <em>Pflichtbeitraege Arbeitslosenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeArbeitslosenversicherung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPflichtbeitraegeArbeitslosenversicherung() <em>Pflichtbeitraege Arbeitslosenversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPflichtbeitraegeArbeitslosenversicherung()
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeArbeitslosenversicherung = PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG_EDEFAULT;

	/**
	 * This is true if the Pflichtbeitraege Arbeitslosenversicherung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean pflichtbeitraegeArbeitslosenversicherungESet;

	/**
	 * The cached value of the '{@link #getNachweisPflichtbetrag() <em>Nachweis Pflichtbetrag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisPflichtbetrag()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisPflichtbetrag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenSozialversicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAngabenSozialversicherungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPflichtbeitraegeKrankenkasse() {
		return pflichtbeitraegeKrankenkasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPflichtbeitraegeKrankenkasse(boolean newPflichtbeitraegeKrankenkasse) {
		boolean oldPflichtbeitraegeKrankenkasse = pflichtbeitraegeKrankenkasse;
		pflichtbeitraegeKrankenkasse = newPflichtbeitraegeKrankenkasse;
		boolean oldPflichtbeitraegeKrankenkasseESet = pflichtbeitraegeKrankenkasseESet;
		pflichtbeitraegeKrankenkasseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE, oldPflichtbeitraegeKrankenkasse, pflichtbeitraegeKrankenkasse, !oldPflichtbeitraegeKrankenkasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPflichtbeitraegeKrankenkasse() {
		boolean oldPflichtbeitraegeKrankenkasse = pflichtbeitraegeKrankenkasse;
		boolean oldPflichtbeitraegeKrankenkasseESet = pflichtbeitraegeKrankenkasseESet;
		pflichtbeitraegeKrankenkasse = PFLICHTBEITRAEGE_KRANKENKASSE_EDEFAULT;
		pflichtbeitraegeKrankenkasseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE, oldPflichtbeitraegeKrankenkasse, PFLICHTBEITRAEGE_KRANKENKASSE_EDEFAULT, oldPflichtbeitraegeKrankenkasseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPflichtbeitraegeKrankenkasse() {
		return pflichtbeitraegeKrankenkasseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPflichtbeitraegeRentenversicherung() {
		return pflichtbeitraegeRentenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPflichtbeitraegeRentenversicherung(boolean newPflichtbeitraegeRentenversicherung) {
		boolean oldPflichtbeitraegeRentenversicherung = pflichtbeitraegeRentenversicherung;
		pflichtbeitraegeRentenversicherung = newPflichtbeitraegeRentenversicherung;
		boolean oldPflichtbeitraegeRentenversicherungESet = pflichtbeitraegeRentenversicherungESet;
		pflichtbeitraegeRentenversicherungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG, oldPflichtbeitraegeRentenversicherung, pflichtbeitraegeRentenversicherung, !oldPflichtbeitraegeRentenversicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPflichtbeitraegeRentenversicherung() {
		boolean oldPflichtbeitraegeRentenversicherung = pflichtbeitraegeRentenversicherung;
		boolean oldPflichtbeitraegeRentenversicherungESet = pflichtbeitraegeRentenversicherungESet;
		pflichtbeitraegeRentenversicherung = PFLICHTBEITRAEGE_RENTENVERSICHERUNG_EDEFAULT;
		pflichtbeitraegeRentenversicherungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG, oldPflichtbeitraegeRentenversicherung, PFLICHTBEITRAEGE_RENTENVERSICHERUNG_EDEFAULT, oldPflichtbeitraegeRentenversicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPflichtbeitraegeRentenversicherung() {
		return pflichtbeitraegeRentenversicherungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPflichtbeitraegeArbeitslosenversicherung() {
		return pflichtbeitraegeArbeitslosenversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPflichtbeitraegeArbeitslosenversicherung(boolean newPflichtbeitraegeArbeitslosenversicherung) {
		boolean oldPflichtbeitraegeArbeitslosenversicherung = pflichtbeitraegeArbeitslosenversicherung;
		pflichtbeitraegeArbeitslosenversicherung = newPflichtbeitraegeArbeitslosenversicherung;
		boolean oldPflichtbeitraegeArbeitslosenversicherungESet = pflichtbeitraegeArbeitslosenversicherungESet;
		pflichtbeitraegeArbeitslosenversicherungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG, oldPflichtbeitraegeArbeitslosenversicherung, pflichtbeitraegeArbeitslosenversicherung, !oldPflichtbeitraegeArbeitslosenversicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetPflichtbeitraegeArbeitslosenversicherung() {
		boolean oldPflichtbeitraegeArbeitslosenversicherung = pflichtbeitraegeArbeitslosenversicherung;
		boolean oldPflichtbeitraegeArbeitslosenversicherungESet = pflichtbeitraegeArbeitslosenversicherungESet;
		pflichtbeitraegeArbeitslosenversicherung = PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG_EDEFAULT;
		pflichtbeitraegeArbeitslosenversicherungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG, oldPflichtbeitraegeArbeitslosenversicherung, PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG_EDEFAULT, oldPflichtbeitraegeArbeitslosenversicherungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetPflichtbeitraegeArbeitslosenversicherung() {
		return pflichtbeitraegeArbeitslosenversicherungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisPflichtbetrag() {
		if (nachweisPflichtbetrag == null) {
			nachweisPflichtbetrag = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG);
		}
		return nachweisPflichtbetrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG:
				return ((InternalEList<?>)getNachweisPflichtbetrag()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE:
				return isPflichtbeitraegeKrankenkasse();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG:
				return isPflichtbeitraegeRentenversicherung();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG:
				return isPflichtbeitraegeArbeitslosenversicherung();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG:
				return getNachweisPflichtbetrag();
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
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE:
				setPflichtbeitraegeKrankenkasse((Boolean)newValue);
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG:
				setPflichtbeitraegeRentenversicherung((Boolean)newValue);
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG:
				setPflichtbeitraegeArbeitslosenversicherung((Boolean)newValue);
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG:
				getNachweisPflichtbetrag().clear();
				getNachweisPflichtbetrag().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE:
				unsetPflichtbeitraegeKrankenkasse();
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG:
				unsetPflichtbeitraegeRentenversicherung();
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG:
				unsetPflichtbeitraegeArbeitslosenversicherung();
				return;
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG:
				getNachweisPflichtbetrag().clear();
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
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_KRANKENKASSE:
				return isSetPflichtbeitraegeKrankenkasse();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_RENTENVERSICHERUNG:
				return isSetPflichtbeitraegeRentenversicherung();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__PFLICHTBEITRAEGE_ARBEITSLOSENVERSICHERUNG:
				return isSetPflichtbeitraegeArbeitslosenversicherung();
			case ElterngeldPackage.ANGABEN_SOZIALVERSICHERUNG_TYPE__NACHWEIS_PFLICHTBETRAG:
				return nachweisPflichtbetrag != null && !nachweisPflichtbetrag.isEmpty();
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
		result.append(" (pflichtbeitraegeKrankenkasse: ");
		if (pflichtbeitraegeKrankenkasseESet) result.append(pflichtbeitraegeKrankenkasse); else result.append("<unset>");
		result.append(", pflichtbeitraegeRentenversicherung: ");
		if (pflichtbeitraegeRentenversicherungESet) result.append(pflichtbeitraegeRentenversicherung); else result.append("<unset>");
		result.append(", pflichtbeitraegeArbeitslosenversicherung: ");
		if (pflichtbeitraegeArbeitslosenversicherungESet) result.append(pflichtbeitraegeArbeitslosenversicherung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenSozialversicherungTypeImpl
