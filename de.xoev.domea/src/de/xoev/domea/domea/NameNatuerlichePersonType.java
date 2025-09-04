/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Natuerliche Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NameNatuerlichePerson leitet sich von der entsprechenden XÖV-Kernkomponente ab. Der Name der Person ist eine Benennung dieser Person, die dazu dient, diese Person von anderen Personen zu unterscheiden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NameNatuerlichePersonType#getAnrede <em>Anrede</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NameNatuerlichePersonType#getTitel <em>Titel</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NameNatuerlichePersonType#getFamilienname <em>Familienname</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NameNatuerlichePersonType#getVorname <em>Vorname</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNameNatuerlichePersonType()
 * @model extendedMetaData="name='NameNatuerlichePersonType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NameNatuerlichePersonType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Anrede ist der Namenszusatz (auch eine Anrede ohne Namen nur mit Titel ist eine Anrede!) bei der Anrede (mündlich oder schriftlich) oder bei einem Anruf (fernmündlich) an eine Person oder Personengruppe, z. B. Herr, Frau.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anrede</em>' attribute.
	 * @see #setAnrede(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameNatuerlichePersonType_Anrede()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Anrede' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAnrede();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getAnrede <em>Anrede</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anrede</em>' attribute.
	 * @see #getAnrede()
	 * @generated
	 */
	void setAnrede(String value);

	/**
	 * Returns the value of the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Titel wird häufig im Zusammenhang mit Namen verwendet, ist aber kein originärer Bestandteil des Namens. Im Unterschied dazu gehören Adelstitel zum Familiennamen und sind daher in diesem Verständnis kein Titel. Zu den Titeln zählen beispielsweise akademische Grade, Dienst- und Amtsbezeichnungen oder militärische Ränge. Es können auch Titel übermittelt werden, die keine Titel im Sinne des Meldewesens sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titel</em>' attribute.
	 * @see #setTitel(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameNatuerlichePersonType_Titel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Titel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitel();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getTitel <em>Titel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titel</em>' attribute.
	 * @see #getTitel()
	 * @generated
	 */
	void setTitel(String value);

	/**
	 * Returns the value of the '<em><b>Familienname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Familienname ist der aktuelle Nachname einer Person und Ausdruck einer bestimmten Familienzugehörigkeit dieser Person.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Familienname</em>' containment reference.
	 * @see #setFamilienname(AllgemeinerNameType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameNatuerlichePersonType_Familienname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Familienname' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getFamilienname();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getFamilienname <em>Familienname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Familienname</em>' containment reference.
	 * @see #getFamilienname()
	 * @generated
	 */
	void setFamilienname(AllgemeinerNameType value);

	/**
	 * Returns the value of the '<em><b>Vorname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Vorname ist der Name bzw. der Teil des Namens, der nicht die Zugehörigkeit zu einer Familie ausdrückt, sondern das Individuum innerhalb der Familie bezeichnet und dazu dient, es von anderen Familienmitgliedern zu unterscheiden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorname</em>' containment reference.
	 * @see #setVorname(AllgemeinerNameType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNameNatuerlichePersonType_Vorname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorname' namespace='##targetNamespace'"
	 * @generated
	 */
	AllgemeinerNameType getVorname();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getVorname <em>Vorname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorname</em>' containment reference.
	 * @see #getVorname()
	 * @generated
	 */
	void setVorname(AllgemeinerNameType value);

} // NameNatuerlichePersonType
