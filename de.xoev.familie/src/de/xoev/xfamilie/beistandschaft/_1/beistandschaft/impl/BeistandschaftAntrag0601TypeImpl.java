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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType;
import de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AndererElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumUnterhaltType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AnliegensklaerungBSSType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AntragstellenderElternteilType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftAntrag0601Type;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.NachweiseBSSType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antrag0601 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getAnliegensklaerung <em>Anliegensklaerung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getAngabenZumKind <em>Angaben Zum Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getAngabenZumAnderenElternteil <em>Angaben Zum Anderen Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getAngabenZumUnterhalt <em>Angaben Zum Unterhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#isWartenAufUnterschrift <em>Warten Auf Unterschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getDsgvo <em>Dsgvo</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#isRichtigkeitDerAngaben <em>Richtigkeit Der Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#getPdfAntrag <em>Pdf Antrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.BeistandschaftAntrag0601TypeImpl#isMerkblattUVG <em>Merkblatt UVG</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeistandschaftAntrag0601TypeImpl extends AntragsnachrichtTypeImpl implements BeistandschaftAntrag0601Type {
	/**
	 * The cached value of the '{@link #getAnliegensklaerung() <em>Anliegensklaerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnliegensklaerung()
	 * @generated
	 * @ordered
	 */
	protected AnliegensklaerungBSSType anliegensklaerung;

	/**
	 * The cached value of the '{@link #getAntragstellenderElternteil() <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 * @ordered
	 */
	protected AntragstellenderElternteilType antragstellenderElternteil;

	/**
	 * The cached value of the '{@link #getAngabenZumKind() <em>Angaben Zum Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumKind()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumKindType angabenZumKind;

	/**
	 * The cached value of the '{@link #getAngabenZumAnderenElternteil() <em>Angaben Zum Anderen Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumAnderenElternteil()
	 * @generated
	 * @ordered
	 */
	protected AndererElternteilType angabenZumAnderenElternteil;

	/**
	 * The cached value of the '{@link #getAngabenZumUnterhalt() <em>Angaben Zum Unterhalt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZumUnterhalt()
	 * @generated
	 * @ordered
	 */
	protected AngabenZumUnterhaltType angabenZumUnterhalt;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected NachweiseBSSType nachweise;

	/**
	 * The default value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARTEN_AUF_UNTERSCHRIFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWartenAufUnterschrift() <em>Warten Auf Unterschrift</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWartenAufUnterschrift()
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;

	/**
	 * This is true if the Warten Auf Unterschrift attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wartenAufUnterschriftESet;

	/**
	 * The cached value of the '{@link #getDsgvo() <em>Dsgvo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDsgvo()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzerklaerungenType dsgvo;

	/**
	 * The default value of the '{@link #isRichtigkeitDerAngaben() <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RICHTIGKEIT_DER_ANGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRichtigkeitDerAngaben() <em>Richtigkeit Der Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRichtigkeitDerAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitDerAngaben = RICHTIGKEIT_DER_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Richtigkeit Der Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean richtigkeitDerAngabenESet;

	/**
	 * The cached value of the '{@link #getPdfAntrag() <em>Pdf Antrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdfAntrag()
	 * @generated
	 * @ordered
	 */
	protected NachweisdokumentType pdfAntrag;

	/**
	 * The default value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MERKBLATT_UVG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMerkblattUVG() <em>Merkblatt UVG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMerkblattUVG()
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVG = MERKBLATT_UVG_EDEFAULT;

	/**
	 * This is true if the Merkblatt UVG attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean merkblattUVGESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeistandschaftAntrag0601TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.BEISTANDSCHAFT_ANTRAG0601_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnliegensklaerungBSSType getAnliegensklaerung() {
		return anliegensklaerung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnliegensklaerung(AnliegensklaerungBSSType newAnliegensklaerung, NotificationChain msgs) {
		AnliegensklaerungBSSType oldAnliegensklaerung = anliegensklaerung;
		anliegensklaerung = newAnliegensklaerung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG, oldAnliegensklaerung, newAnliegensklaerung);
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
	public void setAnliegensklaerung(AnliegensklaerungBSSType newAnliegensklaerung) {
		if (newAnliegensklaerung != anliegensklaerung) {
			NotificationChain msgs = null;
			if (anliegensklaerung != null)
				msgs = ((InternalEObject)anliegensklaerung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG, null, msgs);
			if (newAnliegensklaerung != null)
				msgs = ((InternalEObject)newAnliegensklaerung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG, null, msgs);
			msgs = basicSetAnliegensklaerung(newAnliegensklaerung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG, newAnliegensklaerung, newAnliegensklaerung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AntragstellenderElternteilType getAntragstellenderElternteil() {
		return antragstellenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellenderElternteil(AntragstellenderElternteilType newAntragstellenderElternteil, NotificationChain msgs) {
		AntragstellenderElternteilType oldAntragstellenderElternteil = antragstellenderElternteil;
		antragstellenderElternteil = newAntragstellenderElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, oldAntragstellenderElternteil, newAntragstellenderElternteil);
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
	public void setAntragstellenderElternteil(AntragstellenderElternteilType newAntragstellenderElternteil) {
		if (newAntragstellenderElternteil != antragstellenderElternteil) {
			NotificationChain msgs = null;
			if (antragstellenderElternteil != null)
				msgs = ((InternalEObject)antragstellenderElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			if (newAntragstellenderElternteil != null)
				msgs = ((InternalEObject)newAntragstellenderElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, null, msgs);
			msgs = basicSetAntragstellenderElternteil(newAntragstellenderElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL, newAntragstellenderElternteil, newAntragstellenderElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumKindType getAngabenZumKind() {
		return angabenZumKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumKind(AngabenZumKindType newAngabenZumKind, NotificationChain msgs) {
		AngabenZumKindType oldAngabenZumKind = angabenZumKind;
		angabenZumKind = newAngabenZumKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND, oldAngabenZumKind, newAngabenZumKind);
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
	public void setAngabenZumKind(AngabenZumKindType newAngabenZumKind) {
		if (newAngabenZumKind != angabenZumKind) {
			NotificationChain msgs = null;
			if (angabenZumKind != null)
				msgs = ((InternalEObject)angabenZumKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			if (newAngabenZumKind != null)
				msgs = ((InternalEObject)newAngabenZumKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND, null, msgs);
			msgs = basicSetAngabenZumKind(newAngabenZumKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND, newAngabenZumKind, newAngabenZumKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AndererElternteilType getAngabenZumAnderenElternteil() {
		return angabenZumAnderenElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumAnderenElternteil(AndererElternteilType newAngabenZumAnderenElternteil, NotificationChain msgs) {
		AndererElternteilType oldAngabenZumAnderenElternteil = angabenZumAnderenElternteil;
		angabenZumAnderenElternteil = newAngabenZumAnderenElternteil;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, oldAngabenZumAnderenElternteil, newAngabenZumAnderenElternteil);
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
	public void setAngabenZumAnderenElternteil(AndererElternteilType newAngabenZumAnderenElternteil) {
		if (newAngabenZumAnderenElternteil != angabenZumAnderenElternteil) {
			NotificationChain msgs = null;
			if (angabenZumAnderenElternteil != null)
				msgs = ((InternalEObject)angabenZumAnderenElternteil).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, null, msgs);
			if (newAngabenZumAnderenElternteil != null)
				msgs = ((InternalEObject)newAngabenZumAnderenElternteil).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, null, msgs);
			msgs = basicSetAngabenZumAnderenElternteil(newAngabenZumAnderenElternteil, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL, newAngabenZumAnderenElternteil, newAngabenZumAnderenElternteil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZumUnterhaltType getAngabenZumUnterhalt() {
		return angabenZumUnterhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZumUnterhalt(AngabenZumUnterhaltType newAngabenZumUnterhalt, NotificationChain msgs) {
		AngabenZumUnterhaltType oldAngabenZumUnterhalt = angabenZumUnterhalt;
		angabenZumUnterhalt = newAngabenZumUnterhalt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT, oldAngabenZumUnterhalt, newAngabenZumUnterhalt);
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
	public void setAngabenZumUnterhalt(AngabenZumUnterhaltType newAngabenZumUnterhalt) {
		if (newAngabenZumUnterhalt != angabenZumUnterhalt) {
			NotificationChain msgs = null;
			if (angabenZumUnterhalt != null)
				msgs = ((InternalEObject)angabenZumUnterhalt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT, null, msgs);
			if (newAngabenZumUnterhalt != null)
				msgs = ((InternalEObject)newAngabenZumUnterhalt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT, null, msgs);
			msgs = basicSetAngabenZumUnterhalt(newAngabenZumUnterhalt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT, newAngabenZumUnterhalt, newAngabenZumUnterhalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseBSSType getNachweise() {
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweise(NachweiseBSSType newNachweise, NotificationChain msgs) {
		NachweiseBSSType oldNachweise = nachweise;
		nachweise = newNachweise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE, oldNachweise, newNachweise);
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
	public void setNachweise(NachweiseBSSType newNachweise) {
		if (newNachweise != nachweise) {
			NotificationChain msgs = null;
			if (nachweise != null)
				msgs = ((InternalEObject)nachweise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE, null, msgs);
			if (newNachweise != null)
				msgs = ((InternalEObject)newNachweise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE, null, msgs);
			msgs = basicSetNachweise(newNachweise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE, newNachweise, newNachweise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWartenAufUnterschrift() {
		return wartenAufUnterschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWartenAufUnterschrift(boolean newWartenAufUnterschrift) {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		wartenAufUnterschrift = newWartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschriftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, wartenAufUnterschrift, !oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWartenAufUnterschrift() {
		boolean oldWartenAufUnterschrift = wartenAufUnterschrift;
		boolean oldWartenAufUnterschriftESet = wartenAufUnterschriftESet;
		wartenAufUnterschrift = WARTEN_AUF_UNTERSCHRIFT_EDEFAULT;
		wartenAufUnterschriftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT, oldWartenAufUnterschrift, WARTEN_AUF_UNTERSCHRIFT_EDEFAULT, oldWartenAufUnterschriftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWartenAufUnterschrift() {
		return wartenAufUnterschriftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzerklaerungenType getDsgvo() {
		return dsgvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsgvo(DatenschutzerklaerungenType newDsgvo, NotificationChain msgs) {
		DatenschutzerklaerungenType oldDsgvo = dsgvo;
		dsgvo = newDsgvo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO, oldDsgvo, newDsgvo);
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
	public void setDsgvo(DatenschutzerklaerungenType newDsgvo) {
		if (newDsgvo != dsgvo) {
			NotificationChain msgs = null;
			if (dsgvo != null)
				msgs = ((InternalEObject)dsgvo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO, null, msgs);
			if (newDsgvo != null)
				msgs = ((InternalEObject)newDsgvo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO, null, msgs);
			msgs = basicSetDsgvo(newDsgvo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO, newDsgvo, newDsgvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRichtigkeitDerAngaben() {
		return richtigkeitDerAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRichtigkeitDerAngaben(boolean newRichtigkeitDerAngaben) {
		boolean oldRichtigkeitDerAngaben = richtigkeitDerAngaben;
		richtigkeitDerAngaben = newRichtigkeitDerAngaben;
		boolean oldRichtigkeitDerAngabenESet = richtigkeitDerAngabenESet;
		richtigkeitDerAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN, oldRichtigkeitDerAngaben, richtigkeitDerAngaben, !oldRichtigkeitDerAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetRichtigkeitDerAngaben() {
		boolean oldRichtigkeitDerAngaben = richtigkeitDerAngaben;
		boolean oldRichtigkeitDerAngabenESet = richtigkeitDerAngabenESet;
		richtigkeitDerAngaben = RICHTIGKEIT_DER_ANGABEN_EDEFAULT;
		richtigkeitDerAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN, oldRichtigkeitDerAngaben, RICHTIGKEIT_DER_ANGABEN_EDEFAULT, oldRichtigkeitDerAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetRichtigkeitDerAngaben() {
		return richtigkeitDerAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisdokumentType getPdfAntrag() {
		return pdfAntrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPdfAntrag(NachweisdokumentType newPdfAntrag, NotificationChain msgs) {
		NachweisdokumentType oldPdfAntrag = pdfAntrag;
		pdfAntrag = newPdfAntrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG, oldPdfAntrag, newPdfAntrag);
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
	public void setPdfAntrag(NachweisdokumentType newPdfAntrag) {
		if (newPdfAntrag != pdfAntrag) {
			NotificationChain msgs = null;
			if (pdfAntrag != null)
				msgs = ((InternalEObject)pdfAntrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG, null, msgs);
			if (newPdfAntrag != null)
				msgs = ((InternalEObject)newPdfAntrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG, null, msgs);
			msgs = basicSetPdfAntrag(newPdfAntrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG, newPdfAntrag, newPdfAntrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMerkblattUVG() {
		return merkblattUVG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerkblattUVG(boolean newMerkblattUVG) {
		boolean oldMerkblattUVG = merkblattUVG;
		merkblattUVG = newMerkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVGESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG, oldMerkblattUVG, merkblattUVG, !oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMerkblattUVG() {
		boolean oldMerkblattUVG = merkblattUVG;
		boolean oldMerkblattUVGESet = merkblattUVGESet;
		merkblattUVG = MERKBLATT_UVG_EDEFAULT;
		merkblattUVGESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG, oldMerkblattUVG, MERKBLATT_UVG_EDEFAULT, oldMerkblattUVGESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMerkblattUVG() {
		return merkblattUVGESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG:
				return basicSetAnliegensklaerung(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return basicSetAntragstellenderElternteil(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND:
				return basicSetAngabenZumKind(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				return basicSetAngabenZumAnderenElternteil(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT:
				return basicSetAngabenZumUnterhalt(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE:
				return basicSetNachweise(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO:
				return basicSetDsgvo(null, msgs);
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG:
				return basicSetPdfAntrag(null, msgs);
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
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG:
				return getAnliegensklaerung();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return getAntragstellenderElternteil();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND:
				return getAngabenZumKind();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				return getAngabenZumAnderenElternteil();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT:
				return getAngabenZumUnterhalt();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE:
				return getNachweise();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isWartenAufUnterschrift();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO:
				return getDsgvo();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN:
				return isRichtigkeitDerAngaben();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG:
				return getPdfAntrag();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG:
				return isMerkblattUVG();
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
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG:
				setAnliegensklaerung((AnliegensklaerungBSSType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				setAngabenZumAnderenElternteil((AndererElternteilType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT:
				setAngabenZumUnterhalt((AngabenZumUnterhaltType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE:
				setNachweise((NachweiseBSSType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				setWartenAufUnterschrift((Boolean)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN:
				setRichtigkeitDerAngaben((Boolean)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG:
				setPdfAntrag((NachweisdokumentType)newValue);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG:
				setMerkblattUVG((Boolean)newValue);
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
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG:
				setAnliegensklaerung((AnliegensklaerungBSSType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				setAntragstellenderElternteil((AntragstellenderElternteilType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND:
				setAngabenZumKind((AngabenZumKindType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				setAngabenZumAnderenElternteil((AndererElternteilType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT:
				setAngabenZumUnterhalt((AngabenZumUnterhaltType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE:
				setNachweise((NachweiseBSSType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				unsetWartenAufUnterschrift();
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO:
				setDsgvo((DatenschutzerklaerungenType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN:
				unsetRichtigkeitDerAngaben();
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG:
				setPdfAntrag((NachweisdokumentType)null);
				return;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG:
				unsetMerkblattUVG();
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
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANLIEGENSKLAERUNG:
				return anliegensklaerung != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANTRAGSTELLENDER_ELTERNTEIL:
				return antragstellenderElternteil != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_KIND:
				return angabenZumKind != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_ANDEREN_ELTERNTEIL:
				return angabenZumAnderenElternteil != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__ANGABEN_ZUM_UNTERHALT:
				return angabenZumUnterhalt != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__NACHWEISE:
				return nachweise != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__WARTEN_AUF_UNTERSCHRIFT:
				return isSetWartenAufUnterschrift();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__DSGVO:
				return dsgvo != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__RICHTIGKEIT_DER_ANGABEN:
				return isSetRichtigkeitDerAngaben();
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__PDF_ANTRAG:
				return pdfAntrag != null;
			case BeistandschaftPackage.BEISTANDSCHAFT_ANTRAG0601_TYPE__MERKBLATT_UVG:
				return isSetMerkblattUVG();
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
		result.append(" (wartenAufUnterschrift: ");
		if (wartenAufUnterschriftESet) result.append(wartenAufUnterschrift); else result.append("<unset>");
		result.append(", richtigkeitDerAngaben: ");
		if (richtigkeitDerAngabenESet) result.append(richtigkeitDerAngaben); else result.append("<unset>");
		result.append(", merkblattUVG: ");
		if (merkblattUVGESet) result.append(merkblattUVG); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BeistandschaftAntrag0601TypeImpl
