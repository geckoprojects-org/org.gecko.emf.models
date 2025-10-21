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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AlterssicherungPflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.BeitragsuebernahmeUnfallversicherungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontakformularType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweiseEinreichenType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PauschalbetragVollzeitpflegeType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PflegepersonType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SonstigeAntraegeSendenType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adoptionundpflegekinder Pflegekinder0902 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getKontaktformular <em>Kontaktformular</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getNachweiseEinreichen <em>Nachweise Einreichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getPflegeperson <em>Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getSonstigeAntraegeSenden <em>Sonstige Antraege Senden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getBeitragsuebernahmeUnfallversicherung <em>Beitragsuebernahme Unfallversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getAlterssicherungPflegeperson <em>Alterssicherung Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AdoptionundpflegekinderPflegekinder0902TypeImpl#getPauschalbetragVollzeitpflege <em>Pauschalbetrag Vollzeitpflege</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdoptionundpflegekinderPflegekinder0902TypeImpl extends NachrichtTypeImpl implements AdoptionundpflegekinderPflegekinder0902Type {
	/**
	 * The cached value of the '{@link #getKontaktformular() <em>Kontaktformular</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKontaktformular()
	 * @generated
	 * @ordered
	 */
	protected KontakformularType kontaktformular;

	/**
	 * The cached value of the '{@link #getNachweiseEinreichen() <em>Nachweise Einreichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweiseEinreichen()
	 * @generated
	 * @ordered
	 */
	protected NachweiseEinreichenType nachweiseEinreichen;

	/**
	 * The cached value of the '{@link #getPflegeperson() <em>Pflegeperson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPflegeperson()
	 * @generated
	 * @ordered
	 */
	protected PflegepersonType pflegeperson;

	/**
	 * The cached value of the '{@link #getSonstigeAntraegeSenden() <em>Sonstige Antraege Senden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSonstigeAntraegeSenden()
	 * @generated
	 * @ordered
	 */
	protected SonstigeAntraegeSendenType sonstigeAntraegeSenden;

	/**
	 * The cached value of the '{@link #getBeitragsuebernahmeUnfallversicherung() <em>Beitragsuebernahme Unfallversicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeitragsuebernahmeUnfallversicherung()
	 * @generated
	 * @ordered
	 */
	protected BeitragsuebernahmeUnfallversicherungType beitragsuebernahmeUnfallversicherung;

	/**
	 * The cached value of the '{@link #getAlterssicherungPflegeperson() <em>Alterssicherung Pflegeperson</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlterssicherungPflegeperson()
	 * @generated
	 * @ordered
	 */
	protected AlterssicherungPflegepersonType alterssicherungPflegeperson;

	/**
	 * The cached value of the '{@link #getPauschalbetragVollzeitpflege() <em>Pauschalbetrag Vollzeitpflege</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPauschalbetragVollzeitpflege()
	 * @generated
	 * @ordered
	 */
	protected PauschalbetragVollzeitpflegeType pauschalbetragVollzeitpflege;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdoptionundpflegekinderPflegekinder0902TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontakformularType getKontaktformular() {
		return kontaktformular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKontaktformular(KontakformularType newKontaktformular, NotificationChain msgs) {
		KontakformularType oldKontaktformular = kontaktformular;
		kontaktformular = newKontaktformular;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR, oldKontaktformular, newKontaktformular);
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
	public void setKontaktformular(KontakformularType newKontaktformular) {
		if (newKontaktformular != kontaktformular) {
			NotificationChain msgs = null;
			if (kontaktformular != null)
				msgs = ((InternalEObject)kontaktformular).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR, null, msgs);
			if (newKontaktformular != null)
				msgs = ((InternalEObject)newKontaktformular).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR, null, msgs);
			msgs = basicSetKontaktformular(newKontaktformular, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR, newKontaktformular, newKontaktformular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseEinreichenType getNachweiseEinreichen() {
		return nachweiseEinreichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweiseEinreichen(NachweiseEinreichenType newNachweiseEinreichen, NotificationChain msgs) {
		NachweiseEinreichenType oldNachweiseEinreichen = nachweiseEinreichen;
		nachweiseEinreichen = newNachweiseEinreichen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN, oldNachweiseEinreichen, newNachweiseEinreichen);
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
	public void setNachweiseEinreichen(NachweiseEinreichenType newNachweiseEinreichen) {
		if (newNachweiseEinreichen != nachweiseEinreichen) {
			NotificationChain msgs = null;
			if (nachweiseEinreichen != null)
				msgs = ((InternalEObject)nachweiseEinreichen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN, null, msgs);
			if (newNachweiseEinreichen != null)
				msgs = ((InternalEObject)newNachweiseEinreichen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN, null, msgs);
			msgs = basicSetNachweiseEinreichen(newNachweiseEinreichen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN, newNachweiseEinreichen, newNachweiseEinreichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PflegepersonType getPflegeperson() {
		return pflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPflegeperson(PflegepersonType newPflegeperson, NotificationChain msgs) {
		PflegepersonType oldPflegeperson = pflegeperson;
		pflegeperson = newPflegeperson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON, oldPflegeperson, newPflegeperson);
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
	public void setPflegeperson(PflegepersonType newPflegeperson) {
		if (newPflegeperson != pflegeperson) {
			NotificationChain msgs = null;
			if (pflegeperson != null)
				msgs = ((InternalEObject)pflegeperson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON, null, msgs);
			if (newPflegeperson != null)
				msgs = ((InternalEObject)newPflegeperson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON, null, msgs);
			msgs = basicSetPflegeperson(newPflegeperson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON, newPflegeperson, newPflegeperson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SonstigeAntraegeSendenType getSonstigeAntraegeSenden() {
		return sonstigeAntraegeSenden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSonstigeAntraegeSenden(SonstigeAntraegeSendenType newSonstigeAntraegeSenden, NotificationChain msgs) {
		SonstigeAntraegeSendenType oldSonstigeAntraegeSenden = sonstigeAntraegeSenden;
		sonstigeAntraegeSenden = newSonstigeAntraegeSenden;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN, oldSonstigeAntraegeSenden, newSonstigeAntraegeSenden);
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
	public void setSonstigeAntraegeSenden(SonstigeAntraegeSendenType newSonstigeAntraegeSenden) {
		if (newSonstigeAntraegeSenden != sonstigeAntraegeSenden) {
			NotificationChain msgs = null;
			if (sonstigeAntraegeSenden != null)
				msgs = ((InternalEObject)sonstigeAntraegeSenden).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN, null, msgs);
			if (newSonstigeAntraegeSenden != null)
				msgs = ((InternalEObject)newSonstigeAntraegeSenden).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN, null, msgs);
			msgs = basicSetSonstigeAntraegeSenden(newSonstigeAntraegeSenden, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN, newSonstigeAntraegeSenden, newSonstigeAntraegeSenden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BeitragsuebernahmeUnfallversicherungType getBeitragsuebernahmeUnfallversicherung() {
		return beitragsuebernahmeUnfallversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeitragsuebernahmeUnfallversicherung(BeitragsuebernahmeUnfallversicherungType newBeitragsuebernahmeUnfallversicherung, NotificationChain msgs) {
		BeitragsuebernahmeUnfallversicherungType oldBeitragsuebernahmeUnfallversicherung = beitragsuebernahmeUnfallversicherung;
		beitragsuebernahmeUnfallversicherung = newBeitragsuebernahmeUnfallversicherung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG, oldBeitragsuebernahmeUnfallversicherung, newBeitragsuebernahmeUnfallversicherung);
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
	public void setBeitragsuebernahmeUnfallversicherung(BeitragsuebernahmeUnfallversicherungType newBeitragsuebernahmeUnfallversicherung) {
		if (newBeitragsuebernahmeUnfallversicherung != beitragsuebernahmeUnfallversicherung) {
			NotificationChain msgs = null;
			if (beitragsuebernahmeUnfallversicherung != null)
				msgs = ((InternalEObject)beitragsuebernahmeUnfallversicherung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG, null, msgs);
			if (newBeitragsuebernahmeUnfallversicherung != null)
				msgs = ((InternalEObject)newBeitragsuebernahmeUnfallversicherung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG, null, msgs);
			msgs = basicSetBeitragsuebernahmeUnfallversicherung(newBeitragsuebernahmeUnfallversicherung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG, newBeitragsuebernahmeUnfallversicherung, newBeitragsuebernahmeUnfallversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlterssicherungPflegepersonType getAlterssicherungPflegeperson() {
		return alterssicherungPflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlterssicherungPflegeperson(AlterssicherungPflegepersonType newAlterssicherungPflegeperson, NotificationChain msgs) {
		AlterssicherungPflegepersonType oldAlterssicherungPflegeperson = alterssicherungPflegeperson;
		alterssicherungPflegeperson = newAlterssicherungPflegeperson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON, oldAlterssicherungPflegeperson, newAlterssicherungPflegeperson);
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
	public void setAlterssicherungPflegeperson(AlterssicherungPflegepersonType newAlterssicherungPflegeperson) {
		if (newAlterssicherungPflegeperson != alterssicherungPflegeperson) {
			NotificationChain msgs = null;
			if (alterssicherungPflegeperson != null)
				msgs = ((InternalEObject)alterssicherungPflegeperson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON, null, msgs);
			if (newAlterssicherungPflegeperson != null)
				msgs = ((InternalEObject)newAlterssicherungPflegeperson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON, null, msgs);
			msgs = basicSetAlterssicherungPflegeperson(newAlterssicherungPflegeperson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON, newAlterssicherungPflegeperson, newAlterssicherungPflegeperson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PauschalbetragVollzeitpflegeType getPauschalbetragVollzeitpflege() {
		return pauschalbetragVollzeitpflege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPauschalbetragVollzeitpflege(PauschalbetragVollzeitpflegeType newPauschalbetragVollzeitpflege, NotificationChain msgs) {
		PauschalbetragVollzeitpflegeType oldPauschalbetragVollzeitpflege = pauschalbetragVollzeitpflege;
		pauschalbetragVollzeitpflege = newPauschalbetragVollzeitpflege;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE, oldPauschalbetragVollzeitpflege, newPauschalbetragVollzeitpflege);
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
	public void setPauschalbetragVollzeitpflege(PauschalbetragVollzeitpflegeType newPauschalbetragVollzeitpflege) {
		if (newPauschalbetragVollzeitpflege != pauschalbetragVollzeitpflege) {
			NotificationChain msgs = null;
			if (pauschalbetragVollzeitpflege != null)
				msgs = ((InternalEObject)pauschalbetragVollzeitpflege).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE, null, msgs);
			if (newPauschalbetragVollzeitpflege != null)
				msgs = ((InternalEObject)newPauschalbetragVollzeitpflege).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE, null, msgs);
			msgs = basicSetPauschalbetragVollzeitpflege(newPauschalbetragVollzeitpflege, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE, newPauschalbetragVollzeitpflege, newPauschalbetragVollzeitpflege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR:
				return basicSetKontaktformular(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN:
				return basicSetNachweiseEinreichen(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON:
				return basicSetPflegeperson(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN:
				return basicSetSonstigeAntraegeSenden(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG:
				return basicSetBeitragsuebernahmeUnfallversicherung(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON:
				return basicSetAlterssicherungPflegeperson(null, msgs);
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE:
				return basicSetPauschalbetragVollzeitpflege(null, msgs);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR:
				return getKontaktformular();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN:
				return getNachweiseEinreichen();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON:
				return getPflegeperson();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN:
				return getSonstigeAntraegeSenden();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG:
				return getBeitragsuebernahmeUnfallversicherung();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON:
				return getAlterssicherungPflegeperson();
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE:
				return getPauschalbetragVollzeitpflege();
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR:
				setKontaktformular((KontakformularType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN:
				setNachweiseEinreichen((NachweiseEinreichenType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON:
				setPflegeperson((PflegepersonType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN:
				setSonstigeAntraegeSenden((SonstigeAntraegeSendenType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG:
				setBeitragsuebernahmeUnfallversicherung((BeitragsuebernahmeUnfallversicherungType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON:
				setAlterssicherungPflegeperson((AlterssicherungPflegepersonType)newValue);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE:
				setPauschalbetragVollzeitpflege((PauschalbetragVollzeitpflegeType)newValue);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR:
				setKontaktformular((KontakformularType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN:
				setNachweiseEinreichen((NachweiseEinreichenType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON:
				setPflegeperson((PflegepersonType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN:
				setSonstigeAntraegeSenden((SonstigeAntraegeSendenType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG:
				setBeitragsuebernahmeUnfallversicherung((BeitragsuebernahmeUnfallversicherungType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON:
				setAlterssicherungPflegeperson((AlterssicherungPflegepersonType)null);
				return;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE:
				setPauschalbetragVollzeitpflege((PauschalbetragVollzeitpflegeType)null);
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
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__KONTAKTFORMULAR:
				return kontaktformular != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__NACHWEISE_EINREICHEN:
				return nachweiseEinreichen != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PFLEGEPERSON:
				return pflegeperson != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__SONSTIGE_ANTRAEGE_SENDEN:
				return sonstigeAntraegeSenden != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__BEITRAGSUEBERNAHME_UNFALLVERSICHERUNG:
				return beitragsuebernahmeUnfallversicherung != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__ALTERSSICHERUNG_PFLEGEPERSON:
				return alterssicherungPflegeperson != null;
			case AdoptionPackage.ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902_TYPE__PAUSCHALBETRAG_VOLLZEITPFLEGE:
				return pauschalbetragVollzeitpflege != null;
		}
		return super.eIsSet(featureID);
	}

} //AdoptionundpflegekinderPflegekinder0902TypeImpl
