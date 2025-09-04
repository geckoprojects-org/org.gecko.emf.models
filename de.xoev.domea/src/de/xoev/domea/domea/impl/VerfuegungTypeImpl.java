/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.KontaktType;
import de.xoev.domea.domea.VerfuegungType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verfuegung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getErsteller <em>Ersteller</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getAdressat <em>Adressat</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getErstellungsdatum <em>Erstellungsdatum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getErstellungsuhrzeit <em>Erstellungsuhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getVerfuegung <em>Verfuegung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getTerminDatum <em>Termin Datum</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getTerminUhrzeit <em>Termin Uhrzeit</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl#getNotiz <em>Notiz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerfuegungTypeImpl extends MinimalEObjectImpl.Container implements VerfuegungType {
	/**
	 * The cached value of the '{@link #getErsteller() <em>Ersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErsteller()
	 * @generated
	 * @ordered
	 */
	protected KontaktType ersteller;

	/**
	 * The cached value of the '{@link #getAdressat() <em>Adressat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdressat()
	 * @generated
	 * @ordered
	 */
	protected KontaktType adressat;

	/**
	 * The default value of the '{@link #getErstellungsdatum() <em>Erstellungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ERSTELLUNGSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErstellungsdatum() <em>Erstellungsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar erstellungsdatum = ERSTELLUNGSDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getErstellungsuhrzeit() <em>Erstellungsuhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungsuhrzeit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ERSTELLUNGSUHRZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErstellungsuhrzeit() <em>Erstellungsuhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErstellungsuhrzeit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar erstellungsuhrzeit = ERSTELLUNGSUHRZEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerfuegung() <em>Verfuegung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegung()
	 * @generated
	 * @ordered
	 */
	protected static final String VERFUEGUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerfuegung() <em>Verfuegung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerfuegung()
	 * @generated
	 * @ordered
	 */
	protected String verfuegung = VERFUEGUNG_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminDatum() <em>Termin Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminDatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TERMIN_DATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminDatum() <em>Termin Datum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminDatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar terminDatum = TERMIN_DATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminUhrzeit() <em>Termin Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar TERMIN_UHRZEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminUhrzeit() <em>Termin Uhrzeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminUhrzeit()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar terminUhrzeit = TERMIN_UHRZEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotiz() <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotiz()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTIZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotiz() <em>Notiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotiz()
	 * @generated
	 * @ordered
	 */
	protected String notiz = NOTIZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerfuegungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.VERFUEGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType getErsteller() {
		return ersteller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErsteller(KontaktType newErsteller, NotificationChain msgs) {
		KontaktType oldErsteller = ersteller;
		ersteller = newErsteller;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER, oldErsteller, newErsteller);
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
	public void setErsteller(KontaktType newErsteller) {
		if (newErsteller != ersteller) {
			NotificationChain msgs = null;
			if (ersteller != null)
				msgs = ((InternalEObject)ersteller).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER, null, msgs);
			if (newErsteller != null)
				msgs = ((InternalEObject)newErsteller).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER, null, msgs);
			msgs = basicSetErsteller(newErsteller, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER, newErsteller, newErsteller));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KontaktType getAdressat() {
		return adressat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdressat(KontaktType newAdressat, NotificationChain msgs) {
		KontaktType oldAdressat = adressat;
		adressat = newAdressat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT, oldAdressat, newAdressat);
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
	public void setAdressat(KontaktType newAdressat) {
		if (newAdressat != adressat) {
			NotificationChain msgs = null;
			if (adressat != null)
				msgs = ((InternalEObject)adressat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT, null, msgs);
			if (newAdressat != null)
				msgs = ((InternalEObject)newAdressat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT, null, msgs);
			msgs = basicSetAdressat(newAdressat, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT, newAdressat, newAdressat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getErstellungsdatum() {
		return erstellungsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErstellungsdatum(XMLGregorianCalendar newErstellungsdatum) {
		XMLGregorianCalendar oldErstellungsdatum = erstellungsdatum;
		erstellungsdatum = newErstellungsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSDATUM, oldErstellungsdatum, erstellungsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getErstellungsuhrzeit() {
		return erstellungsuhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErstellungsuhrzeit(XMLGregorianCalendar newErstellungsuhrzeit) {
		XMLGregorianCalendar oldErstellungsuhrzeit = erstellungsuhrzeit;
		erstellungsuhrzeit = newErstellungsuhrzeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT, oldErstellungsuhrzeit, erstellungsuhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVerfuegung() {
		return verfuegung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerfuegung(String newVerfuegung) {
		String oldVerfuegung = verfuegung;
		verfuegung = newVerfuegung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__VERFUEGUNG, oldVerfuegung, verfuegung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTerminDatum() {
		return terminDatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminDatum(XMLGregorianCalendar newTerminDatum) {
		XMLGregorianCalendar oldTerminDatum = terminDatum;
		terminDatum = newTerminDatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__TERMIN_DATUM, oldTerminDatum, terminDatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getTerminUhrzeit() {
		return terminUhrzeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTerminUhrzeit(XMLGregorianCalendar newTerminUhrzeit) {
		XMLGregorianCalendar oldTerminUhrzeit = terminUhrzeit;
		terminUhrzeit = newTerminUhrzeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__TERMIN_UHRZEIT, oldTerminUhrzeit, terminUhrzeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotiz() {
		return notiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotiz(String newNotiz) {
		String oldNotiz = notiz;
		notiz = newNotiz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.VERFUEGUNG_TYPE__NOTIZ, oldNotiz, notiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER:
				return basicSetErsteller(null, msgs);
			case DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT:
				return basicSetAdressat(null, msgs);
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
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER:
				return getErsteller();
			case DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT:
				return getAdressat();
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSDATUM:
				return getErstellungsdatum();
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT:
				return getErstellungsuhrzeit();
			case DomeaPackage.VERFUEGUNG_TYPE__VERFUEGUNG:
				return getVerfuegung();
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_DATUM:
				return getTerminDatum();
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_UHRZEIT:
				return getTerminUhrzeit();
			case DomeaPackage.VERFUEGUNG_TYPE__NOTIZ:
				return getNotiz();
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
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER:
				setErsteller((KontaktType)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT:
				setAdressat((KontaktType)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSDATUM:
				setErstellungsdatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT:
				setErstellungsuhrzeit((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__VERFUEGUNG:
				setVerfuegung((String)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_DATUM:
				setTerminDatum((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_UHRZEIT:
				setTerminUhrzeit((XMLGregorianCalendar)newValue);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__NOTIZ:
				setNotiz((String)newValue);
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
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER:
				setErsteller((KontaktType)null);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT:
				setAdressat((KontaktType)null);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSDATUM:
				setErstellungsdatum(ERSTELLUNGSDATUM_EDEFAULT);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT:
				setErstellungsuhrzeit(ERSTELLUNGSUHRZEIT_EDEFAULT);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__VERFUEGUNG:
				setVerfuegung(VERFUEGUNG_EDEFAULT);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_DATUM:
				setTerminDatum(TERMIN_DATUM_EDEFAULT);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_UHRZEIT:
				setTerminUhrzeit(TERMIN_UHRZEIT_EDEFAULT);
				return;
			case DomeaPackage.VERFUEGUNG_TYPE__NOTIZ:
				setNotiz(NOTIZ_EDEFAULT);
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
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLER:
				return ersteller != null;
			case DomeaPackage.VERFUEGUNG_TYPE__ADRESSAT:
				return adressat != null;
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSDATUM:
				return ERSTELLUNGSDATUM_EDEFAULT == null ? erstellungsdatum != null : !ERSTELLUNGSDATUM_EDEFAULT.equals(erstellungsdatum);
			case DomeaPackage.VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT:
				return ERSTELLUNGSUHRZEIT_EDEFAULT == null ? erstellungsuhrzeit != null : !ERSTELLUNGSUHRZEIT_EDEFAULT.equals(erstellungsuhrzeit);
			case DomeaPackage.VERFUEGUNG_TYPE__VERFUEGUNG:
				return VERFUEGUNG_EDEFAULT == null ? verfuegung != null : !VERFUEGUNG_EDEFAULT.equals(verfuegung);
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_DATUM:
				return TERMIN_DATUM_EDEFAULT == null ? terminDatum != null : !TERMIN_DATUM_EDEFAULT.equals(terminDatum);
			case DomeaPackage.VERFUEGUNG_TYPE__TERMIN_UHRZEIT:
				return TERMIN_UHRZEIT_EDEFAULT == null ? terminUhrzeit != null : !TERMIN_UHRZEIT_EDEFAULT.equals(terminUhrzeit);
			case DomeaPackage.VERFUEGUNG_TYPE__NOTIZ:
				return NOTIZ_EDEFAULT == null ? notiz != null : !NOTIZ_EDEFAULT.equals(notiz);
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
		result.append(" (erstellungsdatum: ");
		result.append(erstellungsdatum);
		result.append(", erstellungsuhrzeit: ");
		result.append(erstellungsuhrzeit);
		result.append(", verfuegung: ");
		result.append(verfuegung);
		result.append(", terminDatum: ");
		result.append(terminDatum);
		result.append(", terminUhrzeit: ");
		result.append(terminUhrzeit);
		result.append(", notiz: ");
		result.append(notiz);
		result.append(')');
		return result.toString();
	}

} //VerfuegungTypeImpl
