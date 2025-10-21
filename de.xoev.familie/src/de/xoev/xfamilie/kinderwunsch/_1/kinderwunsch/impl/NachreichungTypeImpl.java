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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachreichung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl#getArtNachreichung <em>Art Nachreichung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NachreichungTypeImpl extends MinimalEObjectImpl.Container implements NachreichungType {
	/**
	 * The cached value of the '{@link #getArtNachreichung() <em>Art Nachreichung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtNachreichung()
	 * @generated
	 * @ordered
	 */
	protected ArtNachreichungType artNachreichung;

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
	 * The default value of the '{@link #isEinwilligungDatenverarbeitungDurchFoerderstelle() <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEinwilligungDatenverarbeitungDurchFoerderstelle() <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungDatenverarbeitungDurchFoerderstelle = EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE_EDEFAULT;

	/**
	 * This is true if the Einwilligung Datenverarbeitung Durch Foerderstelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einwilligungDatenverarbeitungDurchFoerderstelleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NachreichungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.NACHREICHUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtNachreichungType getArtNachreichung() {
		return artNachreichung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtNachreichung(ArtNachreichungType newArtNachreichung, NotificationChain msgs) {
		ArtNachreichungType oldArtNachreichung = artNachreichung;
		artNachreichung = newArtNachreichung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG, oldArtNachreichung, newArtNachreichung);
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
	public void setArtNachreichung(ArtNachreichungType newArtNachreichung) {
		if (newArtNachreichung != artNachreichung) {
			NotificationChain msgs = null;
			if (artNachreichung != null)
				msgs = ((InternalEObject)artNachreichung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG, null, msgs);
			if (newArtNachreichung != null)
				msgs = ((InternalEObject)newArtNachreichung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG, null, msgs);
			msgs = basicSetArtNachreichung(newArtNachreichung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG, newArtNachreichung, newArtNachreichung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS, oldNachweis, newNachweis);
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
				msgs = ((InternalEObject)nachweis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS, null, msgs);
			if (newNachweis != null)
				msgs = ((InternalEObject)newNachweis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS, null, msgs);
			msgs = basicSetNachweis(newNachweis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS, newNachweis, newNachweis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEinwilligungDatenverarbeitungDurchFoerderstelle() {
		return einwilligungDatenverarbeitungDurchFoerderstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinwilligungDatenverarbeitungDurchFoerderstelle(boolean newEinwilligungDatenverarbeitungDurchFoerderstelle) {
		boolean oldEinwilligungDatenverarbeitungDurchFoerderstelle = einwilligungDatenverarbeitungDurchFoerderstelle;
		einwilligungDatenverarbeitungDurchFoerderstelle = newEinwilligungDatenverarbeitungDurchFoerderstelle;
		boolean oldEinwilligungDatenverarbeitungDurchFoerderstelleESet = einwilligungDatenverarbeitungDurchFoerderstelleESet;
		einwilligungDatenverarbeitungDurchFoerderstelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE, oldEinwilligungDatenverarbeitungDurchFoerderstelle, einwilligungDatenverarbeitungDurchFoerderstelle, !oldEinwilligungDatenverarbeitungDurchFoerderstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinwilligungDatenverarbeitungDurchFoerderstelle() {
		boolean oldEinwilligungDatenverarbeitungDurchFoerderstelle = einwilligungDatenverarbeitungDurchFoerderstelle;
		boolean oldEinwilligungDatenverarbeitungDurchFoerderstelleESet = einwilligungDatenverarbeitungDurchFoerderstelleESet;
		einwilligungDatenverarbeitungDurchFoerderstelle = EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE_EDEFAULT;
		einwilligungDatenverarbeitungDurchFoerderstelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE, oldEinwilligungDatenverarbeitungDurchFoerderstelle, EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE_EDEFAULT, oldEinwilligungDatenverarbeitungDurchFoerderstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinwilligungDatenverarbeitungDurchFoerderstelle() {
		return einwilligungDatenverarbeitungDurchFoerderstelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG:
				return basicSetArtNachreichung(null, msgs);
			case KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS:
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
			case KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG:
				return getArtNachreichung();
			case KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS:
				return getNachweis();
			case KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE:
				return isEinwilligungDatenverarbeitungDurchFoerderstelle();
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
			case KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG:
				setArtNachreichung((ArtNachreichungType)newValue);
				return;
			case KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)newValue);
				return;
			case KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE:
				setEinwilligungDatenverarbeitungDurchFoerderstelle((Boolean)newValue);
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
			case KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG:
				setArtNachreichung((ArtNachreichungType)null);
				return;
			case KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS:
				setNachweis((NachweisdokumentType)null);
				return;
			case KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE:
				unsetEinwilligungDatenverarbeitungDurchFoerderstelle();
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
			case KinderwunschPackage.NACHREICHUNG_TYPE__ART_NACHREICHUNG:
				return artNachreichung != null;
			case KinderwunschPackage.NACHREICHUNG_TYPE__NACHWEIS:
				return nachweis != null;
			case KinderwunschPackage.NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE:
				return isSetEinwilligungDatenverarbeitungDurchFoerderstelle();
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
		result.append(" (einwilligungDatenverarbeitungDurchFoerderstelle: ");
		if (einwilligungDatenverarbeitungDurchFoerderstelleESet) result.append(einwilligungDatenverarbeitungDurchFoerderstelle); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NachreichungTypeImpl
