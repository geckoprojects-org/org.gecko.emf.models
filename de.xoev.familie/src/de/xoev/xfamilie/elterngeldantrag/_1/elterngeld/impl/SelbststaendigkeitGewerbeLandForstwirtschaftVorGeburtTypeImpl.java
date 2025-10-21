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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.SelbststaendigkeitVerschiebetatbestaendeType;

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
 * An implementation of the model object '<em><b>Selbststaendigkeit Gewerbe Land Forstwirtschaft Vor Geburt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl#getAngabenSozialversicherung <em>Angaben Sozialversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl#isKirchensteuerpflicht <em>Kirchensteuerpflicht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl#getVerschiebetatbestaende <em>Verschiebetatbestaende</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl#isSteuerfreibetrag <em>Steuerfreibetrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl#getNachweisEinkommenssteuerbescheid <em>Nachweis Einkommenssteuerbescheid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl extends MinimalEObjectImpl.Container implements SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType {
	/**
	 * The cached value of the '{@link #getAngabenSozialversicherung() <em>Angaben Sozialversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenSozialversicherung()
	 * @generated
	 * @ordered
	 */
	protected AngabenSozialversicherungType angabenSozialversicherung;

	/**
	 * The default value of the '{@link #isKirchensteuerpflicht() <em>Kirchensteuerpflicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKirchensteuerpflicht()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KIRCHENSTEUERPFLICHT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKirchensteuerpflicht() <em>Kirchensteuerpflicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKirchensteuerpflicht()
	 * @generated
	 * @ordered
	 */
	protected boolean kirchensteuerpflicht = KIRCHENSTEUERPFLICHT_EDEFAULT;

	/**
	 * This is true if the Kirchensteuerpflicht attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kirchensteuerpflichtESet;

	/**
	 * The cached value of the '{@link #getVerschiebetatbestaende() <em>Verschiebetatbestaende</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerschiebetatbestaende()
	 * @generated
	 * @ordered
	 */
	protected SelbststaendigkeitVerschiebetatbestaendeType verschiebetatbestaende;

	/**
	 * The default value of the '{@link #isSteuerfreibetrag() <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetrag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STEUERFREIBETRAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSteuerfreibetrag() <em>Steuerfreibetrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSteuerfreibetrag()
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetrag = STEUERFREIBETRAG_EDEFAULT;

	/**
	 * This is true if the Steuerfreibetrag attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean steuerfreibetragESet;

	/**
	 * The cached value of the '{@link #getNachweisEinkommenssteuerbescheid() <em>Nachweis Einkommenssteuerbescheid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweisEinkommenssteuerbescheid()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisdokumentType> nachweisEinkommenssteuerbescheid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getSelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenSozialversicherungType getAngabenSozialversicherung() {
		return angabenSozialversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenSozialversicherung(AngabenSozialversicherungType newAngabenSozialversicherung, NotificationChain msgs) {
		AngabenSozialversicherungType oldAngabenSozialversicherung = angabenSozialversicherung;
		angabenSozialversicherung = newAngabenSozialversicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG, oldAngabenSozialversicherung, newAngabenSozialversicherung);
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
	public void setAngabenSozialversicherung(AngabenSozialversicherungType newAngabenSozialversicherung) {
		if (newAngabenSozialversicherung != angabenSozialversicherung) {
			NotificationChain msgs = null;
			if (angabenSozialversicherung != null)
				msgs = ((InternalEObject)angabenSozialversicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG, null, msgs);
			if (newAngabenSozialversicherung != null)
				msgs = ((InternalEObject)newAngabenSozialversicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG, null, msgs);
			msgs = basicSetAngabenSozialversicherung(newAngabenSozialversicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG, newAngabenSozialversicherung, newAngabenSozialversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKirchensteuerpflicht() {
		return kirchensteuerpflicht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKirchensteuerpflicht(boolean newKirchensteuerpflicht) {
		boolean oldKirchensteuerpflicht = kirchensteuerpflicht;
		kirchensteuerpflicht = newKirchensteuerpflicht;
		boolean oldKirchensteuerpflichtESet = kirchensteuerpflichtESet;
		kirchensteuerpflichtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT, oldKirchensteuerpflicht, kirchensteuerpflicht, !oldKirchensteuerpflichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKirchensteuerpflicht() {
		boolean oldKirchensteuerpflicht = kirchensteuerpflicht;
		boolean oldKirchensteuerpflichtESet = kirchensteuerpflichtESet;
		kirchensteuerpflicht = KIRCHENSTEUERPFLICHT_EDEFAULT;
		kirchensteuerpflichtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT, oldKirchensteuerpflicht, KIRCHENSTEUERPFLICHT_EDEFAULT, oldKirchensteuerpflichtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKirchensteuerpflicht() {
		return kirchensteuerpflichtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SelbststaendigkeitVerschiebetatbestaendeType getVerschiebetatbestaende() {
		return verschiebetatbestaende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerschiebetatbestaende(SelbststaendigkeitVerschiebetatbestaendeType newVerschiebetatbestaende, NotificationChain msgs) {
		SelbststaendigkeitVerschiebetatbestaendeType oldVerschiebetatbestaende = verschiebetatbestaende;
		verschiebetatbestaende = newVerschiebetatbestaende;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE, oldVerschiebetatbestaende, newVerschiebetatbestaende);
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
	public void setVerschiebetatbestaende(SelbststaendigkeitVerschiebetatbestaendeType newVerschiebetatbestaende) {
		if (newVerschiebetatbestaende != verschiebetatbestaende) {
			NotificationChain msgs = null;
			if (verschiebetatbestaende != null)
				msgs = ((InternalEObject)verschiebetatbestaende).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE, null, msgs);
			if (newVerschiebetatbestaende != null)
				msgs = ((InternalEObject)newVerschiebetatbestaende).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE, null, msgs);
			msgs = basicSetVerschiebetatbestaende(newVerschiebetatbestaende, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE, newVerschiebetatbestaende, newVerschiebetatbestaende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSteuerfreibetrag() {
		return steuerfreibetrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSteuerfreibetrag(boolean newSteuerfreibetrag) {
		boolean oldSteuerfreibetrag = steuerfreibetrag;
		steuerfreibetrag = newSteuerfreibetrag;
		boolean oldSteuerfreibetragESet = steuerfreibetragESet;
		steuerfreibetragESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, steuerfreibetrag, !oldSteuerfreibetragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSteuerfreibetrag() {
		boolean oldSteuerfreibetrag = steuerfreibetrag;
		boolean oldSteuerfreibetragESet = steuerfreibetragESet;
		steuerfreibetrag = STEUERFREIBETRAG_EDEFAULT;
		steuerfreibetragESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG, oldSteuerfreibetrag, STEUERFREIBETRAG_EDEFAULT, oldSteuerfreibetragESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSteuerfreibetrag() {
		return steuerfreibetragESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisdokumentType> getNachweisEinkommenssteuerbescheid() {
		if (nachweisEinkommenssteuerbescheid == null) {
			nachweisEinkommenssteuerbescheid = new EObjectContainmentEList<NachweisdokumentType>(NachweisdokumentType.class, this, ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID);
		}
		return nachweisEinkommenssteuerbescheid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG:
				return basicSetAngabenSozialversicherung(null, msgs);
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE:
				return basicSetVerschiebetatbestaende(null, msgs);
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return ((InternalEList<?>)getNachweisEinkommenssteuerbescheid()).basicRemove(otherEnd, msgs);
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
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG:
				return getAngabenSozialversicherung();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT:
				return isKirchensteuerpflicht();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE:
				return getVerschiebetatbestaende();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				return isSteuerfreibetrag();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return getNachweisEinkommenssteuerbescheid();
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
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG:
				setAngabenSozialversicherung((AngabenSozialversicherungType)newValue);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT:
				setKirchensteuerpflicht((Boolean)newValue);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE:
				setVerschiebetatbestaende((SelbststaendigkeitVerschiebetatbestaendeType)newValue);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				setSteuerfreibetrag((Boolean)newValue);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				getNachweisEinkommenssteuerbescheid().clear();
				getNachweisEinkommenssteuerbescheid().addAll((Collection<? extends NachweisdokumentType>)newValue);
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
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG:
				setAngabenSozialversicherung((AngabenSozialversicherungType)null);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT:
				unsetKirchensteuerpflicht();
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE:
				setVerschiebetatbestaende((SelbststaendigkeitVerschiebetatbestaendeType)null);
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				unsetSteuerfreibetrag();
				return;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				getNachweisEinkommenssteuerbescheid().clear();
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
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__ANGABEN_SOZIALVERSICHERUNG:
				return angabenSozialversicherung != null;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__KIRCHENSTEUERPFLICHT:
				return isSetKirchensteuerpflicht();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__VERSCHIEBETATBESTAENDE:
				return verschiebetatbestaende != null;
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__STEUERFREIBETRAG:
				return isSetSteuerfreibetrag();
			case ElterngeldPackage.SELBSTSTAENDIGKEIT_GEWERBE_LAND_FORSTWIRTSCHAFT_VOR_GEBURT_TYPE__NACHWEIS_EINKOMMENSSTEUERBESCHEID:
				return nachweisEinkommenssteuerbescheid != null && !nachweisEinkommenssteuerbescheid.isEmpty();
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
		result.append(" (kirchensteuerpflicht: ");
		if (kirchensteuerpflichtESet) result.append(kirchensteuerpflicht); else result.append("<unset>");
		result.append(", steuerfreibetrag: ");
		if (steuerfreibetragESet) result.append(steuerfreibetrag); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SelbststaendigkeitGewerbeLandForstwirtschaftVorGeburtTypeImpl
