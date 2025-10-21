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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BeistandType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.BetreuerType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.RechtsanwaltType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VertretungType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertretung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getArt <em>Art</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getVormund <em>Vormund</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getBeistand <em>Beistand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getAmtspflegschaft <em>Amtspflegschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getRechtsanwalt <em>Rechtsanwalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getBetreuer <em>Betreuer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VertretungTypeImpl#getOrganisationsname <em>Organisationsname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertretungTypeImpl extends MinimalEObjectImpl.Container implements VertretungType {
	/**
	 * The cached value of the '{@link #getArt() <em>Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArt()
	 * @generated
	 * @ordered
	 */
	protected CodeVertretungType art;

	/**
	 * The cached value of the '{@link #getVormund() <em>Vormund</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVormund()
	 * @generated
	 * @ordered
	 */
	protected VormundType vormund;

	/**
	 * The cached value of the '{@link #getBeistand() <em>Beistand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeistand()
	 * @generated
	 * @ordered
	 */
	protected BeistandType beistand;

	/**
	 * The cached value of the '{@link #getAmtspflegschaft() <em>Amtspflegschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmtspflegschaft()
	 * @generated
	 * @ordered
	 */
	protected AmtspflegendeType amtspflegschaft;

	/**
	 * The cached value of the '{@link #getRechtsanwalt() <em>Rechtsanwalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRechtsanwalt()
	 * @generated
	 * @ordered
	 */
	protected RechtsanwaltType rechtsanwalt;

	/**
	 * The cached value of the '{@link #getBetreuer() <em>Betreuer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBetreuer()
	 * @generated
	 * @ordered
	 */
	protected BetreuerType betreuer;

	/**
	 * The cached value of the '{@link #getOrganisationsname() <em>Organisationsname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationsname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> organisationsname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertretungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getVertretungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVertretungType getArt() {
		return art;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArt(CodeVertretungType newArt, NotificationChain msgs) {
		CodeVertretungType oldArt = art;
		art = newArt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART, oldArt, newArt);
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
	public void setArt(CodeVertretungType newArt) {
		if (newArt != art) {
			NotificationChain msgs = null;
			if (art != null)
				msgs = ((InternalEObject)art).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART, null, msgs);
			if (newArt != null)
				msgs = ((InternalEObject)newArt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART, null, msgs);
			msgs = basicSetArt(newArt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART, newArt, newArt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VormundType getVormund() {
		return vormund;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVormund(VormundType newVormund, NotificationChain msgs) {
		VormundType oldVormund = vormund;
		vormund = newVormund;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND, oldVormund, newVormund);
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
	public void setVormund(VormundType newVormund) {
		if (newVormund != vormund) {
			NotificationChain msgs = null;
			if (vormund != null)
				msgs = ((InternalEObject)vormund).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND, null, msgs);
			if (newVormund != null)
				msgs = ((InternalEObject)newVormund).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND, null, msgs);
			msgs = basicSetVormund(newVormund, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND, newVormund, newVormund));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeistandType getBeistand() {
		return beistand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeistand(BeistandType newBeistand, NotificationChain msgs) {
		BeistandType oldBeistand = beistand;
		beistand = newBeistand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND, oldBeistand, newBeistand);
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
	public void setBeistand(BeistandType newBeistand) {
		if (newBeistand != beistand) {
			NotificationChain msgs = null;
			if (beistand != null)
				msgs = ((InternalEObject)beistand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND, null, msgs);
			if (newBeistand != null)
				msgs = ((InternalEObject)newBeistand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND, null, msgs);
			msgs = basicSetBeistand(newBeistand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND, newBeistand, newBeistand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AmtspflegendeType getAmtspflegschaft() {
		return amtspflegschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAmtspflegschaft(AmtspflegendeType newAmtspflegschaft, NotificationChain msgs) {
		AmtspflegendeType oldAmtspflegschaft = amtspflegschaft;
		amtspflegschaft = newAmtspflegschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT, oldAmtspflegschaft, newAmtspflegschaft);
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
	public void setAmtspflegschaft(AmtspflegendeType newAmtspflegschaft) {
		if (newAmtspflegschaft != amtspflegschaft) {
			NotificationChain msgs = null;
			if (amtspflegschaft != null)
				msgs = ((InternalEObject)amtspflegschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT, null, msgs);
			if (newAmtspflegschaft != null)
				msgs = ((InternalEObject)newAmtspflegschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT, null, msgs);
			msgs = basicSetAmtspflegschaft(newAmtspflegschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT, newAmtspflegschaft, newAmtspflegschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RechtsanwaltType getRechtsanwalt() {
		return rechtsanwalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRechtsanwalt(RechtsanwaltType newRechtsanwalt, NotificationChain msgs) {
		RechtsanwaltType oldRechtsanwalt = rechtsanwalt;
		rechtsanwalt = newRechtsanwalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT, oldRechtsanwalt, newRechtsanwalt);
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
	public void setRechtsanwalt(RechtsanwaltType newRechtsanwalt) {
		if (newRechtsanwalt != rechtsanwalt) {
			NotificationChain msgs = null;
			if (rechtsanwalt != null)
				msgs = ((InternalEObject)rechtsanwalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT, null, msgs);
			if (newRechtsanwalt != null)
				msgs = ((InternalEObject)newRechtsanwalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT, null, msgs);
			msgs = basicSetRechtsanwalt(newRechtsanwalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT, newRechtsanwalt, newRechtsanwalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BetreuerType getBetreuer() {
		return betreuer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBetreuer(BetreuerType newBetreuer, NotificationChain msgs) {
		BetreuerType oldBetreuer = betreuer;
		betreuer = newBetreuer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER, oldBetreuer, newBetreuer);
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
	public void setBetreuer(BetreuerType newBetreuer) {
		if (newBetreuer != betreuer) {
			NotificationChain msgs = null;
			if (betreuer != null)
				msgs = ((InternalEObject)betreuer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER, null, msgs);
			if (newBetreuer != null)
				msgs = ((InternalEObject)newBetreuer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER, null, msgs);
			msgs = basicSetBetreuer(newBetreuer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER, newBetreuer, newBetreuer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOrganisationsname() {
		if (organisationsname == null) {
			organisationsname = new EDataTypeEList<String>(String.class, this, UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ORGANISATIONSNAME);
		}
		return organisationsname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART:
				return basicSetArt(null, msgs);
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND:
				return basicSetVormund(null, msgs);
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND:
				return basicSetBeistand(null, msgs);
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT:
				return basicSetAmtspflegschaft(null, msgs);
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT:
				return basicSetRechtsanwalt(null, msgs);
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER:
				return basicSetBetreuer(null, msgs);
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
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART:
				return getArt();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND:
				return getVormund();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND:
				return getBeistand();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT:
				return getAmtspflegschaft();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT:
				return getRechtsanwalt();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER:
				return getBetreuer();
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ORGANISATIONSNAME:
				return getOrganisationsname();
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
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART:
				setArt((CodeVertretungType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND:
				setVormund((VormundType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND:
				setBeistand((BeistandType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT:
				setAmtspflegschaft((AmtspflegendeType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT:
				setRechtsanwalt((RechtsanwaltType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER:
				setBetreuer((BetreuerType)newValue);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ORGANISATIONSNAME:
				getOrganisationsname().clear();
				getOrganisationsname().addAll((Collection<? extends String>)newValue);
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
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART:
				setArt((CodeVertretungType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND:
				setVormund((VormundType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND:
				setBeistand((BeistandType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT:
				setAmtspflegschaft((AmtspflegendeType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT:
				setRechtsanwalt((RechtsanwaltType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER:
				setBetreuer((BetreuerType)null);
				return;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ORGANISATIONSNAME:
				getOrganisationsname().clear();
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
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ART:
				return art != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__VORMUND:
				return vormund != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BEISTAND:
				return beistand != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__AMTSPFLEGSCHAFT:
				return amtspflegschaft != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__RECHTSANWALT:
				return rechtsanwalt != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__BETREUER:
				return betreuer != null;
			case UnterhaltsvorschussPackage.VERTRETUNG_TYPE__ORGANISATIONSNAME:
				return organisationsname != null && !organisationsname.isEmpty();
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
		result.append(" (organisationsname: ");
		result.append(organisationsname);
		result.append(')');
		return result.toString();
	}

} //VertretungTypeImpl
