/*
 */
package de.xoev.domea.domea;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nachrichtenkopf Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nachrichtenkopf für Nachrichten. Der Nachrichtenkopf umfasst Angaben zur eindeutigen Identifikation des Autors und des Lesers der Nachricht sowie der Nachricht selbst.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getProzessID <em>Prozess ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getInstanzID <em>Instanz ID</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getHinweis <em>Hinweis</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}</li>
 * </ul>
 *
 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType()
 * @model extendedMetaData="name='NachrichtenkopfType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface NachrichtenkopfType extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zur eindeutigen Identifikation einer Nachricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #setIdentifikationNachricht(IdentifikationNachrichtType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_IdentifikationNachricht()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identifikation.nachricht' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifikationNachrichtType getIdentifikationNachricht();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifikation Nachricht</em>' containment reference.
	 * @see #getIdentifikationNachricht()
	 * @generated
	 */
	void setIdentifikationNachricht(IdentifikationNachrichtType value);

	/**
	 * Returns the value of the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Leser der Nachricht. Der Leser ist die fachlich zuständige Behörde / (öffentliche) Stelle, der die Nachricht zugestellt werden soll und die die Nachricht fachlich verarbeiten soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leser</em>' containment reference.
	 * @see #setLeser(KontaktType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_Leser()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='leser' namespace='##targetNamespace'"
	 * @generated
	 */
	KontaktType getLeser();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getLeser <em>Leser</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leser</em>' containment reference.
	 * @see #getLeser()
	 * @generated
	 */
	void setLeser(KontaktType value);

	/**
	 * Returns the value of the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dieses Element enthält Angaben zum Autor der Nachricht, die es dem Leser ermöglichen, bei Bedarf mit dem Autor in Verbindung zu treten. Der Autor ist die fachlich zuständige Behörde / (öffentliche) Stelle, die die Nachricht erstellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Autor</em>' containment reference.
	 * @see #setAutor(KontaktType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_Autor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='autor' namespace='##targetNamespace'"
	 * @generated
	 */
	KontaktType getAutor();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getAutor <em>Autor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autor</em>' containment reference.
	 * @see #getAutor()
	 * @generated
	 */
	void setAutor(KontaktType value);

	/**
	 * Returns the value of the '<em><b>Prozess ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die UUID des Prozesses, zu dem die Nachricht gehört. Sie dient zur Identifikation bei Rückmeldungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prozess ID</em>' attribute.
	 * @see #setProzessID(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_ProzessID()
	 * @model dataType="basisnachricht.UUID" required="true"
	 *        extendedMetaData="kind='element' name='ProzessID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProzessID();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getProzessID <em>Prozess ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prozess ID</em>' attribute.
	 * @see #getProzessID()
	 * @generated
	 */
	void setProzessID(String value);

	/**
	 * Returns the value of the '<em><b>Instanz ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Instanz-ID dient der eindeutigen Identifikation des Systems, in dem die xdomea-Nachricht erzeugt wird. Die Identifizierung des Mandanten ist darin enthalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instanz ID</em>' attribute.
	 * @see #setInstanzID(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_InstanzID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InstanzID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstanzID();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getInstanzID <em>Instanz ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instanz ID</em>' attribute.
	 * @see #getInstanzID()
	 * @generated
	 */
	void setInstanzID(String value);

	/**
	 * Returns the value of the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Hinweis umfasst Erläuterungen zu der Nachricht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinweis</em>' attribute.
	 * @see #setHinweis(String)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_Hinweis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Hinweis' namespace='##targetNamespace'"
	 * @generated
	 */
	String getHinweis();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getHinweis <em>Hinweis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinweis</em>' attribute.
	 * @see #getHinweis()
	 * @generated
	 */
	void setHinweis(String value);

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterung darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung</em>' containment reference list.
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_AnwendungsspezifischeErweiterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterung' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AnwendungsspezifischeErweiterungType> getAnwendungsspezifischeErweiterung();

	/**
	 * Returns the value of the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * AnwendungsspezifischeErweiterungXML darf nur dazu genutzt werden, weitere (z. B. fachspezifische) Metadaten zu spezifizieren, deren Übermittlung mit den bereits in xdomea spezifizierten Metadaten nicht möglich ist. Die AnwendungsspezifischeErweiterungXML bietet die Möglichkeit, mittels Einbindung externer XML-Schemata diese Metadaten zu spezifizieren. Es können beliebige XML-Schemata mit unterschiedlichen Namensräumen angegeben werden. Die XML-Schema-Validierung der weiterführenden Metadaten erfolgt innerhalb der xdomea-Nachricht selbst "lax".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType)
	 * @see de.xoev.domea.domea.DomeaPackage#getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AnwendungsspezifischeErweiterungXML' namespace='##targetNamespace'"
	 * @generated
	 */
	AnwendungsspezifischeErweiterungXMLType getAnwendungsspezifischeErweiterungXML();

	/**
	 * Sets the value of the '{@link de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendungsspezifische Erweiterung XML</em>' containment reference.
	 * @see #getAnwendungsspezifischeErweiterungXML()
	 * @generated
	 */
	void setAnwendungsspezifischeErweiterungXML(AnwendungsspezifischeErweiterungXMLType value);

} // NachrichtenkopfType
