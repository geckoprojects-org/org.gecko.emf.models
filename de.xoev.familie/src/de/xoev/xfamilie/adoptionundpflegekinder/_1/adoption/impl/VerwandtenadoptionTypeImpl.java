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

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AbgebenderElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenDesZuAdoptierendenKindesType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZuKindernDerFamilieType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnnehmenderElternteilType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DatenschutzUndEinwilligungType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DigitalerRueckkanalType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.NachweisType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.SignaturType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.VerwandtenadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.WeiterePersonenImHauhaltType;

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
 * An implementation of the model object '<em><b>Verwandtenadoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getBeratungscode <em>Beratungscode</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getDatenschutzUndEinwilligung <em>Datenschutz Und Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAngabenDesZuAdoptierendenKindes <em>Angaben Des Zu Adoptierenden Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAllgemeineAngaben <em>Allgemeine Angaben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAnnehmenderElternteil <em>Annehmender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAngabenZurPartnerschaft <em>Angaben Zur Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAngabenZuKindernDerFamilie <em>Angaben Zu Kindern Der Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getWeiterePersonenImHauhalt <em>Weitere Personen Im Hauhalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getAbgebenderElternteil <em>Abgebender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getDatenschutzDerFachbehoerde <em>Datenschutz Der Fachbehoerde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getSignatur <em>Signatur</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.VerwandtenadoptionTypeImpl#getDigitalerRueckkanal <em>Digitaler Rueckkanal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerwandtenadoptionTypeImpl extends MinimalEObjectImpl.Container implements VerwandtenadoptionType {
	/**
	 * The default value of the '{@link #getBeratungscode() <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeratungscode()
	 * @generated
	 * @ordered
	 */
	protected static final String BERATUNGSCODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeratungscode() <em>Beratungscode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeratungscode()
	 * @generated
	 * @ordered
	 */
	protected String beratungscode = BERATUNGSCODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatenschutzUndEinwilligung() <em>Datenschutz Und Einwilligung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzUndEinwilligung()
	 * @generated
	 * @ordered
	 */
	protected DatenschutzUndEinwilligungType datenschutzUndEinwilligung;

	/**
	 * The cached value of the '{@link #getAngabenDesZuAdoptierendenKindes() <em>Angaben Des Zu Adoptierenden Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenDesZuAdoptierendenKindes()
	 * @generated
	 * @ordered
	 */
	protected AngabenDesZuAdoptierendenKindesType angabenDesZuAdoptierendenKindes;

	/**
	 * The cached value of the '{@link #getAllgemeineAngaben() <em>Allgemeine Angaben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllgemeineAngaben()
	 * @generated
	 * @ordered
	 */
	protected AllgemeineAngabenVerwandtenadoptionType allgemeineAngaben;

	/**
	 * The cached value of the '{@link #getAnnehmenderElternteil() <em>Annehmender Elternteil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnehmenderElternteil()
	 * @generated
	 * @ordered
	 */
	protected EList<AnnehmenderElternteilType> annehmenderElternteil;

	/**
	 * The cached value of the '{@link #getAngabenZurPartnerschaft() <em>Angaben Zur Partnerschaft</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurPartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected AngabenZurPartnerschaftType angabenZurPartnerschaft;

	/**
	 * The cached value of the '{@link #getAngabenZuKindernDerFamilie() <em>Angaben Zu Kindern Der Familie</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZuKindernDerFamilie()
	 * @generated
	 * @ordered
	 */
	protected EList<AngabenZuKindernDerFamilieType> angabenZuKindernDerFamilie;

	/**
	 * The cached value of the '{@link #getWeiterePersonenImHauhalt() <em>Weitere Personen Im Hauhalt</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeiterePersonenImHauhalt()
	 * @generated
	 * @ordered
	 */
	protected EList<WeiterePersonenImHauhaltType> weiterePersonenImHauhalt;

	/**
	 * The cached value of the '{@link #getAbgebenderElternteil() <em>Abgebender Elternteil</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbgebenderElternteil()
	 * @generated
	 * @ordered
	 */
	protected EList<AbgebenderElternteilType> abgebenderElternteil;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweisType> nachweise;

	/**
	 * The cached value of the '{@link #getDatenschutzDerFachbehoerde() <em>Datenschutz Der Fachbehoerde</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzDerFachbehoerde()
	 * @generated
	 * @ordered
	 */
	protected EList<DatenschutzUndEinwilligungType> datenschutzDerFachbehoerde;

	/**
	 * The cached value of the '{@link #getSignatur() <em>Signatur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignatur()
	 * @generated
	 * @ordered
	 */
	protected SignaturType signatur;

	/**
	 * The cached value of the '{@link #getDigitalerRueckkanal() <em>Digitaler Rueckkanal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigitalerRueckkanal()
	 * @generated
	 * @ordered
	 */
	protected DigitalerRueckkanalType digitalerRueckkanal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerwandtenadoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.VERWANDTENADOPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeratungscode() {
		return beratungscode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeratungscode(String newBeratungscode) {
		String oldBeratungscode = beratungscode;
		beratungscode = newBeratungscode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__BERATUNGSCODE, oldBeratungscode, beratungscode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatenschutzUndEinwilligungType getDatenschutzUndEinwilligung() {
		return datenschutzUndEinwilligung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung, NotificationChain msgs) {
		DatenschutzUndEinwilligungType oldDatenschutzUndEinwilligung = datenschutzUndEinwilligung;
		datenschutzUndEinwilligung = newDatenschutzUndEinwilligung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, oldDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung);
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
	public void setDatenschutzUndEinwilligung(DatenschutzUndEinwilligungType newDatenschutzUndEinwilligung) {
		if (newDatenschutzUndEinwilligung != datenschutzUndEinwilligung) {
			NotificationChain msgs = null;
			if (datenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)datenschutzUndEinwilligung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			if (newDatenschutzUndEinwilligung != null)
				msgs = ((InternalEObject)newDatenschutzUndEinwilligung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, null, msgs);
			msgs = basicSetDatenschutzUndEinwilligung(newDatenschutzUndEinwilligung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG, newDatenschutzUndEinwilligung, newDatenschutzUndEinwilligung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenDesZuAdoptierendenKindesType getAngabenDesZuAdoptierendenKindes() {
		return angabenDesZuAdoptierendenKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenDesZuAdoptierendenKindes(AngabenDesZuAdoptierendenKindesType newAngabenDesZuAdoptierendenKindes, NotificationChain msgs) {
		AngabenDesZuAdoptierendenKindesType oldAngabenDesZuAdoptierendenKindes = angabenDesZuAdoptierendenKindes;
		angabenDesZuAdoptierendenKindes = newAngabenDesZuAdoptierendenKindes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES, oldAngabenDesZuAdoptierendenKindes, newAngabenDesZuAdoptierendenKindes);
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
	public void setAngabenDesZuAdoptierendenKindes(AngabenDesZuAdoptierendenKindesType newAngabenDesZuAdoptierendenKindes) {
		if (newAngabenDesZuAdoptierendenKindes != angabenDesZuAdoptierendenKindes) {
			NotificationChain msgs = null;
			if (angabenDesZuAdoptierendenKindes != null)
				msgs = ((InternalEObject)angabenDesZuAdoptierendenKindes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES, null, msgs);
			if (newAngabenDesZuAdoptierendenKindes != null)
				msgs = ((InternalEObject)newAngabenDesZuAdoptierendenKindes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES, null, msgs);
			msgs = basicSetAngabenDesZuAdoptierendenKindes(newAngabenDesZuAdoptierendenKindes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES, newAngabenDesZuAdoptierendenKindes, newAngabenDesZuAdoptierendenKindes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeineAngabenVerwandtenadoptionType getAllgemeineAngaben() {
		return allgemeineAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeineAngaben(AllgemeineAngabenVerwandtenadoptionType newAllgemeineAngaben, NotificationChain msgs) {
		AllgemeineAngabenVerwandtenadoptionType oldAllgemeineAngaben = allgemeineAngaben;
		allgemeineAngaben = newAllgemeineAngaben;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN, oldAllgemeineAngaben, newAllgemeineAngaben);
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
	public void setAllgemeineAngaben(AllgemeineAngabenVerwandtenadoptionType newAllgemeineAngaben) {
		if (newAllgemeineAngaben != allgemeineAngaben) {
			NotificationChain msgs = null;
			if (allgemeineAngaben != null)
				msgs = ((InternalEObject)allgemeineAngaben).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN, null, msgs);
			if (newAllgemeineAngaben != null)
				msgs = ((InternalEObject)newAllgemeineAngaben).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN, null, msgs);
			msgs = basicSetAllgemeineAngaben(newAllgemeineAngaben, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN, newAllgemeineAngaben, newAllgemeineAngaben));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnnehmenderElternteilType> getAnnehmenderElternteil() {
		if (annehmenderElternteil == null) {
			annehmenderElternteil = new EObjectContainmentEList<AnnehmenderElternteilType>(AnnehmenderElternteilType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL);
		}
		return annehmenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZurPartnerschaftType getAngabenZurPartnerschaft() {
		return angabenZurPartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurPartnerschaft(AngabenZurPartnerschaftType newAngabenZurPartnerschaft, NotificationChain msgs) {
		AngabenZurPartnerschaftType oldAngabenZurPartnerschaft = angabenZurPartnerschaft;
		angabenZurPartnerschaft = newAngabenZurPartnerschaft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, oldAngabenZurPartnerschaft, newAngabenZurPartnerschaft);
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
	public void setAngabenZurPartnerschaft(AngabenZurPartnerschaftType newAngabenZurPartnerschaft) {
		if (newAngabenZurPartnerschaft != angabenZurPartnerschaft) {
			NotificationChain msgs = null;
			if (angabenZurPartnerschaft != null)
				msgs = ((InternalEObject)angabenZurPartnerschaft).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, null, msgs);
			if (newAngabenZurPartnerschaft != null)
				msgs = ((InternalEObject)newAngabenZurPartnerschaft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, null, msgs);
			msgs = basicSetAngabenZurPartnerschaft(newAngabenZurPartnerschaft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT, newAngabenZurPartnerschaft, newAngabenZurPartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AngabenZuKindernDerFamilieType> getAngabenZuKindernDerFamilie() {
		if (angabenZuKindernDerFamilie == null) {
			angabenZuKindernDerFamilie = new EObjectContainmentEList<AngabenZuKindernDerFamilieType>(AngabenZuKindernDerFamilieType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE);
		}
		return angabenZuKindernDerFamilie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<WeiterePersonenImHauhaltType> getWeiterePersonenImHauhalt() {
		if (weiterePersonenImHauhalt == null) {
			weiterePersonenImHauhalt = new EObjectContainmentEList<WeiterePersonenImHauhaltType>(WeiterePersonenImHauhaltType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT);
		}
		return weiterePersonenImHauhalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbgebenderElternteilType> getAbgebenderElternteil() {
		if (abgebenderElternteil == null) {
			abgebenderElternteil = new EObjectContainmentEList<AbgebenderElternteilType>(AbgebenderElternteilType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL);
		}
		return abgebenderElternteil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweisType> getNachweise() {
		if (nachweise == null) {
			nachweise = new EObjectContainmentEList<NachweisType>(NachweisType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE);
		}
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DatenschutzUndEinwilligungType> getDatenschutzDerFachbehoerde() {
		if (datenschutzDerFachbehoerde == null) {
			datenschutzDerFachbehoerde = new EObjectContainmentEList<DatenschutzUndEinwilligungType>(DatenschutzUndEinwilligungType.class, this, AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE);
		}
		return datenschutzDerFachbehoerde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignaturType getSignatur() {
		return signatur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignatur(SignaturType newSignatur, NotificationChain msgs) {
		SignaturType oldSignatur = signatur;
		signatur = newSignatur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR, oldSignatur, newSignatur);
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
	public void setSignatur(SignaturType newSignatur) {
		if (newSignatur != signatur) {
			NotificationChain msgs = null;
			if (signatur != null)
				msgs = ((InternalEObject)signatur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR, null, msgs);
			if (newSignatur != null)
				msgs = ((InternalEObject)newSignatur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR, null, msgs);
			msgs = basicSetSignatur(newSignatur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR, newSignatur, newSignatur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DigitalerRueckkanalType getDigitalerRueckkanal() {
		return digitalerRueckkanal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal, NotificationChain msgs) {
		DigitalerRueckkanalType oldDigitalerRueckkanal = digitalerRueckkanal;
		digitalerRueckkanal = newDigitalerRueckkanal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL, oldDigitalerRueckkanal, newDigitalerRueckkanal);
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
	public void setDigitalerRueckkanal(DigitalerRueckkanalType newDigitalerRueckkanal) {
		if (newDigitalerRueckkanal != digitalerRueckkanal) {
			NotificationChain msgs = null;
			if (digitalerRueckkanal != null)
				msgs = ((InternalEObject)digitalerRueckkanal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			if (newDigitalerRueckkanal != null)
				msgs = ((InternalEObject)newDigitalerRueckkanal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL, null, msgs);
			msgs = basicSetDigitalerRueckkanal(newDigitalerRueckkanal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL, newDigitalerRueckkanal, newDigitalerRueckkanal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return basicSetDatenschutzUndEinwilligung(null, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES:
				return basicSetAngabenDesZuAdoptierendenKindes(null, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return basicSetAllgemeineAngaben(null, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL:
				return ((InternalEList<?>)getAnnehmenderElternteil()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return basicSetAngabenZurPartnerschaft(null, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return ((InternalEList<?>)getAngabenZuKindernDerFamilie()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return ((InternalEList<?>)getWeiterePersonenImHauhalt()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL:
				return ((InternalEList<?>)getAbgebenderElternteil()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE:
				return ((InternalEList<?>)getNachweise()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return ((InternalEList<?>)getDatenschutzDerFachbehoerde()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR:
				return basicSetSignatur(null, msgs);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return basicSetDigitalerRueckkanal(null, msgs);
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
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__BERATUNGSCODE:
				return getBeratungscode();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return getDatenschutzUndEinwilligung();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES:
				return getAngabenDesZuAdoptierendenKindes();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return getAllgemeineAngaben();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL:
				return getAnnehmenderElternteil();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return getAngabenZurPartnerschaft();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return getAngabenZuKindernDerFamilie();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return getWeiterePersonenImHauhalt();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL:
				return getAbgebenderElternteil();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE:
				return getNachweise();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return getDatenschutzDerFachbehoerde();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR:
				return getSignatur();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return getDigitalerRueckkanal();
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
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__BERATUNGSCODE:
				setBeratungscode((String)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES:
				setAngabenDesZuAdoptierendenKindes((AngabenDesZuAdoptierendenKindesType)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				setAllgemeineAngaben((AllgemeineAngabenVerwandtenadoptionType)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL:
				getAnnehmenderElternteil().clear();
				getAnnehmenderElternteil().addAll((Collection<? extends AnnehmenderElternteilType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				setAngabenZurPartnerschaft((AngabenZurPartnerschaftType)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				getAngabenZuKindernDerFamilie().addAll((Collection<? extends AngabenZuKindernDerFamilieType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				getWeiterePersonenImHauhalt().addAll((Collection<? extends WeiterePersonenImHauhaltType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL:
				getAbgebenderElternteil().clear();
				getAbgebenderElternteil().addAll((Collection<? extends AbgebenderElternteilType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE:
				getNachweise().clear();
				getNachweise().addAll((Collection<? extends NachweisType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				getDatenschutzDerFachbehoerde().addAll((Collection<? extends DatenschutzUndEinwilligungType>)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR:
				setSignatur((SignaturType)newValue);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)newValue);
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
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__BERATUNGSCODE:
				setBeratungscode(BERATUNGSCODE_EDEFAULT);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				setDatenschutzUndEinwilligung((DatenschutzUndEinwilligungType)null);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES:
				setAngabenDesZuAdoptierendenKindes((AngabenDesZuAdoptierendenKindesType)null);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				setAllgemeineAngaben((AllgemeineAngabenVerwandtenadoptionType)null);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL:
				getAnnehmenderElternteil().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				setAngabenZurPartnerschaft((AngabenZurPartnerschaftType)null);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				getAngabenZuKindernDerFamilie().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				getWeiterePersonenImHauhalt().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL:
				getAbgebenderElternteil().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE:
				getNachweise().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				getDatenschutzDerFachbehoerde().clear();
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR:
				setSignatur((SignaturType)null);
				return;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL:
				setDigitalerRueckkanal((DigitalerRueckkanalType)null);
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
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__BERATUNGSCODE:
				return BERATUNGSCODE_EDEFAULT == null ? beratungscode != null : !BERATUNGSCODE_EDEFAULT.equals(beratungscode);
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_UND_EINWILLIGUNG:
				return datenschutzUndEinwilligung != null;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_DES_ZU_ADOPTIERENDEN_KINDES:
				return angabenDesZuAdoptierendenKindes != null;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ALLGEMEINE_ANGABEN:
				return allgemeineAngaben != null;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANNEHMENDER_ELTERNTEIL:
				return annehmenderElternteil != null && !annehmenderElternteil.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZUR_PARTNERSCHAFT:
				return angabenZurPartnerschaft != null;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ANGABEN_ZU_KINDERN_DER_FAMILIE:
				return angabenZuKindernDerFamilie != null && !angabenZuKindernDerFamilie.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__WEITERE_PERSONEN_IM_HAUHALT:
				return weiterePersonenImHauhalt != null && !weiterePersonenImHauhalt.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__ABGEBENDER_ELTERNTEIL:
				return abgebenderElternteil != null && !abgebenderElternteil.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__NACHWEISE:
				return nachweise != null && !nachweise.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DATENSCHUTZ_DER_FACHBEHOERDE:
				return datenschutzDerFachbehoerde != null && !datenschutzDerFachbehoerde.isEmpty();
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__SIGNATUR:
				return signatur != null;
			case AdoptionPackage.VERWANDTENADOPTION_TYPE__DIGITALER_RUECKKANAL:
				return digitalerRueckkanal != null;
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
		result.append(" (beratungscode: ");
		result.append(beratungscode);
		result.append(')');
		return result.toString();
	}

} //VerwandtenadoptionTypeImpl
